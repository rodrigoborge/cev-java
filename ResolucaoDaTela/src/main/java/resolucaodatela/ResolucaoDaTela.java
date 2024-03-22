/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package resolucaodatela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Rodrigo Borge
 */
public class ResolucaoDaTela {

    public static void main(String[] args) {
        Dimension tamanhoTela =  Toolkit.getDefaultToolkit().getScreenSize();
        tamanhoTela.getHeight();
        tamanhoTela.getWidth();
        System.out.print("A resolução deste dispositico é de: ");
        System.out.print(tamanhoTela.toString());
    }
}
