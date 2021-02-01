package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.awt.event.ActionEvent;

public class SalariedFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	//UapCSE ers = new UapCSE();

	/**
	 * Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salaried frame = new Salaried();
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
	public SalariedFrame() {
		setTitle("Salaried Employee");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 522, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBackground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(366, 251, 111, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame2.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NAME:");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 13, 111, 34);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(176, 224, 230));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(163, 19, 237, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblId.setBounds(22, 61, 56, 21);
		contentPane.add(lblId);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_1.setBounds(163, 57, 237, 25);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Monthly Salary:");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_1.setBounds(12, 104, 125, 34);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_2.setBackground(new Color(176, 224, 230));
		textField_2.setBounds(163, 109, 237, 25);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnAdd = new JButton("Add Information");
		btnAdd.setBackground(new Color(143, 188, 143));
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n=textField.getText();
				String i=textField_1.getText();
				double b=Double.parseDouble(textField_2.getText());
				String d=textField_3.getText();
				Control.ers.addNewEmployee(n, i, d, b);
				JOptionPane.showMessageDialog(null,"Successfully Added");
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
		btnAdd.setBounds(22, 251, 189, 25);
		contentPane.add(btnAdd);
		
		JLabel lblNewLabel_2 = new JLabel("DESIGNATION:");
		lblNewLabel_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_2.setBounds(12, 167, 116, 25);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_3.setBackground(new Color(176, 224, 230));
		textField_3.setBounds(166, 168, 234, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}

}
