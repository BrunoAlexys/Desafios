import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = input.nextInt();
        boolean encontrado = false;
        int a = 0, b = 1, c = 1;
        while (c <= numero) {
            if (c == numero) {
                encontrado = true;
                break;
            }
            a = b;
            b = c;
            c = a + b;
        }
        if (encontrado) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }
}

