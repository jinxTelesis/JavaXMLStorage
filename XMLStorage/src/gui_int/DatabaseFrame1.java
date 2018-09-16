package gui_int;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorListener;
import javax.xml.parsers.DocumentBuilder; // plan to use this don't remove
import javax.xml.parsers.DocumentBuilderFactory; // plan to use this don't remove
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;


import org.w3c.dom.Element;
import org.w3c.dom.Node;

import jdk.internal.org.xml.sax.SAXException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.IllegalFormatConversionException;
import java.math.*;
import java.beans.PropertyChangeListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.beans.PropertyChangeEvent;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

//import components.DocumentSizeFilter; add documents filter later
import org.w3c.dom.NodeList;

import javafx.stage.FileChooser;

import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;



public class DatabaseFrame1 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7766926757619448060L;
	
	// statMaMin are used by functions to determine character stats min and max
	private int statMaMin = -20;
	private int statMax = 100;
	// testing
	private String fileName = "";
	// tesing 
	// testing
	//testing 
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
	private JTextField ranWeapTF;
	private JTextField spWeapTF;
	private JTextField strMod;
	private JTextField dexMod;
	private JTextField conMod;
	private JTextField intMod;
	private JTextField wisMod;
	private JTextField chaMod;
	private JTextField strMTF;
	private JTextField dexMTF;
	private JTextField conMTF;
	private JTextField intMTF;
	private JTextField wisMTF;
	private JTextField chaMTF;
	private JTextField favAtkTF;
	private JTextField ranAtkTF;
	private JTextField spAtkTF;
	private JTextField FavDamDiTF;
	private JTextField RanDamDiTF;
	private JTextField spDamDiTF;
	private JTextField bBABTF;
	private JTextField tFLevel;
	private JTextField tFHitDie;
	private JTextField tFHP;
	
	// to do the xml import for timmy file dom does not recalculate modes?
	// refactor this so it is not passed around to functions
	
	CharacterStats char1 = new CharacterStats(); 
	CharacterStatsJAXB charB = new CharacterStatsJAXB();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					DatabaseFrame1 frame = new DatabaseFrame1();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public DatabaseFrame1() {
		
		// frame properties 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		setTitle("Dre's XML DatabasePro");
		
		// start of menu bar 
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFileMenu = new JMenu("File / Save");
		menuBar.add(mnFileMenu);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFileMenu.add(mntmNew);
		
		JMenuItem mntmOpenFile = new JMenuItem("Open File");
		mnFileMenu.add(mntmOpenFile);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFileMenu.add(mntmSave);
		
		JMenuItem mntmSaveAs = new JMenuItem("Save As (JAXB)");
		mnFileMenu.add(mntmSaveAs);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFileMenu.add(mntmExit);
		
		JMenu mnNewMenu_1 = new JMenu("Help");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmProgramHelp = new JMenuItem("Program Help");
		mnNewMenu_1.add(mntmProgramHelp);
		
		JMenuItem mntmDndHelp = new JMenuItem("DnD Help");
		mnNewMenu_1.add(mntmDndHelp);
		
		JMenu mnNewMenu_2 = new JMenu("Resources");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmDnd = new JMenuItem("DnD 3.0");
		mnNewMenu_2.add(mntmDnd);
		
		JMenuItem mntmDnd_1 = new JMenuItem("DnD 3.5");
		mnNewMenu_2.add(mntmDnd_1);
		
		JMenuItem mntmPathfinder = new JMenuItem("Pathfinder");
		mnNewMenu_2.add(mntmPathfinder);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// end of menu properties
		
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
		lblWeight.setBounds(37, 263, 100, 14);
		contentPane.add(lblWeight);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(37, 293, 100, 14);
		contentPane.add(lblAge);
		
		// this is for the radio buttons
		
		// consider refactoring to set the font with a loop
		ButtonGroup group = new ButtonGroup();
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(37, 313, 100, 23);
		group.add(rdbtnMale);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(37, 338, 100, 23);
		group.add(rdbtnFemale);
		rdbtnMale.setSelected(true);
		contentPane.add(rdbtnFemale);
		
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
		charNaTF.setBounds(165, 62, 210, 20);
		charNaTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(charNaTF);
		charNaTF.setColumns(10);
		
		strTF = new JTextField();
		strTF.setBounds(165, 87, 50, 20);
		strTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(strTF);
		strTF.setColumns(10);
		
		conTF = new JTextField();
		conTF.setBounds(165, 137, 50, 20);
		conTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(conTF);
		conTF.setColumns(10);
		
		dexTF = new JTextField();
		dexTF.setBounds(165, 112, 50, 20);
		dexTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(dexTF);
		dexTF.setColumns(10);
		
		intTF = new JTextField();
		intTF.setBounds(165, 162, 50, 20);
		intTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(intTF);
		intTF.setColumns(10);
		
		wisTF = new JTextField();
		wisTF.setBounds(165, 187, 50, 20);
		wisTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(wisTF);
		wisTF.setColumns(10);
		
		chaTF = new JTextField();
		chaTF.setBounds(165, 212, 50, 20);
		chaTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(chaTF);
		chaTF.setColumns(10);
		
		weightTF = new JTextField();
		weightTF.setBounds(165, 262, 50, 20);
		weightTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(weightTF);
		weightTF.setColumns(10);
		
		ageTF = new JTextField();
		ageTF.setBounds(165, 292, 50, 20);
		ageTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(ageTF);
		ageTF.setColumns(10);
		
		favWeapTF = new JTextField();
		favWeapTF.setBounds(165, 380, 50, 20);
		favWeapTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(favWeapTF);
		favWeapTF.setColumns(10);
		
		ranWeapTF = new JTextField();
		ranWeapTF.setBounds(165, 409, 50, 20);
		ranWeapTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(ranWeapTF);
		ranWeapTF.setColumns(10);
		
		spWeapTF = new JTextField();
		spWeapTF.setBounds(165, 437, 50, 20);
		spWeapTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(spWeapTF);
		spWeapTF.setColumns(10);
		
		JLabel lblMod = new JLabel("Mod");
		lblMod.setBounds(310, 87, 26, 20);
		contentPane.add(lblMod);
		
		JLabel lblMod_1 = new JLabel("Mod");
		lblMod_1.setBounds(310, 112, 26, 20);
		contentPane.add(lblMod_1);
		
		JLabel lblMod_2 = new JLabel("Mod");
		lblMod_2.setBounds(310, 137, 26, 14);
		contentPane.add(lblMod_2);
		
		JLabel lblMod_3 = new JLabel("Mod");
		lblMod_3.setBounds(310, 162, 26, 14);
		contentPane.add(lblMod_3);
		
		JLabel lblMod_4 = new JLabel("Mod");
		lblMod_4.setBounds(310, 187, 26, 14);
		contentPane.add(lblMod_4);
		
		JLabel lblMod_5 = new JLabel("Mod");
		lblMod_5.setBounds(310, 212, 26, 14);
		contentPane.add(lblMod_5);
		
		strMod = new JTextField();
		strMod.setBounds(345, 87, 30, 20);
		strMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		strMod.setEditable(false);
		contentPane.add(strMod);
		strMod.setColumns(10);
		
		dexMod = new JTextField();
		dexMod.setBounds(345, 112, 30, 20);
		dexMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		dexMod.setEditable(false);
		contentPane.add(dexMod);
		dexMod.setColumns(10);
		
		conMod = new JTextField();
		conMod.setBounds(345, 135, 30, 20);
		conMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		conMod.setEditable(false);
		contentPane.add(conMod);
		conMod.setColumns(10);
		
		intMod = new JTextField();
		intMod.setBounds(345, 160, 30, 20);
		intMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		intMod.setEditable(false);
		contentPane.add(intMod);
		intMod.setColumns(10);
		
		wisMod = new JTextField();
		wisMod.setBounds(345, 185, 30, 20);
		wisMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		wisMod.setEditable(false);
		contentPane.add(wisMod);
		wisMod.setColumns(10);
		
		chaMod = new JTextField();
		chaMod.setBounds(345, 210, 30, 20);
		chaMod.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chaMod.setEditable(false);
		contentPane.add(chaMod);
		chaMod.setColumns(10);
		
		JLabel lblTotal = new JLabel("Magic");
		lblTotal.setBounds(225, 87, 36, 20);
		contentPane.add(lblTotal);
		
		JLabel lblTotal_1 = new JLabel("Magic");
		lblTotal_1.setBounds(225, 112, 36, 20);
		contentPane.add(lblTotal_1);
		
		JLabel lblTotal_2 = new JLabel("Magic");
		lblTotal_2.setBounds(225, 137, 36, 20);
		contentPane.add(lblTotal_2);
		
		JLabel lblTotal_3 = new JLabel("Magic");
		lblTotal_3.setBounds(225, 165, 36, 20);
		contentPane.add(lblTotal_3);
		
		JLabel lblTotal_4 = new JLabel("Magic");
		lblTotal_4.setBounds(225, 187, 36, 20);
		contentPane.add(lblTotal_4);
		
		JLabel lblTotal_5 = new JLabel("Magic");
		lblTotal_5.setBounds(225, 212, 36, 20);
		contentPane.add(lblTotal_5);
		
		strMTF = new JTextField();
		strMTF.setBounds(266, 87, 30, 20);
		strMTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(strMTF);
		strMTF.setColumns(10);
		
		dexMTF = new JTextField();
		dexMTF.setBounds(266, 112, 30, 20);
		dexMTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(dexMTF);
		dexMTF.setColumns(10);
		
		conMTF = new JTextField();
		conMTF.setBounds(266, 137, 30, 20);
		conMTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(conMTF);
		conMTF.setColumns(10);
		
		intMTF = new JTextField();
		intMTF.setBounds(266, 162, 30, 20);
		intMTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(intMTF);
		intMTF.setColumns(10);
		
		wisMTF = new JTextField();
		wisMTF.setBounds(266, 187, 30, 20);
		wisMTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(wisMTF);
		wisMTF.setColumns(10);
		
		chaMTF = new JTextField();
		chaMTF.setBounds(266, 212, 30, 20);
		chaMTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(chaMTF);
		chaMTF.setColumns(10);
		
		favAtkTF = new JTextField();
		favAtkTF.setBounds(273, 380, 30, 20);
		favAtkTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(favAtkTF);
		favAtkTF.setColumns(10);
		
		ranAtkTF = new JTextField();
		ranAtkTF.setBounds(273, 409, 30, 20);
		
		ranAtkTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(ranAtkTF);
		ranAtkTF.setColumns(10);
		
		spAtkTF = new JTextField();
		spAtkTF.setBounds(273, 434, 30, 20);
		spAtkTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
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
		FavDamDiTF.setBounds(369, 380, 86, 20);
		FavDamDiTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		FavDamDiTF.setEditable(false);
		contentPane.add(FavDamDiTF);
		FavDamDiTF.setColumns(10);
		
		RanDamDiTF = new JTextField();
		RanDamDiTF.setBounds(369, 409, 86, 20);
		RanDamDiTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		RanDamDiTF.setEditable(false);
		contentPane.add(RanDamDiTF);
		RanDamDiTF.setColumns(10);
		
		spDamDiTF = new JTextField();
		spDamDiTF.setBounds(369, 437, 86, 20);
		spDamDiTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		spDamDiTF.setEditable(false);
		contentPane.add(spDamDiTF);
		spDamDiTF.setColumns(10);
		
		JButton btnResetStats = new JButton("Reset Stats");
		btnResetStats.setBounds(165, 338, 121, 23);
		contentPane.add(btnResetStats);
		
		JButton saveBtn = new JButton("Save File JAXB");
		saveBtn.setBounds(38, 22, 142, 23);
		contentPane.add(saveBtn);
		
		JButton loadFileBtn = new JButton("Load File JAXB");
		loadFileBtn.setBounds(197, 22, 129, 23);
		contentPane.add(loadFileBtn);
		
		bBABTF = new JTextField();
		bBABTF.setBounds(369, 339, 86, 20);
		bBABTF.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(bBABTF);
		bBABTF.setColumns(10);
		
		JLabel lblBab = new JLabel("   BAB");
		lblBab.setBounds(320, 342, 40, 14);
		contentPane.add(lblBab);
		
		JLabel lblLevel = new JLabel("Level");
		lblLevel.setBounds(227, 264, 40, 14);
		contentPane.add(lblLevel);
		
		JLabel lblHitdie = new JLabel("Hit Die");
		lblHitdie.setBounds(227, 294, 40, 14);
		contentPane.add(lblHitdie);
		
		tFLevel = new JTextField();
		tFLevel.setBounds(266, 262, 36, 20);
		contentPane.add(tFLevel);
		tFLevel.setColumns(10);
		
		tFHitDie = new JTextField();
		tFHitDie.setBounds(266, 292, 36, 20);
		contentPane.add(tFHitDie);
		tFHitDie.setColumns(10);
		
		JLabel hpTF = new JLabel("HP");
		hpTF.setBounds(310, 264, 26, 16);
		contentPane.add(hpTF);
		
		JComboBox cBHitDice = new JComboBox();
		cBHitDice.setEditable(true);
		cBHitDice.setBounds(369, 290, 50, 26);
		contentPane.add(cBHitDice);
		
		JLabel lblHitDice = new JLabel("Hit Dice");
		lblHitDice.setBounds(310, 294, 55, 16);
		contentPane.add(lblHitDice);
		
		tFHP = new JTextField();
		tFHP.setEditable(false);
		tFHP.setBounds(334, 262, 41, 20);
		contentPane.add(tFHP);
		tFHP.setColumns(10);
		
		JButton btnSaveFileDom = new JButton("Save File DOM");
		btnSaveFileDom.setBounds(345, 22, 142, 23);
		contentPane.add(btnSaveFileDom);
		
		JButton btnNewButton = new JButton("Load File DOM");
		btnNewButton.setBounds(505, 22, 129, 23);
		contentPane.add(btnNewButton);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{charNaTF, strTF, strMTF, dexTF, dexMTF, conTF, conMTF, intTF, intMTF, wisTF, wisMTF, chaTF, chaMTF, weightTF, tFLevel, ageTF, tFHitDie, cBHitDice, bBABTF, favWeapTF, favAtkTF, ranWeapTF, ranAtkTF, spWeapTF, spAtkTF, lblName, lblStr, lblDex, lblConstitution, lblIntelligence, lblNewLabel, lblCharisma, lblWeight, lblAge, rdbtnMale, rdbtnFemale, lblFavoriteWeapon, lblRangedWeapon, lblNewLabel_1, lblMod, lblMod_1, lblMod_2, lblMod_3, lblMod_4, lblMod_5, strMod, dexMod, conMod, intMod, wisMod, chaMod, lblTotal, lblTotal_1, lblTotal_2, lblTotal_3, lblTotal_4, lblTotal_5, lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5, lblNewLabel_6, lblNewLabel_7, FavDamDiTF, RanDamDiTF, spDamDiTF, btnResetStats, saveBtn, loadFileBtn, lblBab, lblLevel, lblHitdie, hpTF, lblHitDice, tFHP, btnSaveFileDom, btnNewButton}));
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				 
				XmlDomParser domParse = new XmlDomParser();
				try {
					domParse.XmlDomParse(char1);
				} catch (org.xml.sax.SAXException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ParserConfigurationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				refreshDisplay(char1 ,charNaTF, strTF, dexTF, conTF, intTF, wisTF, chaTF, strMTF, dexMTF, conMTF,
						intMTF, wisMTF, chaMTF, strMod, dexMod, conMod, intMod, wisMod, chaMod, weightTF, ageTF, favWeapTF, ranWeapTF,
						spWeapTF, favAtkTF, ranAtkTF, spAtkTF, rdbtnMale, bBABTF, FavDamDiTF, RanDamDiTF,spDamDiTF, tFLevel, tFHitDie, tFHP);
				
//				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//				try {
//					
//					
//					
//					DocumentBuilder builder = factory.newDocumentBuilder();
//					Document doc = builder.parse("C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml");
//					NodeList characterList = doc.getElementsByTagName("CharacterStats");
//					
//					for(int i = 0;i<characterList.getLength();i++)
//					{
//						
//						// remove this section later
//						// remove this section later
//						// remove this section later
//						
//						System.out.println("got here 1");
//						Node c = characterList.item(i);
//						if(c.getNodeType()==Node.ELEMENT_NODE) {
//							Element stats = (Element) c;
//							String chname = stats.getAttribute("id");
//							NodeList statsList = stats.getChildNodes();
//							
//							
//							Node statsAtt = statsList.item(1); // only every other item has a value
//							String temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setChName(temp);
//							charNaTF.setText(char1.getChName());
//							
//	
//							statsAtt = statsList.item(3);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setStrength(Integer.valueOf(temp));
//							strTF.setText(Integer.toString(char1.getStrength()));
//							
//							
//							statsAtt = statsList.item(5);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setDexterity(Integer.valueOf(temp));
//							dexTF.setText(Integer.toString(char1.getDexterity()));
//							
//							statsAtt = statsList.item(7);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setConstituion(Integer.valueOf(temp));
//							conTF.setText(Integer.toString(char1.getConstitution()));
//							
//							statsAtt = statsList.item(9);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setIntelligence(Integer.valueOf(temp));
//							intTF.setText(Integer.toString(char1.getIntelligence()));
//							
//							statsAtt = statsList.item(11);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setWisdom(Integer.valueOf(temp));
//							wisTF.setText(Integer.toString(char1.getWisdom()));
//							
//							statsAtt = statsList.item(13);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setCharisma(Integer.valueOf(temp));
//							chaTF.setText(Integer.toString(char1.getCharisma()));
//							
//							statsAtt = statsList.item(15);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setBAB(Integer.valueOf(temp));
//							bBABTF.setText(Integer.toString(char1.getBAB()));
//							
//							statsAtt = statsList.item(17);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setWeight(Double.valueOf(temp));
//							weightTF.setText(temp);
//							
//							statsAtt = statsList.item(19);
//							temp = returnNode(statsAtt);
//							System.out.println(temp);
//							char1.setAge(Integer.valueOf(temp));
//							ageTF.setText(temp);
//							
//							statsAtt = statsList.item(21);
//							temp = returnNode(statsAtt);
//							//System.out.println(temp);
//							char1.setMale(Boolean.parseBoolean(temp));
//							if(char1.isMale() == true)
//							{
//								rdbtnMale.setSelected(true);
//							}
//							
//							statsAtt = statsList.item(23);
//							temp = returnNode(statsAtt);
//							char1.setFavWeap(Integer.valueOf(temp));
//							System.out.println(temp);
//							favWeapTF.setText(temp);
//							
//							
//							statsAtt = statsList.item(25);
//							temp = returnNode(statsAtt);
//							char1.setRanWeap(Integer.valueOf(temp));
//							System.out.println(temp);
//							ranWeapTF.setText(temp);
//							
//							statsAtt = statsList.item(27);
//							temp = returnNode(statsAtt);
//							char1.setSpWeap(Integer.valueOf(temp));
//							System.out.println(temp);
//							spWeapTF.setText(temp);
//							
//							statsAtt = statsList.item(29);
//							temp = returnNode(statsAtt);
//							char1.setFavAtk(Integer.valueOf(temp));
//							System.out.println(temp);
//							favAtkTF.setText(temp);
//							
//							statsAtt = statsList.item(31);
//							temp = returnNode(statsAtt);
//							char1.setRaAtk(Integer.valueOf(temp));
//							System.out.println(temp);
//							ranAtkTF.setText(temp);
//							
//							statsAtt = statsList.item(33);
//							temp = returnNode(statsAtt);
//							char1.setSpAtk(Integer.valueOf(temp));
//							System.out.println(temp);
//							spAtkTF.setText(temp);
//							
//							statsAtt = statsList.item(35);
//							temp = returnNode(statsAtt);
//							char1.setMaStr(Integer.valueOf(temp));
//							System.out.println(temp);
//							strMTF.setText(temp);
//							
//							
//							statsAtt = statsList.item(37);
//							temp = returnNode(statsAtt);
//							char1.setMaDex(Integer.valueOf(temp));
//							System.out.println(temp);
//							dexMTF.setText(temp);
//							
//							statsAtt = statsList.item(39);
//							temp = returnNode(statsAtt);
//							char1.setMaCon(Integer.valueOf(temp));
//							System.out.println(temp);
//							conMTF.setText(temp);
//							
//							statsAtt = statsList.item(41);
//							temp = returnNode(statsAtt);
//							char1.setMaInt(Integer.valueOf(temp));
//							System.out.println(temp);
//							intMTF.setText(temp);
//							
//							statsAtt = statsList.item(43);
//							temp = returnNode(statsAtt);
//							char1.setMaWis(Integer.valueOf(temp));
//							System.out.println(temp);
//							wisMTF.setText(temp);
//							
//							statsAtt = statsList.item(45);
//							temp = returnNode(statsAtt);
//							char1.setMaCha(Integer.valueOf(temp));
//							System.out.println(temp);
//							chaMTF.setText(temp);
//							
//							statsAtt = statsList.item(47);
//							temp = returnNode(statsAtt);
//							char1.setLevel(Integer.valueOf(temp));
//							System.out.println(temp);
//							tFLevel.setText(temp);
//							
//							statsAtt = statsList.item(49);
//							temp = returnNode(statsAtt);
//							char1.setHitdie(Integer.valueOf(temp));
//							System.out.println(temp);
//							tFHitDie.setText(temp);
//							tFHP.setText(Integer.toString((char1.getLevel() * char1.getConMod()) + char1.getLevel()));
//							
//							//setting mods
//							char1.setStrMod(Math.floorDiv(((char1.getStrength() + char1.getMaStr())-10), 2)); //str
//							char1.setDexMod(Math.floorDiv(((char1.getDexterity() + char1.getMaDex())-10), 2)); //dex
//							char1.setConMod(Math.floorDiv(((char1.getConstitution() + char1.getMaCon())-10), 2)); //con
//							char1.setIntMod(Math.floorDiv(((char1.getIntelligence() + char1.getMaInt())-10), 2)); //int
//							char1.setWisMod(Math.floorDiv(((char1.getWisdom() + char1.getMaWis())-10), 2)); //wis
//							char1.setChaMod(Math.floorDiv(((char1.getCharisma() + char1.getMaCha())-10), 2)); //cha
//							//display them
//							refreshDisplay(char1 ,charNaTF, strTF, dexTF, conTF, intTF, wisTF, chaTF, strMTF, dexMTF, conMTF,
//									intMTF, wisMTF, chaMTF, strMod, dexMod, conMod, intMod, wisMod, chaMod, weightTF, ageTF, favWeapTF, ranWeapTF,
//									spWeapTF, favAtkTF, ranAtkTF, spAtkTF, rdbtnMale, bBABTF, FavDamDiTF, RanDamDiTF,spDamDiTF, tFLevel, tFHitDie, tFHP);
//							
//							// add mod calculations
//							// add mod ca
//
//						}
//					}
//				}
//				catch(ParserConfigurationException | IOException |org.xml.sax.SAXException e3) {
//					e3.printStackTrace();
//				}
			}
		});
		
		btnSaveFileDom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				XmlDomWriter writeDom = new XmlDomWriter();
				try {
					writeDom.DresDomWriter(char1);
				} catch (TransformerConfigurationException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (ParserConfigurationException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (TransformerException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.println("Worked!");
				}
			});
		
		rdbtnMale.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				char1.setMale(true);
			}
		});
		
		rdbtnFemale.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				char1.setMale(false);
			}
		});
		
		charNaTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!charNaTF.getText().equals(""))
				{
					char1.setChName(charNaTF.getText());
					System.out.println("Worked!" + char1.getChName());
				}
			}
		});
		
		strTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!strTF.getText().equals("")) { // to make sure only actual text gets parses, think best memory wise also
				char1.setStrength(returnTextData(strTF));
				System.out.println("Worked!" + char1.getStrength());
				if(!(char1.getStrength() == 0))
				{
					char1.setStrMod(Math.floorDiv(((char1.getStrength() + char1.getMaStr())-10), 2));
					if(char1.getStrMod() > 0)
					{
						strMod.setText("+" + Integer.toString(char1.getStrMod()));
					}
					else
					{
						strMod.setText(Integer.toString(char1.getStrMod()));
					}

				}
				updateFavDam(favWeapTF,char1, FavDamDiTF);
				}
			}
		});
		
		conTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!conTF.getText().equals("")) {
				char1.setConstituion(returnTextData(conTF));
				System.out.println("Worked!" + char1.getConstitution());
				if(!(char1.getConstitution() == 0))
				{
					char1.setConMod(Math.floorDiv(((char1.getConstitution() + char1.getMaCon())-10), 2));
					if(char1.getConMod() > 0)
					{
						conMod.setText("+" + Integer.toString(char1.getConMod()));
					}
					else
					{
						conMod.setText(Integer.toString(char1.getConMod()));
					}
					
					if(!tFLevel.getText().equals("")) // updates hp with con changes 
					{
						tFHP.setText(Integer.toString((char1.getLevel() * char1.getConMod()) + char1.getLevel()));
					}
				}
				}
			}
		});
		
		dexTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!dexTF.getText().equals("")) {
					char1.setDexterity(returnTextData(dexTF));
					System.out.println("Worked!" + char1.getDexterity());
					if(!(char1.getDexterity() == 0))
					{
						char1.setDexMod((Math.floorDiv(((char1.getDexterity() + char1.getMaDex())-10), 2)));
						if(char1.getDexMod() > 0)
						{
							dexMod.setText("+" + Integer.toString(char1.getDexMod()));
						}
						else
						{
							dexMod.setText(Integer.toString(char1.getDexMod()));
						}
					}
				updateRanDam(ranWeapTF, char1, RanDamDiTF); // chained updates
				updateSpDam(spWeapTF, char1, spDamDiTF); // chained updates
				}
			}	
		});
		
		intTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!intTF.getText().equals("")) {
				char1.setIntelligence(returnTextData(intTF));
				System.out.println("Worked!" + char1.getIntelligence());
				if(!(char1.getIntelligence() == 0))
				{
					char1.setIntMod((Math.floorDiv(((char1.getIntelligence() + char1.getMaInt())-10), 2)));
					if(char1.getIntMod() > 0)
					{
						intMod.setText("+" + Integer.toString(char1.getIntMod()));
					}
					else
					{
						intMod.setText(Integer.toString(char1.getIntMod()));
					}

				}
				}
			}
		});
		

		
		wisTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!wisTF.getText().equals("")) {
				char1.setWisdom(returnTextData(wisTF));
				System.out.println("Worked!" + char1.getWisdom());
				if(!(char1.getWisdom() == 0))
				{
					char1.setWisMod((Math.floorDiv(((char1.getWisdom() + char1.getMaWis())-10), 2))); // error of getmawis - 10 before it is set?
					if(char1.getWisMod() > 0)
					{
						wisMod.setText("+" + Integer.toString(char1.getWisMod()));
					}
					else
					{
						wisMod.setText(Integer.toString(char1.getWisMod()));
					}

				}
				}
			}
		});
		

		
		chaTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				
				if(!chaTF.getText().equals("")) {
				char1.setCharisma(returnTextData(chaTF));
				System.out.println("Worked!" + char1.getCharisma());
				if(!(char1.getCharisma() == 0))
				{
					char1.setChaMod((Math.floorDiv(((char1.getCharisma() + char1.getMaCha())-10), 2)));
					if(char1.getChaMod() > 0)
					{
						chaMod.setText("+" + Integer.toString(char1.getChaMod()));
					}
					else
					{
						chaMod.setText(Integer.toString(char1.getChaMod()));
					}

				}
				}
			}
		});
		
		weightTF.addFocusListener(new FocusAdapter() {			
			@Override
			public void focusLost(FocusEvent e) {
				double maxWeight = 1000000.0;
				
				if(!weightTF.getText().equals("")) {
					
					// this needs testing not sure if brackets in right place others are correct
				double result = 0.0;
				try {
					result = Double.parseDouble(removePlusSign(weightTF.getText(), weightTF));
				}
				catch (NumberFormatException ex)
				{
					result = 0;
					JOptionPane.showMessageDialog(null, "You entered invalid characters \n please enter again!");
					weightTF.setText("");
				}
				
				if(result > maxWeight) // hardcode
				{
					result = 0;
					weightTF.setText("");
					JOptionPane.showMessageDialog(null, "Please enter a value lower than " + maxWeight + "!");
				}
				
				if(result < 0)
				{
					result = 0;
					weightTF.setText("");
					JOptionPane.showMessageDialog(null, "Please enter positive numbers only!");
				}
				
				char1.setWeight(result);
				System.out.println(char1.getWeight());
				}
			}
		});
		
		ageTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!ageTF.getText().equals("")) {
					
				char1.setAge((returnTextData(ageTF,0,1000)));
				System.out.println("Worked!" + char1.getAge());
				}
			}
		});
		
		favWeapTF.addFocusListener(new FocusAdapter() { // write a function
			@Override
			public void focusLost(FocusEvent e) {
				updateFavDam(favWeapTF,char1, FavDamDiTF);

			}
		});
		
		ranWeapTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				updateRanDam(ranWeapTF, char1, RanDamDiTF);
			}
		});
		
		spWeapTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				updateSpDam(spWeapTF, char1, spDamDiTF);				
			}
		});
		
		strMTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!strMTF.getText().equals(""))
				{
					
					char1.setMaStr(returnTextData(strMTF, statMaMin, statMax));
					System.out.println(char1.getMaStr());
					if(!strTF.getText().equals("")) { // to make sure only actual text gets parses, think best memory wise also
						if(!(char1.getStrength() == 0))
						{
							char1.setStrMod(Math.floorDiv(((char1.getStrength() + char1.getMaStr())-10), 2));
							if(char1.getStrMod() > 0)
							{
								strMod.setText("+" + Integer.toString(char1.getStrMod()));
							}
							else
							{
								strMod.setText(Integer.toString(char1.getStrMod()));
							}

						}
					}
					updateFavDam(favWeapTF,char1, FavDamDiTF); // update for weapon damage
				}
				char1.setStrMod(Math.floorDiv(((char1.getStrength() + char1.getMaStr())-10), 2)); // test if this resolves problem
			}
		});
		
		dexMTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!dexMTF.getText().equals(""))
				{
					char1.setMaDex(returnTextData(dexMTF, statMaMin, statMax));
					System.out.println(char1.getMaDex());
					if(!(char1.getDexterity() == 0))
					{
						char1.setDexMod((Math.floorDiv(((char1.getDexterity() + char1.getMaDex())-10), 2)));
						if(char1.getDexMod() > 0)
						{
							dexMod.setText("+" + Integer.toString(char1.getDexMod()));
						}
						else
						{
							dexMod.setText(Integer.toString(char1.getDexMod()));
						}

					}
					updateRanDam(ranWeapTF, char1, RanDamDiTF);
					updateSpDam(spWeapTF, char1, spDamDiTF);
				}
				char1.setDexMod(Math.floorDiv(((char1.getDexterity() + char1.getMaDex())-10), 2));
			}
		});
		
		conMTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!conMTF.getText().equals(""))
				{
					char1.setMaCon(returnTextData(conMTF,statMaMin,statMax));
					System.out.println(char1.getMaCon());
					if(!(char1.getConstitution() == 0))
					{
						char1.setConMod(Math.floorDiv(((char1.getConstitution() + char1.getMaCon())-10), 2));
						if(char1.getConMod() > 0)
						{
							conMod.setText("+" + Integer.toString(char1.getConMod()));
						}
						else
						{
							conMod.setText(Integer.toString(char1.getConMod()));
						}
						
						if(!tFLevel.getText().equals(""))
						{
							tFHP.setText(Integer.toString((char1.getLevel() * char1.getConMod()) + char1.getLevel()));
						}

					}
				}
				char1.setConMod(Math.floorDiv(((char1.getConstitution() + char1.getMaCon())-10), 2));
			}
		});
		
		intMTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!intMTF.getText().equals(""))
				{
					char1.setMaInt(returnTextData(intMTF,statMaMin,statMax));
					System.out.println(char1.getMaInt());
					if(!(char1.getIntelligence() == 0))
					{
						char1.setIntMod((Math.floorDiv(((char1.getIntelligence() + char1.getMaInt())-10), 2)));
						if(char1.getIntMod() > 0)
						{
							intMod.setText("+" + Integer.toString(char1.getIntMod()));
						}
						else
						{
							intMod.setText(Integer.toString(char1.getIntMod()));
						}

					}
				}
				char1.setIntMod(Math.floorDiv(((char1.getIntelligence() + char1.getMaInt())-10), 2));
			}
		});
		
		wisMTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!wisMTF.getText().equals(""))
				{
					char1.setMaWis(returnTextData(wisMTF,statMaMin,statMax)); // fixed wisdom
					System.out.println(char1.getMaWis());
					if(!(char1.getWisdom() == 0))
					{
						char1.setWisMod((Math.floorDiv(((char1.getWisdom() + char1.getMaWis())-10), 2)));
						if(char1.getWisMod() > 0)
						{
							wisMod.setText("+" + Integer.toString(char1.getWisMod()));
						}
						else
						{
							wisMod.setText(Integer.toString(char1.getWisMod()));
						}

					}
				}
				char1.setWisMod(Math.floorDiv(((char1.getWisdom() + char1.getMaWis())-10), 2));
			}
		});
		
		chaMTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!chaMTF.getText().equals(""))
				{
					char1.setMaCha(returnTextData(chaMTF,statMaMin,statMax));
					System.out.println(char1.getMaCha());
					if(!(char1.getCharisma() == 0))
					{
						char1.setChaMod((Math.floorDiv(((char1.getCharisma() + char1.getCharisma())-10), 2)));
						if(char1.getChaMod() > 0)
						{
							chaMod.setText("+" + Integer.toString(char1.getChaMod()));
						}
						else
						{
							chaMod.setText(Integer.toString(char1.getChaMod()));
						}

					}
				}
				char1.setChaMod(Math.floorDiv(((char1.getCharisma() + char1.getMaCha())-10), 2));
			}
		});
		
		ranAtkTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!ranAtkTF.getText().equals(""))
				{
					char1.setRaAtk(returnTextData(ranAtkTF,-5,100));
					System.out.println("Worked!" + char1.getRaAtk());
				}
			}
		});
		
		ranAtkTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!ranAtkTF.getText().equals(""))
				{
					char1.setRaAtk(returnTextData(ranAtkTF,-5,100));
					System.out.println("Worked!" + char1.getRaAtk());
				}
			}
		});
		
		spAtkTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!spAtkTF.getText().equals(""))
				{
					char1.setSpWeap(returnTextData(spAtkTF,-5,100));
					System.out.println("Worked!" + char1.getSpAtk());
				}
			}
		});
		
		btnResetStats.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				clearStats(char1, charNaTF,strTF, dexTF,conTF, intTF, wisTF, chaTF, strMTF, dexMTF, conMTF,	
						intMTF, wisMTF, chaMTF, strMod, dexMod, conMod, intMod,
						wisMod, chaMod, weightTF, ageTF, favWeapTF, ranWeapTF,
						spWeapTF, favAtkTF, ranAtkTF, spAtkTF, rdbtnMale, bBABTF,
						FavDamDiTF, RanDamDiTF, spDamDiTF, tFLevel, tFHitDie,tFHP);
			}
		});
		
		bBABTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!bBABTF.getText().equals(""))
				{
					char1.setBAB(returnTextData(bBABTF, -5,100));
					System.out.println("Worked!" + char1.getBAB());
				}
			}
		});
		
		tFLevel.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent arg0) {
				if(!tFLevel.getText().equals(""))
				{
					char1.setLevel(returnTextData(tFLevel,0,20));
					System.out.println("Worked!" + char1.getLevel());
					if(char1.getLevel() == 0)
					{
						tFLevel.setText("");
					}
					tFHP.setText(Integer.toString((char1.getLevel() * char1.getConMod()) + char1.getLevel()));
				}
			}
		});
		
		// belongs with tFHitDie need to update error for hitdie exception removed for marshalling
		// need to update error for hitdie exception removed for marshalling
		// need to update error for hitdie exception removed for marshalling
		
		tFHitDie.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(!tFHitDie.getText().equals(""))
				{
					try {
						char1.setHitdie(Integer.parseInt(removePlusSign(tFHitDie.getText(),tFHitDie)));
					} catch (NumberFormatException e1) {
						JOptionPane.showMessageDialog(null, "You entered invalid characters \n Please enter again");
						tFHitDie.setText("");
					}
				}
			}
		});
		
		/*****************************************?
		 *  not done yet
		 ****************************************/
		hpTF.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				// add logic
			}
		});
		
		saveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				charB.marshal(char1);
			}
		});
		
		
		mntmOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				int option = chooser.showOpenDialog(DatabaseFrame1.this);
				if(option == JFileChooser.APPROVE_OPTION) {
					try {
						String strLine;
						File selectedFile = chooser.getSelectedFile();
						fileName = selectedFile.getAbsolutePath();
						CharacterStats char2 = new CharacterStats();
						char2 = charB.unmarshall();
						FileInputStream in = new FileInputStream(selectedFile);
						BufferedReader br = new BufferedReader(new InputStreamReader(in));
						while((strLine = br.readLine()) !=null){
							System.out.println(strLine + "\n");
						}
					} catch(Exception e1) {
						System.out.println("Issue");
						fileName = "C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml";
					}
				}
				
				/**this unmarshals selected file no filter applied yet
				 * 
				 */
				CharacterStats char2 = new CharacterStats();
				char2 = charB.unmarshall(fileName);
				CharacterStats char1 = new CharacterStats(char2); 
				refreshDisplay(char1 ,charNaTF, strTF, dexTF, conTF, intTF, wisTF, chaTF, strMTF, dexMTF, conMTF,
						intMTF, wisMTF, chaMTF, strMod, dexMod, conMod, intMod, wisMod, chaMod, weightTF, ageTF, favWeapTF, ranWeapTF,
						spWeapTF, favAtkTF, ranAtkTF, spAtkTF, rdbtnMale, bBABTF, FavDamDiTF, RanDamDiTF,spDamDiTF, tFLevel, tFHitDie, tFHP);
			}
			
		});
		
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				charB.marshal(char1);
			}
		});
		
		// new button
		mntmNew.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
					int oResult = JOptionPane.showConfirmDialog(null, "Do you want to create a new character? \n the old character won't be saved!");
					
					if(oResult == 0)
					{
						JFileChooser chooser = new JFileChooser();
						chooser.setApproveButtonText("Create New File");
						chooser.setApproveButtonToolTipText("Create New Character File with .xml extension");
						clearStats(char1, charNaTF,strTF, dexTF,conTF, intTF, wisTF, chaTF, strMTF, dexMTF, conMTF,	
								intMTF, wisMTF, chaMTF, strMod, dexMod, conMod, intMod,wisMod, chaMod, weightTF, ageTF, favWeapTF, ranWeapTF,
								spWeapTF, favAtkTF, ranAtkTF, spAtkTF, rdbtnMale, bBABTF,FavDamDiTF, RanDamDiTF, spDamDiTF, tFLevel, tFHitDie,tFHP);
						int option = chooser.showOpenDialog(DatabaseFrame1.this);
						
						if(option == JFileChooser.APPROVE_OPTION) {
							try {
								File selectedFile = chooser.getSelectedFile();
								if(!selectedFile.exists())
								{
									fileName = selectedFile.getAbsolutePath();
									
									String extension = "";
									int i = fileName.lastIndexOf('.');
									int p = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
									if (i > p) {
									    extension = fileName.substring(i+1);
									}
									
									if(extension.equals("xml"))
									{
										charB.marshal(char1,fileName);
									}
									else
									{
										JOptionPane.showMessageDialog(null, "Invalid extension");
									}
								}
								else
								{
									JOptionPane.showMessageDialog(null, "File already exists!");
								}
								
							} catch(Exception e1) {
								System.out.println("Issue");
								// intended to be a backup save
								fileName = "C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml";
								charB.marshal(char1,fileName);
							}	
						}
					}
				//tmpDir = new File("/var/tmp");
				//boolean exists = tmpDir.exists();
			}
		});
		
