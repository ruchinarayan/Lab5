
package files;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="convertMilesToKilometersReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "convertMilesToKilometersReturn"
})
@XmlRootElement(name = "convertMilesToKilometersResponse")
public class ConvertMilesToKilometersResponse {

    protected double convertMilesToKilometersReturn;

    /**
     * Gets the value of the convertMilesToKilometersReturn property.
     * 
     */
    public double getConvertMilesToKilometersReturn() {
        return convertMilesToKilometersReturn;
    }

    /**
     * Sets the value of the convertMilesToKilometersReturn property.
     * 
     */
    public void setConvertMilesToKilometersReturn(double value) {
        this.convertMilesToKilometersReturn = value;
    }

}
