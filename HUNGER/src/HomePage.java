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
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;

public class HomePage {
    
	private JFrame frame;
	final JPanel gridPanel = new JPanel();

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
		frame = new JFrame("HUNGER");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\logo.png"));
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
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\burgers.png"));
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
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\sweets.png"));
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
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\drinks.png"));
		lblNewLabel_8.setBounds(10, 0, 101, 68);
		drinksPanel.add(lblNewLabel_8);
		
		final JPanel cartPanel = new JPanel();
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
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Shopping cart.png"));
		lblNewLabel_10.setBounds(25, -1, 31, 33);
		cartPanel.add(lblNewLabel_10);
		
		
		gridPanel.setBackground(new Color(215, 215, 215));
		gridPanel.setBounds(219, 0, 789, 517);
		frame.getContentPane().add(gridPanel);
		gridPanel.setLayout(new GridLayout(0, 3, 5, 5));
		
		
		  buildGridLayout() ;
		
		
		
		
		frame.setBounds(100, 100, 1024, 556);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sweetsPanel.addMouseListener(new MouseAdapter()  

		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	Globals.listItems=Globals.sweetsItems;
		    	gridPanel.removeAll();
		    	buildGridLayout();
		    	SwingUtilities.updateComponentTreeUI(frame);
		    	burgerPanel.setBackground(new Color(39, 45, 47));
		    	drinksPanel.setBackground(new Color(39, 45, 47));
		    	sweetsPanel.setBackground(new Color(215, 215, 215));

		    }  
		}); 
		burgerPanel.addMouseListener(new MouseAdapter()  

		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	Globals.listItems=Globals.burgerItems;
		    	gridPanel.removeAll();
		    	buildGridLayout();
		    	SwingUtilities.updateComponentTreeUI(frame);
		    	burgerPanel.setBackground(new Color(215, 215, 215));
		    	drinksPanel.setBackground(new Color(39, 45, 47));
		    	sweetsPanel.setBackground(new Color(39, 45, 47));

		    }  
		}); 
		drinksPanel.addMouseListener(new MouseAdapter()  


		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		    	Globals.listItems=Globals.drinksItems;
		    	gridPanel.removeAll();
		    	buildGridLayout();
		    	SwingUtilities.updateComponentTreeUI(frame);
		    	burgerPanel.setBackground(new Color(39, 45, 47));
		    	drinksPanel.setBackground(new Color(215, 215, 215));
		    	sweetsPanel.setBackground(new Color(39, 45, 47));

		    }  
		}); 
		cartPanel.addMouseListener(new MouseAdapter()  

		{  
		    public void mouseClicked(MouseEvent e)  
		    {  
		         User.calc_total();
		         User.create_invoice();
		    	CartPage cartPage = new CartPage();
		    	cartPage.setVisible(true);

		    }
		    @Override
			public void mouseEntered(MouseEvent e) {
				cartPanel.setBackground(new Color(171,76,52));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				cartPanel.setBackground(new Color(254,114,76));
			}
		}); 
		
	}

	private void buildGridLayout() {
		
		for( int i=0;i<9;i++) {
			if (i<Globals.listItems.length)
		{
				final JPanel itemPanel1 = new JPanel();
				itemPanel1.setBackground(new Color(255, 255, 255));
				itemPanel1.setSize(2, 2);
				gridPanel.add(itemPanel1);
				itemPanel1.setLayout(new CardLayout(0, 0));
				
				final JPanel itemDitaelsPanel = new JPanel();
				itemDitaelsPanel.setBackground(new Color(255, 255, 255));
				itemDitaelsPanel.setLayout(new BorderLayout(0, 0));
				
				JPanel panel = new JPanel();
				itemDitaelsPanel.add(panel, BorderLayout.NORTH);
				panel.setLayout(new BorderLayout(0, 0));
				
				JLabel itemNameLable = new JLabel(Globals.listItems[i].name);
				itemNameLable.setBackground(new Color(255, 255, 255));
				itemNameLable.setForeground(new Color(39, 45, 47));
				itemNameLable.setHorizontalAlignment(SwingConstants.CENTER);
				itemNameLable.setFont(new Font("SansSerif", Font.BOLD, 20));
				panel.add(itemNameLable, BorderLayout.CENTER);
				
				JLabel backLable = new JLabel("");
				backLable.setBackground(new Color(255, 255, 255));
				
				backLable.setIcon(new ImageIcon("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\Arrow back ios.png"));
				panel.add(backLable, BorderLayout.WEST);
				
				JPanel priceAndATCPanel = new JPanel();
				priceAndATCPanel.setBackground(new Color(255, 255, 255));
				itemDitaelsPanel.add(priceAndATCPanel, BorderLayout.SOUTH);
				priceAndATCPanel.setLayout(new BorderLayout(0, 0));
				
				final JPanel itemAddTOCartPanel = new JPanel();
				itemAddTOCartPanel.setBackground(new Color(255, 197, 41));
				priceAndATCPanel.add(itemAddTOCartPanel, BorderLayout.EAST);
				itemAddTOCartPanel.setLayout(new BorderLayout(0, 0));
				
				JLabel addToCartIcon = new JLabel("");
				addToCartIcon.setIcon(new ImageIcon("C:\\Users\\Sohila\\git\\Hunger-swing\\HUNGER\\images\\AddTOCart.png"));
				itemAddTOCartPanel.add(addToCartIcon, BorderLayout.NORTH);
				
				JLabel itemPriceLable = new JLabel("  "+Globals.listItems[i].price+" EGP");
				itemPriceLable.setHorizontalAlignment(SwingConstants.CENTER);
				itemPriceLable.setForeground(new Color(254, 114, 76));
				itemPriceLable.setFont(new Font("SansSerif", Font.PLAIN, 20));
				priceAndATCPanel.add(itemPriceLable, BorderLayout.WEST);
				
				JPanel NutrationPanel = new JPanel();
				itemDitaelsPanel.add(NutrationPanel, BorderLayout.CENTER);
				NutrationPanel.setLayout(new BorderLayout(0, 0));
				
				JTextArea nutrationTextArea = new JTextArea();
				nutrationTextArea.setForeground(new Color(128, 128, 128));
				nutrationTextArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
				nutrationTextArea.setText("\r\n\tcalories: "+Globals.listItems[i].caloris+"cal \r\n\t protine: "+Globals.listItems[i].protine+"g");
				nutrationTextArea.setEditable(false);
				NutrationPanel.add(nutrationTextArea, BorderLayout.CENTER);
				
				final JPanel itemImagePanel = new JPanel();
				
				
				itemPanel1.add(itemImagePanel, "name_317068623113200");
				itemImagePanel.setLayout(new BorderLayout(0, 0));
				
				JLabel itemImage = new JLabel("");
				itemImage.setHorizontalAlignment(SwingConstants.CENTER);
				itemImage.setIcon(new ImageIcon(Globals.listItems[i].image));
				itemImagePanel.add(itemImage);
				backLable.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						itemPanel1.removeAll();
						itemPanel1.add(itemImagePanel);
						itemPanel1.repaint();
						itemPanel1.revalidate();
					}
				});
				final int index=i;
				itemAddTOCartPanel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseEntered(MouseEvent e) {
						itemAddTOCartPanel.setBackground(new Color(193,150,31));
					}
					@Override
					public void mouseExited(MouseEvent e) {
						itemAddTOCartPanel.setBackground(new Color(255,197,41));
					}
					@Override
					public void mouseClicked(MouseEvent e) {
						boolean itemChecker=false;
						int ckeckerNumber;
						
						for(int i=0;i<User.cartItems.size();i++)
						{
							
							if (Globals.listItems[index].id==User.cartItems.get(i).id)
							{
								itemChecker=true;
								ckeckerNumber=i;
							}
						}
						
						if (itemChecker)
						{
							User.cartItems.get(index).quantaty++;
						}
						else {
							User.cartItems.add(new CartItem(Globals.listItems[index].name,Globals.listItems[index].price,Globals.listItems[index].id,1));
						}
						
						
					}
				});
				itemImagePanel.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						itemPanel1.removeAll();
						itemPanel1.add(itemDitaelsPanel);
						itemPanel1.repaint();
						itemPanel1.revalidate();
					}
				});
		}
			else {
				JPanel itemPanel = new JPanel();
				itemPanel.setSize(2, 2);
				itemPanel.setBackground(new Color(214, 214, 214));
				gridPanel.add(itemPanel);
			}
		}
		
	}
}
