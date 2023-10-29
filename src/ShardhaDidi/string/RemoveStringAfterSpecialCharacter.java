package ShardhaDidi.string;

/*
* Input an email from the user. You have to create a username from the email by deleting
* the part that comes after ‘@’. Display that username to the user.
* Example :
* email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
* email = “helloWorld123@gmail.com”; username = “helloWorld123”
* */

import java.util.Scanner;

public class RemoveStringAfterSpecialCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Email : ");
        String emailId = scanner.next();

        String userName = new String();

        for(int i=0; i<emailId.length(); i++) {
            if(emailId.charAt(i) == '@') {
                break;
            }
            else {
                userName += emailId.charAt(i);
            }
        }

        System.out.print("Your UserName is : ");
        System.out.println(userName);
    }
}
