package tr.gov.nvi.tckimlik.WS;

import javax.xml.namespace.QName;

public class KPSPublicLocatorBuilder {
    private org.apache.axis.EngineConfiguration config;
    private String wsdlLoc;
    private QName sName;

    public KPSPublicLocatorBuilder setConfig(org.apache.axis.EngineConfiguration config) {
        this.config = config;
        return this;
    }

    public KPSPublicLocatorBuilder setWsdlLoc(String wsdlLoc) {
        this.wsdlLoc = wsdlLoc;
        return this;
    }

    public KPSPublicLocatorBuilder setsName(QName sName) {
        this.sName = sName;
        return this;
    }

    public KPSPublicLocator createKPSPublicLocator() {
        return new KPSPublicLocator(config);
    }
}