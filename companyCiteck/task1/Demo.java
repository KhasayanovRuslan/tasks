package companyCiteck.task1;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        int[] numbers = {1,2,7,2,4,5,7,1,2,9,2,3,7,8,3,9,8,8,9};
        Map<Integer, Integer> tm = new TreeMap<>();

//        SortedMap<Integer, Integer> sm = new TreeMap<Integer, Integer>(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer int1, Integer int2) {
//                return int1.compareTo(int2);
//            }
//        });

        for(int i = 0; i < numbers.length; i++) {
            int count = 0;

            for(int j = 0; j < numbers.length; j++) {
                if( numbers[i] == numbers[j])
                    count++;
            }
            tm.put(numbers[i],count);
        }

//        tm.values()


//        Collection<Integer> cInt = tm.values();
//        Stream<Integer> sInt = cInt.stream().sorted();
//        sInt.

        System.out.println(tm);

    }
}
