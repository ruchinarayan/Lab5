
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
 *         &lt;element name="convertInchesToFeetReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "convertInchesToFeetReturn"
})
@XmlRootElement(name = "convertInchesToFeetResponse")
public class ConvertInchesToFeetResponse {

    protected double convertInchesToFeetReturn;

    /**
     * Gets the value of the convertInchesToFeetReturn property.
     * 
     */
    public double getConvertInchesToFeetReturn() {
        return convertInchesToFeetReturn;
    }

    /**
     * Sets the value of the convertInchesToFeetReturn property.
     * 
     */
    public void setConvertInchesToFeetReturn(double value) {
        this.convertInchesToFeetReturn = value;
    }

}
