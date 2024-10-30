package graph.impl;
import java.util.*;

public class SimpleEdges <X>{
    private Map<X, List<X>> edgesMap = new HashMap<>();
    
    protected void add(X source, X target) {
        if( ! edgesMap.containsKey(source)) {
            edgesMap.put(source, new LinkedList<X>());
            edgesMap.get(source).add(target);
        }else {
            edgesMap.get(source).add(target);
        }
       
    }

    protected Set<X> allConnectedToNode(X node){
        if( edgesMap.containsKey(node)) {
            System.out.println("All targets implementing " + node + " as source: ");
            Collection <X> edgesColl = edgesMap.get(node);
            Set <X> edgesSet = new HashSet<> ();
            edgesSet.addAll(edgesColl);
            return edgesSet;
        }
        System.out.println(" the graph implemented doesn't have any edges with " + node + " as source");
        return null;
        
    }

    private boolean DFSSourceToTarget(List<X> path, Map<X, Boolean> visited, X node, X dest) {
        visited.replace(node, false, true);
        path.add(node);

        if(node.equals(dest)) {
            return true;
        }

        Iterator<X> iter = this.edgesMap.get(node).listIterator();
        while(iter.hasNext()) {
            X n = iter.next();
            if(! visited.get(n)) {
                return DFSSourceToTarget(path, visited,  n, dest);
            }
        }
        return false;
    }

    
    protected List<X> pathSourceToTarget ( X source, X target, Set<X> nodes){
        List<X> path = new LinkedList<>();  
        Map<X, Boolean> visited= new HashMap<>();
        Iterator<X> iter = nodes.iterator();
        while(iter.hasNext()) {
            visited.put(iter.next(), false);
        }
        
        if(DFSSourceToTarget(path, visited, source, target)) {
            return path;
        } 

        return null;
    }

}
