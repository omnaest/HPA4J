package org.omnaest.metabolics.hpa.navigation;

import java.util.stream.Stream;

import org.apache.commons.lang.StringUtils;
import org.omnaest.metabolics.hpa.domain.Entry;
import org.omnaest.metabolics.hpa.domain.HPAModel;
import org.omnaest.metabolics.hpa.utils.JSONHelper;

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
