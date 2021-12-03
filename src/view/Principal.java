package view;

import java.util.LinkedList;
import controller.ListaBuilder;

public class Principal {

	public static void main(String[] args) {
		LinkedList<String> lista1 = new LinkedList<String>();
		LinkedList<String> lista2 = new LinkedList<String>();
		LinkedList<String> unidas = new LinkedList<String>();

		ListaBuilder builder = new ListaBuilder();

		String[] nome = { "V", "I", "N", "I", "C", "I", "U", "S" };
		String[] sobrenome = { "B", "A", "R", "B", "O", "S", "A" };

		for (int i = 0; i < nome.length; i++) {
			lista1 = builder.gerarlistas(nome[i], lista1);
		}

		for (int i = 0; i < sobrenome.length; i++) {
			lista2 = builder.gerarlistas(sobrenome[i], lista2);
		}

		unidas = builder.concatenarlistas(lista1, lista2);
		
		System.out.println("Lista Nome" + lista1.toString());
		System.out.println("Lista Primeiro Sobrenome" + lista2.toString());
		System.out.println("Concatenadas" + unidas.toString());

	}
}