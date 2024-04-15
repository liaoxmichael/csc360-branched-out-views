package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import models.BranchedOutModel;
import models.TransitionalViewModel;

public class UserController
{
	TransitionalViewModel tvm;
	BranchedOutModel model;

	@FXML
	private Button addExperienceBtn;

	@FXML
	private Button addSkillBtn;

	@FXML
	private Label bio;

	@FXML
	private Button editExperienceBtn;

	@FXML
	private Button editProfileBtn;

	@FXML
	private Button editSkillBtn;

	@FXML
	private Label name;

	@FXML
	private Label numFollowers;

	@FXML
	private Label numFollowing;

	@FXML
	private Label pronouns;

	public void setModels(BranchedOutModel newModel, TransitionalViewModel tvm)
	{
		this.tvm = tvm;
		model = newModel;
	}
	
	public void loadData() {
		bio.setText(model.drB.bio);
		name.setText(model.drB.name);
		pronouns.setText("(" + model.drB.pronouns + ")");
		numFollowers.setText(String.valueOf(model.drB.numFollowers));
		numFollowing.setText(String.valueOf(model.drB.numFollowing));
	}
}
