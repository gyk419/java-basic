package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {

        ProductOrder p1 = createOrder("두부", 2000, 2);
        ProductOrder p2 = createOrder("김치", 5000, 1);
        ProductOrder p3 = createOrder("콜라", 1500, 2);

        ProductOrder[] p ={p1,p2,p3};
        printOrder(p);
        getTotalPrice(p);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    static void printOrder(ProductOrder[] orders) {

        for (ProductOrder order : orders) {
            System.out.println(order.productName + " " + order.price + " " + order.quantity);

        }

    }

    static void getTotalPrice(ProductOrder[] orders) {
        int totalPrice = 0;
        for (ProductOrder order : orders) {totalPrice += order.price * order.quantity;}
        System.out.println(totalPrice);
    }
}
