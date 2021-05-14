package br.ucsal.fundamentos.OrdenacaoDeArray;
//Metodo de ordenacao InsertSort.
public class InsertSort {
	public static void main(String[] args) {
		executar();
		}

	public static void executar() {
		int[] valores = {1,70,99,100,23,45};
		System.out.println("Array antes de ordenar: ");
		for (int i : valores) {
		System.out.print(i+" ");	
		}
		System.out.println();
		imprimir(ordernar(valores));
	}



	public static void imprimir(int[] ordernar) {
		System.out.println("Array ordenado: ");
		for (int i : ordernar) {
			System.out.print(i+" ");
		}
		
	}
//Metodo de ordenacao insertSort.
	public static int[] ordernar(int[] valores) {
		for (int i = 0; i < valores.length; i++) {
			for (int j = i; j > 0 && valores[j]<valores[j-1]; j--){
				int aux = valores[j-1];
				valores[j-1]= valores[j];
				valores[j] = aux;
			}
		}
		return valores;
	}
}
