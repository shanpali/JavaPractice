package hackerRank;

public class timeConversion {

    static String timeConversion(String s) {
        String time24=null;
        int sL = s.length();
        int hr1 = Integer.parseInt(s.substring(0,2));
        String hr2 = s.substring(0,2);
        String am_pm = s.substring(sL-2,sL);
        String remaining = s.substring(2,sL-2);
        if(am_pm.equals("PM") && hr1!=12) {
            hr1 = hr1 + 12;
            time24 = hr1+remaining;
        }else if(am_pm.equals("PM") && hr1==12){
            time24 = "12"+remaining;
        }else if(am_pm.equals("AM") && hr1==12){
            time24 = "00"+remaining;
        }
        else if((am_pm.equals("AM") && hr1==0)){
            time24 = "00"+remaining;
        }else if((am_pm.equals("AM") && hr1!=0)){
            time24 = hr2+remaining;
        }
        return time24;
    }


    public static void main(String[] args){

        String s = "12:40:22PM";
        String result = timeConversion(s);
        System.out.println(result);

    }
}


