/*******************************************************************************
 * Copyright 2021 Danny Kunz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.omnaest.metabolomics.hpa.navigation;

import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.omnaest.metabolomics.hpa.domain.Entry;
import org.omnaest.metabolomics.hpa.domain.HPAModel;
import org.omnaest.metabolomics.hpa.utils.JSONHelper;

public class HPAModelNavigator
{
	private HPAModel hpaModel;

	public static interface EntityNavigator
	{
		Entry get();

		String getAsJson();
	}

	public HPAModelNavigator(HPAModel hpaModel)
	{
		this.hpaModel = hpaModel;
	}

	public Stream<EntityNavigator> findEntityByNameContains(String searchStr)
	{
		return this.hpaModel.getEntries()
							.stream()
							.filter(entry -> StringUtils.containsIgnoreCase(entry.getName(), searchStr))
							.map(entry -> findEntityByName(entry.getName()));
	}

	public EntityNavigator findEntityByName(String name)
	{
		Entry matchedEntry = this.hpaModel	.getEntries()
											.stream()
											.filter(entry -> StringUtils.equalsIgnoreCase(entry.getName(), name))
											.findFirst()
											.orElseGet(() -> null);
		return new EntityNavigator()
		{
			@Override
			public String getAsJson()
			{
				return JSONHelper.prettyPrint(matchedEntry);
			}

			@Override
			public Entry get()
			{
				return matchedEntry;
			}
		};
	}

}
