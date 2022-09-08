package day62_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestScenario {
    public static void main(String[] args) {
        List<Map<String, String>> data = new ArrayList<>();
        data.add(helper("James", null, null));
        data.add(helper("Jamie", "20", "IL"));
        data.add(helper(null,null,null));
        data.add(helper(null,"30","VA"));

        // Scenario : Database should not have null inputs
        System.out.println(data);
        for (Map<String, String> each : data){ // iterates through the ArrayList
            for (String key : each.keySet());

        }

    }

    public static Map<String, String> helper(String v1, String v2, String v3){
        Map<String, String> map = new HashMap<>();
        map.put("NAME", v1);
        map.put("AGE", v2);
        map.put("STATE", v3);
        return map;
    }
}
