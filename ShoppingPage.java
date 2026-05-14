import javax.swing.*;
import java.awt.event.*;

public class ShoppingPage extends JFrame implements ActionListener {

    JButton hoodieButton;
    JButton shoesButton;
    JButton viewCartButton;

    JTextArea cartArea;

    ShoppingCart cart;

    public ShoppingPage() {

        setTitle("Fashion Hub");
        setSize(500, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cart = new ShoppingCart();

        hoodieButton = new JButton("Add H&M Hoodie - $49.99");
        hoodieButton.setBounds(40, 40, 220, 40);
        hoodieButton.addActionListener(this);

        shoesButton = new JButton("Add Adidas Shoe - $100.00");
        shoesButton.setBounds(40, 100, 220, 40);
        shoesButton.addActionListener(this);

        viewCartButton = new JButton("View Cart");
        viewCartButton.setBounds(40, 170, 220, 40);
        viewCartButton.addActionListener(this);

        cartArea = new JTextArea();
        cartArea.setBounds(280, 40, 180, 220);

        add(hoodieButton);
        add(shoesButton);
        add(viewCartButton);
        add(cartArea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == hoodieButton) {

            Product hoodie = new Product(
                    "H&M Hoodie",
                    49.99
            );

            cart.AddItem(hoodie);

            JOptionPane.showMessageDialog(this,
                    "H&M Hoodie Added");
        }

        if(e.getSource() == shoesButton) {

            Product shoes = new Product(
                    "Adidas Shoe",
                    100.00
            );

            cart.AddItem(shoes);

            JOptionPane.showMessageDialog(this,
                    "Adidas Shoe Added");
        }

        if(e.getSource() == viewCartButton) {

            cartArea.setText(cart.displayCart());
        }
    }
}