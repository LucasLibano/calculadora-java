package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero,numero2,resultado;

        char operacao;

        System.out.println("--- Calculadora ---");
        System.out.print("");

        System.out.println("Insira o primeiro numero: ");
        numero = sc.nextDouble();

        System.out.println("Digite a operacao: ");
        operacao = sc.next().charAt(0);

        System.out.println("Insira o segundo numero: ");
        numero2 = sc.nextDouble();

        switch(operacao){
            case '+':
                resultado = numero + numero2;
                System.out.printf("O seu resultado e: %.2f", resultado);
                break;
            case '-':
                resultado = numero - numero2;
                System.out.printf("O seu resultado e: %.2f", resultado);
                break;
            case '*':
                resultado = numero * numero2;
                System.out.printf("O seu resultado e: %.2f", resultado);
                break;
            case '/':
                if(numero2 != 0 ){
                    resultado = numero / numero2;
                    System.out.printf("O seu resultado e: %.2f", resultado);
                } else {
                    System.out.printf("Erro: Divisão por zero nao permitida.");
                }
                break;

            default:
                if (operacao != '+' && operacao != '-' && operacao != '*' && operacao!= '/'){
                    System.out.printf("Operacao invaliida.");

        }


        }



        sc.close();



        }


    }
