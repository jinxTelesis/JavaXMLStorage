package gui_int;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class DummyDatabaseFrame extends JFrame {
	
	private int mine = 10;

	private JPanel contentPane;
	private JTextField charNaTF;
	private JTextField strTF;
	private JTextField conTF;
	private JTextField dexTF;
	private JTextField intTF;
	private JTextField wisTF;
	private JTextField chaTF;
	private JTextField weightTF;
	private JTextField ageTF;
	private JTextField favWeapTF;
	private JTextField RanWeapTF;
	private JTextField spWeapTF;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField strTotTF;
	private JTextField dexTotTF;
	private JTextField conTotTF;
	private JTextField intTotTF;
	private JTextField wisTotTF;
	private JTextField chaTotTF;
	private JTextField favAtkTF;
	private JTextField ranAtkTF;
	private JTextField spAtkTF;
	private JTextField FavDamDiTF;
	private JTextField RanDamDiTF;
	private JTextField spDamDiTF;
	private JTextField bBABTF;

	
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
		CharacterStats char1 = new CharacterStats();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Dre's XML DatabasePro");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Character Name");
		lblName.setBounds(38, 62, 100, 14);
		contentPane.add(lblName);
		
		JLabel lblStr = new JLabel("Strength");
		lblStr.setBounds(37, 87, 100, 14);
		contentPane.add(lblStr);
		
		JLabel lblDex = new JLabel("Dexterity");
		lblDex.setBounds(37, 112, 100, 14);
		contentPane.add(lblDex);
		
		JLabel lblConstitution = new JLabel("Constitution");
		lblConstitution.setBounds(37, 137, 100, 14);
		contentPane.add(lblConstitution);
		
		JLabel lblIntelligence = new JLabel("Intelligence");
		lblIntelligence.setBounds(37, 162, 100, 14);
		contentPane.add(lblIntelligence);
		
		JLabel lblNewLabel = new JLabel("Wisdom");
		lblNewLabel.setBounds(37, 187, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblCharisma = new JLabel("Charisma");
		lblCharisma.setBounds(37, 212, 100, 14);
		contentPane.add(lblCharisma);
		
		JLabel lblWeight = new JLabel("Weight");
		lblWeight.setBounds(37, 262, 100, 14);
		contentPane.add(lblWeight);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(37, 292, 100, 14);
		contentPane.add(lblAge);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(37, 313, 100, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setBounds(37, 338, 100, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblFavoriteWeapon = new JLabel("Favorite Weapon");
		lblFavoriteWeapon.setBounds(37, 383, 100, 14);
		contentPane.add(lblFavoriteWeapon);
		
		JLabel lblRangedWeapon = new JLabel("Ranged Weapon");
		lblRangedWeapon.setBounds(37, 412, 100, 14);
		contentPane.add(lblRangedWeapon);
		
		JLabel lblNewLabel_1 = new JLabel("Splash Weapon");
		lblNewLabel_1.setBounds(37, 437, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		charNaTF = new JTextField();
		charNaTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		charNaTF.setBounds(165, 62, 216, 20);
		contentPane.add(charNaTF);
		charNaTF.setColumns(10);
		
		strTF = new JTextField();
		strTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				// //
				char1.setStrength(returnTextData(strTF));
				System.out.println("Worked!" + char1.getStrength());
			}
			
		});
		
		strTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		strTF.setBounds(165, 87, 50, 20);
		contentPane.add(strTF);
		strTF.setColumns(10);
		
		conTF = new JTextField();
		conTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		conTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				char1.setConstituion(returnTextData(conTF));
				System.out.println("Worked!" + char1.getConstituion());
				
			}
		});
		conTF.setBounds(165, 137, 50, 20);
		contentPane.add(conTF);
		conTF.setColumns(10);
		
		dexTF = new JTextField();
		dexTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dexTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				////JTextField tF, CharacterStats charObj
				char1.setDexterity(returnTextData(dexTF));
				System.out.println("Worked!" + char1.getDexterity());
			}
				
		});
		dexTF.setBounds(165, 112, 50, 20);
		contentPane.add(dexTF);
		dexTF.setColumns(10);
		
		intTF = new JTextField();
		intTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		intTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				char1.setIntelligence(returnTextData(intTF));
				System.out.println("Worked!" + char1.getIntelligence());
			}
		});
		intTF.setBounds(165, 162, 50, 20);
		contentPane.add(intTF);
		intTF.setColumns(10);
		
		wisTF = new JTextField();
		wisTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		wisTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				char1.setWisdom(returnTextData(wisTF));
				System.out.println("Worked!" + char1.getWisdom());
			}
		});
		wisTF.setBounds(165, 187, 50, 20);
		contentPane.add(wisTF);
		wisTF.setColumns(10);
		
		chaTF = new JTextField();
		chaTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chaTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				char1.setCharisma(returnTextData(chaTF));
				System.out.println("Worked!" + char1.getCharisma());
				
			}
		});
		
		
		chaTF.setBounds(165, 212, 50, 20);
		contentPane.add(chaTF);
		chaTF.setColumns(10);
		
		weightTF = new JTextField();
		weightTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		weightTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				double result = 0.0;
				try {
					result = Double.parseDouble(weightTF.getText());
					if(result > 100)
					{
						result = 0.0;
						JOptionPane.showMessageDialog(null, "You entered " + String.format("%.2f", result) + "Please enter a value lower than 100 ");
					}
					
					if(result < 0)
						{
							result = 0.0;
							JOptionPane.showMessageDialog(null, "You entered " + String.format("%.2f", result) + "Please enter a higher than zero");
						}
				}
				catch (NumberFormatException ex)
				{
					result = 0.0;
					JOptionPane.showMessageDialog(null, "You entered invalid characters \n numbers only please");
					weightTF.setText("");
				}
				
				char1.setWeight(result);
				System.out.println(char1.getWeight());
				
			}
		});
		weightTF.setBounds(165, 262, 50, 20);
		contentPane.add(weightTF);
		weightTF.setColumns(10);
		
		ageTF = new JTextField();
		ageTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ageTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				char1.setAge(returnTextData(ageTF));
				System.out.println("Worked!" + char1.getCharisma());
			}
		});
		ageTF.setBounds(165, 292, 50, 20);
		contentPane.add(ageTF);
		ageTF.setColumns(10);
		
		favWeapTF = new JTextField();
		favWeapTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		favWeapTF.setBounds(165, 380, 50, 20);
		contentPane.add(favWeapTF);
		favWeapTF.setColumns(10);
		
		RanWeapTF = new JTextField();
		RanWeapTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		RanWeapTF.setBounds(165, 409, 50, 20);
		contentPane.add(RanWeapTF);
		RanWeapTF.setColumns(10);
		
		spWeapTF = new JTextField();
		spWeapTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spWeapTF.setBounds(165, 437, 50, 20);
		contentPane.add(spWeapTF);
		spWeapTF.setColumns(10);
		
		JLabel lblMod = new JLabel("Mod");
		lblMod.setBounds(228, 87, 24, 20);
		contentPane.add(lblMod);
		
		JLabel lblMod_1 = new JLabel("Mod");
		lblMod_1.setBounds(228, 112, 24, 14);
		contentPane.add(lblMod_1);
		
		JLabel lblMod_2 = new JLabel("Mod");
		lblMod_2.setBounds(228, 137, 24, 14);
		contentPane.add(lblMod_2);
		
		JLabel lblMod_3 = new JLabel("Mod");
		lblMod_3.setBounds(228, 162, 24, 14);
		contentPane.add(lblMod_3);
		
		JLabel lblMod_4 = new JLabel("Mod");
		lblMod_4.setBounds(228, 187, 24, 14);
		contentPane.add(lblMod_4);
		
		JLabel lblMod_5 = new JLabel("Mod");
		lblMod_5.setBounds(228, 212, 24, 14);
		contentPane.add(lblMod_5);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_12.setEditable(false);
		textField_12.setBounds(260, 87, 30, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_13.setEditable(false);
		textField_13.setBounds(260, 112, 30, 20);
		contentPane.add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_14.setEditable(false);
		textField_14.setBounds(260, 137, 30, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_15.setEditable(false);
		textField_15.setBounds(260, 162, 30, 20);
		contentPane.add(textField_15);
		textField_15.setColumns(10);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_16.setEditable(false);
		textField_16.setBounds(260, 187, 30, 20);
		contentPane.add(textField_16);
		textField_16.setColumns(10);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 10));
		textField_17.setEditable(false);
		textField_17.setBounds(260, 212, 30, 20);
		contentPane.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(308, 87, 30, 20);
		contentPane.add(lblTotal);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setBounds(308, 112, 30, 20);
		contentPane.add(lblTotal_1);
		
		JLabel lblTotal_2 = new JLabel("Total");
		lblTotal_2.setBounds(308, 137, 30, 20);
		contentPane.add(lblTotal_2);
		
		JLabel lblTotal_3 = new JLabel("Total");
		lblTotal_3.setBounds(308, 165, 30, 20);
		contentPane.add(lblTotal_3);
		
		JLabel lblTotal_4 = new JLabel("Total");
		lblTotal_4.setBounds(308, 187, 30, 20);
		contentPane.add(lblTotal_4);
		
		JLabel lblTotal_5 = new JLabel("Total");
		lblTotal_5.setBounds(308, 212, 30, 20);
		contentPane.add(lblTotal_5);
		
		strTotTF = new JTextField();
		strTotTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		strTotTF.setBounds(348, 87, 33, 20);
		contentPane.add(strTotTF);
		strTotTF.setColumns(10);
		
		dexTotTF = new JTextField();
		dexTotTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dexTotTF.setBounds(348, 112, 33, 20);
		contentPane.add(dexTotTF);
		dexTotTF.setColumns(10);
		
		conTotTF = new JTextField();
		conTotTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		conTotTF.setBounds(348, 137, 33, 20);
		contentPane.add(conTotTF);
		conTotTF.setColumns(10);
		
		intTotTF = new JTextField();
		intTotTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		intTotTF.setBounds(348, 162, 33, 20);
		contentPane.add(intTotTF);
		intTotTF.setColumns(10);
		
		wisTotTF = new JTextField();
		wisTotTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		wisTotTF.setBounds(348, 187, 33, 20);
		contentPane.add(wisTotTF);
		wisTotTF.setColumns(10);
		
		chaTotTF = new JTextField();
		chaTotTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chaTotTF.setBounds(348, 212, 33, 20);
		contentPane.add(chaTotTF);
		chaTotTF.setColumns(10);
		
		JButton btnAddCharacter = new JButton("Add Character");
		btnAddCharacter.setBounds(241, 262, 140, 23);
		contentPane.add(btnAddCharacter);
		
		JButton btnNewButton = new JButton("Remove Character");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(241, 292, 140, 23);
		contentPane.add(btnNewButton);
		
		favAtkTF = new JTextField();
		favAtkTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		favAtkTF.setBounds(273, 380, 30, 20);
		contentPane.add(favAtkTF);
		favAtkTF.setColumns(10);
		
		ranAtkTF = new JTextField();
		ranAtkTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ranAtkTF.setBounds(273, 409, 30, 20);
		contentPane.add(ranAtkTF);
		ranAtkTF.setColumns(10);
		
		spAtkTF = new JTextField();
		spAtkTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spAtkTF.setBounds(273, 434, 30, 20);
		contentPane.add(spAtkTF);
		spAtkTF.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Atk");
		lblNewLabel_2.setBounds(240, 383, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Atk");
		lblNewLabel_3.setBounds(240, 412, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Atk");
		lblNewLabel_4.setBounds(240, 440, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Damage");
		lblNewLabel_5.setBounds(315, 383, 50, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Damage");
		lblNewLabel_6.setBounds(315, 412, 50, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Damage");
		lblNewLabel_7.setBounds(315, 437, 50, 14);
		contentPane.add(lblNewLabel_7);
		
		FavDamDiTF = new JTextField();
		FavDamDiTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		FavDamDiTF.setEditable(false);
		FavDamDiTF.setBounds(369, 380, 86, 20);
		contentPane.add(FavDamDiTF);
		FavDamDiTF.setColumns(10);
		
		RanDamDiTF = new JTextField();
		RanDamDiTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		RanDamDiTF.setEditable(false);
		RanDamDiTF.setBounds(369, 409, 86, 20);
		contentPane.add(RanDamDiTF);
		RanDamDiTF.setColumns(10);
		
		spDamDiTF = new JTextField();
		spDamDiTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spDamDiTF.setEditable(false);
		spDamDiTF.setBounds(369, 437, 86, 20);
		contentPane.add(spDamDiTF);
		spDamDiTF.setColumns(10);
		
		JButton btnNextCharacter = new JButton("Next Character");
		btnNextCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("next character");
			}
		});
		btnNextCharacter.setBounds(165, 338, 121, 23);
		contentPane.add(btnNextCharacter);
		
		JButton btnNewButton_1 = new JButton("Save File");
		btnNewButton_1.setBounds(38, 22, 142, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Load File");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_2.setBounds(197, 22, 129, 23);
		contentPane.add(btnNewButton_2);
		
		bBABTF = new JTextField();
		bBABTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		bBABTF.setBounds(369, 339, 86, 20);
		contentPane.add(bBABTF);
		bBABTF.setColumns(10);
		
		JLabel lblBab = new JLabel("   BAB");
		lblBab.setBounds(320, 342, 40, 14);
		contentPane.add(lblBab);
	}
	
	private static int returnTextData(JTextField tF) { // add calls to each now
		//String temp = tF.getText();
		int result = 0;
		try {
			result = Integer.parseInt(tF.getText());
			if(result > 100)
			{
				result = 0;
				JOptionPane.showMessageDialog(null, "You entered " + String.format("%.2f", result) + "Please enter a value lower than 100 ");
			}
			
			if(result < 0)
				{
					result = 0;
					JOptionPane.showMessageDialog(null, "You entered " + String.format("%.2f", result) + "Please enter a higher than zero");
				}
		}
		catch (NumberFormatException ex)
		{
			result = 0;
			JOptionPane.showMessageDialog(null, "You entered invalid characters \n numbers only please");
			tF.setText("");
		}
		
		return result;
	}
	

}
