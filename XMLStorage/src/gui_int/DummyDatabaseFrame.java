package gui_int;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DummyDatabaseFrame extends JFrame {
	
	private int mine = 10;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DummyDatabaseFrame frame = new DummyDatabaseFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DummyDatabaseFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Dre's XML DatabasePro");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Character Name");
		lblName.setBounds(37, 32, 100, 14);
		contentPane.add(lblName);
		
		JLabel lblStr = new JLabel("Strength");
		lblStr.setBounds(36, 57, 100, 14);
		contentPane.add(lblStr);
		
		JLabel lblDex = new JLabel("Dexterity");
		lblDex.setBounds(37, 82, 100, 14);
		contentPane.add(lblDex);
		
		JLabel lblConstitution = new JLabel("Constitution");
		lblConstitution.setBounds(37, 107, 100, 14);
		contentPane.add(lblConstitution);
		
		JLabel lblIntelligence = new JLabel("Intelligence");
		lblIntelligence.setBounds(37, 132, 100, 14);
		contentPane.add(lblIntelligence);
		
		JLabel lblNewLabel = new JLabel("Wisdom");
		lblNewLabel.setBounds(37, 157, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCharisma = new JLabel("Charisma");
		lblCharisma.setBounds(37, 182, 100, 14);
		contentPane.add(lblCharisma);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(37, 232, 100, 14);
		contentPane.add(lblWeight);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(37, 262, 100, 14);
		contentPane.add(lblAge);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(37, 283, 100, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setBounds(37, 308, 100, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblFavoriteWeapon = new JLabel("Favorite Weapon");
		lblFavoriteWeapon.setBounds(37, 353, 100, 14);
		contentPane.add(lblFavoriteWeapon);
		
		JLabel lblRangedWeapon = new JLabel("Ranged Weapon");
		lblRangedWeapon.setBounds(37, 382, 100, 14);
		contentPane.add(lblRangedWeapon);
		
		JLabel lblNewLabel_1 = new JLabel("Splash Weapon");
		lblNewLabel_1.setBounds(37, 407, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(165, 32, 216, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setBounds(165, 57, 50, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(165, 107, 50, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setBounds(181, 107, 46, 14);
		contentPane.add(label);
		
		textField_3 = new JTextField();
		textField_3.setBounds(165, 82, 50, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(165, 132, 50, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(165, 157, 50, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(165, 182, 50, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(165, 232, 50, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(165, 262, 50, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(165, 350, 50, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(165, 379, 50, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(165, 407, 50, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblMod = new JLabel("Mod");
		lblMod.setBounds(237, 57, 24, 20);
		contentPane.add(lblMod);
		
		JLabel lblMod_1 = new JLabel("Mod");
		lblMod_1.setBounds(241, 82, 22, 14);
		contentPane.add(lblMod_1);
		
		JLabel lblMod_2 = new JLabel("Mod");
		lblMod_2.setBounds(241, 107, 22, 14);
		contentPane.add(lblMod_2);
		
		JLabel lblMod_3 = new JLabel("Mod");
		lblMod_3.setBounds(241, 132, 22, 14);
		contentPane.add(lblMod_3);
		
		JLabel lblMod_4 = new JLabel("Mod");
		lblMod_4.setBounds(241, 157, 22, 14);
		contentPane.add(lblMod_4);
		
		JLabel lblMod_5 = new JLabel("Mod");
		lblMod_5.setBounds(241, 182, 22, 14);
		contentPane.add(lblMod_5);
		
		textField_12 = new JTextField();
		textField_12.setBounds(273, 57, 30, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(273, 82, 30, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setBounds(273, 107, 30, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(273, 132, 30, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setBounds(273, 157, 30, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setBounds(273, 182, 30, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(313, 57, 25, 20);
		contentPane.add(lblTotal);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setBounds(313, 82, 25, 20);
		contentPane.add(lblTotal_1);
		
		JLabel lblTotal_2 = new JLabel("Total");
		lblTotal_2.setBounds(313, 107, 25, 20);
		contentPane.add(lblTotal_2);
		
		JLabel lblTotal_3 = new JLabel("Total");
		lblTotal_3.setBounds(313, 135, 25, 20);
		contentPane.add(lblTotal_3);
		
		JLabel lblTotal_4 = new JLabel("Total");
		lblTotal_4.setBounds(313, 157, 25, 20);
		contentPane.add(lblTotal_4);
		
		JLabel lblTotal_5 = new JLabel("Total");
		lblTotal_5.setBounds(313, 182, 25, 20);
		contentPane.add(lblTotal_5);
		
		textField_18 = new JTextField();
		textField_18.setBounds(348, 57, 33, 20);
		contentPane.add(textField_18);
		textField_18.setColumns(10);
		
		textField_19 = new JTextField();
		textField_19.setBounds(348, 82, 33, 20);
		contentPane.add(textField_19);
		textField_19.setColumns(10);
		
		textField_20 = new JTextField();
		textField_20.setBounds(348, 107, 33, 20);
		contentPane.add(textField_20);
		textField_20.setColumns(10);
		
		textField_21 = new JTextField();
		textField_21.setBounds(348, 132, 33, 20);
		contentPane.add(textField_21);
		textField_21.setColumns(10);
		
		textField_22 = new JTextField();
		textField_22.setBounds(348, 157, 33, 20);
		contentPane.add(textField_22);
		textField_22.setColumns(10);
		
		textField_23 = new JTextField();
		textField_23.setBounds(348, 182, 33, 20);
		contentPane.add(textField_23);
		textField_23.setColumns(10);
		
		JButton btnAddCharacter = new JButton("Add Character");
		btnAddCharacter.setBounds(273, 232, 108, 23);
		contentPane.add(btnAddCharacter);
		
		JButton btnNewButton = new JButton("Remove Character");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(273, 262, 108, 23);
		contentPane.add(btnNewButton);
		
		textField_24 = new JTextField();
		textField_24.setBounds(273, 350, 30, 20);
		contentPane.add(textField_24);
		textField_24.setColumns(10);
		
		textField_25 = new JTextField();
		textField_25.setBounds(273, 379, 30, 20);
		contentPane.add(textField_25);
		textField_25.setColumns(10);
		
		textField_26 = new JTextField();
		textField_26.setBounds(273, 404, 30, 20);
		contentPane.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Atk");
		lblNewLabel_2.setBounds(240, 353, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Atk");
		lblNewLabel_3.setBounds(240, 382, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Atk");
		lblNewLabel_4.setBounds(240, 410, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Damage");
		lblNewLabel_5.setBounds(320, 353, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Damage");
		lblNewLabel_6.setBounds(320, 382, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Damage");
		lblNewLabel_7.setBounds(320, 407, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_27 = new JTextField();
		textField_27.setBounds(369, 350, 86, 20);
		contentPane.add(textField_27);
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setBounds(369, 379, 86, 20);
		contentPane.add(textField_28);
		textField_28.setColumns(10);
		
		textField_29 = new JTextField();
		textField_29.setBounds(369, 407, 86, 20);
		contentPane.add(textField_29);
		textField_29.setColumns(10);
		
		JButton btnNextCharacter = new JButton("Next Character");
		btnNextCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("next character");
			}
		});
		btnNextCharacter.setBounds(165, 308, 121, 23);
		contentPane.add(btnNextCharacter);
	}
}
