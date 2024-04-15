package models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BranchedOutModel
{
	public TestPersonModel drB = new TestPersonModel();
	public TestJobPostingModel toiletFlusher = new TestJobPostingModel(1, "Toilet Flusher", "Intern",
			"Responsible for flushing all toilets around campus. Students are no longer allowed to do it themselves.",
			"Centre College", "Danville, KY", "On-site", 62092, "05-12-2022", "SQL", "Advanced Python Programming",
			"Masters in Human-Computer Interaction");
	public TestJobPostingModel unflusher = new TestJobPostingModel(2, "Toilet Unflusher", "Full-time", "You know what to do.",
			"Centre College", "Danville, KY", "Remote", 22, "05-13-2023", "Big Heart", "React.js",
			"ChatGPT proficiency");
	public TestJobPostingModel supportAnimal = new TestJobPostingModel(3, "Support Animal", "Seasonal", "For student mental health.",
			"Centre College", "Danville, KY", "Hybrid", 100, "08-21-2023", "Got that dawg in you");
	
	public TestJobPostingModel getJobPosting(int id) {
		if (toiletFlusher.getID() == id)
		{
			return toiletFlusher;
		} 
		else if (unflusher.getID() == id)
		{
			return unflusher;
		}
		else if (supportAnimal.getID() == id)
		{
			return supportAnimal;
		}
		else
		{
			return null;
		}
	}
	
	public ObservableList<TestJobPostingModel> getJobs() {
		ObservableList<TestJobPostingModel> jobs = FXCollections.observableArrayList();
		jobs.add(toiletFlusher);
		jobs.add(unflusher);
		jobs.add(supportAnimal);
		return jobs;
	}
}
