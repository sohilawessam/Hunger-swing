import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;

public class CartPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField adressField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CartPage frame = new CartPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CartPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 556);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(39, 45, 47));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HUN");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblNewLabel.setForeground(new Color(254, 114, 76));
		lblNewLabel.setBounds(447, 11, 114, 64);
		contentPane.add(lblNewLabel);
		
		JLabel lblGer = new JLabel("GER");
		lblGer.setForeground(new Color(254, 114, 76));
		lblGer.setFont(new Font("SansSerif", Font.BOLD, 50));
		lblGer.setBounds(447, 66, 114, 64);
		contentPane.add(lblGer);
		
		JTextPane cartItemsPanel = new JTextPane();
		cartItemsPanel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		cartItemsPanel.setText("lol");
		cartItemsPanel.setEditable(false);
		cartItemsPanel.setBackground(new Color(215, 215, 215));
		cartItemsPanel.setBounds(290, 144, 430, 156);
		contentPane.add(cartItemsPanel);
		
		JLabel lblNewLabel_1 = new JLabel("Invoice:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setForeground(new Color(255, 197, 41));
		lblNewLabel_1.setBounds(292, 120, 72, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("First name:");
		lblNewLabel_1_1.setForeground(new Color(255, 197, 41));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(290, 306, 72, 22);
		contentPane.add(lblNewLabel_1_1);
		
		firstNameField = new JTextField();
		firstNameField.setBounds(290, 326, 204, 20);
		contentPane.add(firstNameField);
		firstNameField.setColumns(10);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Last name:");
		lblNewLabel_1_1_1.setForeground(new Color(255, 197, 41));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_1.setBounds(516, 306, 72, 22);
		contentPane.add(lblNewLabel_1_1_1);
		
		lastNameField = new JTextField();
		lastNameField.setColumns(10);
		lastNameField.setBounds(516, 326, 204, 20);
		contentPane.add(lastNameField);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Coupon:");
		lblNewLabel_1_1_2.setForeground(new Color(255, 197, 41));
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1_2.setBounds(290, 349, 72, 22);
		contentPane.add(lblNewLabel_1_1_2);
		
		adressField = new JTextField();
		adressField.setColumns(10);
		adressField.setBounds(290, 369, 114, 20);
		contentPane.add(adressField);
		
		JPanel checkoutButton = new JPanel();
		checkoutButton.setBackground(new Color(255, 197, 41));
		checkoutButton.setBounds(290, 447, 430, 38);
		contentPane.add(checkoutButton);
		checkoutButton.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("CHECKOUT");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_2.setForeground(new Color(39, 45, 47));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		checkoutButton.add(lblNewLabel_2);
		
		JPanel checkoutButton_1 = new JPanel();
		checkoutButton_1.setBackground(new Color(254, 114, 76));
		checkoutButton_1.setBounds(426, 369, 65, 22);
		contentPane.add(checkoutButton_1);
		checkoutButton_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_3 = new JLabel("APPLY");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		checkoutButton_1.add(lblNewLabel_3, BorderLayout.CENTER);
		
		JLabel lblNewLabel_4 = new JLabel("TOTAL:");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 25));
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(516, 369, 103, 29);
		contentPane.add(lblNewLabel_4);
		
		JLabel TotalText = new JLabel("250 EGP");
		TotalText.setHorizontalAlignment(SwingConstants.CENTER);
		TotalText.setForeground(new Color(254, 114, 76));
		TotalText.setFont(new Font("SansSerif", Font.BOLD, 25));
		TotalText.setBounds(606, 369, 114, 29);
		contentPane.add(TotalText);
		

	}
}
