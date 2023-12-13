package dto;

import java.util.List;

public class InputTwoDTO {
    private String name;
    private int age;
    private String occupation;
    private List<String> skills;

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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public InputTwoDTO(String name, int age, String occupation, List<String> skills) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "InputTwoDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", skills=" + skills +
                '}';
    }
}
