import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestSubstring {


    public static void main(String[] args) {


//        String n ="abac";
//
//        char ch [] =n.toCharArray();
//            Map<Character,Integer> x = new LinkedHashMap<>();
//        for(int i=0;i<n.length();i++)
//        {
//
//            if(!x.containsKey(ch[i]))
//            {
//
//                x.put(ch[i],i);
//            }
//
//            else {
//
//                i=x.get(ch[i]);
//                x.clear();
//
//            }
//

        Scanner sc = new Scanner(System.in);

        int c[][] = new int[2][2];


        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {


                c[i][j] = sc.nextInt();

            }



            }


        for (int k = 0; k < 2; k++) {

            for (int l = 0; l < 2; l++) {


                System.out.print(c[k][l]+"\t");

            }
            System.out.println();



            //   System.out.println(x.keySet().toString());
        }

    }
}