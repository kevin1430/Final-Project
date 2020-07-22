import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException; 

public class Employee extends Person {
 /*ArrayList<String> ordersList = new ArrayList<String>();
    public void addOrders(String orders) {
      ordersList.add(orders);
    }
    public ArrayList getOrdersList() {
      return this.ordersList; 
        */
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
  public void writeThat() {
    System.out.println("Enter information");
    String writer = scan.nextLine();
      try {
        FileWriter typer = new FileWriter("datafile.txt");
        typer.write(writer);
        typer.close();
        System.out.println("Successfully wrote to the file.");
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
}
