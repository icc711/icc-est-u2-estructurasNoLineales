package structures.graphs;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import structures.node.Node;
import java.util.HashSet;

public class Graph<T> {
    // coleccion de nodos 
    // set hashset, linkedhashset, treeset
    // map hashmap, linkedhashmap, treemap
    // grafo guarda nodos, y estos nodos guarda las referencias de los nodos vecinos  
    private Map<Node<T>, Set<Node<T>>> graph;
    
    public Graph(){
        this.graph = new HashMap<Node<T>, Set<Node<T>>>();
    }

    public void add(T data){
        Node<T> node = new Node<T>(data);
        graph.putIfAbsent(node, new HashSet<Node<T>>());
        // si esta ausente, ingresar nodo
    }

    public void addEdge(T v1, T v2){
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        graph.get(nv1).add(nv2);
        graph.get(nv2).add(nv1);

    }

    public void addEdgeUni(T v1, T v2){
        Node<T> nv1 = new Node<T>(v1);
        Node<T> nv2 = new Node<T>(v2);
        add(v1);
        add(v2);
        graph.get(nv1).add(nv2);
    }

    public void printGraph(){
        for(Map.Entry<Node<T>, Set<Node<T>>> entry: graph.entrySet()){
            System.out.print(entry.getKey() + " -> ");
            for (Node<T> conexion : entry.getValue()) {
                System.out.println(conexion);
            }
            System.out.println();
        }
    }

    
}
