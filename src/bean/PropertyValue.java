package bean;

import lombok.*;

/**
 * @author littlestar
 */
@Data
public class PropertyValue {
    private String value;
    private Product product;
    private Property property;
    private int id;
}
