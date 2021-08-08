package com.company;

public class ConjuntoVetor {
    public static void TamVetor(){
        int maior=0, menor=99999;
        int [] maiorV={1,65,98,45,25,34,29,68,487,54};

        for (int j : maiorV) {
            if (j < menor) {
                menor = j;
            }
            if (j > maior) {
                maior = j;
            }
        }
        System.out.println("O maior valor é: "+ maior+"\nO menor valor : "+ menor);
    }
}
