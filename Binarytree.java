import java.util.LinkedList;
import java.util.Queue;

public class Binarytree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{
        static int idx=-1;
        public Node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }  
    }

    //PREORDER 

    public static void preorder(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

   
    //INORDER

    public static void inorder(Node root){
        if(root==null){
            return ; 
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

     //POSTORDER

     public static void postorder(Node root){
        if(root==null){
            return ; 
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    //LEVELORDER

    public static void levelorder(Node root){
        Queue<Node> q =new LinkedList<>();
        if(root==null){
            return;
        }
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode= q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data + " ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1}; 
        BinaryTree  tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
       // System.out.println(root.data);
       System.out.print("PREORDER -->   "); preorder(root);
       System.out.println();
       System.out.print("INORDER -->    ");inorder(root);
       System.out.println();
       System.out.print("POSTORDER -->  ");postorder(root);
       System.out.println();
       System.out.println("LEVELORDER -->  ");
       levelorder(root);
    }
}
