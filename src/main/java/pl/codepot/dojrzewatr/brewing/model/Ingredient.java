package pl.codepot.dojrzewatr.brewing.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ingredient {

    @JsonProperty("type")
    private String type;
    @JsonProperty("quantity")
    private Integer quantity;


    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The quantity
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     *
     * @param quantity
     * The quantity
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}