package utils;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {
    private Properties props = new Properties();

    public PropertyUtils(String path) {

        loadPropertyFile(path);
    }

    public void loadPropertyFile(String propertyFileName) {
        try {
            props.load(new FileInputStream(propertyFileName));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            Assert.fail("Unable to load file!", e);
            // e.printStackTrace();
        }
    }

    public String getProperty(String propertyKey) {
        String propertyValue = props.getProperty(propertyKey.trim());

        if (propertyValue == null || propertyValue.trim().length() == 0) {
            // Log error message
        }

        return propertyValue;
    }

    public void setProperty(String propertyKey, String value) {
        props.setProperty(propertyKey, value);
    }

    public JsonObject getJsonObjectFromFile(String fileName) throws FileNotFoundException {
        // giving the JSON file path
        String name = fileName;
        JsonObject jsonObject = null;
        JsonParser parser = new JsonParser();
        try {
            jsonObject = parser.parse(new FileReader(name)).getAsJsonObject();
        } catch (Exception e) {
            e.printStackTrace();
            throw new FileNotFoundException("Could not find the Requested json file");
        }
        // returning the JSON object
        return jsonObject;
    }

}
