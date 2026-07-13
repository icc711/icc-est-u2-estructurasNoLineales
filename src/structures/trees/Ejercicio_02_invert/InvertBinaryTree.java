package structures.trees.Ejercicio_02_invert;

import structures.node.Node;


public class InvertBinaryTree {
    public Node<Integer> invert(Node<Integer> root){
        // imprimir el árbol original
        System.out.println("Input: Árbol original:");
        printTree(root);
        invertRecursively(root);
        System.out.println("Output: Árbol invertido:");
        printTree(root);
        return root;
    }

    private void invertRecursively(Node <Integer> root){
        // Caso base: si la raiz es null, retorna nada
        if(root == null){
            return;
        }
        // intercambia izquierda a derecha usando aux
        // se guarda el nodo en una variable aux. aux obtiene la izquierda
        Node<Integer> aux = root.getLeft();
        // raiz obtiene derecha -> setea izquierda
        root.setLeft(root.getRight());
        // hijo izquierdo ahora es hijo derecho, guardado en aux
        root.setRight(aux);
 
        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }

    // llama e método pasandole la raíz y 
    // que su nivel inicial sea 0
    private void printTree(Node<Integer> root){
        printTree(root, 0);
    }

    private void printTree(Node<Integer> root, int level){
        // caso base: si la raiz es null, no retorna nada
        if(root == null){
            return;
        }
        // llama recursivamente al el hijo derecho
        // level + 1: va un nivel más abajo o profundo y 
        // asi obtener la profundidad actual del lado derecho
        // imprime primero el subarbol derecho
        printTree(root.getRight(), level + 1);
        for(int i = 0; i < level; i++){
            System.out.print("    ");
        }
        // imprime el valor del nodo actual
        System.out.println(root.getValue());
        // llama recursivamente al hijo izquierdo 
        printTree(root.getLeft(), level + 1);
    }
}
