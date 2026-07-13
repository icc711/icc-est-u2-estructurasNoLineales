package structures.trees.Ejercicio_04_depth;

import structures.node.Node;
import structures.trees.BinaryTree;

public class Depth {

    public void insert(int[] numeros) {
        // crear un arbol BTS - instanciar BinaryTrees
        BinaryTree<Integer> tree = new BinaryTree<>();
        
        // Insertar los numeros en el arbol
        for(int numero : numeros) {
            tree.insert(numero);
        }
        
        // Calcular la profundidad máxima e imprimirla
        int profundidad = maxDepth(tree.getRoot());
        System.out.println("Output: " + profundidad);
        System.out.println(); // Salto de línea extra para separar en la consola
    }
    
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
