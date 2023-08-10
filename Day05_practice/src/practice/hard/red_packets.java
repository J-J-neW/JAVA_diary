package practice.hard;

import java.util.Random;

public class red_packets {

    //这个小型的抽奖系统，主要是靠打乱数组的内容来进行随机的
    public static void main(String[] args) {

        int[] packets = {9,666,188,520,99999};
        grabRedPackets (packets);

    }

    public static void grabRedPackets(int[] packets){

        dislocate(packets);
        for (int i = 0; i < packets.length; i++) {

            System.out.println("恭喜第" + (i+1) + "个抽到了：" + packets[i]);

        }

    }

    public static void dislocate(int[] packets) {

        Random r = new Random();

        //对数组packets内的元素进行打乱,这个方法是我觉得简单的一种
        for (int i = 0; i < packets.length; i++) {

            int randomIndex = r.nextInt(packets.length);
            int temp = packets[i];
            packets[i] = packets[randomIndex];
            packets[randomIndex] = temp;

        }

    }

}
