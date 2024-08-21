/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.media_vetor;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Media_vetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = 10;int soma=0;
        
        int notas[] = new int[n];
            for(int i =0;i<n;i++){
                notas[i]=(int)(Math.random() * 10);
            }
            for(int i = 0; i < n; i++){
                soma=soma+notas[i];
            }
            for(int i = 0; i < n; i++){
                System.out.println("Vetor" + i +"=" + notas[i]);
            }
            System.out.println("---------------------");
            System.out.println("soma =" + soma);

    }
}
