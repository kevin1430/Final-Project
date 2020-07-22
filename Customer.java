public class Customer extends Person {
  private String[] customers = {"Christian - Lackawanna County Township", "Jan Levinson - Scranton White Pages", "Tom - Blue Cross", "Daniel Schofield - HarperCollins Publishing"};
  public void setCustomers(String[] newCustomers) {
    customers = newCustomers;
  }
  public void customerList() {
    for (String i : customers) {
        System.out.println("Customer: " + i);
        }
  }
  
}