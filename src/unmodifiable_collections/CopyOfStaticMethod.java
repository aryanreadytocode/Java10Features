package unmodifiable_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CopyOfStaticMethod {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        List<Integer> copyList = List.copyOf(list);

//        any attempt to modify such collection woudl result in
//        UnsupportedOperationException at runtime.
//        copyList.add(10);

    }
}
