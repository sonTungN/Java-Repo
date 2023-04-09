package Week4;

import java.util.ArrayList;

public class RecipeCasualDisplay extends RecipeDisplay{
    public RecipeCasualDisplay(Recipe recipe, Separator separator) {
        super(recipe, separator);
    }

    @Override
    public void displayRecipe(){
        ArrayList<RecipeComponent> list = super.getRecipe().getComponentList();
        System.out.println(super.getRecipe().getName() + "    (Recipe)");
        for(RecipeComponent e: list){
            e.displayRecipeComponent();
            System.out.println(super.getSeparator().separate());
        }
    }
}
