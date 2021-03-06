//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.10 at 01:13:12 PM EET
//


package ee.ria.dhx.types.eu.x_road.xsd.xroad;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for ApprovedCAType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedCAType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="authenticationOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="topCA" type="{http://x-road.eu/xsd/xroad.xsd}CaInfoType"/&gt;
 *         &lt;element name="intermediateCA" type="{http://x-road.eu/xsd/xroad.xsd}CaInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="certificateProfileInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApprovedCAType", propOrder = {
    "name",
    "authenticationOnly",
    "topCA",
    "intermediateCA",
    "certificateProfileInfo"
})
public class ApprovedCAType {

  @XmlElement(required = true)
  protected String name;
  protected Boolean authenticationOnly;
  @XmlElement(required = true)
  protected CaInfoType topCA;
  protected List<CaInfoType> intermediateCA;
  @XmlElement(required = true)
  protected String certificateProfileInfo;

  /**
   * Gets the value of the name property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the value of the name property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setName(String value) {
    this.name = value;
  }

  /**
   * Gets the value of the authenticationOnly property.
   * 
   * @return possible object is {@link Boolean }
   * 
   */
  public Boolean isAuthenticationOnly() {
    return authenticationOnly;
  }

  /**
   * Sets the value of the authenticationOnly property.
   * 
   * @param value allowed object is {@link Boolean }
   * 
   */
  public void setAuthenticationOnly(Boolean value) {
    this.authenticationOnly = value;
  }

  /**
   * Gets the value of the topCA property.
   * 
   * @return possible object is {@link CaInfoType }
   * 
   */
  public CaInfoType getTopCA() {
    return topCA;
  }

  /**
   * Sets the value of the topCA property.
   * 
   * @param value allowed object is {@link CaInfoType }
   * 
   */
  public void setTopCA(CaInfoType value) {
    this.topCA = value;
  }

  /**
   * Gets the value of the intermediateCA property.
   * 
   * <p>
   * This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the intermediateCA property.
   * 
   * <p>
   * For example, to add a new item, do as follows:
   * 
   * <pre>
     *    getIntermediateCA().add(newItem);
     * </pre>
   * 
   * 
   * <p>
   * Objects of the following type(s) are allowed in the list {@link CaInfoType }
   * 
   * @return list of {@link CaInfoType}
   */
  public List<CaInfoType> getIntermediateCA() {
    if (intermediateCA == null) {
      intermediateCA = new ArrayList<CaInfoType>();
    }
    return this.intermediateCA;
  }

  /**
   * Gets the value of the certificateProfileInfo property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCertificateProfileInfo() {
    return certificateProfileInfo;
  }

  /**
   * Sets the value of the certificateProfileInfo property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCertificateProfileInfo(String value) {
    this.certificateProfileInfo = value;
  }

}
