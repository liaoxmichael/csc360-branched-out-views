package models;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public abstract class Entity
{
	int id;
	Page page;
	ObservableMap<String, ObservableList<Link>> links;
	ObservableList<String> externalWebLinks;
	
	public Entity(int id)
	{
		this.id = id;
		links = new SimpleMapProperty<String, ObservableList<Link>>();
		externalWebLinks = new SimpleListProperty<String>();
	}

	/**
	 * @return the page
	 */
	public Page getPage()
	{
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(Page page)
	{
		this.page = page;
	}
	
	

}
