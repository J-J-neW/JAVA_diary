package api.Array.test01;

import java.util.ArrayList;

public class deleteTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();

        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if(str.contains("枸杞")){
                list.remove(str);
                i--;
            }
        }
        System.out.println(list);
    }
}

