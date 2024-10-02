import java.util.ArrayList;

public class P2_BoxingUnboxing {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        // boxing
        List.add(10);
        List.add(20);
        List.add(30);
        List.add(40);
        List.add(50);

        // calculate sum of element
        int sum = calculateSum(List);

        // display
        System.out.println("Sum of element in the list : " + sum);

    }

    public static int calculateSum(ArrayList<Integer> list) {

        int sum = 0;
        // unboxing
        for (Integer num : list) {
            sum += num;
        }

        return sum;
    }

}
