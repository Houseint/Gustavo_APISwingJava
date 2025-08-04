
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class CadastroUsuário {
    public static void main(String[] args) {
        JFrame janelaP = new JFrame("Cadastro de Usuário");
        janelaP.setSize(700,600);
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setLocationRelativeTo(null);
        janelaP.setLayout(new GridLayout(2,4,5,5));
    
        JLabel Nome= new JLabel("Nome");
        JLabel Email= new JLabel("Email");
        JLabel Idade= new JLabel("Idade");

        JTextField areaNome = new JTextField(20);
        JTextField areaEmail = new JTextField(20);
        JTextField areaIdade = new JTextField(20);

        JButton Cadastrar = new JButton("Cadastrar");

        Cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
               JOptionPane.showMessageDialog(janelaP, 
                   "Usuário cadastrado com sucesso!\n" +
                   "Nome: " + areaNome.getText() + "\n" +
                   "Email: " + areaEmail.getText() + "\n" +
                   "Idade: " + areaIdade.getText());
        }
    });
}
}
