class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class deleteEl {
    public static node Array2LL(int [] arr){
        if(arr==null || arr.length==0){
            return null;
        }
        node head=new node(arr[0]);
        node mover=head;
        for(int i=1; i<arr.length; i++){
            node temp=new node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static void traversal(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static node deleteEl(node head, int val){
        if(head==null){
            return head;
        }
        if(head.data==val){
            node temp=head;
            head=head.next;
            return head;
        }
        node temp=head;
        node prev=null;
        while(temp!=null){
            if(temp.data==val){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int [] arr={4, 5, 6, 7};
        node head=Array2LL(arr);
        head=deleteEl(head, 5);
        traversal(head);
    }
}
