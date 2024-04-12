package models;

import java.util.ArrayList;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class TestJobPostingModel
{
	SimpleStringProperty title;
	SimpleStringProperty desc;
	SimpleStringProperty company;
	SimpleStringProperty location;
	SimpleStringProperty site;

	SimpleIntegerProperty numApplicants;

	SimpleStringProperty datePosted;

	ArrayList<String> skillsRequired;

	public TestJobPostingModel(String title, String desc, String company, String location, String site,
			int numApplicants, String datePosted, String... skills)
	{
		this.title = new SimpleStringProperty();
		this.title.set(title);
		skillsRequired = new ArrayList<String>();
		this.desc = new SimpleStringProperty();
		this.desc.set(desc);
		this.company = new SimpleStringProperty();
		this.company.set(company);
		this.location = new SimpleStringProperty();
		this.location.set(location);
		this.site = new SimpleStringProperty();
		this.site.set(site);
		this.numApplicants = new SimpleIntegerProperty();
		this.numApplicants.set(numApplicants);
		this.datePosted = new SimpleStringProperty();
		this.datePosted.set(datePosted);

		for (String s : skills)
		{
			skillsRequired.add(s);
		}
	}
}
