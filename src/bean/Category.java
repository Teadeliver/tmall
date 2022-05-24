package bean;

import lombok.Data;

import java.util.List;

/**
 * @author littlestar
 */
@Data
public class Category {
    private String name;
    private int id;
    private int recommend;
    private List<Product> products;
}
