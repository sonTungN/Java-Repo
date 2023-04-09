package Week3.Ex5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramRun {

    public static void main(String[] args) {
        ArrayList<Contact> list = new ArrayList<>();
        startScreen(list);
    }

    public static void startScreen(ArrayList<Contact> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Display the list of contact by name");
            System.out.println("2. Read a contact from a list");
            System.out.println("3. Create a new contact");
            System.out.println("4. Update a contact");
            System.out.println("5. Delete a contact");
            System.out.println("6. Search the contact list by a given string");
            System.out.println("7. Display the list of contacts by one of the given field");
            System.out.println("8: Exit");
            System.out.print("Your choice: ");
            int choice = sc.nextInt();
            if (choice == 7 || choice == 8) {
                System.out.println("End program !");
                break;
            }
            menu(choice, list);
        }
    }

    public static void menu(int choice, ArrayList<Contact> list) {
        switch (choice) {
            case 1:
                displayContactByName(list);
                break;
            case 2:
                readContact(list);
                break;
            case 3:
                createContact(list);
                break;
            case 4:
                updateContact(list);
                break;
            case 5:
                deleteContact(list);
                break;
            case 6:
                searchContactByGivenString(list);
                break;
        }
    }

    public static void displayContactByName(ArrayList<Contact> list) {
        if (list.size() == 0) {
            System.out.println("No contact information yet !");
        } else {
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ". " + (list.get(i).getName()));
            }
        }
    }

    public static void readContact(ArrayList<Contact> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id: ");
        int id = sc.nextInt();
        if (list.size() == 0) {
            System.out.println("No contact yet !");
        } else {
            System.out.println((list.get(id).toString()));
        }

    }

    public static void createContact(ArrayList<Contact> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter new name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        list.add(new Contact(name, phone, email, address));
    }

    public static void updateContact(ArrayList<Contact> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        if (id < list.size()) {
            int choice;
            do {
                System.out.println("1. Update name");
                System.out.println("2. Update phone");
                System.out.println("3. Update email");
                System.out.println("4. Update address");
                System.out.println("5. Exit");
                System.out.print("Your choice: ");
                choice = sc.nextInt();
                runUpdate(list, choice, id);
            } while (choice != 5);
        }
    }

    public static void runUpdate(ArrayList<Contact> list, int choice, int id) {
        Scanner sc = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.print("Enter update name: ");
                String name = sc.nextLine();
                (list.get(id)).setName(name);
                break;

            case 2:
                System.out.print("Enter update phone: ");
                String phone = sc.nextLine();
                (list.get(id)).setPhone(phone);
                break;

            case 3:
                System.out.print("Enter update email: ");
                String email = sc.nextLine();
                (list.get(id)).setEmail(email);
                break;

            case 4:
                System.out.print("Enter update address: ");
                String address = sc.nextLine();
                (list.get(id)).setAddress(address);
        }
    }

    public static void deleteContact(ArrayList<Contact> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id: ");
        int id = sc.nextInt();
        if (id < list.size()) {
            list.remove(id);
        }
    }

    public static void searchContactByGivenString(ArrayList<Contact> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter search word: ");
        String search = sc.nextLine();
        ArrayList<Integer> saveID = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String name = (list.get(i)).getName();
            if (name.contains(search)) {
                saveID.add(i);
            }
        }
        System.out.println("All valid name: ");
        for (int i = 0; i < saveID.size(); i++) {
            System.out.println(saveID.get(i) + ". " + (list.get(i)).getName());
        }
    }
}
