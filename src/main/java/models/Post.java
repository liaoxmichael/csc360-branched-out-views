package models;

import javafx.beans.property.SimpleStringProperty;

public abstract class Post extends Entity
{
	
	SimpleStringProperty title;
	SimpleStringProperty description;
	
	public Post(int id, String title)
	{
		super(id);
		this.title = new SimpleStringProperty();
		this.description = new SimpleStringProperty();
		this.title.set(title);
	}
	
	

}
