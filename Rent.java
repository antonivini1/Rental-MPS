public class Rent {
  private Tape tape;
  private int daysRented;

  public Rent(Tape tape, int daysRented) {
    this.tape = tape;
    this.daysRented = daysRented;
  }

  public Tape getTape() {
    return tape;
  }

  public int getDaysRented() {
    return daysRented;
  }
}

