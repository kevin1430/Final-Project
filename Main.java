import java.util.Scanner;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    System.out.println("Customer Relationship Management\n\n");
    Scanner user_input = new Scanner(System.in);
    ArrayList<String> people = new ArrayList<String>();
    people.add("Henry");
    System.out.println(people.get(0));

    Person p = new Person();
    p.setName("Mark");

    System.out.println(p.getName());
    System.out.println("Enter your first name and last name:");
    String name = user_input.nextLine();

     System.out.println("Name: " + name);
  }
}