package gui_int;

import java.io.File;

import javax.xml.bind.*;
import javax.xml.transform.Result;



public class CharacterStatsJAXB {
	
	public void marshal() {
		try {
			
			CharacterStats char2 = new CharacterStats();
			//Employee emp=new Employee("Blue", "Dre", "Oneonta", 120000);
			JAXBContext jc = JAXBContext.newInstance(CharacterStats.class);
			Marshaller ms=jc.createMarshaller();
			ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			ms.marshal(char2, System.out);
			ms.marshal(char2,  new File("C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml"));
			
			
		} catch (Exception e)
		{
			System.out.println("" + e.getMessage());
		}
	}
	
	public void unmarshall() {
		try {
			JAXBContext jaxCon = JAXBContext.newInstance(CharacterStats.class);
			Unmarshaller umar = jaxCon.createUnmarshaller();
			CharacterStats char2=(CharacterStats)umar.unmarshal(new File("C:\\Users\\dremo\\OneDrive\\Desktop\\testXtest.xml"));
			System.out.println();
			
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
