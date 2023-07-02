import java.util.HashSet;
import java.util.Set;

public class dup {

    public static void main(String [] args)
    {

        String name ="Girish";


        Set<Character> s = new HashSet<>();

        StringBuffer sf = new StringBuffer();


        for(int i=0;i<name.length();i++)
        {

            char c  =name.charAt(i);
            if(!s.contains(c))
            {
                s.add(c);
                sf.append(c);



            }

        }


        System.out.println(sf);


    }

}
