import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new linkedlist();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        System.out.println(list.getKthFromTheEnd(2));

    }
}
