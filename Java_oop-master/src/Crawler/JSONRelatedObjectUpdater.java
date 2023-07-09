package Crawler;
import java.util.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JSONRelatedObjectUpdater {
    public static void main(String[] args) {
        try {
            // Đọc dữ liệu từ tệp JSON
            FileReader fileReader = new FileReader("D:\\Eclipse\\Java_oop-master\\json\\data.json");
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(fileReader);
            fileReader.close();
            Map<String, JSONObject> entityMap = new HashMap<>();

         // Duyệt qua từng thực thể trong danh sách và lưu trữ chúng trong entityMap
         for (Object object : jsonArray) {
             JSONObject entity = (JSONObject) object;
             String name = (String) entity.get("Name");
             entityMap.put(name, entity);
         }

            // Duyệt qua từng thực thể trong danh sách
         for (Object object : jsonArray) {
        	    JSONObject entity = (JSONObject) object;
        	    String currentName = (String) entity.get("Name");

        	    // Duyệt qua các trường AdditionalInfo và Description
        	    for (Object keyObj : entity.keySet()) {
        	        String key = (String) keyObj;
        	        if (entity.get(key) instanceof String) {
        	            String value = (String) entity.get(key);

        	            // Duyệt qua các thực thể có tên liên quan
        	            for (String relatedName : entityMap.keySet()) {
        	                if (value.contains(relatedName) && !currentName.equals(relatedName)) {
        	                    // Lấy id của thực thể tương ứng để gán vào related object
        	                    String relatedId = (String) entityMap.get(relatedName).get("ID");

        	                    // Gán related object là id của thực thể tương ứng
        	                    JSONArray relatedArray = (JSONArray) entity.getOrDefault("Related object", new JSONArray());
        	                    relatedArray.add(relatedId);
        	                    entity.put("Related object", relatedArray);

        	                    // Tạo liên kết hai chiều giữa các thực thể
        	                    JSONArray relatedArray2 = (JSONArray) entityMap.get(relatedName).getOrDefault("Related object", new JSONArray());
        	                    relatedArray2.add((String) entity.get("ID"));
        	                    entityMap.get(relatedName).put("Related object", relatedArray2);
        	                }
        	            }
        	        }
        	    }
        	}

            // Ghi dữ liệu đã cập nhật vào tệp JSON
            FileWriter fileWriter = new FileWriter("D:\\Eclipse\\Java_oop-master\\json\\datanew.json");
            fileWriter.write(jsonArray.toJSONString());
            fileWriter.close();

            System.out.println("Cập nhật thành công!");

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}
