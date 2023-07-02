import java.util.ArrayList;

public class Sort {

    public static void main(String[] args) {


        ArrayList<Integer> a = new ArrayList();

        a.add(100);
        a.add(10);
        a.add(20);
        a.add(50);


        for(int i=0;i<a.size();i++)
        {


            for(int j=i+1;j<a.size();j++)
            {

                if(a.get(i)>a.get(j))
                {


                  int   temp = a.get(i);

                  a.set(i,a.get(j));
                  a.set(j,temp);

                }



            }

        }

        System.out.println(a);




    }

}
