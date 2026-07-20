class node{
    int data;
    node next;
    node(int data, node next){
        this.data=data;
        this.next=next;
    }
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insertTail {
    private static node ArrayToLL(int [] arr){
        node head=new node(arr[0]);
        node mover=head;
        for(int i=1; i<arr.length; i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static void  traversal(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    private static node insertAtTail(int value, node head){
        node newnode=new node(value);
        if(head==null){
            return newnode;
        }
        node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        return head;
    }
    public static void main(String[] args) {
        int[] arr={2, 8, 1, 5};
        node head=ArrayToLL(arr);
        head=insertAtTail(7, head);
        traversal(head);
    }
}
