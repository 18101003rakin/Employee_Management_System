package employeemanagement;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EFrame extends JFrame {

	private JPanel contentPane;
	private final JLabel lblCover = DefaultComponentFactory.getInstance().createTitle("WELCOME TO EMPLOYEE MANAGEMENT SYSTEM");
	/**
	 * @wbp.nonvisual location=111,14
	 */
	private final JTextField txtCoverPage = new JTextField();

	/**
	 * Launch the application.
	 */
	
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EFrame frame = new EFrame();
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
	public EFrame() {
		txtCoverPage.setText("COVER PAGE");
		txtCoverPage.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblCover.setFont(new Font("Tempus Sans ITC", Font.BOLD | Font.ITALIC, 15));
		lblCover.setBackground(Color.CYAN);
		lblCover.setBounds(12, 63, 408, 50);
		contentPane.add(lblCover);
		lblCover.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Click Me");
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Control.frame1.setVisible(true);
			}
		});
		btnNewButton.setBounds(90, 126, 248, 56);
		contentPane.add(btnNewButton);
	}
}
