public class NormalTape extends Tape {
    public NormalTape(String title) {
        super(title);
    }

    @Override
    public float getPrice(int daysRented) {
        float price = 2;
        if (daysRented > 2) {
            price += (daysRented - 2) * 1.5;
        }

        return price;
    }
}
