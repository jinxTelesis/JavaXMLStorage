package gui_int;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class XmlDomWriter {
	
	private static int idinc =0;
	// if professional software would propagate throw up to caller not handle here
	public void DresDomWriter(CharacterStats char1) throws ParserConfigurationException, TransformerConfigurationException,
	TransformerException { 
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();
		Element root = doc.createElementNS(null, "CharacterStats");
		doc.appendChild(root);
		
		root.appendChild(CharacterNode(doc, ++idinc, char1));
	
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transf;
		transf = transformerFactory.newTransformer();
		transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transf.setOutputProperty(OutputKeys.INDENT, "yes");
		transf.setOutputProperty(OutputKeys.STANDALONE, "yes");
			
		DOMSource source = new DOMSource(doc);
			
		File myFile = new File("C:\\Users\\dremo\\OneDrive\\Desktop\\PayYourTaxes.xml");
		
		StreamResult base = new StreamResult(System.out);
		StreamResult file = new StreamResult(myFile);
		transf.transform(source, base);
		transf.transform(source, file);
	}
	
	private static Node CharacterNode(Document doc, int id , CharacterStats char1) {
		
		Element Character = doc.createElement("Adventurers");
		
		Character.setAttribute("id", Integer.toString(id));
		Character.appendChild(atrributesValueNode(doc, char1.getAge("S"), Integer.toString(char1.getAge()))); // age 
		Character.appendChild(atrributesValueNode(doc, char1.getBab("S"), Integer.toString(char1.getBAB()))); // BAB
		Character.appendChild(atrributesValueNode(doc, char1.getChName("S"), (char1.getChName()))); // chName
		Character.appendChild(atrributesValueNode(doc, char1.getChaMod("S"), Integer.toString(char1.getChaMod()))); // chaMod
		Character.appendChild(atrributesValueNode(doc, char1.getCharisma("S"), Integer.toString(char1.getCharisma()))); // charisma
		Character.appendChild(atrributesValueNode(doc, char1.getConMod("S"), Integer.toString(char1.getConMod()))); // conMod
		Character.appendChild(atrributesValueNode(doc, char1.getConstitution("S"), Integer.toString(char1.getConstitution()))); // constitution
		Character.appendChild(atrributesValueNode(doc, char1.getDexMod("S"), Integer.toString(char1.getDexMod()))); // dexmod
		Character.appendChild(atrributesValueNode(doc, char1.getDexterity("S"), Integer.toString(char1.getDexterity()))); // dexterity
		Character.appendChild(atrributesValueNode(doc, char1.getFavAtk("S"), Integer.toString(char1.getFavAtk()))); // favAtk
		Character.appendChild(atrributesValueNode(doc, char1.getFavDam("S"), Integer.toString(char1.getFavDam()))); // favDam
		Character.appendChild(atrributesValueNode(doc, char1.getFavWeap("S"), Integer.toString(char1.getFavWeap()))); //favWeap
		Character.appendChild(atrributesValueNode(doc, char1.getHitdie("S"), Integer.toString(char1.getHitdie())));//hitdie
		Character.appendChild(atrributesValueNode(doc, char1.getIntMod("S"), Integer.toString(char1.getIntMod())));//intMod
		Character.appendChild(atrributesValueNode(doc, char1.getIntelligence("S"), Integer.toString(char1.getIntelligence())));//intelligence
		Character.appendChild(atrributesValueNode(doc, char1.getLevel("S"), Integer.toString(char1.getLevel())));//level
		Character.appendChild(atrributesValueNode(doc, char1.getMaCha("S"), Integer.toString(char1.getMaCha())));//maCha
		Character.appendChild(atrributesValueNode(doc, char1.getMaCon("S"), Integer.toString(char1.getMaCon())));//maCon
		Character.appendChild(atrributesValueNode(doc, char1.getMaDex("S"), Integer.toString(char1.getMaDex())));//maDex
		Character.appendChild(atrributesValueNode(doc, char1.getMaInt("S"), Integer.toString(char1.getMaInt())));//maInt
		Character.appendChild(atrributesValueNode(doc, char1.getMaStr("S"), Integer.toString(char1.getMaStr())));//maStr
		Character.appendChild(atrributesValueNode(doc, char1.getMaWis("S"), Integer.toString(char1.getMaWis())));//maWis
		Character.appendChild(atrributesValueNode(doc, char1.isMale("S"), Boolean.toString(char1.isMale())));//male
		Character.appendChild(atrributesValueNode(doc, char1.getRaAtk("S"), Integer.toString(char1.getRaAtk())));//raAtk
		Character.appendChild(atrributesValueNode(doc, char1.getRaDam("S"), Integer.toString(char1.getRaDam())));//raDam
		Character.appendChild(atrributesValueNode(doc, char1.getRanWeap("S"), Integer.toString(char1.getRanWeap())));//ranWeap
		Character.appendChild(atrributesValueNode(doc, char1.getSpAtk("S"), Integer.toString(char1.getSpAtk())));//spAtk
		Character.appendChild(atrributesValueNode(doc, char1.getSpDam("S"), Integer.toString(char1.getSpDam())));//spDam
		Character.appendChild(atrributesValueNode(doc, char1.getSpWeap("S"), Integer.toString(char1.getSpWeap())));//spWeap
		Character.appendChild(atrributesValueNode(doc, char1.getStrMod("S"), Integer.toString(char1.getStrMod())));//strMod
		Character.appendChild(atrributesValueNode(doc, char1.getStrength("S"), Integer.toString(char1.getStrength())));//strength
		Character.appendChild(atrributesValueNode(doc, char1.getWeight("S"), Double.toString(char1.getWeight())));//weight
		Character.appendChild(atrributesValueNode(doc, char1.getWisMod("S"), Integer.toString(char1.getWisMod())));//wisMod
		Character.appendChild(atrributesValueNode(doc, char1.getWisdom("S"), Integer.toString(char1.getWisdom()))); // wisdom
		return Character;
	}
	
	private static Node atrributesValueNode(Document doc, String name, String value) {
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));
		return node;
	}
	
	

}
