class DLL{

    Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head =node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        if(head==null){
            node.prev=null;
            node=head;
            return;
        }

        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node.next=null;
        node.prev=temp;
        temp.next=node;
    }

    public void insertAfter(int after,int val){
        Node node = new Node(val);
        if(head==null){
            node.prev=null;
            node=head;
            return;
        }
        Node temp =head;
        while(temp.val!=after){
            temp=temp.next;
        }
        node.next=temp.next;
        node.prev=temp;
        temp.next=node;
        if(temp.next!=null){
            temp.next.prev=node;
        }
    }

    public void insertBefore(int before,int val){
        Node node = new Node(val);
        if(head==null){
            node.prev=null;
            node=head;
            return;
        }
        Node temp =head;
        while(temp.val!=before){
            temp=temp.next;
        }
        node.next=temp;
        node.prev=temp.prev;
        temp.prev=node;
        temp.prev.next=node;
    }

    public void display(){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.val +" -> ");
            temp=temp.next;
        }
        System.out.println("End");
    }

    public void revdisplay(){
        Node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        while(temp!=null){
            System.out.print(temp.val+ " -> ");
            temp=temp.prev;
        }
        System.out.println("Start ");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next,Node prev){
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }
}


public class LLDmain {
    public static void main(String[] args) {
        
        DLL list = new DLL();
        list.insertFirst(2);
        list.insertFirst(4);
        list.insertFirst(6);
        list.insertFirst(18);
        list.display();
        list.revdisplay();
        list.insertLast(34);
        list.display();
        list.insertAfter(2, 54);
        list.display();
        list.insertBefore(4, 5);
        list.display();
    }
}

