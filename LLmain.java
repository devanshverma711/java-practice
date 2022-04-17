class LL{

    private Node head ;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;
        
        if(tail==null){
            tail=head;
        }
        size+=1;
    }

    public void insertLast(int val){
        
        if(tail==null){
            insertFirst(val);
            return;
        }

        Node node =new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insert(int val,int index){
        if(head==null){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for(int i=1; i<index ; i++){
            temp = temp.next;
        }
            Node node = new Node(val,temp.next);
            temp.next = node;
            size+=1;

    }

    public int deleteFirst(){

        int val = head.value;
        if(head.next==null){
            head=null;
            tail=null;
            size-=1;
        }

        head=head.next;
        size-=1;
        return val;
    }

    public int deleteLast(){ 
        int val=tail.value;
        if(head.next==null){
            head=null;
            tail=null;
            size-=1;
        }
        Node temp =head;
        for(int i =1;i<size-1;i++){
            temp=temp.next;
        }
        tail=temp;
        tail.next=null;
        size-=1;
        return val;

    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node temp =head;
        for(int i =1;i<index;i++){
            temp=temp.next;
        }
        int val = temp.next.value;
        temp.next=temp.next.next;
        return val;
    }

    public Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp=temp.next;
        }
        System.out.print("end");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    } 
}

public class LLmain{
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(18);
        list.insertLast(99);
        list.insert(35,3); 
        list.deleteFirst();
        list.deleteLast();
        System.out.println(list.delete(2));
        System.out.println(list.find(2));
        list.deleteLast();
        list.display();

    }
}
