package org.omnaest.metabolics.hpa.domain;

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
	private List<Data> data = new ArrayList<>();

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

	public List<Data> getData()
	{
		return data;
	}

	public void setData(List<Data> data)
	{
		this.data = data;
	}

}
