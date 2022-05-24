package bean;

import lombok.Data;
import java.math.BigDecimal;

/**
 * @author littlestar
 */
@Data
public class OrderItem {
    private int id;
    private Product product;
    private Order order;
    private int number;
    private BigDecimal sum;
}
