package org.omnaest.metabolics.hpa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.NONE)
public class Location
{
	@XmlAttribute
	private String status;

	@XmlAttribute(name = "GOId")
	private String goId;

	@XmlValue
	private String value;

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
	}

	public String getGoId()
	{
		return goId;
	}

	public void setGoId(String goId)
	{
		this.goId = goId;
	}

	public String getValue()
	{
		return value;
	}

	public void setValue(String value)
	{
		this.value = value;
	}

}
