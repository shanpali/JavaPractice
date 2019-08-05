package Examples;

public class ArrayExampleuse {


    public String run(){
        return "shantanu";
    }

    public static void main(String[] args) {


        ArrayExample[] arr = new ArrayExample[3];
        arr[0] = new ArrayExample(1, "shefali");
        arr[1] = new ArrayExample(2, "kamini");
        arr[2] = new ArrayExample(3, "kutti");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].emp +" "+ arr[i].rollnumber);
        }

    }

    public void setEffectiveDate(String effectiveDate) {

        System.out.println("shefali");
    }
}
