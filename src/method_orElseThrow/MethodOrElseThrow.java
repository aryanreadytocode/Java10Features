package method_orElseThrow;

import java.util.Arrays;
import java.util.List;

public class MethodOrElseThrow {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3,5,1,3,7,9);
        // if not find even element in stream of integer
        // then it will find exception
        Integer firstEven = list.stream()
                .filter(i->i%2==0)
                .findFirst()
                .orElseThrow();
        System.out.println(firstEven);
    }
}
