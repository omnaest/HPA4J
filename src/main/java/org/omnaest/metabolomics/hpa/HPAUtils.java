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
package org.omnaest.metabolomics.hpa;

import java.io.File;
import java.io.IOException;

import org.omnaest.metabolomics.hpa.domain.HPAModel;
import org.omnaest.metabolomics.hpa.navigation.HPAModelNavigator;

/**
 * @see #loadFrom()
 * @see HPAFileUtils
 * @author omnaest
 */
public class HPAUtils
{
	/**
	 * Returns a {@link HPAModelNavigator} which allows to explore the {@link HPAModel}
	 * 
	 * @return
	 */
	public static HPAModelNavigator loadFrom(HPAModel hpaModel)
	{
		return new HPAModelNavigator(hpaModel);
	}

	public static HPAModelNavigator loadFromXML(File file) throws IOException
	{
		return loadFrom(HPAFileUtils.parseFromXML(file));
	}

	public static HPAModelNavigator loadFromJSON(File file) throws IOException
	{
		return loadFrom(HPAFileUtils.parseFromJSON(file));
	}
}
