package Queues;
    class Node{
    public int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class LinkedListQueue{
    private Node frontNode;
    private Node rearNode;
    private int size;
    public void add(int val){
        Node temp = new Node(val);
        if(frontNode == null){
            frontNode = rearNode = temp;
        }
        else{
            rearNode.next = temp;
            rearNode = temp; 
        }
        ++size;
    }
    public int remove() throws Error{
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        int x = frontNode.val;
        frontNode = frontNode.next;
        --size;
        return x;
    }
    public int peek(){
        if(size == 0){
            throw new Error("Queue is empty...");
        }
        return frontNode.val;
    }
    public void printQueue(){
        System.out.print("The queue is: ");
        Node temp = frontNode;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
}
public class LinkedListImplementationOfQueue {
    public static void main(String[] args) {
        LinkedListQueue que = new LinkedListQueue();
        System.out.println("Is queue Empty? "+que.isEmpty());
        que.add(10);
        que.add(20);
        que.add(30);
        que.add(40);
        que.add(50);
        que.printQueue();
        System.out.println("Size of queue is:"+que.size());
        System.out.println("The removed element is:"+que.remove());
        que.printQueue();
        System.out.println("Size of queue is: "+que.size());
        System.out.println("The front-most element is:"+que.peek());
        que.printQueue();
        System.out.println("Is queue Empty? "+que.isEmpty());
    }
}
