package Graph;

import java.util.HashSet;

public class Graph_client {
    public static void main(String[] args) {
        Undirected_graph g =new Undirected_graph(7);
        g.AddEdge(1,4,6);
        g.AddEdge(1,2,10);
        g.AddEdge(2,3,7);
        g.AddEdge(3,4,5);
        g.AddEdge(4,5,1);
        g.AddEdge(5,6,4);
        g.AddEdge(7,5,2);
        g.AddEdge(6,7,3);
        g.display();
     /*   System.out.println("****");
        g.removeVertex(4);
        g.display();*/
        System.out.println(g.Hashpath(1,6, new HashSet<>()));
        g.Printallpath(1,6,new HashSet<>(),"");
    }
    
}
