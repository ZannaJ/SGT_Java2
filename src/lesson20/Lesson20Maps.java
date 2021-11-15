package lesson20;

import java.util.HashMap;
import java.util.Map;

public class Lesson20Maps {

    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<String, Integer>();

        students.put("Zanna", 32);
        students.get("Zanna"); // 32
        students.containsKey("Zanna"); // true
        students.containsValue(32); // true

        students.put("Zanna", 99);

    }

}