public class Client {
  private String name;
  private RentedTapes rentedTapes;

  public Client(String name, RentedTapes rentedTapes) {

    this.name = name;
    this.rentedTapes = rentedTapes;
  }

  public String getName() { return name; }

  public String getStatement() {
    new ExpensesStatement().extrato(rentedTapes);
  }

}

