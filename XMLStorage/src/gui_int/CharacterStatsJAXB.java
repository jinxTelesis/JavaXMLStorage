package gui_int;

import java.io.File;

import javax.xml.bind.*;
import javax.xml.transform.Result;


public class CharacterStatsJAXB {
	
	public void marshal(CharacterStats char1) {
		try {
			
			
			JAXBContext jc = JAXBContext.newInstance(CharacterStats.class);
			Marshaller ms=jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			ms.marshal(char1, System.out);
			ms.marshal(char1,  new File("C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml"));
			
			
		} catch (Exception e)
		{
			System.out.println("" + e.getMessage());
		}
	}
	
	public CharacterStats unmarshall() {
		CharacterStats char1 = new CharacterStats();
		try {
			
			JAXBContext jaxCon = JAXBContext.newInstance(CharacterStats.class);
			Unmarshaller umar = jaxCon.createUnmarshaller();
			CharacterStats char2=(CharacterStats)umar.unmarshal(new File("C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml"));
			char1 = char2;
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return char1;
	}

}
