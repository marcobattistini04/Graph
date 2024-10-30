package graph.impl;
import java.util.*;


public class SimpleNodes<Y> {
    private Map <Integer, Y> nodesMap = new HashMap <>();
    private int key = 0;
    SimpleNodes(){

    }
    protected void add(Y node) {
        if(! nodesMap.containsValue(node)) {
            nodesMap.put(key, node);
            this.key ++;
        }
    }

    public Y getNode(int key) {
        return nodesMap.get(key);
    }

    public int getSize() {
        return this.nodesMap.size();
    }

    public Set<Y> setOfNodes() {
        Collection <Y> nodesColl = nodesMap.values(); 
        Set<Y> nodesSet = new HashSet<>();
        nodesSet.addAll(nodesColl);
        return nodesSet;
    }
}
