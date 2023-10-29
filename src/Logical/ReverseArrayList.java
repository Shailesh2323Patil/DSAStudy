package Logical;

import java.util.ArrayList;

public class ReverseArrayList {
	public ArrayList<Integer> reverseList(ArrayList<Integer> arrayList) {

        for(int i = 0; i < arrayList.size() / 2; i++) {

            int temp = arrayList.get(i);

            arrayList.set(i,arrayList.get(arrayList.size() - i - 1));
            arrayList.set(arrayList.size() - i - 1, temp);
        }

       return arrayList;
    }

    public static void main(String[] args) {
    	
    	ReverseArrayList res = new ReverseArrayList();
    	
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(16);
        arrayList.add(17);
        arrayList.add(18);
        arrayList.add(19);
        arrayList.add(20);

        ArrayList<Integer> reverseArrayList = res.reverseList(arrayList);

        System.out.println(reverseArrayList.toString());
    }
}
