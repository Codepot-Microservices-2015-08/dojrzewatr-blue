package pl.codepot.dojrzewatr.brewing.model;

import java.util.ArrayList;
import java.util.List;

public class BrewRequest {

    private List<Ingredient> ingredients = new ArrayList<Ingredient>();


    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

}