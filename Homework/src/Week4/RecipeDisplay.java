package Week4;

public abstract class RecipeDisplay {
    private Recipe recipe;
    private Separator separator;

    public RecipeDisplay() {
    }

    public RecipeDisplay(Recipe recipe, Separator separator) {
        this.recipe = recipe;
        this.separator = separator;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


    public Separator getSeparator() {
        return separator;
    }

    public void setSeparator(Separator separator) {
        this.separator = separator;
    }

    public abstract void displayRecipe();

}
