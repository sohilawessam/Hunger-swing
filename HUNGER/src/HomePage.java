import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;

public class HomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage window = new HomePage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sohila\\eclipse-workspace\\HUNGER\\images\\logo.png"));
		frame.getContentPane().setBackground(new Color(215, 215, 215));
		frame.setBackground(new Color(255, 255, 255));
		frame.setForeground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JPanel sidePanel = new JPanel();
		sidePanel.setBackground(new Color(39, 45, 47));
		sidePanel.setBounds(0, 0, 220, 517);
		frame.getContentPane().add(sidePanel);
		sidePanel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("HUN");
		lblNewLabel_1.setBounds(74, 0, 75, 44);
		lblNewLabel_1.setForeground(new Color(254, 114, 76));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 34));
		sidePanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("GER");
		lblNewLabel.setBounds(74, 30, 75, 44);
		lblNewLabel.setForeground(new Color(254, 114, 76));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 34));
		sidePanel.add(lblNewLabel);
		
		final JPanel burgerPanel = new JPanel();
		burgerPanel.setBackground(new Color(215, 215, 215));
		burgerPanel.setBounds(0, 98, 220, 68);
		sidePanel.add(burgerPanel);
		burgerPanel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(110, 5, 0, 0);
		burgerPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BURGERS");
		lblNewLabel_3.setForeground(new Color(254, 114, 76));
		lblNewLabel_3.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(103, 25, 128, 32);
		burgerPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Sohila\\eclipse-workspace\\HUNGER\\images\\burgers.png"));
		lblNewLabel_6.setBounds(0, -11, 100, 79);
		burgerPanel.add(lblNewLabel_6);
		
		
		final JPanel sweetsPanel = new JPanel();
		sweetsPanel.setBackground(new Color(39, 45, 47));
		sweetsPanel.setBounds(0, 166, 220, 68);
		sidePanel.add(sweetsPanel);
		sweetsPanel.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("SWEETS");
		lblNewLabel_4.setForeground(new Color(254, 114, 76));
		lblNewLabel_4.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(106, 16, 104, 33);
		sweetsPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Sohila\\eclipse-workspace\\HUNGER\\images\\sweets.png"));
		lblNewLabel_7.setBounds(10, 2, 110, 66);
		sweetsPanel.add(lblNewLabel_7);
		
		final JPanel drinksPanel = new JPanel();
		drinksPanel.setBackground(new Color(39, 45, 47));
		drinksPanel.setBounds(0, 234, 220, 68);
		sidePanel.add(drinksPanel);
		drinksPanel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("DRINKS");
		lblNewLabel_5.setForeground(new Color(254, 114, 76));
		lblNewLabel_5.setBounds(107, 15, 147, 33);
		drinksPanel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 20));
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Sohila\\eclipse-workspace\\HUNGER\\images\\drinks.png"));
		lblNewLabel_8.setBounds(10, 0, 101, 68);
		drinksPanel.add(lblNewLabel_8);
		
		JPanel cartPanel = new JPanel();
		cartPanel.setBackground(new Color(254, 114, 76));
		cartPanel.setBounds(28, 478, 155, 28);
		sidePanel.add(cartPanel);
		cartPanel.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("cart");
		lblNewLabel_9.setFont(new Font("SansSerif", Font.BOLD, 20));
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setBounds(66, 0, 73, 25);
		cartPanel.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Sohila\\eclipse-workspace\\HUNGER\\images\\Shopping cart.png"));
		lblNewLabel_10.setBounds(25, -1, 31, 33);
		cartPanel.add(lblNewLabel_10);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setBackground(new Color(215, 215, 215));
		gridPanel.setBounds(219, 0, 789, 517);
		frame.getContentPane().add(gridPanel);
		gridPanel.setLayout(new GridLayout(0, 3, 5, 5));
		JPanel itemPanel1 = new JPanel();
		itemPanel1.setBackground(new Color(192, 192, 192));
		itemPanel1.setSize(2, 2);
		gridPanel.add(itemPanel1);
		GridBagLayout gbl_itemPanel1 = new GridBagLayout();
		gbl_itemPanel1.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_itemPanel1.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_itemPanel1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_itemPanel1.rowWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		itemPanel1.setLayout(gbl_itemPanel1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 7;
		gbc_panel_2.gridheight = 6;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 0;
		itemPanel1.add(panel_2, gbc_panel_2);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(-209, 11, 485, 177);
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\Sohila\\eclipse-workspace\\HUNGER\\images\\Bigmac.png"));
		panel_2.add(lblNewLabel_11);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridheight = 2;
		gbc_panel_1.gridwidth = 7;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 14;
		itemPanel1.add(panel_1, gbc_panel_1);
		for(int i=0;i<9;i++) {
			if (i<Globals.burgerItems.length)
		{
		JPanel itemPanel = new JPanel();
		itemPanel.setSize(2, 2);
		itemPanel.setBackground(new Color(255, 255, 255));
		gridPanel.add(itemPanel);
		}
			else {
				JPanel itemPanel = new JPanel();
				itemPanel.setSize(2, 2);
				itemPanel.setBackground(new Color(214, 214, 214));
				gridPanel.add(itemPanel);
			}
		}
		
		
		
		frame.setBounds(100, 100, 1024, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sweetsPanel.addMouseListener(new MouseAdapter()  

		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	burgerPanel.setBackground(new Color(39, 45, 47));
		    	drinksPanel.setBackground(new Color(39, 45, 47));
		    	sweetsPanel.setBackground(new Color(215, 215, 215));

		    }  
		}); 
		burgerPanel.addMouseListener(new MouseAdapter()  

		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	System.out.println(Globals.burgerItems[0].price);
		    	burgerPanel.setBackground(new Color(215, 215, 215));
		    	drinksPanel.setBackground(new Color(39, 45, 47));
		    	sweetsPanel.setBackground(new Color(39, 45, 47));

		    }  
		}); 
		drinksPanel.addMouseListener(new MouseAdapter()  


		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	burgerPanel.setBackground(new Color(39, 45, 47));
		    	drinksPanel.setBackground(new Color(215, 215, 215));
		    	sweetsPanel.setBackground(new Color(39, 45, 47));

		    }  
		}); 
		cartPanel.addMouseListener(new MouseAdapter()  

		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	CartPage cartPage = new CartPage();
		    	cartPage.setVisible(true);

		    }  
		}); 
		
	}
}
