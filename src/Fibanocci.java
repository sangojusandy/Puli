public class Fibanocci {


    public static void main(String[] args) {

        //int i=100;


        int [] x = new int[10];



        x[0] =0;

        x[1] =1;

        for(int i=2;i<x.length;i++)
        {

x[i] = x[i-1] +x[i-2];


        }

        for(int x1 :x)
        System.out.print(x1 +" ");

    }
}
