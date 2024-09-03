/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try_catch_praica_2;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class Try_catch_praica_2 {

    public static void main(String[] args) {
        int num[]= new int [5]; int indice;
        
        Scanner ler = new Scanner(System.in);
        for(int i = 0; i < 4; ++i){
            System.out.println("Digite o valor do vetor");
            num[i]= ler.nextInt();
        }
        
        System.out.println("digite um indice(0-4)");
        indice = ler.nextInt();
        try{
            System.out.println("Valor no indice"+ indice+":"+ num[indice]);
    }catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Erro: indice fora do intervalo");
    }
    }
}
