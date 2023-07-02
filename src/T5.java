import java.util.Arrays;

public class T5 {


    public static void main(String[] args) {

        int[] num = {10, 5, 8, 12, 13, 7, 15};
        Arrays.sort(num);
               int count=0;
               int start =0;

               int end =num.length-1;
                while(start<end)
                {
                    if(num[start]+num[end]==25)
                    {
                        count++;
                        start++;
                        end--;


                    }

                    else if(num[start]+num[end]<25)
                    {
                     start++;

                    }
                    else {

                        end--;
                    }
                }


        System.out.println(count);


    }









}
