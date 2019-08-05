package GFG;



import org.testng.annotations.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MaximumDigitBetweenPrime {

  // Find the maximum digit occurred in a range of prime numbers
  //
  // Eg: Range ( 21 -40) –>Prime numbers are 23,29,31,37,39 ( 2 occurs 2 times, 3 occurs 4 times, 1
  // and 7 occur 1 time and 9 occurs 2 times ->Answer is 3)

  //
  //    Some facts:
  //
  //    The only even prime number is 2. All other even numbers can be divided by 2.
  //    If the sum of a number's digits is a multiple of 3, that number can be divided by 3.
  //    No prime number greater than 5 ends in a 5. Any number greater than 5 that ends in a 5 can
  // be divided by 5.
  //    Zero and 1 are not considered prime numbers.
  //            Except for 0 and 1, a number is either a prime number or a composite number. A
  // composite number is defined as any number, greater than 1, that is not prime.
  //    To prove whether a number is a prime number, first try dividing it by 2, and see if you get
  // a whole number. If you do, it can't be a prime number. If you don't get a whole number, next
  // try dividing it by prime numbers: 3, 5, 7, 11 (9 is divisible by 3) and so on, always dividing
  // by a prime number (see table below).
  //

    static int m = 10;
    static int n = 99;
static int flag=0;
    Map<String, Integer> items = new HashMap<>();

@Test
    public void testPrime(){
        for(int i = m;i<=n;i++){
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=0;
                    break;
                }else{
                    flag = 1;
                }
            }
            if(flag==1){
        System.out.println(i+ " is a prime");

        String k1 =i/10+"";
        String k2 =i%10+"";

        if(items.containsKey(k1)){
            items.get(k1);
            items.put(k1,items.get(k1)+1);
        }
        if(items.containsKey(k2)){
                    items.get(k2);
                    items.put(k2,items.get(k2)+1);
        }
        if(!items.containsKey(k1)){
           items.put(k1,1);
        }
                if(!items.containsKey(k2)){
                    items.put(k2,1);
                }
            }
        }
    int maxValueInMap=(Collections.max(items.values()));
    items.forEach(
        (k, v) -> {
          if (v == maxValueInMap) {
            System.out.println(k+" is having max occurance :" +v);
          }
            System.out.println("Item : " + k + " Count : " + v);
        });
}
    }


