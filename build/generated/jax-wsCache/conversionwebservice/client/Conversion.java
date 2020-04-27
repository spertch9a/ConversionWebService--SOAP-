
package client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conversion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="conversion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dinars" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="cours" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "conversion", propOrder = {
    "dinars",
    "cours"
})
public class Conversion {

    protected double dinars;
    protected double cours;

    /**
     * Gets the value of the dinars property.
     * 
     */
    public double getDinars() {
        return dinars;
    }

    /**
     * Sets the value of the dinars property.
     * 
     */
    public void setDinars(double value) {
        this.dinars = value;
    }

    /**
     * Gets the value of the cours property.
     * 
     */
    public double getCours() {
        return cours;
    }

    /**
     * Sets the value of the cours property.
     * 
     */
    public void setCours(double value) {
        this.cours = value;
    }

}
