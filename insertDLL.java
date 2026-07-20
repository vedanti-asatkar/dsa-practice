class node{
    int data;
    node next;
    node back;
    node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
    node(int data, node next, node back){
        this.data=data;
        this.next=next;
        this.back=back;
    }
}
public class insertDLL {
    private static node array2LL(int[] arr){
        node head=new node(arr[0]);
        node prev=head;
        for(int i=1; i<arr.length; i++){
            node temp=new node(arr[i], null, prev);
            prev.next=temp;
            prev=temp;
        }
        return  head;
    }
    private static void traverse(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    private static node insertHead(node head, int val){
        node newnode=new node(val, head, null);
        head.back=newnode;
        return head;
    }
    private static node insertTail(node head, int val){
        node newnode=new node(val);
        node temp=head;
        while(temp!=null){
            temp=temp.next;
        }
        newnode.back=temp;
        temp.next=newnode;
        return head;
    }
    public static void main(String[] args) {
        
    }
}
