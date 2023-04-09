package SampleAssessment.TestSem3_2022.Ex2;

public class Person {
    private String SSN;
    private String name;
    private char gender;
    private Person spouse;

    public Person(String SSN, String name, char gender) {
        this.spouse = null;
        this.SSN = SSN;
        this.name = name;
        this.gender = gender;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("SSN: " + SSN);
        System.out.println("Gender " + gender);
        System.out.println("--------------------------------");
    }

    public void marry(Person another){
        if(this.spouse == null){
            if(another.spouse == null){
                if(this != another && this.gender != another.gender){
                    this.spouse = another;
                    another.spouse = this;
                } else {
                    System.out.println("Can't marry !");
                }
            } else {
                System.out.println("Can't marry !");
            }
        } else {
            System.out.println("Can't marry !");
        }
    }
    public void divorce(){
        if(this.spouse == null){
        } else {
            Person x = this;
            Person y = x.spouse;

            x.spouse = null;
            y.spouse = null;
        }
    }

    public void displaySpouse(){
        if(this.spouse == null){
            System.out.println("There is no spouse");
        } else {
            Person y = this.spouse;
            System.out.println("Person: " + this.name);
            System.out.println("Spouse: " + y.name);
            y.display();
        }
    }
}
