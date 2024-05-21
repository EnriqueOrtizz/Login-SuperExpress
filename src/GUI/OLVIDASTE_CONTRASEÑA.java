/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Kike Rebollar
 */
public class OLVIDASTE_CONTRASEÑA extends JFrame{
    
    public JLabel icon1,icon2, correo, correo1, icon_correo, icon_correo2;
    public JTextField correoR, correoR2;
    public JButton enviar_c, reenviar;
    
    public OLVIDASTE_CONTRASEÑA(){
        setTitle("¿Olvidaste tu contraseña?");
        setSize(350,550);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        Componentes();
        FONDO fondo=new FONDO();
        this.add(fondo);
    }
    
    public void Componentes(){
         //Label Acceso
           icon1=new JLabel();
           icon1.setBounds(20, 15, 100 , 100);
           icon1.setVisible(true);
           add(icon1);
           ImageIcon logo= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\Inicio.png");
           Icon icon = new ImageIcon(logo.getImage().getScaledInstance(icon1.getWidth(),icon1.getHeight(), Image.SCALE_DEFAULT)); 
           icon1.setIcon(icon);
           this.repaint();
           
           //Label Iconotienda
           icon2=new JLabel();
           icon2.setBounds(200, 15, 100 , 100);
           icon2.setVisible(true);
           add(icon2);
           ImageIcon img= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\LogoSE.jpg");
           Icon icono2 = new ImageIcon(img.getImage().getScaledInstance(icon2.getWidth(),icon2.getHeight(), Image.SCALE_DEFAULT)); 
           icon2.setIcon(icono2);
           this.repaint();
           
            //LABEL PARA INGRESAR NOMBRE DE CORREO
        correo=new JLabel("INGRESA TU CORREO ELECTRÓNICO");
         correo.setBounds(30, 125, 230, 60);
         correo.setVisible(true);
        correo.setFont(new java.awt.Font("Gotham Thin", 1, 12));;
         //correo.setForeground(new java.awt.Color(255, 255, 255));
         add(correo);
         
         //NOMBRE DEL CORREO
         correoR=new JTextField();
         correoR.setBounds(30, 170, 230, 20);
         correoR.setVisible(true);
         add(correoR);
         
          //LABEL PARA CONFIRMAR CORREO
        correo1=new JLabel("CONFIRMA TU CORREO ELECTRÓNICO");
         correo1.setBounds(30, 200, 240, 60);
         correo1.setVisible(true);
        correo1.setFont(new java.awt.Font("Gotham Thin", 1, 12));;
         //correo.setForeground(new java.awt.Color(255, 255, 255));
         add(correo1);
         
         //NOMBRE DEL CORREO CONFIRMADO
         correoR2=new JTextField();
         correoR2.setBounds(30, 245, 230, 20);
         correoR2.setVisible(true);
         add(correoR2);
         
          //ICONO DEL CORREO 
           icon_correo=new JLabel();
           icon_correo.setBounds(260, 230, 50 , 50);
           icon_correo.setVisible(true);
           add(icon_correo);
           ImageIcon icono_c1= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\name.png");
           Icon correo = new ImageIcon(icono_c1.getImage().getScaledInstance(icon_correo.getWidth(),icon_correo.getHeight(), Image.SCALE_DEFAULT)); 
           icon_correo.setIcon(correo);
           this.repaint();
           
            //ICONO DEL CORREO 
           icon_correo2=new JLabel();
           icon_correo2.setBounds(260, 155, 50 , 50);
           icon_correo2.setVisible(true);
           add(icon_correo2);
           ImageIcon icono_c2= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\name.png");
           Icon correo1 = new ImageIcon(icono_c2.getImage().getScaledInstance(icon_correo2.getWidth(),icon_correo2.getHeight(), Image.SCALE_DEFAULT)); 
           icon_correo2.setIcon(correo1);
           this.repaint();
           
           //botón iniciar
         enviar_c=new JButton("ENVIAR CÓDIGO");
         enviar_c.setBounds(100, 320, 130, 30);
         enviar_c.setVisible(true);
         enviar_c.setBackground(Color.BLUE);
         enviar_c.setForeground(new java.awt.Color(255, 255, 255));
         add(enviar_c);
         
         //botón registro
         reenviar=new JButton("REENVIAR");
         reenviar.setBounds(100, 380, 130, 30);
         reenviar.setVisible(true);
         reenviar.setBackground(Color.CYAN);
         add(reenviar);
    }
    
    
}
