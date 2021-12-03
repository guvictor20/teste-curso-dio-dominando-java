package com.exercicios.estruturaderepeticao;

import java.util.Scanner;

public class Exercicio03ValidaInformacoes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        char sexo;
        char estadoCivil;

       System.out.println("Nome: ");
        nome = scan.next();
        //Verifica o número de caracteres do nome
        while (nome.length() <= 3){
            System.out.println("Quantidade de caracter inválida, insira o nome novamente: ");
            nome = scan.next();
        }

        System.out.println("Idade: ");
        idade = scan.nextInt();
        //Verifica o intervalo da idade de 0 a 150
        while (idade <0 || idade > 150){
            System.out.println("Idade inválida, digite novamente:");
            idade = scan.nextInt();
        }
        
        System.out.println("Salário: ");
        salario = scan.nextDouble();
        //Verifica se o salário é maior que 0
        while (salario < 0){
            System.out.println("O valor digitado é invalido, digite novamente: ");
            salario = scan.nextDouble();
        }
        //ata a quebra de linha dos caracteres
        scan.nextLine();

        //verifica se o caracter digitado é válido
        System.out.println("sexo: ");
        sexo = scan.nextLine().charAt(0);
        while(sexo != 'm' && sexo != 'f') {
        	System.out.println("Sexo inválido, favor digitar m ou f: ");
        	sexo = scan.nextLine().charAt(0);
        }

        //Verifica se o caractere digitado é válido
        System.out.println("Estado civil: ");
        estadoCivil = scan.nextLine().charAt(0);
        while (estadoCivil != 's' && estadoCivil != 'c' && estadoCivil != 'v' && estadoCivil != 'd') {
        	System.out.println("Estado civil inválido, favor digitar s, c, v ou d: ");
        	estadoCivil = scan.nextLine().charAt(0);
        }

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
        System.out.println(sexo);
        System.out.println(estadoCivil);

	}

}
