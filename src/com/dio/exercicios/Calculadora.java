package com.dio.exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double n1;
		double n2;
		double result;
		int opcao;
		
		System.out.println("Escolha uma das operações:\n"
				+ "1. Soma\n"
				+ "2. Subtração\n"
				+ "3. Multiplicação\n"
				+ "4. Divisão");
		opcao = scan.nextInt();
		
		switch (opcao) {
			case 1:
			System.out.println("Entre com o primeiro número:");
			n1 = scan.nextDouble();
			
			System.out.println("Entre com o segundo número:");
			n2 = scan.nextDouble();
			
			result = n1 + n2;
			
			System.out.println("O resultado da soma é: "+result);
			break;
		
		case 2:
			System.out.println("Entre com o primeiro número:");
			n1 = scan.nextDouble();
			
			System.out.println("Entre com o segundo número:");
			n2 = scan.nextDouble();
			
			result = n1 - n2;
			
			System.out.println("O resultado da subtração é: "+result);
			break;
		
		case 3:
			System.out.println("Entre com o primeiro número:");
			n1 = scan.nextDouble();
			
			System.out.println("Entre com o segundo número:");
			n2 = scan.nextDouble();
			
			result = n1 * n2;
			
			System.out.println("O resultado da multiplicação é: "+result);
			break;
		
		case 4:
			System.out.println("Entre com o primeiro número:");
			n1 = scan.nextDouble();
			
			System.out.println("Entre com o segundo número:");
			n2 = scan.nextDouble();
			
			result = n1 / n2;
			
			System.out.println("O resultado da divisao é: "+result);
			break;
		
		default:
			System.out.println("Opção de escolha inválida.");
			break;
		}
		
		
		
		
	}
	
	
}


