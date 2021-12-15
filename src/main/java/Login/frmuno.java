
package Login;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class frmuno {


    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Formulario de accesso");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400, 400);
        
        JLabel lblusuario=new JLabel("Usuario");
        lblusuario.setBounds(150,100,100,30);
        frame.add(lblusuario);
        JTextField txtusuario=new JTextField(30);
        txtusuario.setBounds(100,130,200,30);
        frame.add(txtusuario);
        JLabel lblcontrasena=new JLabel("Contraseña");
        lblcontrasena.setBounds(150,160,100,30);
        frame.add(lblcontrasena);
        JPasswordField txtcontrasena=new JPasswordField(30);
        txtcontrasena.setBounds(100,190,200,30);
        frame.add(txtcontrasena);
        JButton btnentrar=new JButton("Entrar");
        btnentrar.setBounds(150,300,100,30);
        frame.add(btnentrar);
        
        frame.setVisible(true);
        
        
        btnentrar.addActionListener(new ActionListener() {

          public void actionPerformed(ActionEvent e) {
           // etiqueta.setText("Has pulsado el botón ");	
            
            String user = txtusuario.getText();
            String pass = new String(txtcontrasena.getPassword());
            
            if(user.equals("Admin") && pass.equals("1234")){
                JOptionPane.showMessageDialog(null,"Bienvenido","Autorizado",JOptionPane.INFORMATION_MESSAGE);
                frmmenu formulario=new frmmenu(); 
                formulario.setVisible(true);
                txtusuario.setText("");
                txtcontrasena.setText("");               
                frame.setVisible(false);
            }else if(user.equals("Crystian") && pass.equals("5715")){
                JOptionPane.showMessageDialog(null,"Bienvenido","Autorizado",JOptionPane.INFORMATION_MESSAGE);
                frmmenu formulario=new frmmenu(); 
                formulario.setVisible(true);
                txtusuario.setText("");
                txtcontrasena.setText("");               
                frame.setVisible(false);
            }else {
               JOptionPane.showMessageDialog(null,"Error de usuario o contraseña","Error",JOptionPane.ERROR_MESSAGE);
               txtusuario.setText("");
               txtcontrasena.setText("");
            }
          }	
        });
    }
//Para poner fondo de JFRAME
 /*   class FondoPanel extends JPanel {
        private Image imagen;
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/Imagenes/login.jpeg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
            
        }
    }*/
}




