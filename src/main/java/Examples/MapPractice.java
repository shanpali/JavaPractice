package Examples;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.internal.mapping.GsonMapper;
import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapPractice {

/*

{
  "employee": [
    {
      "name": "x",
      "id": "1"
    },
    {
      "name": "y",
      "id": "1"
    }
  ]
}
 */

static Map<String,String> inmap = new HashMap<>();

public static void mapCreation(){

    String message;
    JSONObject json = new JSONObject();

    JSONArray array = new JSONArray();


    for(int i=0;i<30;i++) {
        inmap = new HashMap<>();

        inmap.put("name", "x"+i);
        inmap.put("id", i+"");
        array.add(inmap);
    }

    json.put("employee", array);

    message = json.toString();
    System.out.println(message);


}


    public static void main(String[] args) {
        mapCreation();


    }




}
