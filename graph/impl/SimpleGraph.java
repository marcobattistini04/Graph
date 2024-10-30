package graph.impl;
import java.util.List;
import java.util.Set;

import graph.api.Graph;

public class SimpleGraph<X> implements Graph<X>{
    private final SimpleNodes<X> nodes;
    private final SimpleEdges<X> edges;

    public SimpleGraph() {
        this.nodes = new SimpleNodes<X>();
        this.edges = new SimpleEdges< X>();
    }
    
    @Override
    public void addNode(X node) {
        nodes.add(node);
    }
    @Override
    public void addEdge(X source, X target) {
        edges.add(source, target);
    }

    @Override
    public Set<X> nodeSet() {
        return nodes.setOfNodes();
    }
    @Override
    public Set<X> linkedNodes(X node) {
       return edges.allConnectedToNode(node);
    }

    @Override
    public List<X> getPath(X source, X target) {
        System.out.println("Path from " + source + " to " + target + " :");
        return edges.pathSourceToTarget(source, target, nodeSet());
    }
}
