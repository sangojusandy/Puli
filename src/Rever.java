public class Rever {


    public static void main(String [] args)
    {



        int [] x ={10,160,89,25};

        int start =1;

        int end = x.length-1;

        while(start<end)
        {

            int temp = x[start];

             x[start] = x[end];

            x[end] = temp;


            start++;
            end--;





        }


        for(int y :x)
        {

            System.out.println(y);
        }



    }











}
