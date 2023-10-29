package ShardhaDidi.string;

public class StringDeclaration {
    public static void main(String[] args) {
//        String firstName = "Tony";
//        String secondName = "Stark";
//
//        String fullName = firstName + " " + secondName;
//        System.out.println(fullName);

//        String firstName = "Tony";
//        String secondName = "Stark";
//
//        String fullName = firstName + " " + secondName;
//        System.out.println(fullName.length());

        String firstName = "Tony";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName;

        for(int i=0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }
}
