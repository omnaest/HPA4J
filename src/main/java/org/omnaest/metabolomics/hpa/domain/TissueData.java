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
package org.omnaest.metabolomics.hpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class TissueData
{
	@XmlElement
	private String tissue;

	@XmlElement
	private Level level;

	@XmlElement(name = "tissueCell")
	private List<TissueCell> tissueCells = new ArrayList<>();

	public String getTissue()
	{
		return tissue;
	}

	public void setTissue(String tissue)
	{
		this.tissue = tissue;
	}

	public Level getLevel()
	{
		return level;
	}

	public void setLevel(Level level)
	{
		this.level = level;
	}

	public List<TissueCell> getTissueCells()
	{
		return tissueCells;
	}

	public void setTissueCells(List<TissueCell> tissueCells)
	{
		this.tissueCells = tissueCells;
	}

}
