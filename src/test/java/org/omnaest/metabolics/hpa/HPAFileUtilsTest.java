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
package org.omnaest.metabolics.hpa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.stream.StreamSupport;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.io.LineIterator;
import org.junit.Ignore;
import org.junit.Test;
import org.omnaest.metabolics.hpa.domain.HPAModel;

public class HPAFileUtilsTest
{

	/**
	 * Generate a json extract of the original data
	 * 
	 * @throws IOException
	 */
	@Test
	public void test() throws IOException
	{
		File file = new File("C:\\Z\\databases\\proteinatlas\\proteinatlas.xml\\proteinatlas.json");
		HPAModel model = HPAFileUtils.parseFromJSON(file);
	

	}

	@Test
	@Ignore
	public void testGetFileSample() throws IOException
	{

		File file = new File("C:\\Z\\databases\\proteinatlas\\proteinatlas.xml\\proteinatlas.xml");

		FileInputStream openInputStream = FileUtils.openInputStream(file);

		LineIterator lineIterator = IOUtils.lineIterator(openInputStream, "utf-8");

		StreamSupport	.stream(((Iterable<String>) () -> lineIterator).spliterator(), false)
						.limit(20000)
						.forEach(System.out::println);

	}

	/**
	 * Generate a json extract of the original data
	 * 
	 * @throws IOException
	 */
	@Test
	@Ignore
	public void testGenerateJsonExtract() throws IOException
	{
		File file = new File("C:\\Z\\databases\\proteinatlas\\proteinatlas.xml\\proteinatlas.xml");
		HPAModel model = HPAFileUtils.parseFromXML(file);
		FileUtils.writeStringToFile(new File(file.getParent() + "/proteinatlas.json"), HPAFileUtils.serializeToJSON(model), "utf-8");

	}
}
