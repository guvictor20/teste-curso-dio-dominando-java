package com.dio.tabuada;

import javax.swing.JOptionPane;

public class ResolveTabuada {
	
	public static void main(String[] args) {
		
		int fator1;
		int fator2;
		int produto;
		
		fator1 = Integer.parseInt(JOptionPane.showInputDialog("Qual tabuada quer exibir?"));
		fator2 = Integer.parseInt(JOptionPane.showInputDialog("Até quanto quer exibir o resultado?"));
		
		for (int i = 0; i <= fator2; i++) {
			produto = fator1 * i;
			System.out.println(fator1+" x "+i+" = "+produto);
		}
	}

}
