public class queueusinglinkedlist {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;

        public boolean isEmpty(){
            return head==null & tail == null;
        }

        public void add(int data){
            Node newnode = new Node(data);
            if(tail==null){
                tail=head=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }

    int remove(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        int front = head.data;
        if(head==tail){
            tail=null;
        }
        head=head.next;
        return front;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Underflow");
            return -1;
        }
        return head.data;
    }
}
    public static void main(String[] args) {
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}

