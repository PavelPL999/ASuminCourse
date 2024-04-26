package oop.interfaces.HW316;

public class MainHW316 {

    public static void main(String[] args) {
        Client client = new Client();
        client.makeTheOrder(new Waiter() {
            @Override
            public void bringTheOrder(String dish) {
                System.out.println("Принят заказ на блюдо: " + dish);
            }
        }, "fish");
    }
}
