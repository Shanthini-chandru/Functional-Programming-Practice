import java.util.List;
import java.util.function.Function;

/*
*
* 2. Name Formatter
      *Using a Function<String, String>
      *Convert every name to uppercase.
      * Then print the result.
* */

public class FunctionPractice {
    List<String> names = List.of("shanthini","rahul","abi","vijay","geetha");

    void nameFormatter(){
        Function<String, String> upperCased = String::toUpperCase;

        names.stream()
                .map(upperCased)
                .forEach(System.out::println);

//        for( String s:names ){
//            System.out.println(upperCased.apply(s));
//        }

    }

    static void main(){
        FunctionPractice fp = new FunctionPractice();
        fp.nameFormatter();
    }
}
