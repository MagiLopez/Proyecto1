/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Scanner;

/**
 *
 * @author Ricardo
 */
public class Menu {
   Scanner menu =new Scanner(System.in);
    private char dig;
    private Alimentos alimet;
    private Registros regist;

    public Menu(char dig) {
        this.dig = dig;
    }

    public void dMenu(){    
        Registros reg = new Registros();
        Alimentos food = new Alimentos();
       int number;
      while(dig=='S'){
            System.out.println("MENU");
            System.out.println("1. REGISTRO");
            System.out.println("2. VER ALIMENTOS DIARIOS");
            System.out.println("3. SALIR ");
            System.out.println(" DIGITE OPCION: ");number = menu.nextInt();

            switch(number){
                case 1:reg.capturar();
                    break;
                case 2: food.menuAlimentos();
                    break;
                case 3: dig='N';
                 break;
             
            }  
        }
   // return ""; 
    }
     
}
