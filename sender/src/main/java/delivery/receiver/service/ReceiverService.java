
package delivery.receiver.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ReceiverService", targetNamespace = "http://service.receiver.delivery/", wsdlLocation = "file:/media/juan/DATA/linux/sistemas-distribuidos/delivery-safeguard/sender/src/main/java/receiver.wsdl")
public class ReceiverService
    extends Service
{

    private final static URL RECEIVERSERVICE_WSDL_LOCATION;
    private final static WebServiceException RECEIVERSERVICE_EXCEPTION;
    private final static QName RECEIVERSERVICE_QNAME = new QName("http://service.receiver.delivery/", "ReceiverService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/media/juan/DATA/linux/sistemas-distribuidos/delivery-safeguard/sender/src/main/java/receiver.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RECEIVERSERVICE_WSDL_LOCATION = url;
        RECEIVERSERVICE_EXCEPTION = e;
    }

    public ReceiverService() {
        super(__getWsdlLocation(), RECEIVERSERVICE_QNAME);
    }

    public ReceiverService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RECEIVERSERVICE_QNAME, features);
    }

    public ReceiverService(URL wsdlLocation) {
        super(wsdlLocation, RECEIVERSERVICE_QNAME);
    }

    public ReceiverService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RECEIVERSERVICE_QNAME, features);
    }

    public ReceiverService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReceiverService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Receiver
     */
    @WebEndpoint(name = "ReceiverImplPort")
    public Receiver getReceiverImplPort() {
        return super.getPort(new QName("http://service.receiver.delivery/", "ReceiverImplPort"), Receiver.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Receiver
     */
    @WebEndpoint(name = "ReceiverImplPort")
    public Receiver getReceiverImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.receiver.delivery/", "ReceiverImplPort"), Receiver.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RECEIVERSERVICE_EXCEPTION!= null) {
            throw RECEIVERSERVICE_EXCEPTION;
        }
        return RECEIVERSERVICE_WSDL_LOCATION;
    }

}
