package sort;

import java.lang.reflect.Array;
import java.util.*;

public class SortMethod {
    final static int LIST_SIZE = 10;
    public static void main(String[] args) {
        List<People> list = new ArrayList<People>(LIST_SIZE);
        for(int i = 0; i < LIST_SIZE; ++i) {
            People people1 = new People();
            people1.setAge(i);
            people1.setName(i + "");
            list.add(people1);
        }
        Collections.sort(list, new PeopleComparator());
        for(int i = 0; i < LIST_SIZE; ++i) {
            System.out.println(list.get(i).getAge());
        }
        People[] peopleArray = new People[10];
        list.toArray(peopleArray);
        System.out.println(Arrays.toString(peopleArray));



        int[] array = {5,32,7,3};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        HashMap hashMap = new HashMap();
        hashMap.put("a", "a");
        hashMap.get("a");
    }
}
