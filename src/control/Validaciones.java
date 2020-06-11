
package control;

public class Validaciones {
    public boolean validarPromedio(double promedio,char sexo){
        if(promedio>=0 && promedio<=20){
            if(sexo == 'M' || sexo == 'F'){
                return true;
            }
        }
        return false;
    }
}
