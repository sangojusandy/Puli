public class NP {

    public static void main(String[] args) {



        int[] x ={-1,25,-5,45,9};


        for(int i=0;i<x.length;i++)
        {



            for(int j=i+1;j<x.length;j++)
            {
                if(x[i]>x[j])
                {
                    int temp =x[i];
                    x[i] =x[j];
                    x[j] =temp;

                }




            }




        }


        for(int c :x)
        {

            System.out.print(c +" ");
        }
    }
}
