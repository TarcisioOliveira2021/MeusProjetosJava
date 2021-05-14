/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author zRyuk
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int N1 = 3;
        int N2 = 5;
        float M = (N1+N2)/2;
        System.out.println("A média é igual a: "+ M);*/
        
    /*Conceito Pos Numero    
        int Numero = 5;
        int Valor = 5 + Numero ++;
        System.out.println(Valor); 
        
        Valor = 10*/
    
    /*Conceito Pre Numero
        int Numero = 5;
        int Valor = 5 + ++Numero;
        System.out.println(Valor); 
    
        Valor = 11 */
      
    
    
    /*int x = 4;
    x += 2; //(X = X + 2)
    System.out.println(x);*/      //Operador de Atribuição
    
    float v = 8.9f;
    int ar = (int)Math.floor(v);
        System.out.println(ar);
    //Arredondamento Para Cima
    
    float f = 8.9f;
    int gr = (int)Math.ceil(v);
        System.out.println(gr);
    //Arredondamento Para Baixo
    
    float r = 8.9f;
    int re = (int)Math.round(r);
        System.out.println(re);
    //Arredondamento Aritmetico
    
    float e = 8.9f;
    int w = (int)Math.abs(e);
        System.out.println(w);
   //Valor Absoluto
    
    double ale=Math.random();
    int n = (int)(5 + ale * (10-5));
        System.out.println(n);
    }
    //Gerador de numeros + aplicaçao no contador de 5 a 10
    
}
