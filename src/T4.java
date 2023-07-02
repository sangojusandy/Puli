import java.util.ArrayList;
import java.util.List;

public class T4 {


    public static void main(String[] args) {


       List<Integer> a = new ArrayList<>();

       a.add(1);
        a.add(2);
        a.add(3);
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(10);

        List<List<Integer>> result = new ArrayList<>();

        List<Integer> sublist = new ArrayList<>();

        sublist.add(a.get(0));

        for(int i=1;i<a.size();i++)
        {

            if(a.get(i)==a.get(i-1)+1)
            {

                sublist.add(a.get(i));


            }
            else {

                result.add(sublist);

                sublist = new ArrayList<>();
                sublist.add(a.get(i));


            }

        }

       result.add(sublist);

        System.out.println(result);


    }
}
