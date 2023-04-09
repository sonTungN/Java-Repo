package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RecipeSeriousDisplay extends RecipeDisplay{
    public RecipeSeriousDisplay(Recipe recipe, Separator separator) {
        super(recipe, separator);
    }

    @Override
    public void displayRecipe(){
        ArrayList<RecipeComponent> list = super.getRecipe().getComponentList();
        list.sort(new compareAmount());
        System.out.println(super.getRecipe().getName() + "    (Recipe)");
        for(RecipeComponent e: list){
            e.displayRecipeComponent();
            System.out.println(super.getSeparator().separate());
        }
    }
}

class compareAmount implements Comparator<RecipeComponent>{
    @Override
    public int compare(RecipeComponent o1, RecipeComponent o2){
        if(o1.getAmount() > o2.getAmount()){
            return 1;
        } else if (o1.getAmount() < o2.getAmount()){
            return -1;
        }
        return 0;
    }
}
