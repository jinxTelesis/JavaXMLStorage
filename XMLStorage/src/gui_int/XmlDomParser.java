package gui_int;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import org.xml.sax.SAXException;

public class XmlDomParser {
	
	public void XmlDomParse(CharacterStats char1) throws SAXException,
	IOException, ParserConfigurationException { 
		File xmlFile = new File("C:\\Users\\dremo\\OneDrive\\Desktop\\PayYourTaxes.xml");
		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder b = fac.newDocumentBuilder();
		Document doc = b.parse(xmlFile);
		doc.getDocumentElement().normalize();
		
		NodeList nList = doc.getElementsByTagName("Adventurers");
		
		for(int i = 0; i <nList.getLength(); i++)
		{
			Node nNode = nList.item(i);
			
			Element elem = (Element) nNode;
			
			String charid = elem.getAttribute("id");
			
			Node node1 = elem.getElementsByTagName(char1.getAge("S")).item(0);
			char1.setAge(Integer.parseInt(node1.getTextContent()));
			
			Node node2 = elem.getElementsByTagName(char1.getBab("S")).item(0);
			char1.setBAB(Integer.parseInt(node2.getTextContent()));
			
			Node node3 = elem.getElementsByTagName(char1.getChName("S")).item(0);
			char1.setChName(node3.getTextContent());
			
			Node node4 = elem.getElementsByTagName(char1.getChaMod("S")).item(0);
			char1.setChaMod((Integer.parseInt(node4.getTextContent())));
			
			Node node5 = elem.getElementsByTagName(char1.getCharisma("S")).item(0);
			char1.setCharisma((Integer.parseInt(node5.getTextContent())));
			
			Node node6 = elem.getElementsByTagName(char1.getConMod("S")).item(0);
			char1.setConMod(Integer.parseInt(node6.getTextContent()));
			
			Node node7 = elem.getElementsByTagName(char1.getConstitution("S")).item(0);
			char1.setConstituion(Integer.parseInt(node7.getTextContent()));
			
			Node node8 = elem.getElementsByTagName(char1.getDexMod("S")).item(0);
			char1.setDexMod(Integer.parseInt(node8.getTextContent()));

			Node node9 = elem.getElementsByTagName(char1.getDexterity("S")).item(0);
			char1.setDexterity(Integer.parseInt(node9.getTextContent()));
			
			Node node10 = elem.getElementsByTagName(char1.getFavAtk("S")).item(0);
			char1.setFavAtk(Integer.parseInt(node10.getTextContent()));
			
			Node node11 = elem.getElementsByTagName(char1.getFavDam("S")).item(0);
			// damage is calculated not set.
			
			Node node12 = elem.getElementsByTagName(char1.getFavWeap("S")).item(0);
			char1.setFavWeap(Integer.parseInt(node12.getTextContent()));
			
			Node node13 = elem.getElementsByTagName(char1.getHitdie("S")).item(0);
			char1.setHitdie(Integer.parseInt(node13.getTextContent()));
			
			Node node14 = elem.getElementsByTagName(char1.getIntMod("S")).item(0);
			char1.setIntMod(Integer.parseInt(node14.getTextContent()));
			
			Node node15 = elem.getElementsByTagName(char1.getIntelligence("S")).item(0);
			char1.setIntelligence(Integer.parseInt(node15.getTextContent()));
			
			Node node16 = elem.getElementsByTagName(char1.getLevel("S")).item(0);
			char1.setLevel(Integer.parseInt(node16.getTextContent()));
			
//			Node node17 = elem.getElementsByTagName(char1.getLevel("S")).item(0);
//			char1.setBAB(Integer.parseInt(node17.getTextContent()));
			
			Node node18 = elem.getElementsByTagName(char1.getMaCha("S")).item(0);
			char1.setMaCha(Integer.parseInt(node18.getTextContent()));
			
			Node node19 = elem.getElementsByTagName(char1.getMaCon("S")).item(0);
			char1.setMaCon(Integer.parseInt(node19.getTextContent()));
			
			Node node20 = elem.getElementsByTagName(char1.getMaDex("S")).item(0);
			char1.setMaDex(Integer.parseInt(node20.getTextContent()));
			
			Node node21 = elem.getElementsByTagName(char1.getMaInt("S")).item(0);
			char1.setMaInt(Integer.parseInt(node21.getTextContent()));
			
			Node node22 = elem.getElementsByTagName(char1.getMaStr("S")).item(0);
			char1.setMaStr(Integer.parseInt(node22.getTextContent()));
			
			Node node23 = elem.getElementsByTagName(char1.getMaWis("S")).item(0);
			char1.setMaWis(Integer.parseInt(node23.getTextContent()));
			
			Node node24 = elem.getElementsByTagName(char1.isMale("S")).item(0);
			char1.setMale(Boolean.parseBoolean(node24.getTextContent()));
			
			Node node25 = elem.getElementsByTagName(char1.getRaAtk("S")).item(0);
			char1.setRaAtk(Integer.parseInt(node25.getTextContent()));
			
			// ** calculated not stored should prob not parse
			//Node node26 = elem.getElementsByTagName(char1.getRaDam("S")).item(0);
			//(Integer.parseInt(node26.getTextContent()));
			
			Node node27 = elem.getElementsByTagName(char1.getRanWeap("S")).item(0);
			char1.setRanWeap(Integer.parseInt(node27.getTextContent()));
			
			Node node28 = elem.getElementsByTagName(char1.getSpAtk("S")).item(0);
			char1.setSpAtk(Integer.parseInt(node28.getTextContent()));
			
			// ** calculated not set
			//Node node29 = elem.getElementsByTagName(char1.getSpDam("S")).item(0);
			//(Integer.parseInt(node29.getTextContent()));
			
			Node node30 = elem.getElementsByTagName(char1.getSpWeap("S")).item(0);
			char1.setSpWeap(Integer.parseInt(node30.getTextContent()));
			
			Node node31 = elem.getElementsByTagName(char1.getStrMod("S")).item(0);
			char1.setStrMod(Integer.parseInt(node31.getTextContent()));
			
			Node node32 = elem.getElementsByTagName(char1.getStrength("S")).item(0);
			char1.setStrength(Integer.parseInt(node32.getTextContent()));
			
			Node node33 = elem.getElementsByTagName(char1.getWeight("S")).item(0);
			char1.setWeight(Double.parseDouble(node33.getTextContent()));
			
			Node node34 = elem.getElementsByTagName(char1.getWisMod("S")).item(0);
			char1.setWisMod(Integer.parseInt(node34.getTextContent()));
			
			Node node35 = elem.getElementsByTagName(char1.getWisdom("S")).item(0);
			char1.setWisdom(Integer.parseInt(node35.getTextContent())); 
			
			System.out.printf("first character is " + charid);
		}
	}
}
