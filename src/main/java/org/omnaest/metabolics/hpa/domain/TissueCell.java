package org.omnaest.metabolics.hpa.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class TissueCell
{
	@XmlElement
	private String cellType;

	@XmlElement
	private Level level;

	public String getCellType()
	{
		return cellType;
	}

	public void setCellType(String cellType)
	{
		this.cellType = cellType;
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
