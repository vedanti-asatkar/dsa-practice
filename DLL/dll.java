package DLL;
class node{
    int data;;
    node next;
    node back;
    node(int data, node next, node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class dll {
    private static node array2LL(int[] arr){
        node head=new node(arr[0]);
        node prev=head;
        for(int i=1; i<arr.length; i++){
            node temp=new node(arr[i], null, prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    private static void traversal(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        int [] arr={1, 7, 2, 5, 6};
        node head=array2LL(arr);
        traversal(head);
    }
}
