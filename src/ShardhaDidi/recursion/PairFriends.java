package ShardhaDidi.recursion;

/*
* Find the number of ways in which you can invite n people
* to your party, single or in pairs
* */
public class PairFriends {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(callGuest(n));
    }

    public static int callGuest(int n) {
        if(n<=1) {
            return 1;
        }

        int way1 = callGuest(n-1);
        int way2 = (n-1) * callGuest(n-2);

        return way1 + way2 ;
    }
}
