package GFG;

import org.testng.annotations.Test;

public class validateIP {
    String ip = "1.110.230.255";

    @Test
    public void isvalidIP(){
        String[] ch = ip.split("\\.");
        boolean flag = false;
        for(int i =0; i <ch.length;i++){
            int a = Integer.parseInt(ch[i]);
            if(a>=0 && a<=255){
        flag = true;
            }else{
                flag = false;
            }
        }
        if(flag){
            System.out.println("This is a valid ip");
        }else{
            System.out.println("This is a Invalid ip");
        }

    }

}
