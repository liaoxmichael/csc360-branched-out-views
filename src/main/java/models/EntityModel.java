package models;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleMapProperty;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public abstract class EntityModel
{
	int id;
	PageModel page;
	ObservableMap<String, ObservableList<Link>> links;
	ObservableList<String> externalWebLinks;
	
	public EntityModel(int id)
	{
		this.id = id;
		links = new SimpleMapProperty<String, ObservableList<Link>>();
		externalWebLinks = new SimpleListProperty<String>();
	}

	/**
	 * @return the page
	 */
	public PageModel getPage()
	{
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(PageModel page)
	{
		this.page = page;
	}
	
	

}
