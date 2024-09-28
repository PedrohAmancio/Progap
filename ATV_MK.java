/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atv_mk;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author p.rosa
 */
public class ATV_MK {
    
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
        int n = 5; 
        String nomeArquivo ;
        Date tempo = new Date();
        String arquivo[] = new String[5];
        Double Ver_tabuada[] = new Double [5];
        
        for(int i = 0; i < 5; i++){
         String inputNum_tabuada = JOptionPane.showInputDialog("Informe o valor da tabuada:" );
         
          try{
                Ver_tabuada[i] = Double.parseDouble(correcao(inputNum_tabuada));
            }
            catch(NumberFormatException e){
                  JOptionPane.showMessageDialog(null,"Erro: valor invalido!");
                i--;
            }
        }
        for(int i = 0; i < 5; i++){
            arquivo[i] = "C:/Users/p.rosa/Documents/TABUADA" + i;
            JOptionPane.showMessageDialog (null,"A tabuada esta no C:/Users/p.rosa/Documents/TABUADA");
            PrintWriter gravar = new PrintWriter(arquivo[i]);
            gravar.printf("|-------------------------|n");
            gravar.printf("Tabuada do "+Ver_tabuada[i]+" | "+tempo+"\n");
            gravar.printf("|-------------------------|\n");
          for(int j = 0; j <= 10; j++){
                    gravar.printf(j+" * "+Ver_tabuada[i]+" = "+(j*Ver_tabuada[i])+"\n");
                }
            gravar.printf("/--------FIM---------/n");
            gravar.close();
        }
    }
    public static String correcao(String dado){
        return dado.replaceAll(",", ".");
    }
}


