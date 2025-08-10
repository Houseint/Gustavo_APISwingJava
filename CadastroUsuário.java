
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//Aqui eu importei todas as bibliotecas necessárias


public class CadastroUsuário {
    public static void main(String[] args) {
        JFrame janelaP = new JFrame("Cadastro de Usuário");
        janelaP.setSize(400, 300);
        janelaP.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaP.setLocationRelativeTo(null);
        janelaP.setLayout(new GridLayout(5, 2, 10, 10));//aqui eu criei a janela e configurei ela

        JLabel Nome = new JLabel("Nome");
        Nome.setHorizontalAlignment(JLabel.CENTER);
        JLabel Email = new JLabel("Email");
        Email.setHorizontalAlignment(JLabel.CENTER);
        JLabel Idade = new JLabel("Idade");
        Idade.setHorizontalAlignment(JLabel.CENTER);                    //aqui eu criei todos os segmentos da janela principal
        JRadioButton Masculino = new JRadioButton("Masculino");     //aqui criei os botoes pra escolher o sexo do usuário
        Masculino.setHorizontalAlignment(JRadioButton.CENTER);
        JRadioButton Feminino = new JRadioButton("Feminino");
        Feminino.setHorizontalAlignment(JRadioButton.CENTER);
        ButtonGroup escolhaSexo = new ButtonGroup();//esse group junta os dois botões e permite q só um seja escolhido
        escolhaSexo.add(Masculino);
        escolhaSexo.add(Feminino);

        JPanel abaSexo = new JPanel();// criei um painelzinho pra encaixar os botões
        abaSexo.add(Masculino);
        abaSexo.add(Feminino);


        JTextField areaNome = new JTextField(8);
        JTextField areaEmail = new JTextField(8);
        JTextField areaIdade = new JTextField(8);//area onde os usuarios vao digitar as informações

        JButton Cadastrar = new JButton("Cadastrar");
        JButton Limpar = new JButton("Limpar");// esses sao os botoes q vão ter uma ação quando pressionados

        Limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                areaNome.setText("");
                areaEmail.setText("");
                areaIdade.setText("");
                escolhaSexo.clearSelection();
            }
        });
        Cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (areaNome.getText().isEmpty() ||
                        areaEmail.getText().isEmpty() ||
                        areaIdade.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(janelaP, "Um ou mais campos estão vazios!!", "Cadastro Incompleto.", JOptionPane.ERROR_MESSAGE);
                } else if (!areaEmail.getText().contains("@") || !areaEmail.getText().contains(".")) {
                    JOptionPane.showMessageDialog(janelaP, "O Email digitado é inválido! Deve conter '@' e '.' .", "Erro no Email", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(janelaP,
                            "Usuário cadastrado com sucesso!\n" +
                                    "Nome: " + areaNome.getText() + "\n" +
                                    "Email: " + areaEmail.getText() + "\n" +
                                    "Idade: " + areaIdade.getText());//FUNCIONOUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU SOU UM GENIO
                }
            }
        });

        // nesses ActionListener eu criei as funções dos botoes, ***o primeiro(limpar) limpa todos os campos digitados pelo usuario, setando ele para vazio***
        // *** ja o segundo(cadastrar) tem 3 funcoes em um só, ele verifica se tem algum campo vazio, depois ele verifica se o email é valido e por fim exibe a mensagem final, mostrando todos os dados cadastrados

        janelaP.add(Nome);
        janelaP.add(areaNome);
        janelaP.add(Email);
        janelaP.add(areaEmail);
        janelaP.add(Idade);
        janelaP.add(areaIdade);
        janelaP.add(abaSexo);
        janelaP.add(Cadastrar);
        janelaP.add(Limpar);
        janelaP.setVisible(true);// aqui eu adicionei todos os segmentos na janela principal e deixei ela visivel ao ser executada

    }
}
