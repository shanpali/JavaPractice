package Examples;

import java.util.HashMap;
import java.util.Map;

//j a  v  a  2  s. c o  m
public class Main {
    public static void main(String[] args) {
        Map<String, Integer> argMap = new HashMap<String, Integer>();
        for (String arg : args) {
            Integer count = argMap.get(arg);
            argMap.put(arg, (count == null) ? 1 : count + 1);
        }
        System.out.println(argMap);
        System.out.println("Number of distinct arguments = " + argMap.size());
    }
}