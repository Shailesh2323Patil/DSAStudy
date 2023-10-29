package ShardhaDidi.stringBuilder;

public class ReverseString {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("HelloWorld");

        for(int i=0; i<stringBuilder.length() / 2; i++) {
            int first = i;
            int last = stringBuilder.length() - i - 1;

            char firstChar = stringBuilder.charAt(first);
            char lastChar = stringBuilder.charAt(last);

            stringBuilder.setCharAt(first, lastChar);
            stringBuilder.setCharAt(last, firstChar);
        }

        System.out.println(stringBuilder);
    }

}
