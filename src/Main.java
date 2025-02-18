import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> list2 = list1.stream().filter(var -> var % 2 == 0).toList();
        double average = list2.stream().mapToDouble(Integer::doubleValue).average().orElse(0);
        System.out.println(list2);
        System.out.println("==================");
        System.out.println(average);
    }
}
