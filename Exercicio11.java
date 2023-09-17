package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {

		/*
		 * Arredondamento para cima de um número decimal: Crie um programa que solicita
		 * ao usuário um número decimal e, em seguida, usa o método Math.ceil() para
		 * arredondá-lo para cima e exibir o resultado.
		 */

		try {

			Double recebeUsuario;

			recebeUsuario = Double.parseDouble(JOptionPane.showInputDialog(null, " Digite um número"));

			if (recebeUsuario < 0) {
				JOptionPane.showMessageDialog(null, " ERRO ! \n Digite um número positivo");
			} else {
				JOptionPane.showMessageDialog(null, " Número arredondado :  " + Math.ceil(recebeUsuario));

			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, " Você não digitou um número \n tente novamente");
		}

	}

}
