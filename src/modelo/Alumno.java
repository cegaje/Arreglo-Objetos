
package modelo;

public class Alumno {
    private int codigo;
    private String nombre;
    private String apellidopa;
    private String apellidoma;
    private char sexo;
    private double promedio;

    public Alumno(int codigo, String nombre, String apellidopa, String apellidoma, char sexo, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidopa = apellidopa;
        this.apellidoma = apellidoma;
        this.sexo = sexo;
        this.promedio = promedio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopa() {
        return apellidopa;
    }

    public void setApellidopa(String apellidopa) {
        this.apellidopa = apellidopa;
    }

    public String getApellidoma() {
        return apellidoma;
    }

    public void setApellidoma(String apellidoma) {
        this.apellidoma = apellidoma;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
        
    
}
