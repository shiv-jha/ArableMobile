package support_mobile;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

import static support_mobile.World.jsonReader;

public class JsonReader {

    private String mobileJson = "data/translations.json";

    // Reading the JSON file
    public JSONObject jsonFileReader(String jsonFilePath) throws Exception {
        // JSON parser object
        JSONParser jsonParser = new JSONParser();
        // Read the JSON file
        FileReader reader = new FileReader(jsonFilePath);
        // Read and parse the JSON object
        JSONObject json = (JSONObject) jsonParser.parse(reader);
        return json;
    }

    // Reading the SAPI payloads
    public JSONObject getMobileJsonPayload(String keyName) throws Exception {
        JSONObject json = jsonReader.jsonFileReader(mobileJson);
        // Get the key value
        JSONObject payLoad = (JSONObject) json.get(keyName);
        return payLoad;
    }

    public String getValueFromKey(JSONObject jsonData, String keyName){
        String value =  (String) jsonData.get(keyName);
        return value;
    }
}
