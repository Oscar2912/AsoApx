package dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResponseDTO {
    private String nombre;
    private int numero;
    private Date fecha;
    private String email;
    private long cel;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getCel() {
        return cel;
    }

    public void setCel(long cel) {
        this.cel = cel;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "ResponseDTO{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", fecha=" + sdf.format(fecha) +
                ", email='" + email + '\'' +
                ", cel=" + cel +
                '}';
    }
}
