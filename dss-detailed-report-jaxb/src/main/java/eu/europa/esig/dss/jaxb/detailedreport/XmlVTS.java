//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.23 at 04:02:25 PM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for VTS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VTS">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dss.esig.europa.eu/validation/detailed-report}ConstraintsConclusion">
 *       &lt;sequence>
 *         &lt;element name="ControlTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VTS", propOrder = {
    "controlTime"
})
public class XmlVTS
    extends XmlConstraintsConclusion
{

    @XmlElement(name = "ControlTime", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date controlTime;

    /**
     * Gets the value of the controlTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getControlTime() {
        return controlTime;
    }

    /**
     * Sets the value of the controlTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlTime(Date value) {
        this.controlTime = value;
    }

}
