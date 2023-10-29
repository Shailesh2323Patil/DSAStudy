package ShardhaDidi.recursion;

/* https://www.youtube.com/watch?v=xZykmhcWGuY&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=19 */
public class PlaceTiles {
    /*
    * Place Tiles of Size 1*m in a floor of size n*m.
    * Suppose Floor is 4*2 then out tile is 1*2 (1*M).
    * Suppose Floor is 4*3 then out tile is 1*3 (1*M).
    * */
    public static int placeTiles(int n, int m) {
        if(n < m) {
            return 1;
        } else if(n == m) {
            return 2;
        }

        int verticalPlacement = placeTiles(n-1, m);  // If Tile Place in Horizontal Position at First then it is (n-1)
        int horizontalPlacement = placeTiles(n-m, m); // If Tile Place in Vertical Position at First then it is (n-m)

        return verticalPlacement + horizontalPlacement;
    }

    public static void main(String args[]) {
        int n = 3, m = 2;
        System.out.println(placeTiles(n, m));
    }
}
