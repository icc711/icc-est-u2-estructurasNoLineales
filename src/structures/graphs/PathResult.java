package structures.graphs;
import structures.node.*;
import java.util.*;

public class PathResult <T>{


    private final List <Node<T>> visitados;
    private final List <Node<T>> path;

    public PathResult(List <Node<T>> visitados, List <Node<T>> path) {
        this.visitados = visitados;
        this.path = path;
    }

    public List<Node<T>> getPath() {
        return path;
    }
    public List<Node<T>> getVisitados() {
        return visitados;
    }

    @Override
    public String toString() {
        return "PathResult [visitados=" + visitados + ", path=" + path + "]";
    }
    
    
}
