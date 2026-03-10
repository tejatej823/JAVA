public class tightcgitoupling {

    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.placeOrder();

    }
}

class PaymentService {

    public void pay() {
        System.out.println("Payment done using Credit Card");
    }

}

class OrderService {

    PaymentService paymentService = new PaymentService(); // tight coupling

    public void placeOrder() {

        paymentService.pay();
        System.out.println("Order placed successfully");

    }

}