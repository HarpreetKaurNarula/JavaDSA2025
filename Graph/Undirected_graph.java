package Graph;

import java.util.HashMap;
import java.util.HashSet;

public class Undirected_graph {
    HashMap<Integer,HashMap<Integer,Integer>> map;

    public Undirected_graph(int v) {
        map=new HashMap<>();
        for (int i=1;i<=v;i++) {
            map.put(i,new HashMap<>());
        }

    }

    public void AddEdge(int v1, int v2 ,int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    public void Addvtx(int v){
        map.put(v, new HashMap<>());
    }

    public boolean ContainsEdge(int v1, int v2) {
        return map.get(v1).containsKey(v2);
    }

    public int noofEdge(){
        int sum=0;
        for(int key:map.keySet()){
            sum+=map.get(key).size();
        }
        return sum/2;
    }

    public void removeEdge(int v1,int v2) {
        map.get(v1).remove(v2);
        map.get(v2).remove(v1);

    }

    public void removeVertex(int v1){
        for( int nbrs:map.get(v1).keySet()){
            map.get(nbrs).remove(v1);
        }
        map.remove(v1);
    }
     
    public void display(){
        for(int key:map.keySet()){
            System.out.println(key+ " " + map.get(key));
        }
    }

    public boolean Hashpath(int src,int dest, HashSet<Integer> visited){
        if(src==dest){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                boolean ans=Hashpath(nbrs,dest,visited);
                return ans;
            }

        }
        return false;

    }
    public void Printallpath(int src,int dest, HashSet<Integer> visited,String ans){
        if(src==dest){
            System.out.println(ans);
            return;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)){
                Printallpath(nbrs,dest,visited,ans+src);
            
            }

        }

    }
}

        