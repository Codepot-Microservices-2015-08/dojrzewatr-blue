package pl.codepot.dojrzewatr.brewing.model;

public class Ingredient {

    private String type;
    private Integer quantity;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}