
package control;

import modelo.Alumno;

public class ArregloAlumno {
    private Alumno obj[];
    private int indice;
    
    public ArregloAlumno(){
        obj = new Alumno[10];
        indice = 0;
    }
    
    public void agregarAlumno(Alumno x){
        if(indice == obj.length){
            ampliarArreglo();
        }
        obj[indice]=x;
        indice++;
    }
    
    public void ampliarArreglo(){
        Alumno aux[] = obj;
        obj = new Alumno[indice+10];
        for (int i = 0; i < aux.length; i++) {
            obj[i]=aux[i];
        }
    }
    
    public void reiniciar(){
        obj = new Alumno[5];
        indice = 0;
    }
    
    public void eliminar(int pos){
        if(getLongTotal()<=1){
            reiniciar();
        }else{
            for (int i = pos; i < indice-1; i++) {
                obj[i]=obj[i+1];
            } 
            indice--;
        }
    }
    
    public int buscar(int codigo){
        for (int i = 0; i < indice; i++) {
            if(obj[i].getCodigo() == codigo){
                return i;
            }
        }
        return -1;
    }
    
    public Alumno getAlumno(int pos){
        return obj[pos];
    }
    
    public int getLongTotal(){
        return indice;
    }
    
    public String tipoAlumnos(int tipo,int clasificacion){
        String textoApro="";
        String textoDesa="";
        String aux="";
        for (int i = 0; i < indice; i++) {
            if(tipo == 1){
                //TODOS LOS ALUMNOS APROBADOS Ó DESAPROBADOS
                if(obj[i].getPromedio()>=0 && obj[i].getPromedio()<10.5){
                    aux=obj[i].getNombre()+" "+obj[i].getApellidopa()+" "+obj[i].getApellidoma()+"\n";
                    textoDesa = textoDesa.concat(aux);
                }else if(obj[i].getPromedio()<=20){
                    aux=obj[i].getNombre()+" "+obj[i].getApellidopa()+" "+obj[i].getApellidoma()+"\n";
                    textoApro = textoApro.concat(aux);
                }          
            }
            if(tipo==2){
                //ALUMNOS VARONES APROBADOS Ó DESAPROBADOS
                if(obj[i].getPromedio()>=0 && obj[i].getPromedio()<10.5 && obj[i].getSexo() == 'M'){
                    aux=obj[i].getNombre()+" "+obj[i].getApellidopa()+" "+obj[i].getApellidoma()+"\n";
                    textoDesa = textoDesa.concat(aux);
                }else if(obj[i].getPromedio()<=20  && obj[i].getSexo() == 'M'){
                    aux=obj[i].getNombre()+" "+obj[i].getApellidopa()+" "+obj[i].getApellidoma()+"\n";
                    textoApro = textoApro.concat(aux);
                }          
            }
            if(tipo==3){
                //ALUMNAS APROBADAS Ó DESAPROBADAS
                if(obj[i].getPromedio()>=0 && obj[i].getPromedio()<10.5 && obj[i].getSexo() == 'F'){
                    aux=obj[i].getNombre()+" "+obj[i].getApellidopa()+" "+obj[i].getApellidoma()+"\n";
                    textoDesa = textoDesa.concat(aux);
                }else if(obj[i].getPromedio()<=20  && obj[i].getSexo() == 'F'){
                    aux=obj[i].getNombre()+" "+obj[i].getApellidopa()+" "+obj[i].getApellidoma()+"\n";
                    textoApro = textoApro.concat(aux);
                }       
            }
        }
        if(clasificacion == 1 &&  indice>0){
            return textoApro;
        }
        if(clasificacion == 2 &&  indice>0){
            return textoDesa;
        }
        return "NO HAY ALUMNOS";
    }
    
    public static void main(String[] args) {
        ArregloAlumno x = new ArregloAlumno();

        System.out.println(x.tipoAlumnos(1, 1));
        System.out.println(x.tipoAlumnos(1, 2));
    }
}
