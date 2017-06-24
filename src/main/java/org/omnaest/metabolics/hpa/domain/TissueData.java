package org.omnaest.metabolics.hpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class TissueData
{
	@XmlElement
	private String tissue;

	@XmlElement
	private Level level;

	@XmlElement(name = "tissueCell")
	private List<TissueCell> tissueCells = new ArrayList<>();

	public String getTissue()
	{
		return tissue;
	}

	public void setTissue(String tissue)
	{
		this.tissue = tissue;
	}

	public Level getLevel()
	{
		return level;
	}

	public void setLevel(Level level)
	{
		this.level = level;
	}

	public List<TissueCell> getTissueCells()
	{
		return tissueCells;
	}

	public void setTissueCells(List<TissueCell> tissueCells)
	{
		this.tissueCells = tissueCells;
	}

}
