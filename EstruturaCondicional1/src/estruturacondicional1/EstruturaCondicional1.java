/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturacondicional1;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author zRyuk
 */
public class EstruturaCondicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Scanner teclado = new Scanner(System.in);
        System.out.print("Digite sua Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Digite sua Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua Média foi: "+m);
        if (m>9){
            System.out.println("Parabéns");
        }*/
      Calendar ano = Calendar.getInstance();
      Scanner idade = new Scanner(System.in);
        System.out.print("Digite o ano que você nasceu: ");
      int anoN = idade.nextInt();
      int anoA = ano.get(Calendar.YEAR);
      int M = anoA - anoN;
        System.out.print("Você tem: "+M+" Anos");
        if(M>=18){
            System.out.println(" Você é MAIOR");
        }else{
            System.out.println(" Você é MENOR");
    }
      
      
      
    }
    
}
