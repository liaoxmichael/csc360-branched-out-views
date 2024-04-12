package models;

import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

public class Person extends User
{
	SimpleStringProperty pronouns;
	ObservableList<SkillProficiency> skills;
	// ObservableList<WorkExperience> jobs; // will do later

	public Person(int id, String name, String email)
	{
		super(id, name, email);
		skills = new SimpleListProperty<SkillProficiency>();
	}

	public String getPronouns()
	{
		return pronouns.get();
	}

	public void setBio(String pronouns)
	{
		this.pronouns.set(pronouns);
	}

	public SimpleStringProperty pronounsProperty()
	{
		return this.pronouns;
	}

	public SkillProficiency addSkill(Skill skill, SkillProficiency.ProficiencyLevel level)
	{
		SkillProficiency newProf = new SkillProficiency(skill, level);
		int skillIndex = skills.indexOf(newProf);
		if (skillIndex != -1)
		{ // if skill exists, override
			skills.get(skillIndex).setLevel(level);
			return skills.get(skillIndex);
		}
		skills.add(newProf);
		return newProf;
	}

	public boolean removeSkill(Skill skill)
	{
		return skills.remove(new SkillProficiency(skill, SkillProficiency.ProficiencyLevel.BEGINNER));
		// level doesn't matter
	}

}
