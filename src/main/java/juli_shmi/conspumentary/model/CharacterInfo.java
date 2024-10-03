package juli_shmi.conspumentary.model;

import juli_shmi.conspumentary.model.enums.Occupation;

public class CharacterInfo {

    private String name;
    private int age;
    private String gender;
    private String background;
    private String personality;
    protected Occupation occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }


    @Override
    public String toString() {
        return "CharacterInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", background='" + background + '\'' +
                ", personality='" + personality + '\'' +
                ", occupation=" + occupation +
                '}';
    }
}
