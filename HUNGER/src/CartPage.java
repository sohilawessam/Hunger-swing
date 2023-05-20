import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CartPage extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField codeField;

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
		
		JLabel firstLogoLable = new JLabel("HUN");
		firstLogoLable.setFont(new Font("SansSerif", Font.BOLD, 50));
		firstLogoLable.setForeground(new Color(254, 114, 76));
		firstLogoLable.setBounds(447, 11, 114, 64);
		contentPane.add(firstLogoLable);
		
		JLabel secoundLogoLable = new JLabel("GER");
		secoundLogoLable.setForeground(new Color(254, 114, 76));
		secoundLogoLable.setFont(new Font("SansSerif", Font.BOLD, 50));
		secoundLogoLable.setBounds(447, 66, 114, 64);
		contentPane.add(secoundLogoLable);
		
		JTextPane invoicePanel = new JTextPane();
		invoicePanel.setText(User.invoice);		
		invoicePanel.setFont(new Font("Segoe UI", Font.BOLD, 15));
		invoicePanel.setEditable(false);
		invoicePanel.setBackground(new Color(215, 215, 215));
		invoicePanel.setBounds(290, 144, 430, 156);
		contentPane.add(invoicePanel);
		
		JLabel invoiceLabel = new JLabel("Invoice:");
		invoiceLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		invoiceLabel.setForeground(new Color(255, 197, 41));
		invoiceLabel.setBounds(292, 120, 72, 22);
		contentPane.add(invoiceLabel);
		
		JLabel firstNameLabel = new JLabel("First name:");
		firstNameLabel.setForeground(new Color(255, 197, 41));
		firstNameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		firstNameLabel.setBounds(290, 306, 72, 22);
		contentPane.add(firstNameLabel);
		
		
		firstNameField = new JTextField();
		firstNameField.setBounds(290, 326, 204, 20);
		contentPane.add(firstNameField);
		firstNameField.setColumns(10);
		
		JLabel lastNameLabel = new JLabel("Last name:");
		lastNameLabel.setForeground(new Color(255, 197, 41));
		lastNameLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lastNameLabel.setBounds(516, 306, 72, 22);
		contentPane.add(lastNameLabel);
		
		lastNameField = new JTextField();
		lastNameField.setColumns(10);
		lastNameField.setBounds(516, 326, 204, 20);
		contentPane.add(lastNameField);
		
		JLabel couponLabel = new JLabel("Coupon:");
		couponLabel.setForeground(new Color(255, 197, 41));
		couponLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		couponLabel.setBounds(290, 349, 72, 22);
		contentPane.add(couponLabel);
		
		codeField = new JTextField();
		codeField.setColumns(10);
		codeField.setBounds(290, 369, 114, 20);
		contentPane.add(codeField);
		
		final JPanel checkoutButton = new JPanel();
		
		checkoutButton.setBackground(new Color(255, 197, 41));
		checkoutButton.setBounds(290, 447, 430, 38);
		contentPane.add(checkoutButton);
		checkoutButton.setLayout(new BorderLayout(0, 0));
		
		JLabel checkoutLabel = new JLabel("CHECKOUT");
		checkoutLabel.setFont(new Font("SansSerif", Font.BOLD, 25));
		checkoutLabel.setForeground(new Color(39, 45, 47));
		checkoutLabel.setHorizontalAlignment(SwingConstants.CENTER);
		checkoutButton.add(checkoutLabel);
		
		final JPanel applyCoponButton = new JPanel();
		
		applyCoponButton.setBackground(new Color(254, 114, 76));
		applyCoponButton.setBounds(426, 369, 65, 22);
		contentPane.add(applyCoponButton);
		applyCoponButton.setLayout(new BorderLayout(0, 0));
		
		JLabel applyLabel = new JLabel("APPLY");
		applyLabel.setForeground(new Color(255, 255, 255));
		applyLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		applyLabel.setHorizontalAlignment(SwingConstants.CENTER);
		applyCoponButton.add(applyLabel, BorderLayout.CENTER);
		
		JLabel totalButton = new JLabel("TOTAL:");
		totalButton.setFont(new Font("SansSerif", Font.BOLD, 25));
		totalButton.setForeground(new Color(255, 255, 255));
		totalButton.setBounds(516, 369, 103, 29);
		contentPane.add(totalButton);
		
		final JLabel totalText = new JLabel();
		totalText.setText(User.total+" EGP");
		totalText.setForeground(new Color(254, 114, 76));
		totalText.setFont(new Font("SansSerif", Font.BOLD, 25));
		totalText.setBounds(606, 369, 185, 29);
		contentPane.add(totalText);
		
		
		
		
		
		
		
		applyCoponButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 String copoun;
					
					copoun=codeField.getText().toString();
					
			if(Globals.coupons.containsKey(copoun))
			{
			  double disscount=Globals.coupons.get(copoun)/100;
			  User.total=User.total-User.total*disscount;
			  totalText.setText(User.total+" EGP");
			  totalText.repaint();
			  totalText.revalidate();
				
			}
			
			}
			 @Override
				public void mouseEntered(MouseEvent e) {
				 applyCoponButton.setBackground(new Color(171,76,52));
				}
				@Override
				public void mouseExited(MouseEvent e) {
					applyCoponButton.setBackground(new Color(254,114,76));
				}
			
			
		});
		
		checkoutButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				  
				 
				User.firstName=firstNameField.getText().toString();
				User.lastName=lastNameField.getText().toString();
				File f1=new File("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\orders\\"+User.firstName+" " +User.lastName +".txt");
				if(!f1.exists());
				try
				{
					f1.createNewFile();
					
				}
				catch(IOException e1)
				{
					JOptionPane.showMessageDialog(null, "error");
				}
				try
				{
					PrintWriter w=new PrintWriter(f1);
					String printedInvoice = User.invoice+"\r\n Total: "+User.total+" EGP";
					w.println(printedInvoice);
					w.close();
					JOptionPane.showMessageDialog(null, "order set succsessfully!");
					
				}
				catch(IOException e6)
				{
					JOptionPane.showMessageDialog(null, "error");
				}
				
				
				
				
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				checkoutButton.setBackground(new Color(193,150,31));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				checkoutButton.setBackground(new Color(255,197,41));
			}
		});
		
		

	}
}
