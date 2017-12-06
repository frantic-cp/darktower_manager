package org.darktower.mavenjavafxapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxParser {

    public ArrayList<Person> parsePersonXML(String path) throws IOException {
        ArrayList<Person> personArrayList = new ArrayList<>();
        if(new File(path).exists()){
            try(FileInputStream fis = new FileInputStream(path)){
                XMLStreamReader xmls = XMLInputFactory.newInstance().createXMLStreamReader(path,fis);
                while (xmls.hasNext()){
                    xmls.next();

                    /*if(xmls.isStartElement()){

                    }*/
                }
            }catch (XMLStreamException e){
                e.printStackTrace();
            }
        }
        return personArrayList;
    }
}
