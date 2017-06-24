package org.omnaest.metabolics.hpa.domain;

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
