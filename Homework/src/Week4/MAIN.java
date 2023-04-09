package Week4;

public class MAIN {
    public static void main(String[] args) {
        Recipe r = new Recipe("Scone", 3);
        for(int i = 0; i < r.getNumberOfComponent(); i++){
            r.addComponent();
        }
        RecipeDisplay rd = new RecipeHackerDisplay(r, new BinarySeparator());
        rd.displayRecipe();
    }
}
