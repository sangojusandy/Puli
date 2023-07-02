public class Fibac {


    public static void main(String[] args) {

//        int a=0;
//        int b=0;
//       int c=1;
//
//
//        for(int i=0;i<30;i++)
//        {
//
//
//            a=b;
//
//            b=c;
//            c=a+b;
//
//            System.out.print(a +" ");
//
//        }

//int count=10;
//
//int x[] = new int[count];
//        x[0] =0;
//        x[1] =1;
//
//
//        for(int i=2;i<count;i++)
//        {
//
//            x[i] =x[i-1]+x[i-2];
//
//        }
//
//
//        for(int c :x)
//        {
//
//            System.out.print(c +" ");
//        }




        int [] x ={1,0,5,0,3,9};

        int j=0;
        for (int i=0;i<x.length;i++)
        {

            if(x[i]!=0&&x[j]==0)
            {

                int temp =x[i];
                x[i] =x[j];
                x[j] = temp;
            }

            if(x[j]!=0)

            {
                j++;
            }

        }



        for(int y :x)
        {


            System.out.println(y);
        }








    }
}
