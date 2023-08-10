package practice.advanced;

public class encrypt {

    public static void main(String[] args) {

        System.out.println(createEncrypt(1983));

    }

    public static String createEncrypt(int number){

        int[] numbers = splist(number);
        //将一个整形进行拆分，拆分后交给一个整形数组接收

        for (int i = 0; i < numbers.length; i++) {
            //遍历数组，每个元素加5并取余
            numbers[i] = (numbers[i] + 5) % 10;
        }

        revers(numbers);
        //进行反转
        String data = "";

        //遍历数组numbers，将数组的内容打印到data里面
        for (int i = 0; i < numbers.length; i++) {

            data = data + numbers[i];

        }

        return data;

    }

    public static void revers(int[] numbers) {

        for (int i = 0, j = numbers.length - 1; i < j; i++, j--) {

            int temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;

        }

    }

    public static int[] splist(int number) {

        int[] numbers = new int[4];
        numbers[0] = number / 1000;
        numbers[1] = number / 100 % 10;
        numbers[2] = number / 10 % 10;
        numbers[3] = number % 10;

        return numbers;
    }

}
