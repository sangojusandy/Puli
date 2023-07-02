public class Sl {


    public static ListNode head;





   public static  class ListNode
    {
        public int data;
        public ListNode next;
        public ListNode(int data)
        {
            this.data=data;
            this.next=null;

        }







    }




    public static void display()
    {

        ListNode current = head;


         while(current!=null)
         {

             System.out.println(current.data);

             current =current.next;

         }

        System.out.println("null");


    }
    public static void main(String []a)
    {
        Sl s = new Sl();

        s.head = new ListNode(60);

        ListNode s2 = new ListNode(20);

        ListNode s3 = new ListNode(30);

        ListNode s4 =new ListNode(40);

        s.head.next =s2;
        s2.next =s3;
        s3.next =s4;

        ListNode newNode = new ListNode(1);

        newNode.next = head;
         head = newNode;




        display();
    }






}
