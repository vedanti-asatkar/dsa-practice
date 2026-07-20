class Stack1{
    int[] arr;
    int top;
    int capacity;
    Stack1(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    void push(int val){
        if(top==capacity-1){
            System.out.println("overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("Underflow");
            return;
        }
        System.out.println(arr[top] + "deleted");
        top--;
    }
    int peek(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    boolean isEmpty(){
        return top==-1;
    }
}
public class stack {
    public static void main(String[] args) {
        Stack1 s=new Stack1(5);
        s.push(4);
        s.push(12);
        s.peek();
        s.pop();
        s.isEmpty();
    }
}
