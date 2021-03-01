package org.omnaest.metabolics.hpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class RnaExpression
{
	@XmlAttribute
	private String technology;

	@XmlElement
	private RnaTissueCategory rnaTissueCategory;

	@XmlElement
	private List<RnaData> data = new ArrayList<>();

	public String getTechnology()
	{
		return technology;
	}

	public void setTechnology(String technology)
	{
		this.technology = technology;
	}

	public RnaTissueCategory getRnaTissueCategory()
	{
		return rnaTissueCategory;
	}

	public void setRnaTissueCategory(RnaTissueCategory rnaTissueCategory)
	{
		this.rnaTissueCategory = rnaTissueCategory;
	}

	public List<RnaData> getData()
	{
		return data;
	}

	public void setData(List<RnaData> data)
	{
		this.data = data;
	}

}
