public class NewOne {


    public static ListNode head;


    public static class ListNode {


        public  int data;

        public  ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }


public static void insert(int data,int position)
{
    ListNode previous =head;
    ListNode newData = new ListNode(data);

    int count =1;

    while(count<position-1)
    {

        previous =previous.next;
count++;


    }


    ListNode current = previous.next;


    previous.next =newData;

    newData.next =current;







}

        public static void display()
        {

            ListNode current = head;

            while(current!=null)
            {

                System.out.println(current.data);
                current=current.next;


            }

            System.out.println("null");



        }






        public static void deleteFirstNode()
        {

            ListNode current = head;

            head = head.next;

            current.next =null;


        }



        public static void deleteAtPosition(int position)
        {

            if(position==1)
            {
                head= head.next;
            }


            int count =1;

            ListNode previous = head;

            while (count<position-1)
            {

                previous =previous.next;

                count++;
            }



            ListNode current = previous.next;



            previous.next =current.next;


        }







        public static void deleteLastNode()
        {

            ListNode current = head;

            ListNode previous = null;


           while(current.next!=null)
           {

previous=current;

current =current.next;


           }


previous.next=null;
        }




        public static void removeKey(int key)
        {

        ListNode current =head;

        ListNode previous = null;

        int count =1;
        while(current.next!=null && current.data!=key)
        {

            previous =current;

            current =current.next;




        }


previous.next = current.next;




        }

public static void insertNewnode()
{






}

    }


    public static void main(String[] args) {


    NewOne n = new NewOne();

    n.head =new ListNode(10);

    ListNode n1 = new ListNode(20);
    ListNode n2 = new ListNode(30);
        ListNode n3 = new ListNode(60);

    n.head.next =n1;
    n1.next =n2;

n2.next =n3;

        //ListNode.deleteFirstNode();
     //   ListNode.insert(40,2);
       //ListNode.deleteLastNode();
      // ListNode.deleteAtPosition(2);

        ListNode.removeKey(20);
        ListNode.display();







}











}

