/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figura;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;

public class Painel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);
        g.fillRect(50, 50, 100, 300);
        g.fillRect(150, 150, 100, 200);

        int diametro = 80;
        int x = 60;
        int red = 50;
        int yellow = 150;
        int green = 250;
        int black = 160;
        int seta = 250;

        g.setColor(Color.red);
        g.fillOval(x, red, diametro, diametro);

        g.setColor(Color.YELLOW);
        g.fillOval(x, yellow, diametro, diametro);

        g.setColor(Color.GREEN);
        g.fillOval(x, green, diametro, diametro);

        g.setColor(Color.black);
        g.fillOval(160, black, diametro, diametro);

        g.setColor(Color.black);
        g.clearRect(160, seta, diametro, diametro);

    }

}
