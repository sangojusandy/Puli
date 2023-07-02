import java.util.HashMap;
import java.util.Map;

public class dupOccur {


    public static void main(String [] args)
    {



String name ="Girish";


Map<Character,Integer> a = new HashMap<>();


char ch []= name.toCharArray();


for(char c : ch)
{

    if(a.containsKey(c))
    {
        a.put(c,a.get(c)+1);

    }
    else
    {

        a.put(c,1);

    }
}




a.entrySet().removeIf(i-> i.getValue()==1);
        System.out.println(a);

    }


}
