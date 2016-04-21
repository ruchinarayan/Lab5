
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
 *         &lt;element name="convertInchesToCentimeterReturn" type="{http://www.w3.org/2001/XMLSchema}double"/>
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
    "convertInchesToCentimeterReturn"
})
@XmlRootElement(name = "convertInchesToCentimeterResponse")
public class ConvertInchesToCentimeterResponse {

    protected double convertInchesToCentimeterReturn;

    /**
     * Gets the value of the convertInchesToCentimeterReturn property.
     * 
     */
    public double getConvertInchesToCentimeterReturn() {
        return convertInchesToCentimeterReturn;
    }

    /**
     * Sets the value of the convertInchesToCentimeterReturn property.
     * 
     */
    public void setConvertInchesToCentimeterReturn(double value) {
        this.convertInchesToCentimeterReturn = value;
    }

}
