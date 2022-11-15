public class OrderConverter {
    private Order order;

    public OrderConverter(Order order) {
        this.order = order;
    }

    public String asString() {
        String result = "";
        result += "Registro de Alugueis de " + order.getClient().getName() + "\n";

        for (Rent rent : order.getRents()) {
            result += rent.getRentable().getTitle() + " " + rent.calculateCost() + "\n";

        }
        result += "Valor total devido: " + order.calculateTotalCost() + "\n";
        result += "Você acumulou " + order.getBonusPoints() + " pontos de acumulador frequente\n";

        return result;
    }
}
