//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.org.w3._2000._09.xmldsig_;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for RSAKeyValueType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RSAKeyValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Modulus" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *         &lt;element name="Exponent" type="{http://www.w3.org/2000/09/xmldsig#}CryptoBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RSAKeyValueType", propOrder = {
    "modulus",
    "exponent"
})
public class RSAKeyValueType {

  @XmlElement(name = "Modulus", required = true)
  protected byte[] modulus;
  @XmlElement(name = "Exponent", required = true)
  protected byte[] exponent;

  /**
   * Gets the value of the modulus property.
   * 
   * @return possible object is byte[]
   */
  public byte[] getModulus() {
    return modulus;
  }

  /**
   * Sets the value of the modulus property.
   * 
   * @param value allowed object is byte[]
   */
  public void setModulus(byte[] value) {
    this.modulus = value;
  }

  /**
   * Gets the value of the exponent property.
   * 
   * @return possible object is byte[]
   */
  public byte[] getExponent() {
    return exponent;
  }

  /**
   * Sets the value of the exponent property.
   * 
   * @param value allowed object is byte[]
   */
  public void setExponent(byte[] value) {
    this.exponent = value;
  }

}
