class node{
    int data;
    node next;
    node back;
    node(int data){
        this.data=data;
        this.next=next;
        this.back=back;
    }
    node(int data, node next, node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
}
public class deleteDLL {
    private  static node array2LL(int[] arr){
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
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    private static node deleteHead(node head){
        node prev=head;
        head=head.next;
        prev.next=null;
        head.back=null;
        return head;
    }
    private static node deleteTail(node head){
        if(head==null){
            return head;
        }
        if(head.back==null && head.next==null){
            return null;
        }
        node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        node prev=tail.back;
        prev.next=null;
        tail.back=null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={3, 5, 7, 9};
        node head=array2LL(arr);
        head=deleteTail(head);
        traversal(head);
    }
}
