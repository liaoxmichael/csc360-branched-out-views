package models;

import javafx.beans.property.SimpleStringProperty;

public abstract class UserModel extends EntityModel
{
	
	SimpleStringProperty name;
	SimpleStringProperty bio;
	SimpleStringProperty email;
	SimpleStringProperty phone;
	SimpleStringProperty avatarURL;
	SimpleStringProperty bannerURL;
	
	public UserModel(int id, String name, String email)
	{
		super(id);
		this.name = new SimpleStringProperty();
		this.bio = new SimpleStringProperty();
		this.email = new SimpleStringProperty();
		this.phone = new SimpleStringProperty();
		this.avatarURL = new SimpleStringProperty();
		this.bannerURL = new SimpleStringProperty();
		
		this.name.set(name);
		this.email.set(email);
	}
	
	public String getName()
	{
		return name.get();
	}

	public void setName(String name)
	{
		this.name.set(name);
	}

	public SimpleStringProperty nameProperty()
	{
		return this.name;
	}
	
	public String getBio()
	{
		return bio.get();
	}

	public void setBio(String bio)
	{
		this.bio.set(bio);
	}

	public SimpleStringProperty bioProperty()
	{
		return this.bio;
	}
	
	public String getEmail()
	{
		return email.get();
	}

	public void setEmail(String email)
	{
		this.email.set(email);
	}

	public SimpleStringProperty EmailProperty()
	{
		return this.email;
	}
	
	public String getPhone()
	{
		return phone.get();
	}

	public void setPhone(String phone)
	{
		this.phone.set(phone);
	}

	public SimpleStringProperty phoneProperty()
	{
		return this.phone;
	}
	
	public String getAvatarURL()
	{
		return avatarURL.get();
	}

	public void setAvatarURL(String avatarURL)
	{
		this.avatarURL.set(avatarURL);
	}

	public SimpleStringProperty avatarURLProperty()
	{
		return this.avatarURL;
	}
	
	public String getBannerURL()
	{
		return bannerURL.get();
	}

	public void setBannerURL(String bannerURL)
	{
		this.bannerURL.set(bannerURL);
	}

	public SimpleStringProperty bannerURLProperty()
	{
		return this.bannerURL;
	}

}
