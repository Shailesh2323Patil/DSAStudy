package ShardhaDidi.array;


/*
* YouTube Link : https://www.youtube.com/watch?v=NTHVTY6w2Co&list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop&index=11
* Notes : https://docs.google.com/document/d/1AJgDc-EdunSKVhW1fujsaZS5JfxSgzFiDlfg35ewhIA/edit
* */
public class CheckArrayAscending {
    public static void main(String[] args) {
        Integer[] array = {2,1,4,5,6,7};

        Boolean isAscending = false;

        for(int i=0; i<array.length - 1; i++) {
            if(array[i] < array[i+1]) { // Condition to check the Ascending Order
                isAscending = true;
            }
            else {
                isAscending = false;
                break;
            }
        }

        System.out.println("The Array is Ascending : "+isAscending);
    }
}
