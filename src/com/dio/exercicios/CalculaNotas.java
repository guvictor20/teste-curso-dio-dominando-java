package com.dio.exercicios;

import java.util.Scanner;

public class CalculaNotas {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nomeAluno;
		double nota1;
		double nota2;
		double mediaFinal;
		
		System.out.println("Insira o nome do aluno:");
		nomeAluno = scan.next();
		
		System.out.println("Insira a primeira nota:");
		nota1 = scan.nextDouble();
		
		System.out.println("Insira a segunda nota:");
		nota2 = scan.nextDouble();
		
		mediaFinal = (nota1 + nota2)/2;
		
		if (mediaFinal >= 7) {
			System.out.println("O aluno "+nomeAluno+" foi aprovado.\n"
					+ "Sua média final foi "+mediaFinal);
		}else {
			System.out.println("O aluno "+nomeAluno+" foi reprovado.\n"
					+ "Sua média final foi "+mediaFinal);
		}
		
		
	}

}
