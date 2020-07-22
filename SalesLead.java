class SalesLead extends Customer{
  String[] salesLeads = {"University of Scranton", "Marywood University",
"Penn State Scranton","Moses Taylor Hospital","Geisinger Community Medical Center","Arlington Industries","S & S Tools & Supplies","Linwood Nursing and Rehab Center","Shindo Corporation","Awake LLC","Danaken Design"};
 
  public void SalesLeadsList() {
    for (String i : salesLeads) {
        System.out.println("Sales Lead: " + i);
        }
  }
}