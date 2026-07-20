class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
    node(int data, node next){
        this.data=data;
        this.next=next;
    }
}
public class insertHead {
    private static node arraytoLL(int[] arr){
        node head=new node(arr[0]);
        node mover=head;
        for(int i=1; i<arr.length; i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static node insertatHead(int val, node head){
        node temp=new node(val, head);
        return temp;

    } 
    private static void traversal(node head){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    } 
    public static void main(String[] args) {
        int[] arr={3, 6, 1, 8};
        node head=arraytoLL(arr);
        head=insertatHead(5, head);
        System.out.println(head.data);
        traversal(head);
    }
}
