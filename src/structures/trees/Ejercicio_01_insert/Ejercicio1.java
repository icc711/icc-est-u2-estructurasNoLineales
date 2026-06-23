package structures.trees.Ejercicio_01_insert;
import structures.node.*;
import structures.trees.BinaryTree;

public class Ejercicio1 {
    public void insert(int [] numeros){
        // crear un arbol BTS - instaciar BinaryTree de tipo integer
        // insertar los numeros en el arbol
        // imprimir el arbol [5, 3, 7, 2, 4, 6, 8]
        // imprimir al reves
        // pre order(5, 3, 2, 4, 7, 6, 8)
        // in order(2, 4, 3, 6, 8, 7, 5)
        // slash t para imprimir los tabs (espacios)

        BinaryTree<Integer> tree = new BinaryTree<>();
        for (int numero : numeros){
            tree.insert(numero);
        }
    }

    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el árbol: ");
        printTreeRecursivo(root, 0);
    }

    public void printTreeRecursivo(Node <Integer> actual, int nivel){
        if(actual == null){
            return;
        }
        printTreeRecursivo(actual.getRight(), nivel +1);
        // for, i obtiene la posicion 0, i < al nivel, i va aumentando
        for (int i = 0; i < nivel; i++){
            // espacios hechos por el tab
            System.out.println("\t");
        }
        System.out.println(actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel +1);
    }
}
