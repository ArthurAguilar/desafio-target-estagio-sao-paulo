// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int num = sc.nextInt();

        if (pertenceFibonacci(num)) {
            System.out.printf("O número %d pertence à sequência de Fibonacci.", num);
        } else {
            System.out.printf("O número %d não pertence à sequência de Fibonacci.", num);
        }

        sc.close();
    }

    public static boolean pertenceFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int a = 0;
        int b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }

            int proximoNum = a + b;
            a = b;
            b = proximoNum;
        }

        return false;
    }


}