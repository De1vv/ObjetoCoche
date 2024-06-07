

//Creacion de la clase "coche"
public class coche{ 
    //Atributos de nuestro objeto 
   String color; 
   String marca; 
   String placas;
   int km;  
   String dueño; 

   //Metodos 
   public static void main (String [] args ){

    coche coche1 = new coche(); 
    coche1.color = "Blanco"; 
    coche1 .marca = "BMW"; 
    coche1.placas = "001- PP2";
    coche1.km = 3450;
    coche1.dueño = "David"; 

    System.out.println("El coche 1 es de color " + coche1.color);
    System.out.println("La marca del coche 1 es: " + coche1.marca);
    System.out.println("Las placa del coche 1 son" + coche1.marca);
    System.out.println("El kilometraje del coche 1 es: " + coche1.km);
    System.out.println("El Dueño del coche 1 es: " + coche1.dueño);

    coche coche2 = new coche(); 
    coche2.color = "Negro"; 
    coche2 .marca = "Mazda"; 
    coche2.placas = "990-PD3";
    coche2.km = 4565;
    coche2.dueño = "Daniel";
    
    System.out.println("El coche 2 es de color " + coche2.color);
    System.out.println("La marca del coche 2 es: " + coche2.marca);
    System.out.println("Las placa del coche 2 son" + coche2.marca);
    System.out.println("El kilometraje del coche 2 es: " + coche2.km);
    System.out.println("El Dueño del coche 2 es: " + coche2.dueño);

   } 



}