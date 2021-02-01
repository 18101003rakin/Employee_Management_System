package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class HFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HFrame frame = new HFrame();
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
	public HFrame() {
		setTitle("HOURLY EMPLOYEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("NAME :");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(22, 13, 87, 42);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBackground(new Color(176, 224, 230));
		textField.setBounds(189, 24, 187, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("ID :");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_1.setBounds(31, 55, 85, 42);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setBounds(189, 66, 187, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DESIGNATION :");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2.setBounds(22, 95, 124, 42);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBackground(new Color(176, 224, 230));
		textField_2.setBounds(189, 106, 187, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("RATE :");
		lblNewLabel_3.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_3.setBounds(22, 131, 124, 42);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBackground(new Color(176, 224, 230));
		textField_3.setBounds(189, 142, 187, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEwLabel = new JLabel("Hour Worked :");
		lblEwLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblEwLabel.setBounds(22, 169, 116, 42);
		contentPane.add(lblEwLabel);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setBackground(new Color(176, 224, 230));
		textField_4.setBounds(189, 180, 187, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(new Color(220, 20, 60));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame2.setVisible(true);
			}
		});
		btnExit.setBounds(279, 215, 97, 25);
		contentPane.add(btnExit);
		
		btnNewButton = new JButton("ADD Information");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n=textField.getText();
				String i=textField_1.getText();
				String d=textField_2.getText();
				double hr=Double.parseDouble(textField_3.getText());
				int wh=Integer.parseInt(textField_4.getText());
				Control.ers.addNewEmployee(n, i, d,hr,wh);
				
JOptionPane.showMessageDialog(null,"Successfully Added");
				
				
				ObjectOutputStream os = null;
				try {
					os= new ObjectOutputStream (new FileOutputStream (Control.fileName));
					os.writeObject(Control.ers);
					
				}
				
				catch(Exception e) {
					System.out.println("No Data Found");
				}
			}
		});
		btnNewButton.setBounds(22, 215, 164, 25);
		contentPane.add(btnNewButton);
	}

}
