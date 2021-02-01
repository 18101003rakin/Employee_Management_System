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
import java.awt.event.ActionEvent;
import java.awt.Color;

public class InSalFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InSalFrame frame = new InSalFrame();
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
	public InSalFrame() {
		setTitle("Increase Salary");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID :");
		lblNewLabel.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel.setBounds(40, 24, 76, 36);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(176, 224, 230));
		textField.setBounds(138, 32, 200, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Amount :");
		lblNewLabel_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		lblNewLabel_1.setBounds(40, 86, 87, 42);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(176, 224, 230));
		textField_1.setBounds(138, 97, 200, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("CONFIRM");
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String i=textField.getText();
				double b=Double.parseDouble(textField_1.getText());
				Control.ers.increaseSalary(i,b);
				JOptionPane.showMessageDialog(null,"DONE");
			}
		});
		btnNewButton.setBounds(122, 159, 216, 25);
		contentPane.add(btnNewButton);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.setBackground(new Color(220, 20, 60));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame1.setVisible(true);
			}
		});
		btnExit.setBounds(162, 197, 135, 25);
		contentPane.add(btnExit);
	}

}
