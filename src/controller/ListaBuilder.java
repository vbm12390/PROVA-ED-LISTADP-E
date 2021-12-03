package controller;

import java.util.LinkedList;


public class ListaBuilder {
	public LinkedList<String> gerarlistas(String nome, LinkedList<String> lista) {
		lista.add(nome);
		return lista;
	}

	public LinkedList<String> concatenarlistas(LinkedList<String> lista1, LinkedList<String> lista2) {
		LinkedList<String> listas_unidas = new LinkedList<String>();
		int tamanholista1 = 0;
		int tamanholista2 = lista2.size() - 1;
		
			while(true) {
				listas_unidas.add(lista1.get(tamanholista1));
				listas_unidas.add(lista2.get(tamanholista2));
				if(tamanholista1>=lista1.size()) {
					break;
				}
				if(tamanholista2==0) {
					break;
				}
				tamanholista1++;
				tamanholista2--;
			}
		return listas_unidas;
	}
}