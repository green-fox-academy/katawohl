public class TodoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";
        // Add "My todo:" to the beginning of the todoText

        StringBuilder todoListFull = new StringBuilder(" - Buy milk\n");

        todoListFull.insert(0, "My todo:\n");

        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        todoListFull.insert(21, " - Download games\n     - Diablo");


        System.out.println(todoListFull);
        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        //System.out.println(todoText);
    }
}
