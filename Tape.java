abstract class Tape {

    private String title;
    public Tape(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public abstract float getPrice(int daysRented);
}

