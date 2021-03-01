package org.omnaest.metabolics.hpa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Identifier
{
	@XmlAttribute
	private String id;

	@XmlAttribute
	private String db;

	@XmlAttribute
	private String version;

	@XmlElement
	private XREF xref;

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getDb()
	{
		return db;
	}

	public void setDb(String db)
	{
		this.db = db;
	}

	public String getVersion()
	{
		return version;
	}

	public void setVersion(String version)
	{
		this.version = version;
	}

	public XREF getXref()
	{
		return xref;
	}

	public void setXref(XREF xref)
	{
		this.xref = xref;
	}

}
