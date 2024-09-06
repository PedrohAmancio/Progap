/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_13_pedroh;

import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class PROJETO_13_PedroH {
public static int n=0;
    public static void main(String[] args) {
        int op = 0;  String gene_tri; int tamanho = 0;
        int ind1 = 0; int ind2 = 0;
        
        Scanner ler = new Scanner(System.in);
        
       System.out.println("Qual o tamanho do vetor");
       gene_tri=ler.next();
       
       try {// verificação
          tamanho = Integer.parseInt(gene_tri);
          if (tamanho <= 0) {
            System.out.println("Erro: tamanho do vetor invalido.");
            }
       } catch (NumberFormatException e) {
            System.out.println("Erro: argumento invalido");
       }
       
        while (tamanho <= 0);

        int vet[] = new int[tamanho];
        double resultados[] = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {/* vai digitar o numero ate o desejado,
            ler, fazer verificação e deixar em um "mini loop"*/
            do {
                System.out.print("Digite um numero: ");
                gene_tri = ler.next();
                try {
                    vet[i] = Integer.parseInt(gene_tri);
                } catch (NumberFormatException e) {
                    System.out.println("Erro: argumento invalido.");
                }
            } while (vet[i] == 0 && !gene_tri.equals("0"));
            if (vet[i] < 0) {
                System.out.println("Erro: argumento invalido.");
                i--;
            }
        }

        for (int i = 0; i < tamanho; i++) {//vai jogar o numero e o indice na tela
            System.out.println("Numero: " + vet[i] + " Indice: " + i);
        }

        for (int i = 0; i < tamanho; i++) {/* pergunta a operação, faz verificação
            começa o processo de calculo(pergunta os numeros), faz verificação
            entra no escolha caso para mostrar resultado e "quebra o codigo"(na
            divisão faz verificação)*/

            do {
                System.out.println("Escolha: \n 1 - Soma \n 2 - Subtracao \n 3 - Multiplicacao \n 4 - Divisao");
                gene_tri = ler.next();
                try {
                    op = Integer.parseInt(gene_tri);
                    if (op > 4 || op < 0) {
                        System.out.println("Erro: operacao invelida.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: argumento invalido.");
                }
            } while (op > 4 || op <= 0);

            do {
                System.out.println("Escolha o primeiro indice: ");
                gene_tri = ler.next();
                try {
                    ind1 = Integer.parseInt(gene_tri);
                    if (ind1 >= tamanho || ind1 < 0) {
                        System.out.println("Erro: primeiro indice invalido.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Erro: primeiro indice invalido.");
                }
            } while (ind1 < 0 || ind1 >= tamanho || ind1 == 0 && !gene_tri.equals("0"));

            do {
                System.out.println("Escolha o segundo indice: ");
                gene_tri = ler.next();
                try {
                    ind2 = Integer.parseInt(gene_tri);
                    if (ind2 >= tamanho || ind2 < 0) {
                        System.out.println("Erro: segundo indice invalido.");
                    }
                } catch (NumberFormatException e2) {
                    System.out.println("Erro: segundo indice invalido.");
                }
            } while (ind2 < 0 || ind2 >= tamanho || ind2 == 0 && !gene_tri.equals("0"));

            switch (op) {
                case 1:
                    resultados[i] = vet[ind1] + vet[ind2];
                    System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    break;
                case 2:
                    resultados[i] = vet[ind1] - vet[ind2];
                    System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    break;
                case 3:
                    resultados[i] = vet[ind1] * vet[ind2];
                    System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    break;
                case 4:
                    try {
                        double num1 = vet[ind1], num2 = vet[ind2];
                        resultados[i] = num1 / num2;
                        System.out.println("Resultado " + (i + 1) + ": " + resultados[i]);
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: calculo indisponivael");
                        i--;
                    }
                    break;
            }

        }
        System.out.println("\nResultados dos calculos:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Resultado "+(i+1)+":"+resultados[i]);
        }
    }
}