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
/* 

	Copyright 2017 Danny Kunz

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
	

*/
package org.omnaest.metabolomics.hpa;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

import org.apache.commons.io.FileUtils;
import org.omnaest.metabolomics.hpa.domain.HPAModel;
import org.omnaest.metabolomics.hpa.utils.JSONHelper;
import org.omnaest.metabolomics.hpa.utils.XMLHelper;

/**
 * Utils class to read the xml data from http://www.proteinatlas.org/about/download
 */
public class HPAFileUtils
{
	private static final String CHARSET_UTF8 = "utf-8";

	/**
	 * Similar to {@link #parseFromXML(String)}
	 * 
	 * @param file
	 * @return
	 * @throws IOException
	 */
	public static HPAModel parseFromXML(File file) throws IOException
	{
		return parseFromXML(new BufferedReader(new InputStreamReader(FileUtils.openInputStream(file), CHARSET_UTF8)));
	}

	/**
	 * Parses the proteinatlas.xml file content into the {@link HPAModel}
	 * 
	 * @param xml
	 * @return
	 */
	public static HPAModel parseFromXML(String xml)
	{
		return XMLHelper.parse(xml, HPAModel.class);
	}

	/**
	 * Parses the proteinatlas.xml file content into the {@link HPAModel}
	 * 
	 * @param xml
	 * @return
	 */
	public static HPAModel parseFromXML(Reader xmlReader)
	{
		return XMLHelper.parse(xmlReader, HPAModel.class);
	}

	public static HPAModel parseFromJSON(File file) throws IOException
	{
		return parseFromJSON(FileUtils.readFileToString(file, CHARSET_UTF8));
	}

	public static HPAModel parseFromJSON(String json)
	{
		return JSONHelper.readFromString(json, HPAModel.class);
	}

	/**
	 * Serializes the given {@link HPAModel} into xml content
	 * 
	 * @param hpaModel
	 * @return
	 */
	public static String serializeToXML(HPAModel hpaModel)
	{
		return XMLHelper.serialize(hpaModel);
	}

	public static String serializeToJSON(HPAModel hpaModel)
	{
		return JSONHelper.prettyPrint(hpaModel);
	}
}
