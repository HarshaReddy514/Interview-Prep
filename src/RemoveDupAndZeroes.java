import java.util.ArrayList;
import java.util.List;

public class RemoveDupAndZeroes {

    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(1,0,8,2,3,5,7,0,2,11,0,0,23,60);
        list.stream().distinct().forEach(num -> System.out.print(num));*/

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(0);

        //1,0,8,2,3,5,7,0,2,11,0,0,23,60
        List<Integer> zerosList = new ArrayList<>();
        for(int i=0; i<list.size(); i++) {
            if (list.get(i) == 0) {
                zerosList.add(list.get(i));
                list.remove(i);
            }
        }

        list.addAll(zerosList);

        list.stream().forEach(num -> System.out.print(num));


    }
}
