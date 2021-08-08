package com.company;

public class VetoresDecrescentes {
    public static void MultiplicarVetores(){
        int [] vetorA=new int[20];
        int [] vetorB=new int[20];
        int [] vetorC=new int[20];

        for (int i = 0, m=0; i <vetorA.length ; i++,m++) {
            vetorA[i]=(int)(Math.random()*100);
            vetorB[i]=(int)(Math.random()*100);
        }
        for (int i = 0,j=19; i <vetorA.length ; i++,j--) {
            System.out.println(vetorA[i]*vetorB[j]);

        }

    }
}
