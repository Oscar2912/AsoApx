package dto;

import java.util.List;

public class CursoDTO {
    private String nombre;
    private List<EstudianteDTO> estudiantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<EstudianteDTO> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<EstudianteDTO> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public CursoDTO() {
    }

    public CursoDTO(String nombre, List<EstudianteDTO> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    @Override
    public String toString() {
        return "CursoDTO{" +
                "nombre='" + nombre + '\'' +
                ", estudiantes=" + estudiantes +
                '}';
    }


}
