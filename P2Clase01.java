//Ajustar nombre del package
package clase1;

import java.util.Scanner;

public class P2Clase01 {

    public static void main(String[] args) {
        System.out.println("Hola desde main");
        //repaso();
        ejercicio1(); //Invocar el metodo ejercicio1
        //ejercicio2();
    }

    public static void repaso() {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Ingrese el dato");
        int dato = in.nextInt();
        System.out.println("dato = " + dato);

        System.out.println("Ingrese el nombre");
        in.nextLine(); //Limpiar buffer solo cuando se lee string luego de int
        String texto = in.nextLine();
        System.out.println("texto = " + texto);
        System.out.println(texto.length());

        float dato2 = 3f; //Literal de float
        double dato3 = 3d; //Literal de double

        //System.out.println(texto.charAt(0)+""); 
//Pasar char a string (debe tener al menos un elemento para que el indice cero exista)
    }

    public static void ejercicio1() {
        System.out.println("ejercicio1");

        int a = 8;
        int b = 3;
        int c = -5;

        //La salida no es correcta dado que el operador + concatena los numero como string
        System.out.println("La parte a es:" + a + b + c); //Salida: "La parte a es:83-5"
        //Debemos utilizar parentesis para que primero se realice la cuenta.
        System.out.println("La parte a es:" + (a + b + c)); //Salida: "La parte a es:16"
        
        //EL resultado de una operacion ente int da en int, por lo que no toma los numeros luego de la coma. 
        //Para este ejemplo 3/-5 da 0 en lugar de 0.6
        System.out.println("La parte h es:" + (a * (b / c))); //Salida: "La parte h es:0"
        System.out.println("La parte h es:" + (a * ( (double) b / c))); //Salida: "La parte h es:-4.8"

    }

    public static void ejercicio2() {
        System.out.println("ejercicio2");
    }
    
    //Ejemplo de sobrecarga de métodos, mismo nombre con parámetros diferentes.
    public static void ejercicio2(String nombre) {
        System.out.println("ejercicio2");
    }
    
    

}
