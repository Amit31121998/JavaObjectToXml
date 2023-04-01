package com.amit;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXml {
	
	
	public static void main(String[] args) {
		
		try {
			Student s=new Student();
			s.setId(101);
			s.setFname("Amit");
			s.setLname("Kumar");
			
			JAXBContext newInstance = JAXBContext.newInstance(Student.class);
			Marshaller  marshaller = newInstance.createMarshaller();
			
			File f=new File("src\\main\\resources\\std.xml");
			marshaller.marshal(s,f);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
