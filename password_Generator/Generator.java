package password_Generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Generator {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Generator window = new Generator();
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
	public Generator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("  ");
		frame.setBounds(100, 100, 555, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMAIL");
		lblNewLabel.setBounds(32, 126, 97, 30);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(169, 126, 211, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setBounds(32, 179, 81, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		btnNewButton = new JButton("SUBMITED");
		btnNewButton.setBounds(159, 312, 179, 48);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Generate Password");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String password = textField_1.getText(); 
				
					  	

			
			}

			public String generateRandomPassword(int z) {
				
				for (int i = 0; i < 1; i++) {
					
					System.out.println( generateRandomPassword(1));
					
				}
				String pass = generateRandomPassword(z);
				return pass ;
			}
		});
		
		
		
		
		btnNewButton_1.setBounds(376, 181, 153, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("AUTOMATIC PASSWORD GENERATOR");
		lblNewLabel_2.setBounds(169, 37, 244, 38);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(169, 182, 211, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
	}

	
}
