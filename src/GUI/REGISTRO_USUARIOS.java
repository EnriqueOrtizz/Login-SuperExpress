/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Kike Rebollar
 */
public class REGISTRO_USUARIOS extends JFrame {
    public JLabel icon1,icon2, nombR,correo,contra,conf_c, icon_name, icon_correo, icon_pass, icon_passConf;
    public JTextField u1,correoR;
    public JPasswordField C_con, conf_contra;
    public JButton registrar1;
   
    
   
     public REGISTRO_USUARIOS(){
        setTitle("Registro de Usuario");
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
           
            //LABEL PARA NOMBRE DE REGISTRO
        nombR=new JLabel("NOMBRE COMPLETO");
         nombR.setBounds(30, 125, 150, 60);
         nombR.setVisible(true);
        nombR.setFont(new java.awt.Font("Gotham Thin", 1, 14));;
         //nombR.setForeground(new java.awt.Color(255, 255, 255));
         add(nombR);
         
         //NOMBRE DEL USUARIO
         u1=new JTextField();
         u1.setBounds(30, 170, 230, 20);
         u1.setVisible(true);
         
         add(u1);
         
         //LABEL PARA NOMBRE DE CORREO
        correo=new JLabel("CORREO ELECTRÓNICO");
         correo.setBounds(30, 200, 190, 60);
         correo.setVisible(true);
        correo.setFont(new java.awt.Font("Gotham Thin", 1, 14));;
         //correo.setForeground(new java.awt.Color(255, 255, 255));
         add(correo);
         
         //NOMBRE DEL CORREO
         correoR=new JTextField();
         correoR.setBounds(30, 245, 230, 20);
         correoR.setVisible(true);
         add(correoR);
         
          //LABEL PARA CREAR CONTRASEÑA
        contra=new JLabel("PASSWORD");
         contra.setBounds(30, 275, 190, 60);
         contra.setVisible(true);
        contra.setFont(new java.awt.Font("Gotham Thin", 1, 14));;
         //contra.setForeground(new java.awt.Color(255, 255, 255));
         add(contra);
         
         //CONTENIDO DE CONTRASEÑA
         C_con=new JPasswordField();
         C_con.setBounds(30, 320, 230, 20);
         C_con.setVisible(true);
         add(C_con);
         
         //LABEL PARA CONFIRMAR CONTRASEÑA
        conf_c=new JLabel("CONFIRM PASSWORD");
         conf_c.setBounds(30, 350, 200, 60);
         conf_c.setVisible(true);
        conf_c.setFont(new java.awt.Font("Gotham Thin", 1, 14));;
         //conf_c.setForeground(new java.awt.Color(255, 255, 255));
         add(conf_c);
         
         //CONTENIDO DE CONTRASEÑA
         conf_contra=new JPasswordField();
         conf_contra.setBounds(30, 395, 230, 20);
         conf_contra.setVisible(true);
         add(conf_contra);
         
          //BOTON PARA CONFIRMAR REGISTRO
         registrar1=new JButton("CONFIRMAR REGISTRO");
         registrar1.setBounds(70, 450, 190, 30);
         registrar1.setVisible(true);
         registrar1.setBackground(Color.CYAN);
         //registrar.setForeground(new java.awt.Color(255, 255, 255));
         add(registrar1);
         
         //ICONO DEL NOMBRE 
           icon_name=new JLabel();
           icon_name.setBounds(260, 150, 50 , 50);
           icon_name.setVisible(true);
           add(icon_name);
           ImageIcon icono_nombre= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\name.png");
           Icon name = new ImageIcon(icono_nombre.getImage().getScaledInstance(icon_name.getWidth(),icon_name.getHeight(), Image.SCALE_DEFAULT)); 
           icon_name.setIcon(name);
           this.repaint();
           
           //ICONO DEL CORREO 
           icon_correo=new JLabel();
           icon_correo.setBounds(260, 235, 50 , 50);
           icon_correo.setVisible(true);
           add(icon_correo);
           ImageIcon icono_c= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\name.png");
           Icon correo = new ImageIcon(icono_c.getImage().getScaledInstance(icon_name.getWidth(),icon_name.getHeight(), Image.SCALE_DEFAULT)); 
           icon_correo.setIcon(correo);
           this.repaint();
           
           //ICONO DEL PASSWORD 
           icon_pass=new JLabel();
           icon_pass.setBounds(265, 310, 40 , 40);
           icon_pass.setVisible(true);
           add(icon_pass);
           ImageIcon icono_p= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\password.png");
           Icon password = new ImageIcon(icono_p.getImage().getScaledInstance(icon_name.getWidth(),icon_name.getHeight(), Image.SCALE_DEFAULT)); 
           icon_pass.setIcon(password);
           this.repaint();
           
            //ICONO DE CONFIRM PASSWORD 
           icon_passConf=new JLabel();
           icon_passConf.setBounds(265, 385, 40 , 40);
           icon_passConf.setVisible(true);
           add(icon_passConf);
           ImageIcon icono_pC= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\password.png");
           Icon passwordConfirm = new ImageIcon(icono_pC.getImage().getScaledInstance(icon_name.getWidth(),icon_name.getHeight(), Image.SCALE_DEFAULT)); 
           icon_passConf.setIcon(passwordConfirm);
           this.repaint();
           
           
          
 
      }
    
}
    
         
     
