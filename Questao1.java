// Leone Rodrigues Santos, 23/06/21

// Lista de exercícios 2

/* Questão 1. Escreva um algoritmo que leia dois números e ao final mostre a soma,
subtração, multiplicação e a divisão dos números lidos. */ 

import java.util.Scanner;

public class Questao1 {


    public static void main(String[] args){

       
        int num1, num2; 

        Scanner scan = new Scanner(System.in);

        System.out.printf("\nEste script recebe 2 numeros e mostra operaçoes matematicas basicas com eles.\n");

        System.out.printf("\nInsira o primeiro numero: ");
        num1 = scan.nextInt();

        System.out.printf("\nInsira o segundo numero: ");
        num2 = scan.nextInt();
        


        System.out.printf("\n\nAdicao: %d", (num1 + num2));
        System.out.printf("\nSubtracao: %d", (num1 - num2));
        System.out.printf("\nMuitiplicacao: %d", (num1 * num2));
        System.out.printf("\nDivisao: %d\n", (num1 / num2));
        


    }
    
}
