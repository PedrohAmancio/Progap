/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_14_pedro;
import java.io.DataInputStream;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Projeto_14_pedro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int [][]tabela = new int [5][5];int res=0;
       int numr=0; int n = 2;
        
       for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.println("Digite um numero: ");
                DataInputStream dado = new DataInputStream (System.in);
                String res = dado.readLine();
                try{
                    tabela[i][j] = Integer.parseInt(res);
                }
                catch(NumberFormatException e){
                    System.out.println("Erro: Argumento invalido.");
                    i--;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("["+tabela[i][j]+"]");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    for(int l = 0; l < n; l++){
                        if(tabela[i][j] <= tabela[k][l]){
                            int aux = tabela[i][j];
                            tabela[i][j] = tabela[k][l];
                                                        tabela[i][j] = tabela[k][l];
[k][l] = aux;
                        }
                    }
                }
            }
        }
    }
}
