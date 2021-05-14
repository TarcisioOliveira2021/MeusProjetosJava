/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author zRyuk
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        String nome1 = "Tarcisio";
        String nome2 = "Tarcisio";
        String nome3 = new String ("Tarcisio");
        String res;
        res = (nome1 == nome3)?"igual":"diferente" ;  //.equals mostra esse resultado como igual. pois confere os conteudos.
        System.out.println(res);
     
    
    
    }
    
}
