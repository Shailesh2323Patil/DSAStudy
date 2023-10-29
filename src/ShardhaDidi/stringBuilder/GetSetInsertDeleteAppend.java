package ShardhaDidi.stringBuilder;

public class GetSetInsertDeleteAppend {
    public static void main(String[] args) {
        /*
        * Get Operation
        * Get the Index.
        * */
        StringBuilder stringBuilder = new StringBuilder("Apna College");
        System.out.println(stringBuilder.charAt(3));

        /*
        * Set Operation
        * Replace the Character
        * */
        StringBuilder stringBuilder1 = new StringBuilder("Tony");
        stringBuilder1.setCharAt(0, 'S');
        System.out.println(stringBuilder1);

        /*
        * Insert Operation
        * Insert a Character at Some Index
         * */
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        stringBuilder2.insert(5, " Java");
        System.out.println(stringBuilder2);

        /*
        * Delete Operation
        * Delete char at some Index
        * */
        StringBuilder stringBuilder3 = new StringBuilder("CELLO");
        System.out.println(stringBuilder3);
        stringBuilder3.delete(2,4);
        System.out.println(stringBuilder3);

        /*
        * Append Operation
        * Append means to add something at the end.
        * */
        StringBuilder stringBuilder4 = new StringBuilder("Tony");
        stringBuilder4.append(" Stark");
        System.out.println(stringBuilder4);

        /*
        * Length
        * */
        StringBuilder stringBuilder5 = new StringBuilder("Tony");
        stringBuilder5.append(" Stark");
        System.out.println(stringBuilder5);

        System.out.println(stringBuilder5.length());
    }
}
