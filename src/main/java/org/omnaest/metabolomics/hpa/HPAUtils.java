package org.omnaest.metabolics.hpa;

import java.io.File;
import java.io.IOException;

import org.omnaest.metabolics.hpa.domain.HPAModel;
import org.omnaest.metabolics.hpa.navigation.HPAModelNavigator;

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
