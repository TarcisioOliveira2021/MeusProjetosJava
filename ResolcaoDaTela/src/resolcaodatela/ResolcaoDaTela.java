/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolcaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author zRyuk
 */
public class ResolcaoDaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        System.out.println("== R E S O L U C A O==");
        System.out.print("A Sua Tela tem resolucao " + d.width );
        System.out.println(" X " + d.height);
    }
    
}
