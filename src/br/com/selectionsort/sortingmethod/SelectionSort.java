package br.com.selectionsort.sortingmethod;

/**
 *
 * @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
 */
public class SelectionSort {

	// Attributes / Atributos ===================================================

	// Variable for counting position comparisons in the vector.
	// Variável para contagem de comparações de posição no vetor.
	private int comparisonCount;

	// Constructors / Construtores ==============================================

	public SelectionSort() {
		
	}

	public SelectionSort(int[] vector) {
		this.sortVector(vector);
	}

	// Getters ==================================================================

	public int getComparisonCount() {
		return comparisonCount;
	}

	// Setters ==================================================================

	private void setComparisonCount(int comparisonCount) {
		this.comparisonCount = comparisonCount;
	}

	// Methods / Métodos ========================================================

	public void sortVector(int[] vector) {

		// Reset zero the variable comparisonCount to a new count of each vector.
		// Zera a variável comparisonCount para uma nova contagem de cada vetor.
		this.setComparisonCount(0);

		// Loop that runs across the vector.
		// Laço que percorre todo o vetor.
		for (int i = 0; i < vector.length - 1; i++) {

			int smallestElement = i;
			
			/*
			 * Each time the first loop rotates, it does not see the first position and so
			 * on, because, the smallest element will always be thrown to the start.
			 * 
			 * Cada vez que roda o primeiro laço, ele não enxerga a primeira posição e assim
			 * por diante, devido que, o menor elemento será jogado sempre para o começo.
			 */
			for (int j = i + 1; j < vector.length; j++) {
				
				// Add +1 the variable comparisonCount. 
				// Soma +1 a variável comparisonCount.
				comparisonCount++;

				/*
				 * Check the first position (which for the moment is the smallest element) with the position J, if it is larger, then the smallest element holds the position J.
				 * 
				 * Verifica a primeira posição (que por enquanto é o menor elemento) com a posição J, se for maior, então o menor elemento guarda a posição J.
				 */
				if (vector[smallestElement] > vector[j]) {
					smallestElement = j;
				}

			} 
			// Make the position change of the smallest element with the first position of the current loop.
			// Faz a troca de posição do menor elemento com a primeira posição do atual laço.
			int swap = vector[smallestElement];
			vector[smallestElement] = vector[i];
			vector[i] = swap;
		} 

	} 

} 
