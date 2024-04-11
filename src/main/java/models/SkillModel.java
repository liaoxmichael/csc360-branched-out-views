package models;

import javafx.beans.property.SimpleListProperty;

public class SkillModel extends PostModel
{

	public SkillModel(int id, String title)
	{
		super(id, title);
		links.put("mentors", new SimpleListProperty<Link>());
	}

}
