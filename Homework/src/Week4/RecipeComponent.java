package Week4;

import java.util.Scanner;

public class RecipeComponent {
    private Ingredient ingredient;
    private float amount;

    public RecipeComponent() {
        this.ingredient = null;
        this.amount = 0;
    }

    public RecipeComponent(Ingredient ingredient, float amount) {
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public static RecipeComponent createRecipeComponent(){
        Scanner sc = new Scanner(System.in);
        Ingredient ingredient = Ingredient.createIngredient();
        System.out.print("Amount: ");
        float amount = sc.nextFloat();
        System.out.println();
        return new RecipeComponent(ingredient, amount);
    }

    public void displayRecipeComponent(){
        ingredient.displayIngredient();
        System.out.println("Amount: " + amount);
    }
}
