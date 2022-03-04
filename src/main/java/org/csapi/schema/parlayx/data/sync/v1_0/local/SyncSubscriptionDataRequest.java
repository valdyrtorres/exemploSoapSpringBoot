//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.2 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2022.03.04 às 12:11:49 AM BRT 
//


package org.csapi.schema.parlayx.data.sync.v1_0.local;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MSISDN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="updateType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "msisdn",
    "serviceId",
    "productId",
    "updateType"
})
@XmlRootElement(name = "SyncSubscriptionDataRequest")
public class SyncSubscriptionDataRequest {

    @XmlElement(name = "MSISDN", required = true)
    protected String msisdn;
    @XmlElement(required = true)
    protected String serviceId;
    @XmlElement(required = true)
    protected String productId;
    protected int updateType;

    /**
     * Obtém o valor da propriedade msisdn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSISDN() {
        return msisdn;
    }

    /**
     * Define o valor da propriedade msisdn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSISDN(String value) {
        this.msisdn = value;
    }

    /**
     * Obtém o valor da propriedade serviceId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceId() {
        return serviceId;
    }

    /**
     * Define o valor da propriedade serviceId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceId(String value) {
        this.serviceId = value;
    }

    /**
     * Obtém o valor da propriedade productId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Define o valor da propriedade productId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Obtém o valor da propriedade updateType.
     * 
     */
    public int getUpdateType() {
        return updateType;
    }

    /**
     * Define o valor da propriedade updateType.
     * 
     */
    public void setUpdateType(int value) {
        this.updateType = value;
    }

}
