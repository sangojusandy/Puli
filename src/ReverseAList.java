import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAList {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        //   List<Integer> b = new ArrayList<>();
        a.add(100);
        a.add(120);
        a.add(200);
        a.add(1666);


        System.out.println(a);


        int start = 2;

        int end = a.size()-1;


        while (start<end)
        {


            int temp = a.get(start);

            a.set(start,a.get(end));
           a.set(end,temp);

          //  System.out.println(a);
            start++;
            end--;




        }

        //Collections.reverse();

        System.out.println(a);


    }
}
