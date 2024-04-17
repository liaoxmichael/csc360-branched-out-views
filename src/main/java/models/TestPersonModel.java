package models;

import java.util.ArrayList;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TestPersonModel
{
	// TODO add example work experiences etc
	
	public String name;
	public String bio;
	public String email;
	public String pronouns;

	public ArrayList<String> skills;
	public ArrayList<String> jobs;
	public ArrayList<String> communities;

	public int numFollowers;
	public int numFollowing;

	public TestPersonModel()
	{
		name = "Michael Keith Bradshaw";
		bio = "I love to teach :)";
		email = "michael.bradshaw@centre.edu";
		pronouns = "he/him";

		skills = new ArrayList<String>();
		skills.add("Python");
		skills.add("Java");

		jobs = new ArrayList<String>();
		jobs.add("Centre College Professor");
		jobs.add("Arcane Architect Developer");

		communities = new ArrayList<String>();
		communities.add("Professor Support Group");
		communities.add("Video Game Designers Unite!");

		numFollowers = 12382893;
		numFollowing = 22;
	}
	
	public ObservableList<String> getSkills() {
		return FXCollections.observableArrayList(skills);
	}
	
	public ObservableList<String> getJobs() {
		return FXCollections.observableArrayList(jobs);
	}
	
	public ObservableList<String> getCommunities() {
		return FXCollections.observableArrayList(communities);
	}

	@Override
	public String toString()
	{
		return name + "(" + pronouns + ")\n" + bio + ", skills=" + skills + ", jobs=" + jobs + ", communities="
				+ communities + ", numFollowers=" + numFollowers + ", numFollowing=" + numFollowing + "]";
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
