package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame2.setVisible(true);
			}
		});
		btnAddEmployee.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnAddEmployee.setBackground(new Color(143, 188, 143));
		btnAddEmployee.setBounds(140, 28, 143, 36);
		contentPane.add(btnAddEmployee);
		
		JButton btnNewButton = new JButton("Get Salary");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame6.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.setBounds(140, 77, 143, 36);
		contentPane.add(btnNewButton);
		
		JButton btnIncreaseSalary = new JButton("Increase Salary");
		btnIncreaseSalary.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame7.setVisible(true);
			}
		});
		btnIncreaseSalary.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnIncreaseSalary.setBackground(new Color(143, 188, 143));
		btnIncreaseSalary.setBounds(134, 126, 161, 36);
		contentPane.add(btnIncreaseSalary);
		
		JButton btnDisplayList = new JButton("Display List");
		btnDisplayList.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame8.setVisible(true);
			}
		});
		btnDisplayList.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnDisplayList.setBackground(new Color(143, 188, 143));
		btnDisplayList.setBounds(134, 175, 161, 36);
		contentPane.add(btnDisplayList);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame.setVisible(true);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBackground(new Color(220, 20, 60));
		btnExit.setBounds(168, 224, 97, 25);
		contentPane.add(btnExit);
	}
}
