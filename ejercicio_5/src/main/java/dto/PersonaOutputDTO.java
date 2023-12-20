package dto;

public class PersonaOutputDTO {
    private String nombre;
    private String contactoProcesado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContactoProcesado() {
        return contactoProcesado;
    }

    public void setContactoProcesado(String contactoProcesado) {
        this.contactoProcesado = contactoProcesado;
    }

    public PersonaOutputDTO(String nombre, String contactoProcesado) {
        this.nombre = nombre;
        this.contactoProcesado = contactoProcesado;
    }

    @Override
    public String toString() {
        return "dto.PersonaOutputDTO{" +
                "nombre='" + nombre + '\'' +
                ", contactoProcesado='" + contactoProcesado + '\'' +
                '}';
    }
}
