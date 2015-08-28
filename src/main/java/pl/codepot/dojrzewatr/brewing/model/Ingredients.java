package pl.codepot.dojrzewatr.brewing.model;

import java.util.Map;

public class Ingredients {

    Map<String, Integer> ingredients;

    public Ingredients() {
    }

    public Ingredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Map<String, Integer> ingredients) {
        this.ingredients = ingredients;
    }
}
