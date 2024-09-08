/* 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
• O menor valor de faturamento ocorrido em um dia do mês;
• O maior valor de faturamento ocorrido em um dia do mês;
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal; */ 

// Observação: Realizei o teste em js para não precisar ficar baixando dependencias no java.

const fs = require('fs');

const caminhoArquivo = 'ex03.json'; 
const conteudoArquivo = fs.readFileSync(caminhoArquivo);
const faturamentoMensal = JSON.parse(conteudoArquivo);

let menorFaturamento = Number.MAX_VALUE;
let maiorFaturamento = Number.MIN_VALUE;
let somaFaturamento = 0;
let diasComFaturamento = 0;


faturamentoMensal.faturamento_diario.forEach(faturamento => {
    if (faturamento > 0) {
        if (faturamento < menorFaturamento) {
            menorFaturamento = faturamento;
        }
        if (faturamento > maiorFaturamento) {
            maiorFaturamento = faturamento;
        }
        somaFaturamento += faturamento;
        diasComFaturamento++;
    }
});

const mediaMensal = somaFaturamento / diasComFaturamento;

let diasAcimaDaMedia = 0;
faturamentoMensal.faturamento_diario.forEach(faturamento => {
    if (faturamento > mediaMensal) {
        diasAcimaDaMedia++;
    }
});

console.log("Menor valor de faturamento: " + menorFaturamento);
console.log("Maior valor de faturamento: " + maiorFaturamento);
console.log("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

