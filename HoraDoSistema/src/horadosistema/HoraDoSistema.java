/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.util.Date;

/**
 *
 * @author zRyuk
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date();
        System.out.println("       H O R A        ");
        System.out.println("======================");
        System.out.println("A Hora do Sisteme é :");
        System.out.println("======================");
        System.out.println(relogio.toString());
        
    }
    
}
