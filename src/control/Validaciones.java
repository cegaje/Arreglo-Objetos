
package control;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class Validaciones {
    public boolean validar(double promedio,char sexo){
        if(promedio>=0 && promedio<=20){
            if(sexo == 'M' || sexo == 'F'){
                return true;
            }
        }
        return false;
    }
    
    public void soloNumero(char type, java.awt.event.KeyEvent e){
        if(Character.isLetter(type)){
            e.consume();
            mensaje("Ingrese solo numeros");
        }
    }
    
    public void soloLetras(char type, java.awt.event.KeyEvent e){
        if(Character.isDigit(type)){
            e.consume();
            mensaje("Ingrese correctamente los datos");
        }
    }
    
    public void mensaje(String msn){
        JOptionPane.showMessageDialog(null, msn);
    }
}
