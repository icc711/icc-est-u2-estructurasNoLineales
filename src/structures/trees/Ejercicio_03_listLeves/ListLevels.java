package structures.trees.Ejercicio_03_listLeves;

import java.util.*;
import structures.node.*;

public class ListLevels<T> {

    public List<List<Node<T>>> listLevels(Node<T> root){
        List<List<Node<T>>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int levelSize = queue.size();
            List<Node<T>> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++){
                Node<T> current = queue.poll();
                currentLevel.add(current);

                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }

            result.add(currentLevel);
        }
        return result;
    }
}
// ejercicio 3: Dado un árbol binario, devuelve una lista de listas que contiene los nodos en cada nivel del árbol.



