package Learning;

class StrConvert{


    public static int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int fib(int n)
    {
        int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }

        return b;

    }
    public static void main(String []args){
//        String strTest = "100";
//        int iTest = Integer.parseInt(strTest);
//        System.out.println("Actual String:"+ strTest);
//        System.out.println("Converted to Int:" + iTest);
//        //This will now show some arithmetic operation
//        System.out.println("Arithmetic Operation on Int: " + (iTest/4));

        System.out.println(fib(10));
    }
}