/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author zRyuk
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Locale locale = Locale.getDefault();
        System.out.print("O Seu sistema esta em ");
        System.out.println(locale.getDisplayLanguage());  /* Aqui mostra que esta em portugues*/
    }
    
}
