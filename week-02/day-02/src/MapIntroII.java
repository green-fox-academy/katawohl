import java.util.HashMap;

public class MapIntroII {

    public static void main(String[] args) {
        //Create a map where the keys are strings and the values are strings with the following initial values
        //
        //Key	Value
        //978-1-60309-452-8	A Letter to Jo
        //978-1-60309-459-7	Lupus
        //978-1-60309-444-3	Red Panda and Moon Bear
        //978-1-60309-461-0	The Lab

        HashMap<String, String> mapOfStrings = new HashMap<>();

        mapOfStrings.put("978-1-60309-452-8", "A Letter to Jo");
        mapOfStrings.put("978-1-60309-459-7", "Lupus");
        mapOfStrings.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        mapOfStrings.put("978-1-60309-461-0", "The Lab");

        //Print all the key-value pairs in the following format
        //
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)

        for (String key: mapOfStrings.keySet()) {
            String value = mapOfStrings.get(key);
                System.out.println(value + " (ISBN: " + key + ")");
        }
        System.out.println();

        //Remove the key-value pair with key 978-1-60309-444-3
        mapOfStrings.remove(978-1-60309-444-3);

        //Remove the key-value pair with value The Lab

        mapOfStrings.remove(mapOfStrings.containsValue("The Lab"));


        //Add the following key-value pairs to the map
        //
        //Key	Value
        //978-1-60309-450-4	They Called Us Enemy
        //978-1-60309-453-5	Why Did We Trust Him?

        mapOfStrings.put("978-1-60309-450-4", "They Called Us Enemy");
        mapOfStrings.put("978-1-60309-453-5", "Why Did We Trust Him?");

        System.out.println(mapOfStrings);

        //Print whether there is an associated value with key 478-0-61159-424-8 or not

        if (mapOfStrings.get(478-0-61159-424-8) != null){
            System.out.println("Yes, there is an associated value with key 478-0-61159-424-8");
        } else System.out.println("No, there is no value associated with key 478-0-61159-424-8");

        //Print the value associated with key 978-1-60309-453-5

        System.out.println(mapOfStrings.get(978-1-60309-453-5));

    }
}
