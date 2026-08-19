package DLL;
import LLinsertion.node;

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
public class KposDLL {
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
    private static node Kposition(node head, int k){
        if(head==null){
            return head;
        }
        node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }
        node prev=temp.back;
        node front=temp.next;
        if(prev==null && front==null){
            return null;
        }else if(prev==null){
            return deleteHead(head);
        }else if(front==null){
            return deleteTail(head);
        }else{
          prev.next=front;
        front.back=prev;
        temp.back=null;
        temp.next=null;  
        }
       return head; 
    }
    public static void main(String[] args) {
        int[] arr={3, 6, 1, 9, 0};
        node head=array2LL(arr);
        head=Kposition(head,  2);
        traverse(head);
    }
}
