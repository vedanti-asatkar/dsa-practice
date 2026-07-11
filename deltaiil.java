class node{
    int data;
    node next;
    node(int data){
        this.data=data;
    }
}
public class deltaiil {
    private static node ArrayToLL(int [] arr){
        node head=new node(arr[0]);
        node mover=head;
        for(int i=1; i<arr.length; i++){
            node temp=head;
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    private static node deletTail(node head){
        if(head==null || head.next==null){
            return null;
        }
        node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void main(String[] args) {
        int [] arr={2, 5, 6, 8};
        node head=ArrayToLL(arr);
        head=
    }
}
