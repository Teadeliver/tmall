package bean;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author littlestar
 */

@Data
public class CartItem {
    private int id;
    private Product product;
    private User user;
    private int number;
    private BigDecimal sum;
}
