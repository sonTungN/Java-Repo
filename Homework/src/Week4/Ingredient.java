package Week4;

import java.util.Scanner;

public class Ingredient {
    private String name;
    private String measureUnit;
    private String comment;

    public Ingredient() {
        this.name = null;
        this.measureUnit = null;
        this.comment = null;
    }

    public Ingredient(String name, String measureUnit, String comment) {
        this.name = name;
        this.measureUnit = measureUnit;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static Ingredient createIngredient(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingredient's name: ");
        String name = sc.nextLine();
        System.out.print("Unit: ");
        String measureUnit = sc.nextLine();
        System.out.print("Note: ");
        String comment = sc.nextLine();
        if(comment.length() == 0){
            return new Ingredient(name, measureUnit, "No comment");
        }
        return new Ingredient(name, measureUnit, comment);
    }

    public void displayIngredient(){
        System.out.println("Name: " + name + ", Unit: " + measureUnit);
        System.out.println("Note: " + comment);
    }
}
