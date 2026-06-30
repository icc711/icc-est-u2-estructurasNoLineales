package structures.trees.Ejercicio_04_depth;

import structures.node.Node;

public class Depth {
    public int maxDepth(Node<Integer> root){
        // Caso base: si el nodo es null, retorna 0
        // se detiene la recursión
        if (root == null) {
            return 0;
        }
        // maxDepth va bajando por el sub-árbol izquierdo 
        // hasta llegar a null
        int leftDepth = maxDepth(root.getLeft());
        // maxDepth va bajando por el sub-árbol derecho 
        // hasta llegar a null
        int rightDepth = maxDepth(root.getRight());
        // retorna la rama o sub-árbol más profundo   
        return Math.max(leftDepth, rightDepth) + 1;
    }
    
}
