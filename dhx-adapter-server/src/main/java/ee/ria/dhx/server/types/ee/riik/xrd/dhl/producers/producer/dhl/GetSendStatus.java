//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.xrd.dhl.producers.producer.dhl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="keha" type="{http://producers.dhl.xrd.riik.ee/producer/dhl}getSendStatusV2RequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "keha"
})
@XmlRootElement(name = "getSendStatus")
public class GetSendStatus {

  @XmlElement(required = true)
  protected GetSendStatusV2RequestType keha;

  /**
   * Gets the value of the keha property.
   * 
   * @return possible object is {@link GetSendStatusV2RequestType }
   * 
   */
  public GetSendStatusV2RequestType getKeha() {
    return keha;
  }

  /**
   * Sets the value of the keha property.
   * 
   * @param value allowed object is {@link GetSendStatusV2RequestType }
   * 
   */
  public void setKeha(GetSendStatusV2RequestType value) {
    this.keha = value;
  }

}
