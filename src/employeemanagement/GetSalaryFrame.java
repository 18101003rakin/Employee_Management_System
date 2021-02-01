package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GetSalaryFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnBack;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gSal frame = new gSal();
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
	public  GetSalaryFrame () {
		setTitle("GET SALARY");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(12, 13, 67, 39);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(173, 216, 230));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setBounds(91, 16, 290, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setBounds(91, 112, 290, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnGetSalary = new JButton("Get Salary");
		btnGetSalary.setBackground(new Color(143, 188, 143));
		btnGetSalary.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnGetSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id =textField.getText();
				double sal=Control.ers.getSalary(id);
				textField_1.setText(String.valueOf(sal));
			}
		});
		btnGetSalary.setBounds(147, 60, 179, 39);
		contentPane.add(btnGetSalary);
		
		btnBack = new JButton("EXIT");
		btnBack.setBackground(new Color(220, 20, 60));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Control.frame1.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(177, 171, 113, 33);
		contentPane.add(btnBack);
		
		
	}

}
