package org.omnaest.metabolics.hpa;

import java.io.File;

import org.junit.Test;
import org.omnaest.metabolics.hpa.navigation.HPAModelNavigator;

public class HPAUtilsTest
{

	@Test
	public void testLoadFromJSON() throws Exception
	{
		File file = new File("C:\\Z\\databases\\proteinatlas\\proteinatlas.xml\\proteinatlas.json");

		HPAModelNavigator hpaModelNavigator = HPAUtils.loadFromJSON(file);
		//
		//		System.out.println(hpaModelNavigator.findEntityByName("COMT")
		//											.getAsJson());

		hpaModelNavigator	.findEntityByName("COMT")
							.get()
							.getTissueExpression()
							.getData()
							.stream()
							.forEach(data ->
							{
								String tissue = data.getTissue();
								System.out.println(tissue);
								data.getTissueCells()
									.stream()
									.forEach(cells ->
									{
										String cellType = cells.getCellType();
										String value = cells.getLevel()
															.getValue();
										System.out.println("  " + cellType + ": " + value);
									});
							});
	}

}
