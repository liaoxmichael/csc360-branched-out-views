package models;

import javafx.beans.property.SimpleStringProperty;

public abstract class PostModel extends EntityModel
{
	
	SimpleStringProperty title;
	SimpleStringProperty description;
	
	public PostModel(int id, String title)
	{
		super(id);
		this.title = new SimpleStringProperty();
		this.description = new SimpleStringProperty();
		this.title.set(title);
	}
	
	

}
