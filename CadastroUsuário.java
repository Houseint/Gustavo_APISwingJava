
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
        janelaP.setSize(400,300);
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setLocationRelativeTo(null);
        janelaP.setLayout(new GridLayout(4,2,10,10));
    
        JLabel Nome= new JLabel("Nome");
        Nome.setHorizontalAlignment(JLabel.CENTER);
        JLabel Email= new JLabel("Email");
        Email.setHorizontalAlignment(JLabel.CENTER);
        JLabel Idade= new JLabel("Idade");
        Idade.setHorizontalAlignment(JLabel.CENTER);

        JTextField areaNome = new JTextField(8);
        JTextField areaEmail = new JTextField(8);
        JTextField areaIdade = new JTextField(8);

        JButton Cadastrar = new JButton("Cadastrar");

        Cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (areaNome.getText().isEmpty() ||
                        areaEmail.getText().isEmpty() ||
                        areaIdade.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(janelaP,"Um ou mais campos estão vazios!!", "Cadastro Incompleto.", JOptionPane.ERROR_MESSAGE );
                }else {
                    JOptionPane.showMessageDialog(janelaP,
                            "Usuário cadastrado com sucesso!\n" +
                                    "Nome: " + areaNome.getText() + "\n" +
                                    "Email: " + areaEmail.getText() + "\n" +
                                    "Idade: " + areaIdade.getText());//FUNCIONOUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU SOU UM GENIO
                }
        }
    });
        janelaP.add(Nome);
        janelaP.add(areaNome);
        janelaP.add(Email);
        janelaP.add(areaEmail);
        janelaP.add(Idade);
        janelaP.add(areaIdade);
        janelaP.add(new JLabel(""));
        janelaP.add(Cadastrar);
        janelaP.setVisible(true);

}
}
