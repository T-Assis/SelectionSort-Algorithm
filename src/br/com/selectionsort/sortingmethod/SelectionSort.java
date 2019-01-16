package br.com.selectionsort.sortingmethod;

/**
 *
 * @author Thales Lima de Assis (T-Assis - https://github.com/T-Assis)
 */
public class SelectionSort {

	// Attributes / Atributos ===================================================

	// Variable for counting position comparisons in the vector.
	// Vari�vel para contagem de compara��es de posi��o no vetor.
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

	// Methods / M�todos ========================================================

	public void sortVector(int[] vector) {

		// Reset zero the variable comparisonCount to a new count of each vector.
		// Zera a vari�vel comparisonCount para uma nova contagem de cada vetor.
		this.setComparisonCount(0);

		// Loop that runs across the vector.
		// La�o que percorre todo o vetor.
		for (int i = 0; i < vector.length - 1; i++) {

			int smallestElement = i;
			
			/*
			 * Each time the first loop rotates, it does not see the first position and so
			 * on, because, the smallest element will always be thrown to the end.
			 * 
			 * Cada vez que roda o primeiro la�o, ele n�o enxerga a primeira posi��o e assim
			 * por diante, devido que, o menor elemento ser� jogado sempre para o come�o.
			 */
			for (int j = i + 1; j < vector.length; j++) {
				
				// Add +1 the variable comparisonCount. 
				// Soma +1 a vari�vel comparisonCount.
				comparisonCount++;

				/*
				 * Check the first position (which for the moment is the smallest element) with the position J, if it is larger, then the smallest element holds the position J.
				 * 
				 * Verifica a primeira posi��o (que por enquanto � o menor elemento) com a posi��o J, se for maior, ent�o o menor elemento guarda a posi��o J.
				 */
				if (vector[smallestElement] > vector[j]) {
					smallestElement = j;
				}

			} 
			// Make the position change of the smallest element with the first position of the current loop.
			// Faz a troca de posi��o do menor elemento com a primeira posi��o do atual la�o.
			int swap = vector[smallestElement];
			vector[smallestElement] = vector[i];
			vector[i] = swap;
		} 

	} 

} 
