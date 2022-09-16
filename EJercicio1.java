import java.util.Scanner;

public class EJercicio1 {
    public static void main(String[] args) {
        System.out.println("¡Hola, MIGUEL!");
        System.out.printf("\n \n \n" );
        ejercicio3();
        System.out.printf("\n \n \n" );
        ejercicio4();
        System.out.printf("\n \n \n" );
        ejercicio5();
        System.out.printf("\n \n \n" );
        ejercicio6();
        System.out.printf("\n \n \n" );
        ejercicio7();
        System.out.printf("\n \n \n" );
        ejercicio10();
        //System.out.printf("\n \n \n" );
       // System.out.printf("Entrada: \n");
        //ejercicio11  ( );
       // System.out.printf("Entrada: \n");
       // ejercicio12();
        System.out.printf("\n \n \n" );
        System.out.printf("Entrada: \n");
        ejercicio13();

    }

    public static void ejercicio3  ( ){
        System.out.printf("Primera \n");
        System.out.printf("Segunda \n");
        System.out.printf("Tercera \n");
    }
    public static void ejercicio4  ( ){

        System.out.printf("********* \n");
        System.out.printf("      *** \n");
        System.out.printf("      *** \n");
        System.out.printf("      *** \n");
        System.out.printf("***   *** \n");
        System.out.printf("***   *** \n");
        System.out.printf("********* \n");


    }
    public static void ejercicio5  ( ){
        int x=0;
        while(x<=4)
        {
            System.out.printf("" + x +"\n");
            x++;
        }
    }
    public static void ejercicio6  ( ) {
        int x=9;
        while((x<10)&&(x>=0))
        {
            System.out.printf("" + x +"\n");
            x--;
        }
    }
    public static void ejercicio7  ( ){
        System.out.printf("    *     \n");
        System.out.printf("   ***    \n");
        System.out.printf("  *****   \n");
        System.out.printf("   ***    \n");
        System.out.printf("    *     \n");
    }
    public static void ejercicio10  ( ){


        System.out.print("¡Tres! ");
        System.out.print("¡Dos! ");
        System.out.println("¡Uno! \n");
        // System.out.println("¡Adelante!");

        System.out.println("¡Adelante!");
    }

    public static void ejercicio11  ( )
    {

        String entrada1 = "";
        Scanner entradaEscaner1 = new Scanner(System.in);
        entrada1 = entradaEscaner1.nextLine();

        String entrada2 = "";
        Scanner entradaEscaner2= new Scanner(System.in);
        entrada2 = entradaEscaner2.nextLine();

        String entrada3 = "";
        Scanner entradaEscaner3= new Scanner(System.in);
        entrada3 = entradaEscaner3.nextLine();

        String entrada4 = "";
        Scanner entradaEscaner4= new Scanner(System.in);
        entrada4 = entradaEscaner4.nextLine();

        String entrada5 = "";
        Scanner entradaEscaner5= new Scanner(System.in);
        entrada5 = entradaEscaner5.nextLine();

        System.out.println("" + entrada1 +"\n"+entrada2 +"\n"+entrada3 +"\n"+ entrada4 +"\n"+ entrada5);
    }

    public static void ejercicio12  ( ){
        String entrada1 = "";
        Scanner entradaEscaner1 = new Scanner(System.in);
        entrada1 = entradaEscaner1.nextLine();

        String entrada2 = "";
        Scanner entradaEscaner2= new Scanner(System.in);
        entrada2 = entradaEscaner2.nextLine();

        String entrada3 = "";
        Scanner entradaEscaner3= new Scanner(System.in);
        entrada3 = entradaEscaner3.nextLine();
        System.out.println("" + entrada3 +"\n"+entrada2 +"\n"+entrada1);

    }
    public static void ejercicio13  ( ){
        String nombre = "";
        Scanner entradaNombre = new Scanner(System.in);
        nombre = entradaNombre.nextLine();

        String edad = "";
        Scanner entradaEdad= new Scanner(System.in);
        edad = entradaEdad.nextLine();


        String exp = "";
        Scanner entradaExp= new Scanner(System.in);
        exp = entradaExp.nextLine();

        String comida = "";
        Scanner entradaComida= new Scanner(System.in);
        comida = entradaComida.nextLine();

        System.out.println("El formulario de " + nombre +",de "+edad+ " años  y " +exp +" de experiencia, esta completo. Nos \n"
                +"comunicaremos con usted si necesitamos alguien que cocine comida "+comida +".");
    }

}
