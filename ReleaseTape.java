public class ReleaseTape extends Tape {
    public ReleaseTape(String title) {
        super(title);
    }

    @Override
    public float getPrice(int daysRented) {
       return daysRented * 3;
    }
}
