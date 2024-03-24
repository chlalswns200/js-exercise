package hello.itemservice.repository;

import lombok.Data;

@Data
public class ItemUpdateDto {
    private String itemName;
    private Integer price;
    private Integer quantity;
    private String contents;
    private String img;

    public ItemUpdateDto() {
    }

//    public ItemUpdateDto(String itemName, Integer price, Integer quantity) {
//        this.itemName = itemName;
//        this.price = price;
//        this.quantity = quantity;
//    }


    public ItemUpdateDto(String itemName, Integer price, Integer quantity, String contents, String img) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
        this.contents = contents;
        this.img = img;
    }
}
