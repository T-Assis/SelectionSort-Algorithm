# SelectionSort-Algorithm
## English:

Selection sort is a sort algorithm based on always passing the smallest value of the vector to the first position (or greater depending on the required order), then the second lowest value for the second position, and so is done successively with n-1 remaining elements, up to the last two elements.

It consists of two loops, an outer loop and an inner loop. The outer loop serves to control the initial index and the inner loop runs through the vector. In the first iteration of the external loop the index starts from 0 and each iteration adds one unit to the end of the vector and the innermost loop traverses the vector starting from that external index + 1 until the end of the vector.

The Selection Sort algorithm is often used in real-time systems because it has the same performance regardless of the previous ordering of the vector.

Selection Sort is not a stable algorithm, that is, elements that have the same value will not always maintain the relative position before the start of sorting.

### The Selection Sort algorithm consists of three steps:
- Navigate the vector until you find the smallest element of this vector.
  - It depends on the size of the vector, that is O(n).
- Remove this element from the vector and insert it into the first position of the response vector.
  - Operation of position change, regardless of the size of the vector, that is O(1).
- Repeat these steps for each item in the array.
  - It depends on the size of the vector, that is O(n).

As the two steps that depend on the size of the vector, are nested the complexity of them ends up multiplying resulting in:
- O(n) = n^2

## Example:

Given the initial vector: [7, 4, 5, 9, 8, 2, 1], the following image demonstrates step by step Selection Sort steps (this image is based on the code of this project).


![selection-sort](https://user-images.githubusercontent.com/17066350/51257086-fdc2dc80-198d-11e9-93ec-de72732c7a62.JPG)

## References:

 - https://www.geeksforgeeks.org/selection-sort
 - https://pt.wikipedia.org/wiki/Selection_sort
 - https://en.wikipedia.org/wiki/Selection_sort
 - https://www.devmedia.com.br/algoritmos-de-ordenacao-analise-e-comparacao/28261
 - 
## ====================================================

## Português:

Selection sort é um algoritmo de ordenação baseado em se passar sempre o menor valor do vetor para a primeira posição (ou o maior dependendo da ordem requerida), depois o de segundo menor valor para a segunda posição, e assim é feito sucessivamente com os n-1 elementos restantes, até os últimos dois elementos.

É composto por dois laços, um laço externo e outro interno. O laço externo serve para controlar o índice inicial e o interno percorre todo o vetor. Na primeira iteração do laço externo o índice começa de 0 e cada iteração ele soma uma unidade até o final do vetor e o laço mais interno percorre o vetor começando desse índice externo + 1 até o final do vetor.
    
O algoritmo do Selection Sort é usado muitas vezes em sistemas de tempo real, porque ele tem o mesmo desempenho não importa a ordenação prévia do vetor.
    
O Selection Sort não é um algoritmo estável, ou seja, os elementos que possuem o mesmo valor nem sempre irá manter a posição relativa de antes do início da ordenação.
    
### O algoritmo do Selection Sort consiste em três passos:
 - Navegue pelo vetor até encontrar o menor elemento desse vetor.
    - Depende do tamanho do vetor, ou seja O(n).
 - Remova esse elemento do vetor e insira na primeira posição do vetor de resposta.
    - Operação de troca de posições, independe do tamanho do vetor, ou seja O(1).
 - Repita esses passos para cada item existente no vetor.
    - Depende do tamanho do vetor, ou seja O(n).

Como os dois passos que dependem do tamanho do vetor, estão aninhados a complexidade deles acaba se multiplicando resultando em:
- O(n) = n^2
    
## Exemplo:

Dado o vetor inicial: [ 7, 4, 5, 9, 8, 2, 1 ], a imagem a seguir demonstra o passo a passo das etapas do Selection Sort(esta imagem é com base no código deste projeto).

![selection-sort](https://user-images.githubusercontent.com/17066350/51257086-fdc2dc80-198d-11e9-93ec-de72732c7a62.JPG)

## Referências:
 - https://www.geeksforgeeks.org/selection-sort
 - https://pt.wikipedia.org/wiki/Selection_sort
 - https://en.wikipedia.org/wiki/Selection_sort
 - https://www.devmedia.com.br/algoritmos-de-ordenacao-analise-e-comparacao/28261
