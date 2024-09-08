// 5) Escreva um programa que inverta os caracteres de um string.

// IMPORTANTE:
// a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
// b) Evite usar funções prontas, como, por exemplo, reverse;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a string para inverter: ");
        String entrada = sc.nextLine();

        String resultado = inverterString(entrada);
        
        System.out.println("String invertida: " + resultado);

        sc.close();
    }
    
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;

            inicio++;
            fim--;
        }
        
        return new String(caracteres);
    }
}
