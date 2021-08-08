package com.company;

public class TresVetores {
    public static void Vetores(){
        int[] vetorA={98,648,35,124,59};
        int[] vetorB={5,78,68,94,29};
        int[] vetorC=new int[5];

        for (int i = 0,j=0,s=0; i <vetorA.length ; i++,j++,s++) {
            vetorC[s]=vetorA[i]+vetorB[j];
            System.out.println(vetorC[s]);

        }
    }
}
