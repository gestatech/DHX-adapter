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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for getSendStatusV2RequestType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSendStatusV2RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dokumendid" type="{http://producers.dhl.xrd.riik.ee/producer/dhl}base64BinaryType"/&gt;
 *         &lt;element name="staatuse_ajalugu" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSendStatusV2RequestType", propOrder = {
    "dokumendid",
    "staatuseAjalugu"
})
public class GetSendStatusV2RequestType {

  @XmlElement(required = true)
  protected Base64BinaryType dokumendid;
  @XmlElement(name = "staatuse_ajalugu")
  protected boolean staatuseAjalugu;

  /**
   * Gets the value of the dokumendid property.
   * 
   * @return possible object is {@link Base64BinaryType }
   * 
   */
  public Base64BinaryType getDokumendid() {
    return dokumendid;
  }

  /**
   * Sets the value of the dokumendid property.
   * 
   * @param value allowed object is {@link Base64BinaryType }
   * 
   */
  public void setDokumendid(Base64BinaryType value) {
    this.dokumendid = value;
  }

  /**
   * Gets the value of the staatuseAjalugu property.
   * 
   */
  public boolean isStaatuseAjalugu() {
    return staatuseAjalugu;
  }

  /**
   * Sets the value of the staatuseAjalugu property.
   * 
   */
  public void setStaatuseAjalugu(boolean value) {
    this.staatuseAjalugu = value;
  }

}
