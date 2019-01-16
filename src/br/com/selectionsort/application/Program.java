package br.com.selectionsort.application;

import br.com.selectionsort.sortingmethod.SelectionSort;

/**
 * 
 * @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
 */
public class Program {

	public static void main(String[] args) {
	
		// ===================================================================
		// OPTION 1 / OPÇÃO 1
		System.out.println("Selection Sort: OPTION 1\n");
		
		int[] vector1 = { 34, 10, 13, 5, 67, 0};
		
		System.out.print("Vector1 Before:\n[ ");
		for (int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.print("]\n\n");

		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sortVector(vector1);

		System.out.print("Vector1 After:\n[ ");
		for (int i = 0; i < vector1.length; i++) {
			System.out.print(vector1[i] + " ");
		}
		System.out.println("]\n\nComparison Count in Vector1: " + selectionSort.getComparisonCount()+"\n");
		
		System.out.println("======================================\n");
		// ======================================================================
		// OPTION 2 / OPÇÃO 2
		System.out.println("Selection Sort: OPTION 2\n");
		
		int[] vector2 = { 7, 4, 5, 9, 8, 2, 1 };
		
		System.out.print("Vector2 Before:\n[ ");
		for (int i = 0; i < vector2.length; i++) {
			System.out.print(vector2[i] + " ");
		}
		System.out.print("]\n\n");

		SelectionSort selectionSort2 = new SelectionSort(vector2);

		System.out.print("Vector2 After:\n[ ");
		for (int i = 0; i < vector2.length; i++) {
			System.out.print(vector2[i] + " ");
		}
		System.out.println("]\n\nComparison Count in Vector2: " + selectionSort2.getComparisonCount());

	} 

} 
