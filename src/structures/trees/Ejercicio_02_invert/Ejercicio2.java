package structures.trees.Ejercicio_02_invert;

import structures.node.Node;


public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root){
        // imprimir el árbol original
        // printTree(root);

        invertRecursively(root);
        return root;
    }

    private void invertRecursively(Node <Integer> root){
        // si la raiz es null no retorna nada
        if(root == null){
            return;
        }
        // guarda una posicion aux. root obtiene izquierda
        Node<Integer> aux = root.getLeft();
        // raiz obtiene derecha a raiz setea izquierda
        root.setLeft(root.getRight());
        // la raiz setea la derecha con la posicion antes creada, aux
        root.setRight(aux);
 
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }
}
