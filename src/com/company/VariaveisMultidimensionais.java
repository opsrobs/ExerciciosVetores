package com.company;

public class VariaveisMultidimensionais {
    public static final String RED = "\u001b[31m";
    public static final String RESET = "\u001b[0m";
    public static void VariaveisCompostas(){
        int[][] grid=new int[4][4];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                grid[i][j]=(int)(Math.random()*100);
                System.out.print(grid[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println("");
        int somaImpar=0;
        for (int[] ints : grid) {
            for (int j = 0; j < grid.length; j++) {
                if (ints == grid[j]) {
                    System.out.println(RED + "Diagonal principal: " + ints[j] + RESET);
                }
                if (ints[j] % 2 != 0) {
                    somaImpar += ints[j];
                }
            }
        }
        System.out.println("\n"+somaImpar);

    }
}
