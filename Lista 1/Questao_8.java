import java.util.Scanner;

/**
 * @author Marcelo Indio
 * @version 1.0
 * Implementação didática para resolução da 8ª questão da lista de exercícios 1
 * Observem o nome das variáveis, constantes e métodos que esclarecem a intenção de uso dos mesmos
 * Observem os comentários que esclarecem a implementação 
 */


public class Questao_8 {

	final double DEZ_PORCENTO = 0.10;
	final double QUINZE_PORCENTO = 0.15;
	final int TAMANHO_DO_ARRAY = 10;

	public static void main(String[] args) {

		Questao_8 questao = new Questao_8();
		questao.executa();
		
	}
	
	
	/**
	 * Método que realiza a execucao do programa
	*/
	public void executa() {

		Pessoa[] pessoas = constroiArray(TAMANHO_DO_ARRAY);
		pessoas = calculaAliquota(pessoas);
		imprimeAliquota(pessoas);
			
	}

	/**
	 * Método que constrói o array
	 * @param tamanho Tamanho do array a ser construído
	 * @return valores Array
	 */
	public Pessoa[] constroiArray(int tamanho) {

		Scanner entrada = new Scanner(System.in); // Leitor de dados do teclado

		Pessoa[] pessoas = new Pessoa[tamanho]; 
		
		for(int i=0; i<pessoas.length;i++) {

			pessoas[i] = new Pessoa();
			
			System.out.println(String.format("Qual o nome da %d ª pessoa?", i+1));
			pessoas[i].setNome(entrada.next());

			System.out.println(String.format("Qual o salario da %d ª pessoa?", i+1));
			pessoas[i].setSalario(entrada.nextDouble());
			
		}

		entrada.close();

		return pessoas;
		
	}
	
	/**
	 * Método que calcula a Alíquota
	 * @param pessoas Array com as pessoas
	 */
	public Pessoa[] calculaAliquota(Pessoa[] pessoas) {

		for(int i=0; i<pessoas.length;i++) {

			if (pessoas[i].getSalario()<600.0) {
				pessoas[i].setAliquota(0);
			} else if (pessoas[i].getSalario()<1500.0) {
				pessoas[i].setAliquota(pessoas[i].getSalario()*DEZ_PORCENTO);
			} else {
				pessoas[i].setAliquota(pessoas[i].getSalario()*QUINZE_PORCENTO);
			}
		
		}

		return pessoas;
		
	}
	
	/**
	 * Método que imprime o nome e a alíquota da pessoa
	 * @param pessoas Array com as pessoas
	 */
	public void imprimeAliquota(Pessoa[] pessoas) {

		for(int i=0; i<pessoas.length;i++) {
			
			System.out.println(String.format("%s pagou R$ %.2f de imposto de renda.", pessoas[i].getNome(), pessoas[i].getAliquota()));
		
		}

	}
	
}

class Pessoa{
	
	private String nome;
	private double salario;
	private double aliquota;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getAliquota() {
		return aliquota;
	}

	public void setAliquota(double aliquota) {
		this.aliquota = aliquota;
	}
	
}