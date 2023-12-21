package bolsaEmpleo;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/***
 * @author Zamir Pineda
 * @version v0
 * @since 06/12/2023
 */

@DatabaseTable(tableName = "aspirantes")
public class Aspirante {

    //Atributos

    @DatabaseField(id = true)
    private int cedula; //Llave primaria

    @DatabaseField
    private String nombreCompleto;

    @DatabaseField
    private int edad;

    @DatabaseField
    private int exp;

    @DatabaseField
    private String profesion;

    @DatabaseField
    private String telefono;

    // Constructor vacio necesario para ORMLite
    public Aspirante() {
    }

    // Constructor con parametros
    public Aspirante(int cedula, String nombreCompleto, int edad, int exp, String profesion, String telefono) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.exp = exp;
        this.profesion = profesion;
        this.telefono = telefono;
    }

    //Getters y Setters

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //ToString

    @Override
    public String toString() {
        return "Aspirante{" +
                "cedula=" + cedula +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", exp=" + exp +
                ", profesion='" + profesion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
