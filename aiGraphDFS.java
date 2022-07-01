import java.util.*;

class Graph{
    ArrayList<ArrayList<Integer>> graph;
    int V;

    Graph(int nodes){
        V=nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++){
            graph.add(new ArrayList<Integer>());
        }
    }

    void addEdges(int v,int u){
        graph.get(v).add(u);
        graph.get(u).add(v);
    }

    void printGraph(){
        for(int i = 0 ;i<V;i++){
            System.out.print("Nodes"+i);
            for(int x:graph.get(i))System.out.print("->"+x);
            System.out.println();
        }
    }
    void dfsUtil(int node,boolean visited[]){
        visited[node]=true;
        System.out.print(node + " ");
        for(int x:graph.get(node)){
            if(visited[x]==false){
                dfsUtil(x,visited);
            }
        }
    }
    void DFS(int start){
        boolean visited[] = new boolean[V];
        System.out.println("DFS Traversal of an array");
        dfsUtil(start,visited);
    }
}

public class aiGraphDFS {
    public static void main(String[] args) {
        
    Graph g = new Graph(7);
    g.addEdges(1,2);
    g.addEdges(1,3);
    g.addEdges(2,5);
    g.addEdges(2,4);
    g.addEdges(3,5);
    g.addEdges(4,5);
    g.addEdges(4,6);
    g.addEdges(5,6);
    g.printGraph();
    g.DFS(1);
    }
}
