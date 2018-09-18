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

import javax.swing.JTextField;

public class DatabaseFrameRefactor extends JFrame { // 37
	
	private static final long serialVersionUID = 7766926757619448060L;
	
	private static int TFNUM = 36;
	private JTextField dynamicSettingTF[] = new JTextField[TFNUM]; // reference array for tfs
	//private String jTFNames[] = new String[TFNUM]; // reference array for tf names
	
	enum TFName // should be 33
	{   // 0       1       2     3    4     5      6      7        8      9         10
		charNaTF, strTF, conTF,dexTF,intTF,wisTF,chaTF,weightTF, ageTF, favWeapTF,ranWeapTF,
		// 11       12       13     14      15      16       17    18      19       20
		spWeapTF, strMod, dexMod, conMod, intMod, wisMod, chaMod, strMTF, dexMTF, conMTF,
		// 21      22     23      24        25         26        27          28         29       30
		intMTF, wisMTF, chaMTF, favAtkTF, ranAtkTF, spAtkTF, FavDamDiTF, RanDamDiTF, spDamDiTF, bBABTF,
		// 31      32       33
		tFLevel, tFHitDie, tFHP
	}
	
	// statMaMin are used by functions to determine character stats min and max
	private int statMaMin = -20;
	private int statMax = 100;
	// testing
	private String fileName = "";
	// tesing 

	
	CharacterStats char1 = new CharacterStats(); 
	CharacterStatsJAXB charB = new CharacterStatsJAXB();
	
	
	// main that threads
	// set as an annoynmous class 
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
	public DatabaseFrameRefactor() {
		//JTextField dynamicSettingTF = new JTextField();
		for(int i = 0; i < TFNUM; i++ )
		{
			dynamicSettingTF[i] = new JTextField();
		}
		
//		private JTextField charNaTF;
//		private JTextField strTF;
//		private JTextField conTF;
//		private JTextField dexTF;
//		private JTextField intTF;
//		private JTextField wisTF;
//		private JTextField chaTF;
//		private JTextField weightTF;
//		private JTextField ageTF;
//		private JTextField favWeapTF;
//		private JTextField ranWeapTF;
//		private JTextField spWeapTF;
//		private JTextField strMod;
//		private JTextField dexMod;
//		private JTextField conMod;
//		private JTextField intMod;
//		private JTextField wisMod;
//		private JTextField chaMod;
//		private JTextField strMTF;
//		private JTextField dexMTF;
//		private JTextField conMTF;
//		private JTextField intMTF;
//		private JTextField wisMTF;
//		private JTextField chaMTF;
//		private JTextField favAtkTF;
//		private JTextField ranAtkTF;
//		private JTextField spAtkTF;
//		private JTextField FavDamDiTF;
//		private JTextField RanDamDiTF;
//		private JTextField spDamDiTF;
//		private JTextField bBABTF;
//		private JTextField tFLevel;
//		private JTextField tFHitDie;
//		private JTextField tFHP;
		

		
		for(int i = 0; i < TFNUM; i++)
		{
			dynamicSettingTF[i].setName(""); // create a name list
		}
		// add dynamic name list to last 
		
	}
	
	
}
