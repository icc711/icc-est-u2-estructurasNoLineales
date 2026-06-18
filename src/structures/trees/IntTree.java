package structures.trees;

import structures.node.Node;
import java.util.Queue;
import java.util.LinkedList;

// Clase que representa un árbol binario de enteros
public class IntTree {

    private Node<Integer> root;

    /// Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public IntTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> node) {
        root = node;
    }

    public void setRoot(Integer value) {
        Node<Integer> node = new Node<Integer>(value);
        root = node;
    }

    public void insert(Integer value) { // 10
        Node<Integer> node = new Node<Integer>(value);
        root = insertRecursivo(root, node);
    }

    public void insert(Node<Integer> value) { // 10
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<Integer> insertRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayor o menor y decidir si lo inserto a la der o izq
        if (actual.getValue() > nodeInsertar.getValue()) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }

        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<Integer> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");

    }

    public void inOrder(){
        inOrderRecursivo(root);
    }

    public void inOrderRecursivo(Node<Integer> actual){
        if (actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());

    }

    public void nivelesIterativo(){
        
        if(root == null){ 
            return;
        }    
        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);

        while(!cola.isEmpty()){
            Node<Integer> actual = cola.poll();
            if(actual != null){
                System.out.print(actual.getValue() + " ");
                cola.offer(actual.getLeft());
                cola.offer(actual.getRight());
            }
        }

    }
    
    public int alturaArbol(Node<Integer> actual){
        if(actual == null){
            return 0;
        }
        int alturaIzquierda = alturaArbol(actual.getLeft());
        int alturaDerecha = alturaArbol(actual.getRight());
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    public int pesoArbol(Node<Integer> actual){
        if(actual == null){
            return 0;
        }
        int pesoIzquierdo = pesoArbol(actual.getLeft());
        int pesoDerecho = pesoArbol(actual.getRight());
        return pesoIzquierdo + pesoDerecho + 1;
    }
}
