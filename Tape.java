abstract class Tape implements Rentable {

    private String title;
    public Tape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice(int daysRented);
    public double getBonus(int daysRented) {
        return 1;
    }
}

