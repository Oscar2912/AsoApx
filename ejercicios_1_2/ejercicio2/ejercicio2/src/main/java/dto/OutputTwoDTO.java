package dto;

import java.util.List;

public class OutputTwoDTO {
    private String fullName;
    private int yearsOld;
    private String jobTitle;
    private List<String> formattedSkills;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public List<String> getFormattedSkills() {
        return formattedSkills;
    }

    public void setFormattedSkills(List<String> formattedSkills) {
        this.formattedSkills = formattedSkills;
    }

    public OutputTwoDTO(String fullName, int yearsOld, String jobTitle, List<String> formattedSkills) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
        this.jobTitle = jobTitle;
        this.formattedSkills = formattedSkills;
    }

    @Override
    public String toString() {
        return "OutputTwoDTO{" +
                "fullName='" + fullName + '\'' +
                ", yearsOld=" + yearsOld +
                ", jobTitle='" + jobTitle + '\'' +
                ", formattedSkills=" + formattedSkills +
                '}';
    }
}
