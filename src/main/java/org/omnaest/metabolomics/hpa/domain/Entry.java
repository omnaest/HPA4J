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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Entry
{
	@XmlAttribute
	private String version;

	@XmlAttribute
	private String url;

	@XmlElement
	private String name;

	@XmlElement(name = "synonym")
	private List<String> synonyms = new ArrayList<>();

	@XmlElement
	private Identifier identifier;

	@XmlElement
	private TissueExpression tissueExpression;

	@XmlElement
	private CellExpression cellExpression;

	@XmlElement
	private RnaExpression rnaExpression;

	public CellExpression getCellExpression()
	{
		return cellExpression;
	}

	public void setCellExpression(CellExpression cellExpression)
	{
		this.cellExpression = cellExpression;
	}

	public RnaExpression getRnaExpression()
	{
		return rnaExpression;
	}

	public void setRnaExpression(RnaExpression rnaExpression)
	{
		this.rnaExpression = rnaExpression;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<String> getSynonyms()
	{
		return synonyms;
	}

	public void setSynonyms(List<String> synonyms)
	{
		this.synonyms = synonyms;
	}

	public Identifier getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier(Identifier identifier)
	{
		this.identifier = identifier;
	}

	public TissueExpression getTissueExpression()
	{
		return tissueExpression;
	}

	public void setTissueExpression(TissueExpression tissueExpression)
	{
		this.tissueExpression = tissueExpression;
	}

}
