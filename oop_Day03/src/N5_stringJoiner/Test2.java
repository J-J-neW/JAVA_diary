package N5_stringJoiner;

import java.util.StringJoiner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(gerArrayData(new int[]{11,22,33}));
    }

    public static String gerArrayData(int[] arr){
        if(arr == null){
            return null;
        }
        StringJoiner str = new StringJoiner(",","[","]");
        for (int i = 0; i < arr.length; i++) {
            str.add(arr[i] + "");
        }
        return str.toString();
    }
}
