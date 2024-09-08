// 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
// • SP – R$67.836,43
// • RJ – R$36.678,66
// • MG – R$29.229,88
// • ES – R$27.165,48
// • Outros – R$19.849,53

// Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  

public class ex04 {
    public static void main(String[] args) {

        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        double percSp = (sp / totalFaturamento) * 100;
        double percRj = (rj / totalFaturamento) * 100;
        double percMg = (mg / totalFaturamento) * 100;
        double percEs = (es / totalFaturamento) * 100;
        double percOutros = (outros / totalFaturamento) * 100;

        System.out.printf("Percentual de representação de São Paulo: %.2f%%\n", percSp);
        System.out.printf("Percentual de representação de Rio de Janeiro: %.2f%%\n", percRj);
        System.out.printf("Percentual de representação de Minas Gerais: %.2f%%\n", percMg);
        System.out.printf("Percentual de representação de Espírito Santo: %.2f%%\n", percEs);
        System.out.printf("Percentual de representação de Outros: %.2f%%\n\n", percOutros);

        double testePerc = percSp + percRj + percMg + percEs + percOutros;
        System.out.printf("Teste percentual total: %.2f%%", testePerc);
    }
}
