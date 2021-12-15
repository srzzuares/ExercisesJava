
package Login;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class graficos {

    public static void main(String[] args) {
        // TODO code application logic here
        //crear el frame o ventana
        JFrame frame = new JFrame("Formulario de accesso");
        Container contenedor = frame.getContentPane();
        //mostrar botonoes de cerrar, minimizar y maximizar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //posicionar un objeto en el frame
        frame.setLayout(new FlowLayout());
        //tamaño del frame o ventana
        frame.setSize(400, 400);
        //crear caja de texto
        JLabel lblusuario= new JLabel("Usuario:");
        JTextField txtusuario= new JTextField(20); 
        JLabel lblcontrasena= new JLabel("Contraseña:");
       // JTextField txtcontrasena= new JTextField(20); 
        JPasswordField txtcontrasena=new JPasswordField(20);
        JButton btnentrar=new JButton("Entrar");
        btnentrar.setBackground(Color.red);
        //agregar caja de texto a el frame o ventana
        frame.add(lblusuario);
        frame.add(txtusuario);
        frame.add(lblcontrasena);
        frame.add(txtcontrasena);
        frame.add(btnentrar);

        JPanel panel = new JPanel();
        panel.add(new JButton("Uno"));
        panel.add(new JButton("Dos"));
        panel.add(new JButton("Tres"));
        contenedor.add(panel);
        
        //mostrar ventana
        frame.setVisible(true);
    }
    
}
