import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    System.out.println("Dunder Mifflin Customer Relationship Management System\n\n");
    Scanner user_input = new Scanner(System.in);
    boolean dmStatus = true;
    loop: while (dmStatus = true) {
      System.out.println("Enter [1] to create a file | Enter [2] to read a file | Enter [3] to view a list of customers | Enter [4] to exit\n");
    int option = user_input.nextInt();
    switch (option) {
      case 1: 
        Employee e = new Employee();
        e.printIt();
        System.out.println("Enter [1] to write information to the file | Enter [2] to exit.");
        int option2 = user_input.nextInt();
        switch(option2) {
          case 1:
          Employee w = new Employee();
          w.writeThat();
          break;
          case 2: 
          System.out.println("Exited");
          break;
        }
    
        break;
      case 2: 
        Employee r = new Employee();
        r.readIt();
        break;
      case 3: 
        Customer c = new Customer();
        c.customerList();
        System.out.println("Enter [1] to view a list of sales leads | Enter [2] to exit.");
        int option3 = user_input.nextInt();
        switch(option3) {
          case 1:
          SalesLead s = new SalesLead();
          s.SalesLeadsList();
          break;
          case 2: 
          System.out.println("Exited");
          break;
        }
        break;
      case 4:
        System.out.println("Exited");
        break loop;
      }   
    }
    


    ArrayList<String> people = new ArrayList<String>();
    people.add("Henry");
    System.out.println(people.get(0));

    String[] employees = {"Michael Scott", "Dwight Schrute", "Jim Halpert", "Pam Halpert", "Erin Hannon", "Andy Bernard", "Angela Martin","Kevin Malone","Creed Bratton","Toby Flenderson","Oscar Martinez"};

    int[] orderNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    System.out.println("Order number: " + orderNum[1]); 
    
    String[] numStrings = {"1", "2"};
    System.out.println(numStrings[1]);

    Person p = new Person();
    p.setName("Mark");
    p.setName("James");
    System.out.println(p.getName());
    for (String i : employees) {
        System.out.println("Employee: " + i);
        }
    Person num = new Person();
    num.setNumber(2723652978L);
    System.out.println("Phone Number: " + num.getNumber());


    Employee j = new Employee();
    j.setTitle("Sales");
    System.out.println(j.getTitle() + ": " +  p.getName());
    
    
  }
}