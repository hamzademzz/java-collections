package JavaAssignment;

public class SuperHeroes {

    public SuperHeroes(String pseudonym, int height, int intelligenceRating, int strengthRating, int speedRating, int agilityRating, int fightingSkillsRating, String realName, String description) {
        this.pseudonym = pseudonym;
        this.height = height;
        this.intelligenceRating = intelligenceRating;
        this.strengthRating = strengthRating;
        this.speedRating = speedRating;
        this.agilityRating = agilityRating;
        this.fightingSkillsRating = fightingSkillsRating;
        this.realName = realName;
        this.description = description;
    }

    public SuperHeroes(){

    }

    String pseudonym;
    String realName;
    String description;

    int height;
    int intelligenceRating;
    int strengthRating;
    int speedRating;
    int agilityRating;
    int fightingSkillsRating;



    public String getPseudonym() {
        return pseudonym;
    }

    public void setPseudonym(String pseudonym) {
        this.pseudonym = pseudonym;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIntelligenceRating() {
        return intelligenceRating;
    }

    public void setIntelligenceRating(int intelligenceRating) {
        this.intelligenceRating = intelligenceRating;
    }

    public int getStrengthRating() {
        return strengthRating;
    }

    public void setStrengthRating(int strengthRating) {
        this.strengthRating = strengthRating;
    }

    public int getSpeedRating() {
        return speedRating;
    }

    public void setSpeedRating(int speedRating) {
        this.speedRating = speedRating;
    }

    public int getAgilityRating() {
        return agilityRating;
    }

    public void setAgilityRating(int agilityRating) {
        this.agilityRating = agilityRating;
    }

    public int getFightingSkillsRating() {
        return fightingSkillsRating;
    }

    public void setFightingSkillsRating(int fightingSkillsRating) {
        this.fightingSkillsRating = fightingSkillsRating;
    }
}
