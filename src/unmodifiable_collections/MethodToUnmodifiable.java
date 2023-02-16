package unmodifiable_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodToUnmodifiable {

    public static void main(String[] args) {
        List<String> bhojpuriActor = new ArrayList<>();
        bhojpuriActor.add("Manoj Tiwari");
        bhojpuriActor.add("Dinesh Lal Yadav");
        bhojpuriActor.add("Kunal");
        bhojpuriActor.add("Khesari Yadav");
        bhojpuriActor.add("Pawan Singh");

        List<String > bhojpuriActorWithLongName = bhojpuriActor.stream()
                .filter(s -> s.length()>5)
                .collect(Collectors.toUnmodifiableList());
        bhojpuriActorWithLongName.forEach(System.out::println);

        // throws java.lang.UnsupportedOperation exception
        //bhojpuriActorWithLongName.add("Ravi Kishan");

    }
}
