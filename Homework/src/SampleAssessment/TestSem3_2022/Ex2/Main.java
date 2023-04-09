package SampleAssessment.TestSem3_2022.Ex2;

public class Main {
    public static void main(String[] args) {
        Person anna = new Person("48", "Anna", 'F');
        Person mane = new Person("39", "Mane", 'M');
        Person carol = new Person("55", "Carol", 'F');

//        anna.display();

//        anna.marry(carol);
//        anna.displaySpouse();

//        anna.marry(mane);
//        mane.displaySpouse();

        anna.marry(mane);
        mane.divorce();
        mane.marry(carol);
        carol.displaySpouse();
    }
}
