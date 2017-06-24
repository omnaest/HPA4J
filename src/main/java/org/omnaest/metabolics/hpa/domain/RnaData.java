package org.omnaest.metabolics.hpa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class RnaData
{
	@XmlElement
	private String cellLine;

	@XmlElement
	private Level level;

	public String getCellLine()
	{
		return cellLine;
	}

	public void setCellLine(String cellLine)
	{
		this.cellLine = cellLine;
	}

	public Level getLevel()
	{
		return level;
	}

	public void setLevel(Level level)
	{
		this.level = level;
	}

}
