import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
class Main {
  public static void main(String[] args) {

  System.out.println("Dunder Mifflin Customer Relationship Management System\n\n");
  Scanner user_input = new Scanner(System.in);
  LocalDateTime clock = LocalDateTime.now();
  DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
  String formattedDate = clock.format(formattedTime);
  
  System.out.println("System Log-In:");
  System.out.println("Enter your name");
  Person p = new Person();
  p.setName(user_input.nextLine());
  System.out.println("Enter your job title");
  Employee j = new Employee();
  j.setTitle(user_input.nextLine());
  System.out.println(j.getTitle() + ": " +  p.getName());
  System.out.println("Enter your phone number");
  Person num = new Person();
  num.setNumber(user_input.nextLong());
  System.out.println("Phone Number: " + num.getNumber()+"\n");

  System.out.println("Time In: " + formattedDate +"\n");
    
  try {
    boolean dmStatus = true;
    loop: while (dmStatus = true) {
    System.out.println("Enter [1] to create a file / update file | Enter [2] to read the file | Enter [3] to view a list of customers | Enter [4] to view a list of employees | Enter [5] to view a list of order numbers | Enter [6] to exit\n");
    int option = user_input.nextInt();
    switch (option) {
      case 1: 
        Employee e = new Employee();
        e.printIt();
        System.out.println("Enter [1] to update the information in the file | Enter [2] to exit.");
        int option2 = user_input.nextInt();
        switch(option2) {
          case 1:
          Employee u = new Employee();
          u.updateData();
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
        Employee l = new Employee();
        l.employeesList();
        break;
      case 5: 
        Employee o = new Employee();
        o.ordersList();
        break;
      case 6:
        System.out.println("Exited");
        System.out.println("System Logged Out");
        break loop;
      }   
    }
  } catch (Exception e) {
      System.out.println("An error occurred. Enter a number from 1-6.");
    }
  }
}