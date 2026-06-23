package structures.trees.Ejercicio_02_invert;

import structures.node.Node;


public class Ejercicio2 {
    public Node<Integer> invert(Node<Integer> root){
        // imprimir el árbol original
        // printTree(root);
        invertRecursively(root);
        // printTree(root);
        return root;
    }

    private void invertRecursively(Node <Integer> root){
        // si la raiz es null, retorna nada
        if(root == null){
            return;
        }
        // intercambia izquierda y derecha usando aux
        // se guarda el nodo en una posicion aux. root obtiene la izquierda
        Node<Integer> aux = root.getLeft();
        // raiz obtiene derecha -> raiz setea izquierda
        root.setLeft(root.getRight());
        // la raiz setea la derecha con la posicion antes creada: aux
        root.setRight(aux);
 
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }
}
