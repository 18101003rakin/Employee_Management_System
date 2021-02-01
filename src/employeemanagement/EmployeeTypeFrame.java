package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class EmployeeTypeFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeTypeFrame frame = new EmployeeTypeFrame();
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
	public EmployeeTypeFrame() {
		setTitle("TYPES OF EMPLOYEE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("SALARIED");
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame3.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.setBounds(120, 30, 182, 33);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("COMMISSION");
		btnNewButton_1.setBackground(new Color(143, 188, 143));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame4.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton_1.setBounds(120, 76, 182, 33);
		contentPane.add(btnNewButton_1);
		
		JButton btnHourly = new JButton("HOURLY");
		btnHourly.setBackground(new Color(143, 188, 143));
		btnHourly.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame5.setVisible(true);
			}
		});
		btnHourly.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnHourly.setBounds(120, 122, 182, 33);
		contentPane.add(btnHourly);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.setBackground(new Color(220, 20, 60));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame1.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(161, 168, 97, 25);
		contentPane.add(btnNewButton_2);
	}

}
