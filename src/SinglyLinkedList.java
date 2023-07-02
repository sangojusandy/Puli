import java.util.LinkedList;

public class SinglyLinkedList {


    public static ListNode head;



    public static  class ListNode {

        public int data;

        public ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;

        }
            public static  void insert(int num,int position)
                    {


                        ListNode ln = new ListNode(num);

                        ListNode current = head;
                        int count =1;

                        while(count<position-1)
                        {


                            current =current.next;
                            count++;
                        }

                       ListNode after = current.next ;
                         current.next =ln;
                         ln.next=after;






                    }


    }
        public static void main(String[] args) {

            SinglyLinkedList s = new SinglyLinkedList();

            s.head = new ListNode(50);

            ListNode l2 = new ListNode(20);

            ListNode l3 = new ListNode(30);


            s.head.next = l2;

            l2.next = l3;


            ListNode l4 = new ListNode(10);

            l4.next = head;
            head = l4;


            ListNode l6 = new ListNode(100);
            ListNode current = head;

            while (null!=current.next) {
                current = current.next;

            }

            current.next = l6;

            ListNode.insert(3,5);


            ListNode cu = head;

            head = head.next;

            cu.next = null;
            System.out.println(cu.data);




        ListNode curr = head;

        while(curr!=null)
        {
            System.out.println(curr.data);
            curr =curr.next;

        }
            System.out.println("null");












       }
//





}
