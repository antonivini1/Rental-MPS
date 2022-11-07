public class Rent {
    private Rentable rentable;
    private int daysRented;

    public Rent(Rentable rentable, int daysRented) {
        this.rentable = rentable;
        this.daysRented = daysRented;
    }

    public double calculateCost() {
        return rentable.getPrice(daysRented);
    }

    public Rentable getRentable() {
        return rentable;
    }

    public int getDaysRented() {
        return daysRented;
    }
}

