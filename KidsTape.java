public class KidsTape extends Tape {

    public KidsTape(String title) {
        super(title);
    }

    @Override
    public float getPrice(int daysRented) {
        float price = 1.5F;
        if (daysRented > 3) {
            price += (daysRented - 3) * 1.5;
        }

        return price;
    }
}
