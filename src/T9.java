public class T9 {


    public static void main(String[] args) {

        String str ="765";
int result=0;

        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0'; // Convert the character to its numeric value

           result = result * 10 + digit; // Multiply the previous result by 10 and add the current digit
        }

        System.out.println(result);
    }

}












