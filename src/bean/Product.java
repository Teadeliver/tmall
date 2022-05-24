package bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author littlestar
 */
@Data
public class Product {
    private int id;
    private Category category;
    private String name;
    private String subTitle;
    private BigDecimal originalPrice;
    private BigDecimal nowPrice;
    private int stock;
    private Date createDate;
    private ProductImage firstProductImage;
    private int commentCount;
    private int saleCount;
}
