package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int totalCount = sc.nextInt();
        sc.nextLine(); //에러 방지용

        ProductOrder[] p = new ProductOrder[totalCount];
        for(int i=0;i<totalCount;i++){
            System.out.println((i+1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();

            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine();

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            p[i] = createOrder(productName, price, quantity);
        }

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
