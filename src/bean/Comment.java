package bean;

import lombok.Data;

import java.util.Date;

/**
 * @author littlestar
 */
@Data
public class Comment {
    private int id;
    private String content;
    private User user;
    private Product product;
    private Date createDate;
}
