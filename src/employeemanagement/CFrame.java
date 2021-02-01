package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnExit;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CFrame frame = new CFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public CFrame() {
		setTitle(" COMMISSION EMPLOYEE ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 336);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("Button.background"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("    NAME :");
		lblNewLabel.setBackground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 18, 124, 32);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBackground(new Color(176, 224, 230));
		textField.setBounds(204, 24, 169, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("   ID :");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 48, 113, 42);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setBounds(204, 59, 169, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DESIGNATION :");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2.setBounds(20, 88, 124, 42);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBackground(new Color(176, 224, 230));
		textField_2.setBounds(204, 99, 169, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCommission = new JLabel(" COMMISSION :");
		lblCommission.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblCommission.setBounds(12, 132, 131, 42);
		contentPane.add(lblCommission);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBackground(new Color(176, 224, 230));
		textField_3.setBounds(204, 143, 169, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("SALE :");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_3.setBounds(20, 173, 124, 42);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBackground(new Color(176, 224, 230));
		textField_4.setBounds(204, 184, 169, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnAddInformation = new JButton("ADD Information");
		btnAddInformation.setBackground(new Color(143, 188, 143));
		btnAddInformation.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddInformation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n=textField.getText();
				String i=textField_1.getText();
				String d=textField_2.getText();
				double b=Double.parseDouble(textField_3.getText());
				double c=Double.parseDouble(textField_4.getText());
				Control.ers.addNewEmployee(n, i, d,b,c);
				
				JOptionPane.showMessageDialog(null,"Added Successfully");
				
				ObjectOutputStream os = null;
				try {
					os= new ObjectOutputStream (new FileOutputStream (Control.fileName));
					os.writeObject(Control.ers);
					
				}
				
				catch(Exception e) {
					System.out.println("No Data");
				}
			
			}
		});
		btnAddInformation.setBounds(26, 242, 180, 25);
		contentPane.add(btnAddInformation);
		
		btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(220, 20, 60));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame2.setVisible(true);
			}
		});
		btnExit.setBounds(296, 243, 97, 25);
		contentPane.add(btnExit);
	}
}
