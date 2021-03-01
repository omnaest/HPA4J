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

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class TissueExpression
{
	@XmlAttribute
	private String type;

	@XmlAttribute
	private String technology;

	@XmlAttribute
	private String assayType;

	@XmlElement
	private Summary summary;

	@XmlElement(name = "image")
	private List<Image> images = new ArrayList<>();

	@XmlElement
	private List<TissueData> data = new ArrayList<>();

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getTechnology()
	{
		return technology;
	}

	public void setTechnology(String technology)
	{
		this.technology = technology;
	}

	public String getAssayType()
	{
		return assayType;
	}

	public void setAssayType(String assayType)
	{
		this.assayType = assayType;
	}

	public Summary getSummary()
	{
		return summary;
	}

	public void setSummary(Summary summary)
	{
		this.summary = summary;
	}

	public List<Image> getImages()
	{
		return images;
	}

	public void setImages(List<Image> images)
	{
		this.images = images;
	}

	public List<TissueData> getData()
	{
		return data;
	}

	public void setData(List<TissueData> data)
	{
		this.data = data;
	}

}
