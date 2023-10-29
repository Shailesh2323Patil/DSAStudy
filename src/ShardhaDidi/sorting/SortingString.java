package ShardhaDidi.sorting;

/**
 * Place Smallest Character At First
 * */
public class SortingString {
    public static void main(String[] args) {
        String name = "JAVA";

        char[] data = name.toCharArray();

        for(int i=0; i<data.length; i++) {

            for(int j=i+1; j<data.length; j++) {

                if(data[i] > data[j]) {
                    char temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        System.out.println(new String(data));
    }
}
