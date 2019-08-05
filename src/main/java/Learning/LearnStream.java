package Learning;

import org.testng.annotations.Test;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStream {

    @Test
    public void testMap(){

List<Integer> numbers  = Arrays.asList(2,3,4,5,6,7,8);
List<Integer> square = numbers.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
    }

    @Test
    public void testFilter(){

        List<Integer> numbers  = Arrays.asList(2,3,4,5,6,7,8);
        List<Integer> square = numbers.stream().filter(x->x%2==0).collect(Collectors.toList());
        System.out.println(square);
    }


    @Test
    public void testfilter2(){

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
    }

    @Test
    public void testsorted(){

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
}
