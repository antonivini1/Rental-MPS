package Tape;

public class ReleaseTape extends Tape {
    public ReleaseTape(String title) {
        super(title);
    }

    @Override
    public double getPrice(int daysRented) {
       return daysRented * 3;
    }

    @Override
    public double getBonus(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
