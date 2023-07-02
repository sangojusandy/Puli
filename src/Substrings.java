import javax.sound.midi.Soundbank;

public class Substrings {


    public static void main(String[] args) {



        String name ="Saikiran";

       char ch [] = name.toCharArray();

//
//        System.out.println(name.substring(0,2));
//        System.out.println(name.substring(1,3));
//        System.out.println(name.substring(2,4));


        for(int i=0;i<name.length();i++)
        {

            for(int j=i+1;j<name.length();j++)
            {


                System.out.println(name.substring(i,j+1));


            }

        }






    }
}
