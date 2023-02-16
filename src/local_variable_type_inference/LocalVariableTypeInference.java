package local_variable_type_inference;

import java.util.Map;

public class LocalVariableTypeInference {

    public static void main(String[] args) {
        // before java 10 we used to declare local variable like following
        String name = "Raj Aryan";
        Map<String, Integer> nameSalMap = Map.of("Raj", 100, "Aryan", 200, "Rahul", 300);

        // after java 10
        var nameIn10 = "Anu";
        var nameSalMapIn10 = Map.of("Raju", 1000, "Kaju", 200, "Baaju", 300);

        // illegal use of var

//        var won't work without the initializer
//        var illegalVariable;

//        nor would it work if initialized with null
//        var emptyList = null;

//        It won't work for non-local variables
//        public var = "hello"

//        Lambda expression needs explicit target type, and hence var cannot be used
//        var p = (String s) -> s.length()>10;
    }
}
