import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int i=0;
        Scanner entrada1=new Scanner (System.in);
        System.out.println (" \nIngrese el numero: ");
        i = entrada1.nextInt ();
        if(i<0)
        {
            System.out.printf("El numero es negativo");
        }
        else {
            System.out.printf("El numero es positivo");
        }
    }
}
