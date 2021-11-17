package com.company;

public class MatrizQuatroPorDois {
    public static void MatrizDeFloat(){

        final String RED = "\u001b[31m";
        final String RESET = "\u001b[0m";
        float[][] matQuatroXDois=new float[4][2];
        float mults=1;
        float somaLinha=0;
        float somaArray=0;

        for (int i = 0; i < matQuatroXDois.length; i++) {
            for (int j= 0; j < matQuatroXDois.length-2; j++) {
                matQuatroXDois[i][j]=(int)(Math.random()*100);
                somaArray+=matQuatroXDois[i][j];
                if (i==0 && j==0 ||i==0 && j==1){
                    somaLinha+=matQuatroXDois[i][j];
                }
                if (j==1) {
                    mults *= matQuatroXDois[i][j];
                }
                System.out.print(matQuatroXDois[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("\n A multiplicação dos valores da segunda coluna é: "+ RED + mults + RESET);
        System.out.println("\n A multiplicação dos valores da segunda coluna é: "+ RED + mults + RESET);
        System.out.println("\n A soma dos valores da primeira linha é: "+ RED + somaLinha + RESET);
        System.out.println("\n A soma dos valores da matriz é: "+RED + somaArray + RESET);

    }
}
