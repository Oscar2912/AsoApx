package dto;

public class OutputDTO {
    private String fullName;
    private int yearsOld;
    private String jobTitle;

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

    public OutputDTO(String fullName, int yearsOld, String jobTitle) {
        this.fullName = fullName;
        this.yearsOld = yearsOld;
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "OutputDTO{" +
                "fullName='" + fullName + '\'' +
                ", yearsOld=" + yearsOld +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
