package dto;

public class PersonaInputDTO {
    private String nombre;
    private String contacto;
    private TipoContacto tipoContacto;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public TipoContacto getTipoContacto() {
        return tipoContacto;
    }

    public void setTipoContacto(TipoContacto tipoContacto) {
        this.tipoContacto = tipoContacto;
    }

    public PersonaInputDTO(String nombre, String contacto, TipoContacto tipoContacto) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.tipoContacto = tipoContacto;
    }

    @Override
    public String toString() {
        return "dto.PersonaInputDTO{" +
                "nombre='" + nombre + '\'' +
                ", contacto='" + contacto + '\'' +
                ", tipoContacto=" + tipoContacto +
                '}';
    }
}
