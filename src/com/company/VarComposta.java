package com.company;

import javax.swing.*;

public class VarComposta {
    public static void AlunoComposto(){
        int aluno= Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de alunos: "));
        String []alunos= new String[aluno];
        int[] notas = new int[3];
        float[] media= new float[3];

        for (int i = 0; i < alunos.length; i++) {
            String nome=JOptionPane.showInputDialog("Informe o nome do Aluno: ");
            for (int j = 0; j < notas.length; j++) {
                notas[j]=Integer.parseInt(JOptionPane.showInputDialog("Informe aª nota do aluno "));
                media[i]+=notas[j];
                if (notas.length ==j+1){
                    media[i]=media[i]/3;
                }
            }
            alunos[i]= nome+" "+ media[i];
            System.out.println(alunos[i]);
        }



    }
}
