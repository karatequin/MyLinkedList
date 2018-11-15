import java.util.LinkedList;
public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> test = new LinkedList<Integer>();

        test.add(1);
        test.add(2);
        System.out.println(test);
        test.add(3);
        test.add(4);
        System.out.println(test.findNode(3));



    }

}