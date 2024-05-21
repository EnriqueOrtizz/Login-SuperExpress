/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author lucho
 */
public class INICIO_SESION extends JFrame implements ActionListener{
    
    public JLabel imagen1,inicio_ses, contraseña,azul,rosa, icon1,imageLabel, icon2, olv_con, icon3, icon4;
    public JTextField resp1;
    public JButton iniciar, registrar;
    public JPasswordField contra;
    
    public INICIO_SESION(){
        setTitle("Login");
        setSize(350,550);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
        Componentes();
        FONDO fondo=new FONDO();
        this.add(fondo);
        //IMAGEN PARA LOS ÍCONOS
           //ImageIcon logo= new ImageIcon("/IMAGENES/logoSuperER.png");
           //Icon icono1 = new ImageIcon(logo.getImage().getScaledInstance(azul.getWidth(),azul.getHeight(), Image.SCALE_DEFAULT)); 
           //azul.setIcon(icono1);
           //this.revalidate();
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
           
           //Icono Usuario
            icon3=new JLabel();
           icon3.setBounds(90, 140, 25 , 25);
           icon3.setVisible(true);
           add(icon3);
           ImageIcon img3= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\usuario1.png");
           Icon icono3 = new ImageIcon(img3.getImage().getScaledInstance(icon3.getWidth(),icon3.getHeight(), Image.SCALE_DEFAULT)); 
           icon3.setIcon(icono3);
           this.repaint();
           
           //Icono de Contraseña
             icon4=new JLabel();
           icon4.setBounds(70, 230, 25 , 25);
           icon4.setVisible(true);
           add(icon4);
           ImageIcon img4= new ImageIcon("C:\\Users\\Kike Rebollar\\OneDrive\\Documentos\\NetBeansProjects\\SUPER_EXPRESS\\src\\IMAGENES\\contra.png");
           Icon icono4 = new ImageIcon(img4.getImage().getScaledInstance(icon3.getWidth(),icon3.getHeight(), Image.SCALE_DEFAULT)); 
           icon4.setIcon(icono4);
           this.repaint();
           
           

         //LABEL PARA INSTRUCCIONES (INICIO SESIÓN)
         inicio_ses=new JLabel("USUARIO");
         inicio_ses.setBounds(125, 125, 100, 60);
         inicio_ses.setVisible(true);
         inicio_ses.setFont(new java.awt.Font("Gotham Thin", 1, 18));;
         //inicio_ses.setForeground(new java.awt.Color(0, 255, 255));
         add(inicio_ses);
         
         //lABEL PARA CONTRASEÑA 
         contraseña=new JLabel("CONTRASEÑA");
         contraseña.setBounds(100, 215, 150, 60);
         contraseña.setVisible(true);
         contraseña.setFont(new java.awt.Font("Gotham Thin", 1, 18));;
        // contraseña.setForeground(new java.awt.Color(0, 255, 255));
         add(contraseña);
         
         //label has olvidiado contraseña
          olv_con=new JLabel("¿Olvidaste tu contraseña?");
          olv_con.setBounds(60, 450, 210, 50);
          olv_con.setVisible(true);
          olv_con.setFont(new java.awt.Font("Gotham Thin", 1, 15));;
          olv_con.setForeground(new java.awt.Color(255, 255, 255));
          //FUNCIÓN PARA ABRIR NUEVA INTERFAZ MEDIANTE UN CLICK
         olv_con.addMouseListener(new MouseListener(){
           @Override
           public void mouseClicked (MouseEvent e){
                OLVIDASTE_CONTRASEÑA ventanaCR=new OLVIDASTE_CONTRASEÑA();
                ventanaCR.setVisible(true);
           }

               @Override
               public void mousePressed(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public void mouseReleased(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public void mouseEntered(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public void mouseExited(MouseEvent e) {
                   //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
       
   });
          
          
         add( olv_con);
         
         
         
         //respuesta de contraseña
         contra= new JPasswordField();
         contra.setBounds(70, 260 , 200, 20);
         contra.setVisible(true);
         //contra.setBackground(new Color(0,0,0,1));
         add(contra);
         
         
         //respuesta de InicioSesión
         resp1=new JTextField();
         resp1.setBounds(70, 170, 200, 20);
         resp1.setVisible(true);
         //resp1.setBackground(new Color(0,0,0,1));
         add(resp1);
       
         
         
         //botón iniciar
         iniciar=new JButton("INICIAR SESIÓN");
         iniciar.setBounds(100, 320, 130, 30);
         iniciar.setVisible(true);
         iniciar.setBackground(Color.BLUE);
         iniciar.setForeground(new java.awt.Color(255, 255, 255));
         add(iniciar);
         
         //botón registro
         registrar=new JButton("REGISTARTE");
         registrar.setBounds(100, 380, 130, 30);
         registrar.setVisible(true);
         registrar.setBackground(Color.CYAN);
         //registrar.setForeground(new java.awt.Color(255, 255, 255));
         add(registrar);
         registrar.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed (ActionEvent e){
                REGISTRO_USUARIOS ventanaR=new REGISTRO_USUARIOS();
                ventanaR.setVisible(true);
           }
       
   });
         
     }
     

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
