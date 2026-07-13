package structures.graphs.implementations;

import structures.graphs.Graph;
import structures.graphs.PathResult;
import structures.graphs.PathFinder;
import java.util.Set;
import java.util.LinkedHashSet;
import structures.node.Node;

public class DFSPathFinder<T> implements PathFinder<T> {

    @Override
    public PathResult<T> find(Graph<T> graph, T start, T end){
        Set<T> visited = new LinkedHashSet<>();
        Set<T> path = new LinkedHashSet<>();
        boolean encontrado = dfs(graph, start, end, visited, path);
        
        if (!encontrado) {
            path.clear();
        }
        return new PathResult<>(null, null);
        
    }

    // dfs busqueda por profundidad
    private boolean dfs(Graph<T> graph, 
        T current, T end, 
        Set<T> visited, 
        Set<T> path) {
        visited.add(current);
        path.add(current);

        // Caso base
        Node<T> nC = new Node<T>(current);
        Node<T> nE = new Node<T>(end);
        if (nC.equals(nE)) {
            return true;
        }
        for(Node<T> vecino: graph.getVecinos(current)){
            if (!visited.contains(vecino)) {
                boolean encontrado = dfs(graph, vecino.getValue(), end, visited, path);
                if (encontrado) {
                    return true;
                }
                
            }
        }
        return false;
    }

}
