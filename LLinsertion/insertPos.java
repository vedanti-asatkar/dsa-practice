package LLinsertion;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class insertPos {
    private static node array2LL(int [] arr){
        if(arr == null || arr.length == 0){
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
    private static  void traversal(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
    private static node insertAtpos(node head, int val, int k ){
        if(k < 1){
            System.out.println("invalid position");
            return head;
        }
        node newnode = new node(val);
        if(k==1){
            newnode.next=head;
            return newnode;
        }
        if(head == null){
            System.out.println("invalid position");
            return null;
        }
        node temp=head;
        int count=1;
        while(temp!=null && count<k-1){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            System.out.println("invalid position");
            return head;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return head;
    }
    public static void main(String[] args){
        int[] arr={2, 6, 7, 1};
        node head=array2LL(arr);
        head=insertAtpos(head, 5, 2);
        traversal(head);
    }
}