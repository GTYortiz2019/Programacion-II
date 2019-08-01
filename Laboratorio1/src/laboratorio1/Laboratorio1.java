/*
 *Yulian Christofer Ortiz Morales
 *5090-18-534
 */
package laboratorio1;
import java.util.Scanner; 
public class Laboratorio1 {
    public static void main(String[] args) {//inicio main principal
 menu();//llama a funcion menu
    }//fin main principal
    public static void menu(){//inicio funcion menu
       int op;//declaracion de variable entera para uso en switch
     Scanner var = new Scanner(System.in);//para poder ingresar datos desde el teclado
        System.out.println("*-*-**-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");//muestra texto en pantalla
        System.out.println("\n\n ***SELECCIONE SE SU OPCION*** ");//muestra texto en pantalla
        System.out.println("¿Que es IDE?....................1");//muestra texto en pantalla
        System.out.println("Variables/Operadores............2");//muestra texto en pantalla
        System.out.println("Condicionales...................3");//muestra texto en pantalla
        System.out.println("Ciclos..........................4");//muestra texto en pantalla
        System.out.println("Arreglos........................5");//muestra texto en pantalla
        System.out.println("Salir...........................6");//muestra texto en pantalla
        System.out.print("?: ");//muestra texto en pantalla
        op=var.nextInt();//solicita el valor  que obtendra la variable op
        switch(op){//primer condicional, se usa para indicar que opcion mostrara
            case 1: ide(); menu(); break;
            case 2: variables(); menu(); break;
            case 3: condicionales(); menu(); break;
            case 4: ciclos();menu();  break;
            case 5: arreglos();menu(); break;
            case 6: System.out.println("Gracias por utilizar el programa..... \nSaliendo....."); break;
            default: System.out.println("Opcion invalida ");menu(); break;
        }
    }   
   public static void ide(){
       System.out.println("IDE ES:Entorno de Desarollo Integrado");
   }
   public static void variables(){
       Scanner var = new Scanner(System.in);
       int aa,an,ed;
       boolean a1;
       char a2;
       String no;
       System.out.print("Ingrese Nombre: ");
       no= var.nextLine();
       System.out.print("Ingrese Inicial de su Apellido: ");
       a2=var.nextLine().charAt(0);
       System.out.print("Ingrese Primer digito: ");
       an=var.nextInt();
       System.out.print("Ingrese Segundo Digito: ");
       aa=var.nextInt();
       ed=aa+an;
       System.out.println("\nLa suma de los 2 digitos anterioes es: "+ed);
       ed=aa-an;
       System.out.println("La resta de los 2 digitos anterioes es: "+ed);
       ed=aa*an;
       System.out.println("La multiplicacion de los 2 digitos anterioes es: "+ed);
       ed=aa/an;
       System.out.println("La division de los 2 digitos anterioes es: "+ed);
   }
   
   public static void condicionales(){
   Scanner var = new Scanner(System.in);
   int an,aa;
   boolean v;
   v=false;
       System.out.println("Ingrese 2 digitos en los cuales el primero sea mayor que el menor (a1>a2)");
          System.out.print("Ingrese Primer digito: ");
       an=var.nextInt();
       System.out.print("Ingrese Segundo Digito: ");
       aa=var.nextInt();
       if(an>aa){
       v=true;
           System.out.println("El Primer Dato es Mayor: "+an);
       }
      if(v!=true){
          System.out.println("El Dato Mayor es el Segundo");
      }    
   }
   
   public static void ciclos(){
   Scanner var = new Scanner(System.in);
   int f,cont=0;
   for(int i=0;i<10;i++){
       System.out.println("Ingrese dato "+i+" : ");
       f=var.nextInt();
        if(f>100){
        cont++;
        }
   }
       System.out.println("Cantidad de numeros mayores a 100: "+cont);
   }
   
   public static void arreglos(){
   Scanner var = new Scanner(System.in);
   int i=0;
   int [] a = new int[20];
   for( i=0;i<10;i++){
    System.out.println("Ingrese datos para el vector "+i+" : ");
    a[i]=var.nextInt();
   }
       System.out.println("Los Datos en el Vector son");
          for( i=0;i<10;i++){
    System.out.println("Dato "+i+" : " +a[i]);
   }
   }   
}
