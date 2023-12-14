package dto;

import java.util.List;

public class ProjectDTO {
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "ProjectDTO{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
