package structures.trees.Ejercicio_01_insert;
import structures.node.*;
import structures.trees.BinaryTree;

public class InsertBSTTest {
    public void insert(int [] numeros){
        // Crear el arbol de enteros
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        // Insertar cada numero
        for (int numero : numeros){
            tree.insert(numero);
        }
        
        // Imprimir el arbol
        tree.inOrder();
        System.out.println();
        printTree(tree.getRoot());
    }
 
    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el árbol: ");
        printTreeRecursivo(root, 0);
    }

    public void printTreeRecursivo(Node <Integer> actual, int nivel){
        // Caso base
        if(actual == null){ 
            return;
        }
        // primero imprime el sub-árbol derecho
        printTreeRecursivo(actual.getRight(), nivel +1);

        // espacios según nivel
        // for, i (que sera tipo int) obtiene la posicion 0, i < al nivel, i va aumentando
        for (int i = 0; i < nivel; i++){
            // espacios hechos por el tab
            System.out.print("\t");
        }

        // Imprime el valor del nodo
        System.out.println(actual.getValue());
        // Luego imprime el sub-árbol izquierdo
        printTreeRecursivo(actual.getLeft(), nivel +1);
    }
}
        // crear un arbol BTS - instaciar BinaryTree de tipo integer
        // insertar los numeros en el arbol
        // imprimir el arbol [5, 3, 7, 2, 4, 6, 8]
        // imprimir al reves
        // pre order(5, 3, 2, 4, 7, 6, 8)
        // in order(2, 4, 3, 6, 8, 7, 5)
        // slash t para imprimir los tabs (espacios)
