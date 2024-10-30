package graph.impl;

public class UseSimpleGraph {
    public static void main(String[] args) {
        
            final SimpleGraph<Integer> graph = new SimpleGraph<Integer>();
            graph. addNode (10);
            graph. addNode (2);
            graph. addNode (3);
            graph. addNode (5);
            graph. addNode (7);
   
            graph. addEdge (2,7);
            graph. addEdge (5,2);
            graph. addEdge (10,3);
            graph. addEdge (10,3);
            graph. addEdge (3,10);
            graph. addEdge (3,7);
            graph. addEdge (3,2);
            graph. addEdge (7,10);
            graph. addEdge (7,5);
            graph. addEdge (5,3);
   
            System.out.println("\n\nTESTING GRAPH WITH INTEGER NODES: ");
            System.out.println (graph. nodeSet ());

            System.out.println (graph. linkedNodes (10));
            System.out.println (graph. linkedNodes (2));
            System.out.println (graph. linkedNodes (3));
            System.out.println (graph. linkedNodes (5));
            System.out.println (graph. linkedNodes (7));

            System.out.println (graph.getPath(7, 2));

            final SimpleGraph<String> graph2 = new SimpleGraph<>();
            graph2.addNode("Bologna");
            graph2.addNode("Imola");
            graph2.addNode("Cesena");
            graph2.addNode("Faenza");
            graph2.addNode("Modena");
            graph2.addNode("Cervia");
            graph2.addNode("Ravenna");
            graph2.addNode("Rimini");

            graph2.addEdge("Bologna", "Modena");
            graph2.addEdge("Modena", "Bologna");
            graph2.addEdge("Bologna", "Imola");
            graph2.addEdge("Imola", "Bologna");
            graph2.addEdge("Faenza", "Cesena");
            graph2.addEdge("Faenza", "Imola");
            graph2.addEdge("Cesena", "Faenza");
            graph2.addEdge("Cesena", "Rimini");
            graph2.addEdge("Cesena", "Cervia");
            graph2.addEdge("Cervia", "Cesena");
            graph2.addEdge("Cervia", "Ravenna");

            System.out.println("TESTING GRAPH WITH STRING NODES: ");

            System.out.println (graph2. nodeSet ());

            System.out.println(graph2.linkedNodes("Cesena"));

            System.out.println(graph2.getPath("Cervia", "Bologna") + " \n");

    }
}
