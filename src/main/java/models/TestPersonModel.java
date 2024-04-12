package models;

import java.util.ArrayList;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TestPersonModel
{
	SimpleStringProperty name;
	SimpleStringProperty bio;
	SimpleStringProperty email;
	SimpleStringProperty pronouns;

	ArrayList<String> skills;
	ArrayList<String> jobs;
	ArrayList<String> communities;
	
	SimpleIntegerProperty numFollowers;
	SimpleIntegerProperty numFollowing;

	public TestPersonModel()
	{
		name = new SimpleStringProperty();
		name.set("Michael Keith Bradshaw");
		
		bio = new SimpleStringProperty();
		bio.set("I love to teach :)");
		
		email = new SimpleStringProperty();
		email.set("michael.bradshaw@centre.edu");
		
		pronouns = new SimpleStringProperty();
		pronouns.set("he/him");
		
		skills = new ArrayList<String>();
		skills.add("Python");
		skills.add("Java");
		jobs = new ArrayList<String>();
		jobs.add("Centre College Professor");
		jobs.add("Arcane Architect Developer");
		communities = new ArrayList<String>();
		communities.add("Professor Support Group");
		communities.add("Video Game Designers Unite!");
		
		numFollowers = new SimpleIntegerProperty();
		numFollowers.set(12382893);
		
		numFollowing = new SimpleIntegerProperty();
		numFollowing.set(22);
	}

	@Override
	public String toString()
	{
		return name + "(" + pronouns + ")\n" + bio
				+ ", skills=" + skills + ", jobs=" + jobs + ", communities=" + communities + ", numFollowers="
				+ numFollowers + ", numFollowing=" + numFollowing + "]";
	}
	
	

//	public String getName()
//	{
//		return name.get();
//	}
//
//	public void setName(String name)
//	{
//		this.name.set(name);
//	}
//
//	public SimpleStringProperty nameProperty()
//	{
//		return this.name;
//	}
//	
//	public String getBio()
//	{
//		return bio.get();
//	}
//
//	public void setBio(String bio)
//	{
//		this.bio.set(bio);
//	}
//
//	public SimpleStringProperty bioProperty()
//	{
//		return this.bio;
//	}
//	
//	public String getPronouns()
//	{
//		return pronouns.get();
//	}
//
//	public void setPronouns(String pronouns)
//	{
//		this.pronouns.set(pronouns);
//	}
//
//	public SimpleStringProperty pronounsProperty()
//	{
//		return this.pronouns;
//	}
//	
//	public String getEmail()
//	{
//		return email.get();
//	}
//
//	public void setEmail(String email)
//	{
//		this.email.set(email);
//	}
//
//	public SimpleStringProperty EmailProperty()
//	{
//		return this.email;
//	}
}
