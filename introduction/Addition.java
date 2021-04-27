package aula;
import java.util.Scanner;
class Addition {
    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        

        int a;
        int b;
        int c;

        System.out.print("Insira o primeiro número: ");
        a = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        b = entrada.nextInt();

        c = a+b;

        System.out.printf("Resultado: %d %n", c);

        entrada.close();

    }
}