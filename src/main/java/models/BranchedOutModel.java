package models;

public class BranchedOutModel
{
	TestPersonModel drB = new TestPersonModel();
	TestJobPostingModel toiletFlusher = new TestJobPostingModel("Toilet Flusher",
			"Responsible for flushing all toilets around campus. Students are no longer allowed to do it themselves.",
			"Centre College", "Danville, KY", "On-site", 62092, "05-12-2022", "SQL", "Advanced Python Programming",
			"Masters in Human-Computer Interaction");
	TestJobPostingModel unflusher = new TestJobPostingModel("Toilet Unflusher", "You know what to do.",
			"Centre College", "Danville, KY", "Remote", 22, "05-13-2023", "Big Heart", "React.js",
			"ChatGPT proficiency");
	TestJobPostingModel supportAnimal = new TestJobPostingModel("Support Animal", "For student mental health.",
			"Centre College", "Danville, KY", "Hybrid", 100, "08-21-2023", "Got that dawg in you");
}
