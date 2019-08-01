package ordenamiento;
import java.util.Random;
import java.util.Scanner;
public class Ordenamiento {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);//para ingresar datos con el teclado
        Random nr=new Random();//generador de numeros random
         int [] n= new int[25];//se inicializa el vector
         int i,j;
         int numero,aux;//variable en donde se almacenan los datos
   for( i=0;i<25;i++){ //inicio for para crear numeros random
   numero=100+nr.nextInt(25); //indica de que rango seran nuestros numeros random
   n[i]=numero;//se guarda el dato en una parte del vector
    System.out.println("Datos del Arreglo: "+n[i]);//muestra los numeros que contiene el vector
   }//fin for para crear numeros random
 //inicio metodo burbuja
 for(i=0; i<(25-1);i++){//INICIO FOR VERIFICAR VECEES QUE TIENE QUE RECORRER EL VECTOR
     for (j=0; j<(25-1);j++){//INICIO FOR QUE ORDENA DATOS
         if(n[j]>n[j+1]){//INICIO si el numero actual es mayor al numero siguiente realiza el cambio
              aux=n[j];//variable auxiliar toma el valor del arreglo en primera posicion
              n[j]=n[j+1];///primera posicion del arreglo toma el valor de la segunda posicion
              n[j+1]= aux;//segunda posicion del arreglo toma el valor de auxiliar (primera posicion)
        }//FIN IF si el numero actual es mayor al numero siguiente
     }//FIN FOR QUE ORDENA DATOS
 }//FIN FOR VERIFICAR VECEES QUE TIENE QUE RECORRER EL VECTOR
 //fin metodo burbuja
        System.out.println("/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*");
        System.out.println("METODO BURBUJA ");
        System.out.println("/*//*/*/*/*/*/*/*/*/*/*/*/*/*/*");
 for( i=0;i<25;i++){ //inicio for para crear numeros random
    System.out.println("Datos del Arreglo: "+n[i]);//muestra los numeros que contiene el vector
   }//fin for para crear numeros random
    }    
}
