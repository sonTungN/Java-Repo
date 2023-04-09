package Week4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RecipeHackerDisplay extends RecipeDisplay{
    public RecipeHackerDisplay() {
    }

    public RecipeHackerDisplay(Recipe recipe, Separator separator) {
        super(recipe, separator);
    }

    @Override
    public void displayRecipe(){
        ArrayList<RecipeComponent> list = super.getRecipe().getComponentList();
        list.sort(new compareAmountDigit());
        for(RecipeComponent e: list){
            e.displayRecipeComponent();
            System.out.println(super.getSeparator().separate());
        }
    }

}

class compareAmountDigit implements Comparator<RecipeComponent>{
    @Override
    public int compare(RecipeComponent o1, RecipeComponent o2){
        String str1 = Float.toString(o1.getAmount());
        String str2 = Float.toString(o2.getAmount());
        int result = str1.compareTo(str2);
        if(result > 0){
            return 1;
        } else if (result < 0){
            return -1;
        }
        return 0;
    }
}
