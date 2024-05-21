/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Kike Rebollar
 */
public class FONDO extends JPanel {
    public FONDO(){
        setSize(350,550);
    }
    @Override
    public void paintComponent(Graphics g) {
        Dimension tamanio = getSize();
        ImageIcon FONDO = new ImageIcon(getClass().getResource("/IMAGENES/FondoVerde.jpeg"));
        g.drawImage(FONDO.getImage(), 0, 0, tamanio.width, tamanio.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
    
