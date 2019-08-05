package Examples;

public class ArraySum {

    static int[] numbers = {2,4,3,5,6,7,4,3,5,6,7,4,3,2,2,23,4,34,234,324,234,234,23,432,432,423,423,423,4,234,234,32};

    public static void main(String[] args) {
        sum(numbers);
    }
    public static void sum(int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum+=arr[i];

        System.out.println("sum of array values : " + sum);
    }

}
