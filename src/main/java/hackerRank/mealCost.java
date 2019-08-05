package hackerRank;

public class mealCost {


    static void solve(double meal_cost, int tip_percent, int tax_percent) {

        double tip = meal_cost*tip_percent*0.01;
        double tax = meal_cost*tax_percent*0.01;


        double totalCost = (meal_cost + tip + tax);
        System.out.println(Math.round(totalCost));


    }


    public static void main(String[] args) {
        double meal_cost = 12.00;


        int tip_percent = 20;


        int tax_percent = 8;


        solve(meal_cost, tip_percent, tax_percent);

    }
}
