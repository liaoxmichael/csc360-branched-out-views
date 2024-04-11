package models;

public class SkillProficiency
{
	int id;
	
	enum ProficiencyLevel {
		BEGINNER, INTERMEDIATE, ADVANCED
	}

	ProficiencyLevel level;
	SkillModel skill;
	
	public SkillProficiency(SkillModel skill, ProficiencyLevel level)
	{
		this.skill = skill;
		this.level = level;
	}

	/**
	 * @return the level
	 */
	public ProficiencyLevel getLevel()
	{
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(ProficiencyLevel level)
	{
		this.level = level;
	}

	/**
	 * @return the skill
	 */
	public SkillModel getSkill()
	{
		return skill;
	}

	/**
	 * @param skill the skill to set
	 */
	public void setSkill(SkillModel skill)
	{
		this.skill = skill;
	}

}
