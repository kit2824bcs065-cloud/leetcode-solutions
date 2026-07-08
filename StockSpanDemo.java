import java.util.*;

public class StockSpanDemo {

    private Stack<int[]> stack;

    public StockSpanDemo() {
        stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }

    public static void main(String[] args) {

        StockSpanDemo stock = new StockSpanDemo();

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        System.out.println("Stock Prices:");
        System.out.println(Arrays.toString(prices));

        System.out.println("\nSpan Values:");

        for (int price : prices) {
            System.out.println("Price = " + price + "  Span = " + stock.next(price));
        }
    }
}