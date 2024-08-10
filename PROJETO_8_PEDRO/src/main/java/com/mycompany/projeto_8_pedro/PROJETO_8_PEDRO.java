/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_pedro;
import java.util.Scanner;
/**
 *
 * @author p.rosa
 */
public class PROJETO_8_PEDRO {

    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero de medalhas de ouro");
            int Mouro = ler.nextInt();
        System.out.println("Digite o numero de medalhas de prata");
            int Mprat = ler.nextInt();
        System.out.println("Digite o numero de medalhas de bronze");
            int Mbron = ler.nextInt();
            int somaT = (Mouro + Mprat + Mbron);
                if(Mouro > 10){
                    System.out.println("Otimo desempenho");
                }
                else if((Mouro >= 5) &&(Mouro < 10)){
                    System.out.println("Bom desempenho");
                }
                else if ((Mouro < 5)&&(somaT>=20)){
                    System.out.println("Desempenho regular");
                }
                else if(somaT < 20){
                    System.out.println("Desempenho fraco");
                }
                else if((Mouro>5)&&(somaT>=30)){
                    System.out.println("Desempenho extraordinario");
                }
    }
}
