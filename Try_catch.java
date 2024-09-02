/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.try_catch;

/**
 *
 * @author p.rosa
 */
public class Try_catch {

    public static void main(String[] args) {
        String valorString = "42";
        try{
         int valorInteiro = Integer.parseInt(valorString);
         System.out.println("Valor inteiro:" + valorInteiro);
        }catch(NumberFormatException e){
            System.out.println("Erro ao converter: "+ e.getMessage());
        }
    }
}
