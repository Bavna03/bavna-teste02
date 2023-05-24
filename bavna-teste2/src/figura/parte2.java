/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

import javax.swing.JFrame;

public class parte2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Semaforo");
        Painel painel = new Painel();

        frame.add(painel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 450);
        frame.setVisible(true);

    }

}
