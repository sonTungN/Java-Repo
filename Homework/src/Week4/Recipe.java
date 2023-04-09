package Week4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Recipe {
    private String name;
    private ArrayList<RecipeComponent> componentList;
    private int numberOfComponent;
    private static double countRecipe = 0;

    public Recipe() {
        this.name = null;
        this.componentList = null;
    }

    public Recipe(String name, int numberOfComponent) {
        this.name = name;
        this.numberOfComponent = numberOfComponent;
        this.componentList = new ArrayList<>();
        countRecipe++;
    }

    public int getNumberOfComponent() {
        return numberOfComponent;
    }

    public void setNumberOfComponent(int numberOfComponent) {
        this.numberOfComponent = numberOfComponent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<RecipeComponent> getComponentList() {
        return componentList;
    }

    public void setComponentList(ArrayList<RecipeComponent> componentList) {
        this.componentList = componentList;
    }

    public static double getCountRecipe() {
        return countRecipe;
    }

    public void addComponent(){
        System.out.println("ADDING COMPONENT...");
        componentList.add(RecipeComponent.createRecipeComponent());
    }

    public void displayRecipe(){
        System.out.println(name + "    (Recipe)");
        for(RecipeComponent e: componentList){
            e.displayRecipeComponent();
            System.out.println("----------------------------");
        }
    }
}