//		fileName = selectedFile.getAbsolutePath();
//		
//		String extension = "";
//		int i = fileName.lastIndexOf('.');
//		int p = Math.max(fileName.lastIndexOf('/'), fileName.lastIndexOf('\\'));
//		if (i > p) {
//		    extension = fileName.substring(i+1);
//		}
//		
//		if(extension.equals("xml"))
//		{
//			charB.marshal(char1,fileName);
//		}
//		else
//		{
//			JOptionPane.showMessageDialog(null, "Invalid extension");
//		}
		
		mntmSaveAs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setApproveButtonText("Save As");
				chooser.setApproveButtonToolTipText("Save over file with .xml extension");
				int option = chooser.showOpenDialog(DatabaseFrame1.this);
				if(option == JFileChooser.APPROVE_OPTION) {
					try {
						File selectedFile = chooser.getSelectedFile();
						if(selectedFile.exists())
						{
							int oResult = JOptionPane.showConfirmDialog(null, "Do you want to save over this file? \n " + selectedFile.getAbsolutePath());
							
							if(oResult == 0)
							{
								fileName = selectedFile.getAbsolutePath();
								charB.marshal(char1,fileName);
							}
						}	
					} catch(Exception e1) {
						System.out.println("Issue");
						fileName = "C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml";
						charB.marshal(char1,fileName);
					}	
				}
			}
		});
		
		loadFileBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CharacterStats char2 = new CharacterStats();
				char2 = charB.unmarshall();
				CharacterStats char1 = new CharacterStats(char2);
				
				// this returns an object, discarded right now
				 refreshDisplay(char1 ,charNaTF, strTF, dexTF, conTF, intTF, wisTF, chaTF, strMTF, dexMTF, conMTF,
						intMTF, wisMTF, chaMTF, strMod, dexMod, conMod, intMod, wisMod, chaMod, weightTF, ageTF, favWeapTF, ranWeapTF,
						spWeapTF, favAtkTF, ranAtkTF, spAtkTF, rdbtnMale, bBABTF, FavDamDiTF, RanDamDiTF,spDamDiTF, tFLevel, tFHitDie, tFHP);
			}

		});
		
		
	}
	
	// *** add this to CharacterStats ***
	// this needs to be pushed off to class
	// prob have to add a hit dice later
	private static void clearStats(CharacterStats chObj,JTextField charNatTFL, JTextField strTF, JTextField dexTF,
			JTextField conTF, JTextField intTF, JTextField wisTF, JTextField chaTF, JTextField strMTF, JTextField dexMTF, JTextField conMTF,	
			JTextField intMTF, JTextField wisMTF, JTextField chaMTF, JTextField strMod, JTextField dexMod, JTextField conMod, JTextField intMod,
			JTextField wisMod, JTextField chaMod, JTextField weightTF, JTextField ageTF, JTextField favWeapTF, JTextField ranWeapTF,
			JTextField spWeapTF, JTextField favAtkTF, JTextField ranAtkTF, JTextField spAtkTF, JRadioButton rBMale, JTextField bBABTF,
			JTextField FavDamnDiTF, JTextField RanDamDiTF, JTextField spDamDiTF, JTextField tFLevel, JTextField tFHitDie,JTextField tFHP) {
		
		charNatTFL.setText(""); chObj.setChName("");
		strTF.setText(""); chObj.setStrength(0);
		dexTF.setText(""); chObj.setDexterity(0);
		conTF.setText(""); chObj.setConstituion(0);
		intTF.setText(""); chObj.setIntelligence(0);
		wisTF.setText(""); chObj.setWisdom(0);
		chaTF.setText(""); chObj.setCharisma(0);
		strMTF.setText(""); chObj.setMaStr(0);
		dexMTF.setText(""); chObj.setMaDex(0);
		conMTF.setText(""); chObj.setMaCon(0);
		intMTF.setText(""); chObj.setMaInt(0);
		wisMTF.setText(""); chObj.setMaWis(0);
		chaMTF.setText(""); chObj.setMaCha(0);
		strMod.setText(""); chObj.setStrMod(0);
		dexMod.setText(""); chObj.setDexMod(0);
		conMod.setText(""); chObj.setConMod(0);
		intMod.setText(""); chObj.setIntMod(0);
		wisMod.setText(""); chObj.setWisMod(0);
		chaMod.setText(""); chObj.setChaMod(0);
		weightTF.setText("");chObj.setWeight(0.0);
		ageTF.setText(""); chObj.setAge(0);
		// radio button not done yet
		favWeapTF.setText("");chObj.setFavWeap(0);
		ranWeapTF.setText("");chObj.setRanWeap(0);
		spWeapTF.setText("");chObj.setSpWeap(0);
		favAtkTF.setText("");chObj.setFavAtk(0);
		ranAtkTF.setText("");chObj.setRaAtk(0);
		spAtkTF.setText("");chObj.setSpAtk(0);
		bBABTF.setText("");chObj.setBAB(0);
		FavDamnDiTF.setText("");
		RanDamDiTF.setText("");
		spDamDiTF.setText("");
		tFLevel.setText("");chObj.setLevel(0);
		tFHitDie.setText("");chObj.setHitdie(0);
		tFHP.setText("");
		
	}
	
	
	// need to add mod calculations
	private static CharacterStats refreshDisplay(CharacterStats chObj,JTextField charNatTFL, JTextField strTF, JTextField dexTF, 
			JTextField conTF, JTextField intTF, JTextField wisTF, JTextField chaTF, JTextField strMTF, JTextField dexMTF, JTextField conMTF,
			JTextField intMTF, JTextField wisMTF, JTextField chaMTF, JTextField strMod, JTextField dexMod, JTextField conMod, JTextField intMod,
			JTextField wisMod, JTextField chaMod, JTextField weightTF, JTextField ageTF, JTextField favWeapTF, JTextField ranWeapTF,
			JTextField spWeapTF, JTextField favAtkTF, JTextField ranAtkTF, JTextField spAtkTF, JRadioButton rBMale, JTextField bBABTF,
			JTextField FavDamnDiTF, JTextField RanDamDiTF, JTextField spDamDiTF, JTextField tFLevel, JTextField tFHitDie, JTextField tFHP) {
		
		chObj.calcFavDam();
		chObj.calcRaDam();
		chObj.calcSpDam();
		// add calculate hp?
		// add calculate hp
		// add calculate hp
		// add calculate hp
		// add calculate hp
		
		charNatTFL.setText(chObj.getChName());
		strTF.setText(Integer.toString(chObj.getStrength()));
		dexTF.setText(Integer.toString(chObj.getDexterity()));
		conTF.setText(Integer.toString(chObj.getConstitution()));
		intTF.setText(Integer.toString(chObj.getIntelligence()));
		wisTF.setText(Integer.toString(chObj.getWisdom()));
		chaTF.setText(Integer.toString(chObj.getCharisma()));
		strMTF.setText(Integer.toString(chObj.getMaStr()));
		dexMTF.setText(Integer.toString(chObj.getMaDex()));
		conMTF.setText(Integer.toString(chObj.getMaCon()));
		intMTF.setText(Integer.toString(chObj.getMaInt()));
		wisMTF.setText(Integer.toString(chObj.getMaWis()));
		chaMTF.setText(Integer.toString(chObj.getChaMod()));
		
		// added mod calculations
		chObj.setStrMod(Math.floorDiv(((chObj.getStrength() + chObj.getMaStr())-10), 2));
		chObj.setDexMod(Math.floorDiv(((chObj.getDexterity() + chObj.getMaDex())-10), 2));
		chObj.setConMod(Math.floorDiv(((chObj.getConstitution() + chObj.getMaCon())-10), 2)); // didn't refacor here????
		chObj.setIntMod(Math.floorDiv(((chObj.getIntelligence() + chObj.getMaInt())-10), 2));
		chObj.setWisMod(Math.floorDiv(((chObj.getWisdom() + chObj.getMaWis())-10), 2));
		chObj.setChaMod(Math.floorDiv(((chObj.getCharisma() + chObj.getMaCha())-10), 2));
		strMod.setText(Integer.toString(chObj.getStrMod()));
		dexMod.setText(Integer.toString(chObj.getDexMod()));
		conMod.setText(Integer.toString(chObj.getConMod()));
		intMod.setText(Integer.toString(chObj.getIntMod()));
		wisMod.setText(Integer.toString(chObj.getWisMod()));
		chaMod.setText(Integer.toString(chObj.getChaMod()));
		weightTF.setText(Double.toString(chObj.getWeight()));
		ageTF.setText(Integer.toString(chObj.getAge()));
		// radio button not done yet
		favWeapTF.setText(Integer.toString(chObj.getFavWeap()));
		ranWeapTF.setText(Integer.toString(chObj.getRanWeap()));
		spWeapTF.setText(Integer.toString(chObj.getSpWeap()));
		favAtkTF.setText(Integer.toString(chObj.getFavAtk()));
		ranAtkTF.setText(Integer.toString(chObj.getRaAtk()));
		spAtkTF.setText(Integer.toString(chObj.getSpAtk()));
		bBABTF.setText(Integer.toString(chObj.getLevel()));
		FavDamnDiTF.setText(Integer.toString(chObj.getFavDam()));
		RanDamDiTF.setText(Integer.toString(chObj.getRaDam()));
		spDamDiTF.setText(Integer.toString(chObj.getSpDam()));
		tFLevel.setText(Integer.toString(chObj.getLevel()));
		tFHitDie.setText(Integer.toString(chObj.getHitdie()));
		tFHP.setText(Integer.toString((chObj.getLevel() * chObj.getConMod()) + chObj.getLevel()));
		return chObj;
	}
	
	private static int returnTextData(JTextField tF) { // add calls to each now // might want to just remove this
		int result = 0;
		try {
			result = Integer.parseInt(removePlusSign(tF.getText(),tF));
		}
		catch (NumberFormatException ex)
		{
			result = 0;
			JOptionPane.showMessageDialog(null, "You entered invalid characters \n positive numbers only please");
			tF.setText("");
		}
		
		if(result > 100)
		{
			result = 0;
			tF.setText("");
			JOptionPane.showMessageDialog(null, "Please enter a value lower than 100!");
		}
		
		if(result < 0)
		{
			result = 0;
			tF.setText("");
			JOptionPane.showMessageDialog(null, "Please enter positive numbers only!");
		}
		
		return result;
	}
	
	// filters text data prompts user if invalid
	
	private static int returnTextData(JTextField tF, int min, int max) { // add calls to each now
		//String temp = tF.getText();
		int result = 0;
		try {
			result = Integer.parseInt(removePlusSign(tF.getText(),tF));
		}
		catch (NumberFormatException ex)
		{
			result = 0;
			JOptionPane.showMessageDialog(null, "You entered invalid characters \n Please enter again");
			tF.setText("");
		}
		
		if(result > max)
		{
			result = 0;
			tF.setText("");
			JOptionPane.showMessageDialog(null, "Please enter a value lower than " + max + "!");
		}
		
		if(result < min)
		{
			result = 0;
			tF.setText("");
			JOptionPane.showMessageDialog(null, "Value too low! Please enter a value higher than" + min +"!");
		}
		
		return result;
	}
	
	// just removes the plus signs
	
	private static String removePlusSign(String s, JTextField tF)
	{
		if(s.substring(0).equalsIgnoreCase("+"));
		{
			s = s.replace("+", "");
			tF.setText(s);
		}
		return s;
	}
	
	// updates data
	
	private static void updateFavDam(JTextField tf,CharacterStats char1, JTextField disTF) //maybe this should be polymorphic
	{
		if(!tf.getText().equals(""))
		{
			char1.setFavWeap(returnTextData(tf,0,100));
			System.out.println("Worked!" + char1.getFavWeap());
			char1.calcFavDam();
			disTF.setText(Integer.toString(char1.getFavDam()));
		}
	}
	
	// this could be more polymorphic to work with all types of damage
	
	private static void updateRanDam(JTextField tf, CharacterStats char1, JTextField disTF)
	{
		if(!tf.getText().equals(""))
		{
			char1.setRanWeap(returnTextData(tf,0,100));
			System.out.println("Worked!" + char1.getRanWeap());
			char1.calcRaDam();
			disTF.setText(Integer.toString(char1.getRaDam()));
		}
	}
	
	private static void updateSpDam(JTextField tf, CharacterStats char1, JTextField disTF)
	{
		if(!tf.getText().equals(""))
		{
			char1.setSpWeap(returnTextData(tf,0,100));
			System.out.println("Worked!" + char1.getRanWeap());
			char1.calcSpDam();
			disTF.setText(Integer.toString(char1.getSpDam()));
		}
	}
	
	// returns XML element node
	
	private static String returnNode(Node statsAtt) {
		String s = "";
		
		if(statsAtt.getNodeType()==Node.ELEMENT_NODE) {
			Element attributes = (Element) statsAtt;
			s = attributes.getTextContent();
		}
		
		return s;
	}
	
}
