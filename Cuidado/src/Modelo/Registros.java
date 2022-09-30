
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Registros {
    
            List<String>nombre=new ArrayList<>();
            List<Integer> edad=new ArrayList<>();
            List<Double> estatura=new ArrayList<>();
            List<Double> peso=new ArrayList<>();
           Scanner Entrada=new Scanner(System.in);
           
    public Registros() {
    }

    public List<String> getNombre() {
        return nombre;
    }

    public void setNombre(List<String> nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getEdad() {
        return edad;
    }

    public void setEdad(List<Integer> edad) {
        this.edad = edad;
    }

    public List<Double> getEstatura() {
        return estatura;
    }

    public void setEstatura(List<Double> estatura) {
        this.estatura = estatura;
    }

    public List<Double> getPeso() {
        return peso;
    }

    public void setPeso(List<Double> peso) {
        this.peso = peso;
    }

     
      public String capturar(){
          
          String salt;
          
          char OP='S';
          while (OP=='S'){
          
          System.out.println("Por favor digite su nombre   ");nombre.add(Entrada.nextLine());
          System.out.println("Por favor digite su edad     ");edad.add(Entrada.nextInt());
          System.out.println("Por favor digite su estatura ");estatura.add(Entrada.nextDouble());
          System.out.println("Por favor digite su peso     ");peso.add(Entrada.nextDouble());
          System.out.println("Desea continuar(S/N)         ");OP=Entrada.next().charAt(0);
          System.out.println("");salt=Entrada.nextLine();
          } 
          return "";
      }          
    
    
            
}

