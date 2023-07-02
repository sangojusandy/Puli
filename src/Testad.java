public class Testad {


    public static void main(String[] args) {


        String sl= "sandy";
        System.out.println(recursiveString(sl));
    }
    public static String recursiveString(String s) {
        // TODO Auto-generated method stub
        if(s==null || s.length()<=1) {
            return s;
        }
        //System.out.println(s.charAt(0));
        return recursiveString(s.substring(1))+ s.charAt(0);
    }




    }


