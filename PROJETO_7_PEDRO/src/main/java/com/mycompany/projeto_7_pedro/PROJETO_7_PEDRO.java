/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class PROJETO_7_PEDRO {

    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu peso");
            int peso = ler.nextInt();
        System.out.println("Digite sua altura");
            double altura = ler.nextDouble();
        System.out.println("Seu IMC é:");
            double IMC = (peso/(altura*altura));
                if((IMC > 18.5) && (IMC <= 24.9)){
                     System.out.println("Peso nomal");
                }
                if((IMC >= 25) && (IMC <= 29.9)){
                     System.out.println("Excesso de peso");
                }
                if ((IMC >= 30) && (IMC <= 34.9)){
                    System.out.println("Obesidade classe 1");
                }
                if((IMC == 35) && (IMC <= 39.9)){
                     System.out.println("Obesidade classe 2");
                }
                else{
                     System.out.println("Obesidade classe 3");
                }
         
    }
}
