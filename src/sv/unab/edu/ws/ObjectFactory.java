
package sv.unab.edu.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the sv.unab.edu.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Hola_QNAME = new QName("http://webservice.unab.edu.sv/", "hola");
    private final static QName _Adios_QNAME = new QName("http://webservice.unab.edu.sv/", "adios");
    private final static QName _AdiosResponse_QNAME = new QName("http://webservice.unab.edu.sv/", "adiosResponse");
    private final static QName _HolaResponse_QNAME = new QName("http://webservice.unab.edu.sv/", "holaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: sv.unab.edu.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HolaResponse }
     * 
     */
    public HolaResponse createHolaResponse() {
        return new HolaResponse();
    }

    /**
     * Create an instance of {@link AdiosResponse }
     * 
     */
    public AdiosResponse createAdiosResponse() {
        return new AdiosResponse();
    }

    /**
     * Create an instance of {@link Hola }
     * 
     */
    public Hola createHola() {
        return new Hola();
    }

    /**
     * Create an instance of {@link Adios }
     * 
     */
    public Adios createAdios() {
        return new Adios();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hola }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unab.edu.sv/", name = "hola")
    public JAXBElement<Hola> createHola(Hola value) {
        return new JAXBElement<Hola>(_Hola_QNAME, Hola.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Adios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unab.edu.sv/", name = "adios")
    public JAXBElement<Adios> createAdios(Adios value) {
        return new JAXBElement<Adios>(_Adios_QNAME, Adios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdiosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unab.edu.sv/", name = "adiosResponse")
    public JAXBElement<AdiosResponse> createAdiosResponse(AdiosResponse value) {
        return new JAXBElement<AdiosResponse>(_AdiosResponse_QNAME, AdiosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HolaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.unab.edu.sv/", name = "holaResponse")
    public JAXBElement<HolaResponse> createHolaResponse(HolaResponse value) {
        return new JAXBElement<HolaResponse>(_HolaResponse_QNAME, HolaResponse.class, null, value);
    }

}
