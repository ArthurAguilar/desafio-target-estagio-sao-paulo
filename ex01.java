//1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); Ao final do processamento, qual será o valor da variável SOMA?

// Valor da variável soma no final = 90

public class ex01 {
    public static void main(String[] args) {
        int indice = 13;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k += 1;
            soma += k;
        }
        
        System.out.println(soma); // Soma = 90
    }
}