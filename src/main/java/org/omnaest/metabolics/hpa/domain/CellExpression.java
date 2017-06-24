package org.omnaest.metabolics.hpa.domain;

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
