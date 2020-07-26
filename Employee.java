import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Employee extends Person {
 
 String[] employees = {"Michael Scott", "Dwight Schrute", "Jim Halpert", "Pam Halpert", "Erin Hannon", "Andy Bernard", "Angela Martin","Kevin Malone","Creed Bratton","Toby Flenderson","Oscar Martinez"};
 public void employeesList() {
    for (String e : employees) {
          System.out.println("Employee: " + e);
        }
    }
 String[] orderNum =  {"0001", "0002", "0003", "0004", "0005", "0006", "0007", "0008", "0009", "0010", "0011", "0012"};
  public void ordersList() {
    for (String i : orderNum) {
          System.out.println("Order: " + i);
      }
    }
    
  Scanner scan = new Scanner(System.in);
  public void printIt() {
    System.out.println("Creating a file...");
      try {
        File f = new File("datafile.txt");
        if (f.createNewFile()) {
        System.out.println("File created: " + f.getName());
        } else {
        System.out.println("File already exists.");
        }
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  }
  public void readIt() {
    System.out.println("Reading file...");
    try {
      File datafile = new File("datafile.txt");
      Scanner reader = new Scanner(datafile);
      while (reader.hasNextLine()) {
        String data = reader.nextLine();
        System.out.println(data);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  private String jobTitle; 
  public void setTitle(String newTitle) {
    jobTitle = newTitle;
  }
  public String getTitle() {
    return jobTitle;
  }

  public void updateData() {
    System.out.println("Please update your employee information.");
    System.out.println("Enter your name.");
    String writer = scan.nextLine();
    System.out.println("Enter your job title.");
    String writer1 = scan.nextLine();
    System.out.println("Enter your address.");
    String writer2 = scan.nextLine();
    System.out.println("Enter your email.");
    String writer3 = scan.nextLine();
    System.out.println("Enter your phone number.");
    long writer4 = scan.nextLong();
    try {
        FileWriter typer = new FileWriter("datafile.txt");
        typer.write("Employee: " + writer + " |");
        typer.write("Job Title: " + writer1 + " |");
        typer.write("Address: " + writer2 + " |");
        typer.write("Email: " + writer3 + " |");
        typer.write("Phone Number: " + writer4 + " |");
        typer.close();
        System.out.println("Successfully wrote to the file.");
      } catch (IOException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }
  }
}
