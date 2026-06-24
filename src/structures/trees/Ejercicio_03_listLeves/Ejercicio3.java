package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;

public class Ejercicio3 { // Tip
    public List<List<Node> > listLevels(Node<T> root){ 
        // define el metodo que retorna una lista de listas (matriz?)
        List<List<Node<Integer>> > resultado = new ArrayList<>(); 
        // instancia una nueva lista
        if (root == null){ // si la raiz es nula, retorna el resultado
            return null;
        }

        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);
        while(cola.isEmpty()){
            int size = cola.size();

        }
    }
}



