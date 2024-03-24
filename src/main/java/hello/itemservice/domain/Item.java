package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name", length = 10)
    private String itemName;
    private Integer price;
    private Integer quantity;
    private String contents;
    private String img;

    public Item() {
    }

//    public Item(String itemName, Integer price, Integer quantity) {
//        this.itemName = itemName;
//        this.price = price;
//        this.quantity = quantity;
//    }


//    public Item(String itemName, Integer price, Integer quantity, String contents) {
//        this.itemName = itemName;
//        this.price = price;
//        this.quantity = quantity;
//        this.contents = contents;
//    }


    public Item(String itemName, Integer price, Integer quantity, String contents, String img) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.contents = contents;
        this.img = img;
    }
}
