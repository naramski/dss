//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.23 at 04:02:25 PM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.validation.SignatureQualification;

public class Adapter4
    extends XmlAdapter<String, SignatureQualification>
{


    public SignatureQualification unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureQualificationParser.parse(value));
    }

    public String marshal(SignatureQualification value) {
        return (eu.europa.esig.dss.jaxb.parsers.SignatureQualificationParser.print(value));
    }

}
