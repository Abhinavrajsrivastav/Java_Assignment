import java.util.*;

public class SortedMapByValue {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(5, "Rahul");
        map.put(7, "Lakshman");
        map.put(1, "Ram");
        map.put(4, "Krrish");
        map.put(2, "Lakshay");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        System.out.print("{");
        for (Map.Entry<Integer, String> entry : list) {
            System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
        }
        System.out.println("}");
    }
}
