package gui_int;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegisterJF extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;


	public static void main(String[] args) {
		
		try {
	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	    } catch(Exception e) {
	        System.out.println("Error setting native LAF: " + e);
	    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterJF frame = new RegisterJF();
					frame.setVisible(true);
					//frame.setTitle("Dre's XML DatabasePro");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public RegisterJF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 362, 289);
		setTitle("Dre's XML DatabasePro");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterUsername = new JLabel("Enter username");
		lblEnterUsername.setBounds(35, 41, 89, 25);
		contentPane.add(lblEnterUsername);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(35, 157, 89, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter password");
		lblNewLabel_1.setBounds(35, 91, 89, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblReenterPassword = new JLabel("Reenter password");
		lblReenterPassword.setBounds(35, 141, 102, 16);
		contentPane.add(lblReenterPassword);
		
		textField = new JTextField();
		textField.setBounds(162, 39, 122, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 85, 122, 28);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(162, 135, 122, 28);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton = new JButton("Create Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(93, 185, 149, 28);
		contentPane.add(btnNewButton);
	}
}
