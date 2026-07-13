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
    
    public void imprimirNiveles(List<List<Node<T>>> niveles, boolean conFlechas) {
        for (List<Node<T>> nivel : niveles) {
            String linea = "";
            for (int i = 0; i < nivel.size(); i++) {
                linea += nivel.get(i).getValue() + (i < nivel.size() - 1 ? (conFlechas ? " -> " : "   ") : "");
            }
            System.out.println(linea);
        }
    }
}



