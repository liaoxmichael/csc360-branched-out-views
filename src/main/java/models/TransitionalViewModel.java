package models;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import views.MainController;
import views.SkillController;
import views.UserController;

public class TransitionalViewModel
{
	BorderPane mainview;
	BranchedOutModel model;

	public TransitionalViewModel(BorderPane view, BranchedOutModel model)
	{
		mainview = view;
		this.model = model;
	}
	
	public void showMain() throws IOException {
		// set mainview to dashboard
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TransitionalViewModel.class.getResource("../views/MainView.fxml"));

		Pane view = loader.load();

		MainController controller = loader.getController();
		mainview.setTop(null);
		mainview.setCenter(view);
		mainview = (BorderPane) view; // reset mainview to take perspective of actual Main (w/ nav bar) instead of LoginView
		controller.setModels(model, this);
	}
	
	public void showSearchDisplay() {
		//set center to display list of job postings
		
	}
	
	public void showProfile() throws IOException {
		// set center to user profile
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TransitionalViewModel.class.getResource("../views/UserView.fxml"));

		ScrollPane view = loader.load();

		UserController controller = loader.getController();
		mainview.setCenter(view);
		controller.setModels(model, this);
	}
	
	public void showSkill() throws IOException {
		// show skill page from user profile
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TransitionalViewModel.class.getResource("../views/SkillView.fxml"));

		ScrollPane view = loader.load();

		SkillController controller = loader.getController();
		mainview.setCenter(view);
		controller.setModels(model, this);
	}
	
	public void onClickJob() {
		// 
	}

	public void showJobPosting()
	{
		// TODO takes us from display job postings to job posting page
		
	}

}
