class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class link{
    // converting array to linked list
    private static Node Array2LL(int [] arr){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1; i<arr.length; i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static int lengthOfLL(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    // check if element is present
    private static boolean Search(Node head, int val){
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                return true;
            }else{
                temp=temp.next;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr={2, 5, 6, 8};
        Node y=new Node(arr[3]);
        // System.out.println(y.next);
        Node head=Array2LL(arr);
        System.out.println(head.data);
        // to traverse a ll
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(lengthOfLL(head));
        System.out.println(Search(head, 5));
    }
}