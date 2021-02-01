package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DisplayFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DisplayFrame frame = new DisplayFrame();
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
	public DisplayFrame() {
		setTitle(" DISPLAY INFORMATION ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 336);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setFont(new Font("Tahoma", Font.PLAIN, 16));
		list.setBackground(new Color(173, 216, 230));
		list.setBounds(36, 114, 420, 114);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Display List");
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				Control.employee.clear();
				for(Employee e:Control.ers.employees) {
					if(e==null)
						break;
					Control.employee.addElement(e.toString());
				}
				
			  list.setModel(Control.employee);
				
			}
		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.setBounds(133, 13, 202, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EXIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				Control.frame1.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(220, 20, 60));
		btnNewButton_1.setBounds(161, 74, 149, 27);
		contentPane.add(btnNewButton_1);
		
	}
}
