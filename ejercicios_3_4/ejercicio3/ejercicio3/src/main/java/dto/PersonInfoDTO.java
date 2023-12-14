package dto;

import java.util.List;

public class PersonInfoDTO {
    private String fullName;
    private int age;
    private String occupation;
    private List<ProjectDTO> projects;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public List<ProjectDTO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectDTO> projects) {
        this.projects = projects;
    }

    public PersonInfoDTO(String fullName, int age, String occupation, List<ProjectDTO> projects) {
        this.fullName = fullName;
        this.age = age;
        this.occupation = occupation;
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "PersonInfoDTO{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                ", projects=" + projects +
                '}';
    }
}
