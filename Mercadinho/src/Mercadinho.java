import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mercadinho {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simulação de Pedidos de Mercadinho");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JLabel labelProduto = new JLabel("Produto:");
        JTextField txtProduto = new JTextField(10);

        JLabel labelQuantidade = new JLabel("Quantidade:");
        JTextField txtQuantidade = new JTextField(5);

        JLabel labelTotal = new JLabel("Total:");
        JTextField txtTotal = new JTextField(10);
        txtTotal.setEditable(false);

        JButton btnCalcular = new JButton("Calcular");


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int quantidade = Integer.parseInt(txtQuantidade.getText());
                double preco = 5.00; // Preço fixo para todos os produtos
                double total = quantidade * preco;
                txtTotal.setText(String.valueOf(total));
            }
        });


        JPanel panel = new JPanel();
        panel.add(labelProduto);
        panel.add(txtProduto);
        panel.add(labelQuantidade);
        panel.add(txtQuantidade);
        panel.add(btnCalcular);
        panel.add(labelTotal);
        panel.add(txtTotal);

        frame.add(panel);
        frame.setVisible(true);
    }
}
