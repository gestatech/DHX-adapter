//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.sk.digidoc.v1_3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the ee.sk.digidoc.v1_3 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _SignedDoc_QNAME = new QName("http://www.sk.ee/DigiDoc/v1.3.0#",
      "SignedDoc");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: ee.sk.digidoc.v1_3
   * 
   */
  public ObjectFactory() {}

  /**
   * Create an instance of {@link SignedDocType }
   * 
   */
  public SignedDocType createSignedDocType() {
    return new SignedDocType();
  }

  /**
   * Create an instance of {@link DataFileType }
   * 
   */
  public DataFileType createDataFileType() {
    return new DataFileType();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link SignedDocType }{@code >}
   * 
   */
  @XmlElementDecl(namespace = "http://www.sk.ee/DigiDoc/v1.3.0#", name = "SignedDoc")
  public JAXBElement<SignedDocType> createSignedDoc(SignedDocType value) {
    return new JAXBElement<SignedDocType>(_SignedDoc_QNAME, SignedDocType.class, null, value);
  }

}
