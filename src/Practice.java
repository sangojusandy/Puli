import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {


    public static void main(String[] args)
    {


//        String name ="GirishG";
//
//       char ch [] = name.toCharArray();
////
////
////        for(int i=0;i<ch.length;i++)
////        {
////
////            for(int j=i+1;j<ch.length;j++)
////            {
////
////                if(ch[i] == ch[j])
////                {
////
////                    System.out.println(ch[i]);
////                }
////
////
////            }
////
////        }
//
//
//
//        Map<Character,Integer> m = new HashMap<>();
//
//
//        for(int i=0;i<ch.length;i++)
//        {
//
//
//            if(!m.containsKey(ch[i]))
//            {
//
//                m.put(ch[i],1);
//            }
//            else {
//
//                m.put(ch[i],m.get(ch[i])+1);
//            }
//        }
//
//
//
//Set<Map.Entry<Character,Integer> > entry =m.entrySet();
//        for(Map.Entry<Character,Integer> en :entry)
//        {
//
//            if(en.getValue()>1)
//            {
//
//                System.out.println(en.getKey() +"    "+en.getValue());
//            }
//
//
//
//        }
//


//        int a=20;
//        int b=30;
//         int c =40;
//
//        a= a+b;
//
//        b= a-b;
//
//        a= a-b;
//
//
//        System.out.println(a +" " +b);



//
//        if(a>b && a>c)
//        {
//
//            System.out.println(+a+"is large");
//
//        }
//
//        else if (b>c &&b>a){
//
//
//            System.out.println(+b+"is large");
//        }
//else {
//            System.out.println(+c+"is large");
//
//        }


//char ch ;

//        for(char ch='a';ch<='z';ch++)
//        {
//
//
//            System.out.print(ch);
//        }
//
//



//        int x []= {10,50,40,80};
//
//
//        int start =0;
//        int end = x.length-1;
//
//
//        while(start<end)
//        {
//
//
//            if(x[start]<x[end])
//            {
//
//                int temp =x[start];
//
//                x[start] = x[end];
//
//                x[end] = temp;
//
//
//            }
//
//
//            start++;
//            end--;
//        }
//
//
//        for(int x1 : x)
//        {
//
//
//            System.out.println(x1);
//        }




        String name ="java";

        char ch [] = name.toCharArray();

        String newOne ="";
        int start =0;
        int end  = ch.length-1;


        while(start<end)
        {

            if(ch[start]>ch[end])
            {

                char temp = ch[start];

                ch[start] =ch[end];

                ch[end] = temp;

            }


start++;
end--;

        }





        for(char g :ch)
        {

newOne = newOne+g;


        }

        System.out.println(newOne);



    }
}
