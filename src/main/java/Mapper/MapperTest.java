package Mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class MapperTest {

    public static void main(String[] args) throws IOException {


        ObjectMapper mapper = new ObjectMapper();

        String jsonString = "{\n    \"id\": 1414870,\n    \"operatorAccountId\": 1430676,\n    \"instapayMode\": \"shefali\",\n    \"modeOfPayments\": \"NEFT\",\n    \"frequency\": \"DAILY\",\n    \"retainMinAmount\": null,\n    \"isActive\": 1\n}";

        SampleMapper sm = mapper.readValue(jsonString, SampleMapper.class);
        System.out.println(sm.getInstapayMode());

    }

}
