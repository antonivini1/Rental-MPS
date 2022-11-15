import Order.Order;
import Rent.Rent;
import Tape.KidsTape;
import Tape.NormalTape;
import Tape.ReleaseTape;
import Order.Client;
import Order.OrderConverter;

public class Rental {
  public static void main(String[] args) {
    Client c1 = new Client("Juliana");
    Order order = new Order(c1);

    order.addRent(new Rent(new NormalTape("O Exorcista"), 3));
    order.addRent(new Rent(new NormalTape("Men in Black"), 2));
    order.addRent(new Rent(new ReleaseTape("Jurassic Park III"), 3));
    order.addRent(new Rent(new ReleaseTape("Planeta dos Macacos"), 4));
    order.addRent(new Rent(new KidsTape("Pateta no Planeta dos Macacos"), 10));
    order.addRent(new Rent(new KidsTape("O Rei Leao"), 30));

    System.out.println(new OrderConverter(order).asString());
  }
}
