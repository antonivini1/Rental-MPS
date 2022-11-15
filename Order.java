import java.util.*;

public class Order {

    private Client client;
    private List<Rent> rents;
    public Order(Client client) {
        this.client = client;
        rents = new ArrayList<>();
    }

    public void addRent(Rent rent) {
        rents.add(rent);
    }

    public Client getClient() {
        return client;
    }

    public List<Rent> getRents() {
        return rents;
    }

    public double calculateTotalCost() {
        double totalCost = 0;
        for (Rent rent : rents) {
            totalCost += rent.calculateCost();
        }
        return totalCost;
    }
    public double getBonusPoints() {
        double bonusPoints = 0;
        for (Rent rent : rents) {
            bonusPoints += rent.calculateBonus();
        }
        return bonusPoints;
    }

}
