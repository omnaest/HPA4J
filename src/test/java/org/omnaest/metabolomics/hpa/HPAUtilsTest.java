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

import org.junit.Ignore;
import org.junit.Test;
import org.omnaest.metabolomics.hpa.HPAUtils;
import org.omnaest.metabolomics.hpa.navigation.HPAModelNavigator;

public class HPAUtilsTest
{

    @Test
    @Ignore
    public void testLoadFromJSON() throws Exception
    {
        File file = new File("C:\\Z\\databases\\proteinatlas\\proteinatlas.xml\\proteinatlas.json");

        HPAModelNavigator hpaModelNavigator = HPAUtils.loadFromJSON(file);
        //
        //		System.out.println(hpaModelNavigator.findEntityByName("COMT")
        //											.getAsJson());

        hpaModelNavigator.findEntityByName("COMT")
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
