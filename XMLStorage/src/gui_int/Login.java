package gui_int;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

public class Login {

	private JFrame frame;
	private JTextField UserNameTxtF;
	private JPasswordField passTF;
	private int MaxLogins = 0;
	private String validUser = "Billy";
	private String validPass = "Bob";
	
	
	public static void main(String[] args) {
		
	    try {
	        UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
	    } catch(Exception e) {
	        System.out.println("Error setting native LAF: " + e);
	    }
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});
	}

	public Login() {
		initialize();
	}

	private void initialize() {
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.inactiveCaption);
		frame.setBounds(100, 100, 378, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Dre's XML DatabasePro");
		
		JLabel userInvalidLabel = new JLabel("");
		userInvalidLabel.setFont(new Font("SansSerif", Font.PLAIN, 10));
		userInvalidLabel.setForeground(Color.RED);
		userInvalidLabel.setBounds(147, 76, 135, 16);
		frame.getContentPane().add(userInvalidLabel);
		
		JLabel passInvalidLabel = new JLabel("");
		passInvalidLabel.setFont(new Font("SansSerif", Font.PLAIN, 10));
		passInvalidLabel.setForeground(Color.RED);
		passInvalidLabel.setBounds(147, 121, 147, 16);
		frame.getContentPane().add(passInvalidLabel);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(64, 51, 71, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setLabelFor(frame);
		lblPassword.setBounds(64, 96, 71, 27);
		frame.getContentPane().add(lblPassword);
		
		UserNameTxtF = new JTextField();
		
		
		
		UserNameTxtF.setBounds(145, 54, 137, 25);
		frame.getContentPane().add(UserNameTxtF);
		UserNameTxtF.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		
		btnLogin.setBounds(64, 146, 89, 23);
		frame.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		
		btnRegister.setBounds(193, 146, 89, 23);
		frame.getContentPane().add(btnRegister);
		
		passTF = new JPasswordField();
		passTF.setBounds(145, 99, 137, 25);
		frame.getContentPane().add(passTF);
		
		// should put in class or at least after all components are added
		UserNameTxtF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent arg0) {
			passInvalidLabel.setText("");
			userInvalidLabel.setText("");
			}
		});
		
		passTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				userInvalidLabel.setText("");
				passInvalidLabel.setText("");
			}
		});
		
		// should put this in a class
		// need to work on logic
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String userName = UserNameTxtF.getText();
				String userPass = passTF.getText();
				
			// in future unhardcode this to actual checkup of usernames and passes
				
			if(userName.equals(validUser) && userPass.equals(validPass)) {
				System.out.println("Worked");
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							DummyDatabaseFrame dummydbFrame = new DummyDatabaseFrame();
							dummydbFrame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
			else
			{
				MaxLogins++;
				if(userName.equals(validUser.toString())) {
					passInvalidLabel.setText("Invalid password entered");
				}
				
				if(userPass.equals(validPass.toString())) {
					userInvalidLabel.setText("Username doesn't exist");
				}
			}
			
			if(MaxLogins >= 4) {
				userInvalidLabel.setText("lockout in 1 more attempt");
			}
			
			if(MaxLogins >= 5) {
				btnLogin.setEnabled(false);
				userInvalidLabel.setText("Please contact admin");
			}
				
				
			}
		});
		
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							RegisterJF frame = new RegisterJF();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		
	
	}
}
