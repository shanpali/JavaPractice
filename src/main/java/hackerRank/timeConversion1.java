package hackerRank;

public class timeConversion1 {

    static String timeConversion(String s) {
        String time24=null;
        int sL = s.length();

        String hr = s.substring(0,2);
        String am_pm = s.substring(sL-2,sL);
        String remaining = s.substring(2,sL-2);

        if(am_pm.equals("PM")) {
            switch (hr) {
                //Case statements
                case "01":
                    hr ="13";
                    break;
                case "02":
                    hr ="14";
                    break;
                case "03":
                    hr ="15";
                    break;
                case "04":
                    hr ="16";
                    break;
                case "05":
                    hr ="17";
                    break;
                case "06":
                    hr ="18";
                    break;
                case "07":
                    hr ="19";
                    break;
                case "08":
                    hr ="20";
                    break;
                case "09":
                    hr ="21";
                    break;
                case "10":
                    hr ="22";
                    break;
                case "11":
                    hr ="23";
                    break;
                case "12":
                    hr ="00";
                    break;
                //Default case statement
                default:
                    System.out.println("Incorrect time format");
            }


        }

time24 = hr+remaining;



        return time24;
    }


    public static void main(String[] args){

        String s = "07:05:45PM";
        String result = timeConversion(s);
        System.out.println(result);

    }
}


