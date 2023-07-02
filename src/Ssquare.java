public class Ssquare {

    public static void main(String[] args) {
        int[] x = {-6, -1, 2, 4, 5,7};




        for(int i=0;i<x.length;i++)
        {

            x[i] =x[i]*x[i];
        }



        for(int k=0;k<x.length;k++)
        {


            for(int j=k+1;j<x.length;j++)
            {

                if(x[k]>x[j])
                {

                    int temp =x[k];
                    x[k] = x[j];

                    x[j] =temp;


                }

            }
        }



for(int m :x)
{
    System.out.println(m);
}






    }
}
