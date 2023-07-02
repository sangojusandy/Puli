public class LargestPalindrome {

    public static void main(String []args) {

        lPalindrome("aaaaaaaaabaaamalayalamwowhabib");


    }


    public static void lPalindrome(String name) {

        String hold = "";
        int len = 0;

        String palindrome = " ";
        StringBuilder sb;
        for (int i = 0; i < name.length(); i++) {


            for (int j = i + 1; j < name.length(); j++) {


                hold = name.substring(i, j);


                if (new StringBuilder(hold).reverse().toString().equals(hold) && hold.length() > len) {

                    palindrome = hold;
                    len = palindrome.length();

                }


            }


        }

        System.out.println(palindrome);



    }


}
