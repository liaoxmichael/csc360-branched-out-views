package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Page
{

	int id;
	protected Entity entity;
	protected List<User> canEdit;
	protected List<User> cantView;

	public Page(int id, Entity entity)
	{
		this.id = id;
		this.entity = entity;
		canEdit = new ArrayList<User>();
		cantView = new ArrayList<User>();
	}

	public int getId()
	{
		return id;
	}

	public void addEditor(User user)
	{
		canEdit.add(user);
	}

	public boolean removeEditor(User user)
	{

		return canEdit.remove(user);
	}

	public void blockViewer(User user)
	{
		cantView.add(user);
	}

	public boolean unblockViewer(User user)
	{
		return cantView.remove(user);
	}

	/**
	 * @return whether or not the specified user has edit permissions
	 */
	public boolean canEdit(User user)
	{
		return canEdit.contains(user);
	}

	/**
	 * @return whether or not the specified user is blocked from viewing
	 */
	public boolean cantView(User user)
	{
		return cantView.contains(user);
	}

	/**
	 * @return the canEdit
	 */
	public List<User> getCanEdit()
	{
		return canEdit;
	}

	/**
	 * @param canEdit the canEdit to set
	 */
	public void setCanEdit(List<User> canEdit)
	{
		this.canEdit = canEdit;

	}

	/**
	 * @return the cantView
	 */
	public List<User> getCantView()
	{
		return cantView;
	}

	/**
	 * @param cantView the cantView to set
	 */
	public void setCantView(List<User> cantView)
	{
		this.cantView = cantView;
	}

	/**
	 * @return the entity
	 */
	public Entity getEntity()
	{
		return entity;
	}

	/**
	 * @param entity the entity to set
	 */
	public void setEntity(Entity entity)
	{
		this.entity = entity;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Page other = (Page) obj;
		return id == other.id;
	}

	@Override
	public String toString()
	{
		return "Page [id=" + id + ", entity=" + entity + ", canEdit=" + canEdit + ", cantView=" + cantView + "]";
	}

}
