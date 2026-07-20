class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class delPos {
    private static node ArrayToLL(int [] arr){
        if (arr == null || arr.length == 0) {
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
    private static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    private static node deletAtK(node head, int k){
        if(head==null){
            return null;
        }
        if(k==1){
            node temp=head;
            head=head.next;
            return head;
        }
        node prev=null;
        node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(k==count){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr={2, 5, 6, 8};
        node head=ArrayToLL(arr);
        head=deletAtK(head, 3);
        display(head);
    }
}
