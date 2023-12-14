package dto;

import java.util.List;

public class OutputInfoDTO {
    private String personName;
    private int personAge;
    private String personOccupation;
    private List<String> formattedProjectNames;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getPersonOccupation() {
        return personOccupation;
    }

    public void setPersonOccupation(String personOccupation) {
        this.personOccupation = personOccupation;
    }

    public List<String> getFormattedProjectNames() {
        return formattedProjectNames;
    }

    public void setFormattedProjectNames(List<String> formattedProjectNames) {
        this.formattedProjectNames = formattedProjectNames;
    }

    public OutputInfoDTO(String personName, int personAge, String personOccupation, List<String> formattedProjectNames) {
        this.personName = personName;
        this.personAge = personAge;
        this.personOccupation = personOccupation;
        this.formattedProjectNames = formattedProjectNames;
    }

    @Override
    public String toString() {
        return "OutputInfoDTO{" +
                "personName='" + personName + '\'' +
                ", personAge=" + personAge +
                ", personOccupation='" + personOccupation + '\'' +
                ", formattedProjectNames=" + formattedProjectNames +
                '}';
    }
}
