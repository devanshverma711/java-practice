public class queueusingarraycircular{

    static class Queue{
        static int arr[];
        static  int size;
        static int rear=-1;
        static int front =-1;

        Queue(int size){
            this.size=size;
            arr=new int[size];   
        }

        boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        boolean full(){
            return (rear+1)%size == front;
        }

        void enque(int data){
            if(full()){
                System.out.println("Overflow");
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        int deque(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            int result = arr[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        
        int peek(){
            if(isEmpty()){
                System.out.println("Underflow");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {
            Queue q = new Queue(5);
            q.enque(1);
            q.enque(2);
            q.enque(3);
            q.enque(4);
            q.enque(5);
            System.out.println(q.deque());
            q.enque(6);
            System.out.println(q.deque());
            q.enque(7);
            while(!q.isEmpty()) {
                System.out.println(q.deque());
            }
        }
    }
}