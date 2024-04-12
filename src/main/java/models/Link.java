package models;

import java.util.Objects;

public class Link
{

	int id;
	Page page;

	enum RelationshipType {
		HAS_SKILL, REQUIRES_SKILL,

		HAS_PROJECT,

		FOLLOWING_USER, FOLLOWER_USER, MENTOR_PERSON, CONTRIBUTOR_PERSON, COORDINATOR_PERSON, JOB_APPLICANT_PERSON,

		FROM_COMPANY,
	}

	RelationshipType relation;

	public Link(int id, Page page, RelationshipType type)
	{
		this.id = id;
		this.page = page;
		relation = type;
	}

	public int getId()
	{
		return id;
	}
	
	/**
	 * @return the page
	 */
	public Page getPage()
	{
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(Page page)
	{
		this.page = page;
	}

	/**
	 * @return the relation
	 */
	public RelationshipType getRelation()
	{
		return relation;
	}

	/**
	 * @param relation the relation to set
	 */
	public void setRelation(RelationshipType relation)
	{
		this.relation = relation;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(page, relation);
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
		Link other = (Link) obj;
		return Objects.equals(page, other.page) && relation == other.relation;
	}

	@Override
	public String toString()
	{
		// maybe need a cool way to tostring this? depending on listview
		return "Link [id=" + id + ", page=" + page + ", relation=" + relation + "]";
	}

}
