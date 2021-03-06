//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.schemas.dhl_meta_manual;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the ee.riik.schemas.dhl_meta_manual package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _KoostajaAsutuseNr_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_asutuse_nr");
  private final static QName _SaajaAsutuseNr_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saaja_asutuse_nr");
  private final static QName _KoostajaDokumendinimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_dokumendinimi");
  private final static QName _KoostajaDokumendityyp_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_dokumendityyp");
  private final static QName _KoostajaVotmesona_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_votmesona");
  private final static QName _KoostajaDokumendinr_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_dokumendinr");
  private final static QName _KoostajaKuupaev_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_kuupaev");
  private final static QName _KoostajaAsutuseNimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_asutuse_nimi");
  private final static QName _KoostajaAsutuseKontakt_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_asutuse_kontakt");
  private final static QName _AutoriOsakond_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "autori_osakond");
  private final static QName _AutoriIsikukood_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "autori_isikukood");
  private final static QName _AutoriNimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "autori_nimi");
  private final static QName _AutoriKontakt_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "autori_kontakt");
  private final static QName _SeotudDhlId_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "seotud_dhl_id");
  private final static QName _SeotudDokumendinrKoostajal_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "seotud_dokumendinr_koostajal");
  private final static QName _SeotudDokumendinrSaajal_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "seotud_dokumendinr_saajal");
  private final static QName _SaatjaDokumendinr_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saatja_dokumendinr");
  private final static QName _SaatjaKuupaev_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saatja_kuupaev");
  private final static QName _SaatjaAsutuseKontakt_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saatja_asutuse_kontakt");
  private final static QName _SaajaIsikukood_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saaja_isikukood");
  private final static QName _SaajaNimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saaja_nimi");
  private final static QName _SaajaOsakond_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "saaja_osakond");
  private final static QName _KoostajaFailinimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_failinimi");
  private final static QName _KoostajaKataloog_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_kataloog");
  private final static QName _KoostajaKokkuvote_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "koostaja_kokkuvote");
  private final static QName _SisuId_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-manual", "sisu_id");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: ee.riik.schemas.dhl_meta_manual
   * 
   */
  public ObjectFactory() {}

  /**
   * Create an instance of {@link SaatjaDefineeritud }
   * 
   * @return {@link SaatjaDefineeritud}
   */
  public SaatjaDefineeritud createSaatjaDefineeritud() {
    return new SaatjaDefineeritud();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_asutuse_nr")
  public JAXBElement<String> createKoostajaAsutuseNr(String value) {
    return new JAXBElement<String>(_KoostajaAsutuseNr_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saaja_asutuse_nr")
  public JAXBElement<String> createSaajaAsutuseNr(String value) {
    return new JAXBElement<String>(_SaajaAsutuseNr_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_dokumendinimi")
  public JAXBElement<String> createKoostajaDokumendinimi(String value) {
    return new JAXBElement<String>(_KoostajaDokumendinimi_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_dokumendityyp")
  public JAXBElement<String> createKoostajaDokumendityyp(String value) {
    return new JAXBElement<String>(_KoostajaDokumendityyp_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_votmesona")
  public JAXBElement<String> createKoostajaVotmesona(String value) {
    return new JAXBElement<String>(_KoostajaVotmesona_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_dokumendinr")
  public JAXBElement<String> createKoostajaDokumendinr(String value) {
    return new JAXBElement<String>(_KoostajaDokumendinr_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_kuupaev")
  public JAXBElement<String> createKoostajaKuupaev(String value) {
    return new JAXBElement<String>(_KoostajaKuupaev_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_asutuse_nimi")
  public JAXBElement<String> createKoostajaAsutuseNimi(String value) {
    return new JAXBElement<String>(_KoostajaAsutuseNimi_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_asutuse_kontakt")
  public JAXBElement<String> createKoostajaAsutuseKontakt(String value) {
    return new JAXBElement<String>(_KoostajaAsutuseKontakt_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "autori_osakond")
  public JAXBElement<String> createAutoriOsakond(String value) {
    return new JAXBElement<String>(_AutoriOsakond_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "autori_isikukood")
  public JAXBElement<String> createAutoriIsikukood(String value) {
    return new JAXBElement<String>(_AutoriIsikukood_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "autori_nimi")
  public JAXBElement<String> createAutoriNimi(String value) {
    return new JAXBElement<String>(_AutoriNimi_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "autori_kontakt")
  public JAXBElement<String> createAutoriKontakt(String value) {
    return new JAXBElement<String>(_AutoriKontakt_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "seotud_dhl_id")
  public JAXBElement<String> createSeotudDhlId(String value) {
    return new JAXBElement<String>(_SeotudDhlId_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "seotud_dokumendinr_koostajal")
  public JAXBElement<String> createSeotudDokumendinrKoostajal(String value) {
    return new JAXBElement<String>(_SeotudDokumendinrKoostajal_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "seotud_dokumendinr_saajal")
  public JAXBElement<String> createSeotudDokumendinrSaajal(String value) {
    return new JAXBElement<String>(_SeotudDokumendinrSaajal_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saatja_dokumendinr")
  public JAXBElement<String> createSaatjaDokumendinr(String value) {
    return new JAXBElement<String>(_SaatjaDokumendinr_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saatja_kuupaev")
  public JAXBElement<String> createSaatjaKuupaev(String value) {
    return new JAXBElement<String>(_SaatjaKuupaev_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saatja_asutuse_kontakt")
  public JAXBElement<String> createSaatjaAsutuseKontakt(String value) {
    return new JAXBElement<String>(_SaatjaAsutuseKontakt_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saaja_isikukood")
  public JAXBElement<String> createSaajaIsikukood(String value) {
    return new JAXBElement<String>(_SaajaIsikukood_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saaja_nimi")
  public JAXBElement<String> createSaajaNimi(String value) {
    return new JAXBElement<String>(_SaajaNimi_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "saaja_osakond")
  public JAXBElement<String> createSaajaOsakond(String value) {
    return new JAXBElement<String>(_SaajaOsakond_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_failinimi")
  public JAXBElement<Object> createKoostajaFailinimi(Object value) {
    return new JAXBElement<Object>(_KoostajaFailinimi_QNAME, Object.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_kataloog")
  public JAXBElement<Object> createKoostajaKataloog(Object value) {
    return new JAXBElement<Object>(_KoostajaKataloog_QNAME, Object.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "koostaja_kokkuvote")
  public JAXBElement<Object> createKoostajaKokkuvote(Object value) {
    return new JAXBElement<Object>(_KoostajaKokkuvote_QNAME, Object.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
   * 
   * @param value value
   * @return {@link SaatjaDefineeritud}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-manual", name = "sisu_id")
  public JAXBElement<Object> createSisuId(Object value) {
    return new JAXBElement<Object>(_SisuId_QNAME, Object.class, null, value);
  }

}
