package N4_stringBuilder;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(gerArrayData(new int[]{11,22,33}));
    }

    public static String gerArrayData(int[] arr){
        if(arr == null){
            return null;
        }

        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                str.append(arr[i]);
            }else{
                str.append(arr[i]).append(",");
            }
        }
        str.append("]");

        String s = str.toString();
        return s;
    }


}
