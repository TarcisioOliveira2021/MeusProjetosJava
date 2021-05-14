package atividade;

import java.util.Scanner;

public class AtividadeEmprestimo {

	public static void main(String[] args) {
		/* Declaracao de variaveis
		 * sal= salario base
		 * tf= taxa final 30%
		 * salf= salario final apos *30%
		 * r= valor do salario final * a taxa 
		 * tx= taxa predefinida |3.4%|2.5%|4.2%|
		 * vm=valor maximo do emprestimo
		 * em= valor do emprestimo desejado
		 * vce=valor do emprestimo desejado * taxa predefinida
		 * vce1= valor do emprestimo maximo - o resultado do valor do emprestimo desejado pela taxa
		 */
		double sal,tf,salf,r,tx,vm,em,vce,vce1;
		Scanner teclado=new Scanner(System.in);//comando de entrada de dados
		System.out.println("| E M P R E S T I M O | Ex:1000,2000,3000...");//inicio do programa com exemplos usar valores sem o ponto
		System.out.print("1.Digite o valor do seu salario: ");
		sal=teclado.nextDouble();
		
		tf = 0.3;
		salf = sal * tf;
		
		//Taxa de 2.5%
		if(salf <= 1000){
			r = salf * 0.025;
			vm =salf - r;
			tx = 0.025;
		    System.out.println(" .Considerado o valor informado a taxa cobrada sera de: "+tx);
			System.out.println(" .O valor maximo para empréstimo sera: "+vm);
			System.out.print("2.Digite o quanto deseja obter do emprestimo: ");
			em =teclado.nextDouble();
			vce =em * tx;
			vce1 = em - vce;
			System.out.println(" .O valor a ser creditado do empréstimo e: "+vce1);
			
		//Taxa de 3.4%
		}else if((salf > 1000)&&(salf <= 2000)) {
			r = salf * 0.034;
			tx = 0.034;
			vm =salf - r;
			System.out.println(" .Considerado o valor informado a taxa cobrada sera de: "+tx);
			System.out.println(" .O valor maximo para empréstimo sera: "+vm);
			System.out.print("2.Digite o quanto deseja obter do emprestimo: ");
			em =teclado.nextDouble();
			vce = em * tx;
			vce1 = em - vce;
			System.out.println(" .O valor a ser creditado do empréstimo e: "+vce1);
			
		//Taxa de 4.2%
		}else if (salf > 2000) {
			r = salf * 0.042;
			vm =salf - r;
			tx = 0.042;
			System.out.println(" .Considerado o valor informado a taxa cobrada sera de: "+tx);
			System.out.println(" .O valor maximo para empréstimo sera: "+vm);
			System.out.print("2.Digite o quanto deseja obter do emprestimo: ");
			em =teclado.nextDouble();
			vce =em * tx;
			vce1 = em - vce;
			System.out.println(" .O valor a ser creditado do empréstimo e: "+vce1);
		}
	teclado.close();
	}

}
