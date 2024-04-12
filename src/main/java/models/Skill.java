package models;

import javafx.beans.property.SimpleListProperty;

public class Skill extends Post
{

	public Skill(int id, String title)
	{
		super(id, title);
		links.put("mentors", new SimpleListProperty<Link>());
	}

}
