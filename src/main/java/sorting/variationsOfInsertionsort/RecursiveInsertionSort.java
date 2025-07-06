package sorting.variationsOfInsertionsort;

import java.util.Arrays;

import sorting.AbstractSorting;
import util.Util;

public class RecursiveInsertionSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * Implementacaoo RECURSIVA do insertion sort. Para isso, tente definir o 
	 * caso base do algoritmo e depois o caso recursivo, que reduz o problema 
	 * para uma entrada menor em uma chamada recursiva. Seu algoritmo deve 
	 * ter complexidade quadratica O(n^2).
	 * 
	 * Restrições:
	 *  - voce NAO pode utilizar array auxiliar
	 *  - voce pode utilizar variaveis temporarias
	 *  - voce NAO pode declarar novos atributos na classe
	 *  - para as trocas no array, utilize o metodo Util.swap
	 */
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if ((array.length > 0) && leftIndex != rightIndex) {
			int i = leftIndex + 1;
			T key = array[i];
			int j = leftIndex;
			while (j >= 0 && array[j].compareTo(key)== 1) {
				Util.swap(array, j, j + 1);
				j--;
			}  
			sort(array, leftIndex + 1, rightIndex);
		}		
	}
}
