
package Modelo;

import java.util.Scanner;


public class Alimentos {
    
    Scanner Entrada2=new Scanner(System.in);
    
    public void menuAlimentos(){
        
                int seleccion;
                
                char op='S';
                
                while (op=='S'){
    
                         System.out.println("BIENVENIDO A NUESTRA GUIA DE COMIDAS SEÑOR USUARIO");
                         System.out.println("ESCOJA UN DIA DE LA SEMANA");
                         System.out.println("1. Lunes");
                         System.out.println("2. Martes");
                         System.out.println("3. Miercoles");
                         System.out.println("4. Jueves");
                         System.out.println("5. Viernes");
                         System.out.println("6. Sabado");
                         System.out.println("7. Domingo");
                         System.out.println("8. Salir");
                       
                         System.out.println("Escoga una opcion  ");seleccion=Entrada2.nextInt();
                         
                         switch (seleccion) {
                             
                             case 1:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Lunes");
                                 
                                 System.out.println("Desayuno:   té o café - 2 rebanadas pan integral con 50g. de queso");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   ensalada de lechuga - esparragos - tomates - 4 aceitunas y cebolla - 150g. ternera -1 fruta.");
                                 System.out.println("--------------------------------------------------------------------");
                                 System.out.println("Cena:       Atún al natural Pimientos al horno - 1 fruta..");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                            
                                 
                             case 2:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Martes");
                                 
                                 System.out.println("Desayuno:   zumo de naranja - 2 tostadas con mantequilla.");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   arroz con verduras - 40g. de queso - 1 fruta.");
                                 System.out.println("--------------------------------------------------------------------");
                                 System.out.println("Cena:       espárragos blancos con mayonesa light dos huevos duros - 1 yogur..");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                                 
                             case 3:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Miercoles");
                                 
                                 System.out.println("Desayuno:   té o café - 2 tostadas con mermelada Light.");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   150g. pollo a la plancha -1 fruta..");
                                 System.out.println("--------------------------------------------------------------------");
                                 System.out.println("Cena:       sopa de verduras tortilla - 1 fruta.");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                                 
                             case 4:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Jueves");
                                 
                                 System.out.println("Desayuno:   zumo de naranja - 2 bollos pequeños integrales..");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   Lentejas cocidas (sin chorizito ni nada de eso eh!) - filete de pescado a la plancha - ensalada de frutas..");
                                 System.out.println("--------------------------------------------------------------------");
                                 System.out.println("Cena:       Patatas hervidas con mayonesa Light 1 yogur..");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                                 
                             case 5:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Viernes");
                                 
                                 System.out.println("Desayuno:  té o café - 2 rebanadas pan integral con 50g. de queso..");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   ensalada de lechuga - espárragos - tomates - 4 aceitunas y cebolla - 150g. pavo a la plancha - 1 fruta");
                                 System.out.println("Cena:      pasta al gusto..");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                                 
                             case 6:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Sabado");
                                 
                                 System.out.println("Desayuno:  Huevo cocido o plancha y plátano..");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   Crema de calabacín y gambas. Chipirones encebollados. Sandía.");
                                 System.out.println("Cena:     Melón con jamón...");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                                 
                             case 7:
                                 
                                 System.out.println("-------------------------------------");
                                 System.out.println("-------------------------------------");
                                 System.out.println("Dia Domingo");
                                 
                                 System.out.println("Desayuno:  Fiambre natural de pavo y 6 fresas..");
                                 System.out.println("-------------------------------------------------------------------");
                                 System.out.println("Almuerzo:   Menestra de verduras. Guiso de carne. Melón..");
                                 System.out.println("Cena:     Pimientos del piquillo y atún.");
                                 System.out.println("-----------------------------------------------------");
                                 System.out.println("Desea volver (S/N)");op=Entrada2.next().charAt(0);
                                 break;
                                 
                             case 8: op='N';     
                                     }
                         
                 }
     }
}
