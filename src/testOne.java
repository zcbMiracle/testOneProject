import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by 91339 on 2019/8/4.
 */
public class testOne {
    public static void main(String[] args) {
        System.out.println(123123);
        System.out.println(111222);
        new testOne().removeData();
    }
    public void removeData(){
        List<Integer> integers = new LinkedList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        for (Integer i:
             integers) {
            if (i==2){
                integers.set(i,null);
                integers.remove(i);
            }
            System.out.println(integers.size());
        }
    }
}
