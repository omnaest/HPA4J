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
public class CellExpression
{
	@XmlElement
	private Summary summary;

	@XmlElement
	private Verification verification;

	@XmlElement(name = "image")
	private List<Image> images = new ArrayList<>();

	@XmlElement
	private List<CellData> data;

	public Summary getSummary()
	{
		return summary;
	}

	public void setSummary(Summary summary)
	{
		this.summary = summary;
	}

	public Verification getVerification()
	{
		return verification;
	}

	public void setVerification(Verification verification)
	{
		this.verification = verification;
	}

	public List<Image> getImages()
	{
		return images;
	}

	public void setImages(List<Image> images)
	{
		this.images = images;
	}

	public List<CellData> getData()
	{
		return data;
	}

	public void setData(List<CellData> data)
	{
		this.data = data;
	}

}
