package structures.trees;
import structures.node.Node;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root;

    // Constructor SIEMPRE inicializa LAS VARIABLES (ROOT)
    public BinaryTree() {
        this.root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> node) {
        root = node;
    }

    public void setRoot(T value) {
        Node<T> node = new Node<T>(value);
        root = node;
    }

    public void insert(T value) { // 10
        Node<T> node = new Node<T>(value);
        root = insertRecursivo(root, node);
    }

    public void insert(Node<T> value) { // 10
        root = insertRecursivo(root, value);
    }

    // recursivo para insertar valores ARBOL BINARIO
    private Node<T> insertRecursivo(Node<T> actual, Node<T> nodeInsertar) {
        if (actual == null) {
            return nodeInsertar;
        }

        // validar si es mayor o menor y decidir si lo inserto a la der o izq
        // PARA COMPARAR OBJETOS DE TIPO GENERICO, NECESITO QUE T IMPLEMENTE LA INTERFAZ COMPARABLE
        if (actual.getValue().compareTo(nodeInsertar.getValue()) > 0) {
            actual.setLeft(insertRecursivo(actual.getLeft(), nodeInsertar));
        } else {
            actual.setRight(insertRecursivo(actual.getRight(), nodeInsertar));
        }
        return actual;
    }

    public void preOrder() {
        preOrderRecursivo(root);
    }

    private void preOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        System.out.print(actual + " ");
        preOrderRecursivo(actual.getLeft());
        preOrderRecursivo(actual.getRight());
    }

    public void posOrder() {
        posOrderRecursivo(root);
    }

    private void posOrderRecursivo(Node<T> actual) {
        if (actual == null)
            return;
        posOrderRecursivo(actual.getLeft());
        posOrderRecursivo(actual.getRight());
        System.out.print(actual + " ");

    }

    public void inOrder(){
        inOrderRecursivo(root);
    }

    public void inOrderRecursivo(Node<T> actual){
        if (actual == null)
            return;
        inOrderRecursivo(actual.getLeft());
        System.out.print(actual + " ");
        inOrderRecursivo(actual.getRight());

    }

    /*public void nivelesIterativo(){
        if(root == null){ 
            return;
        Queue<Node<T>> cola = new LinkedList<>();
        cola.add(root);

        while(!cola.isEmpty()){
            actual = cola.poll();
            if(actual != null){
                System.out.print(getRoot().getValue() + "");
                cola.offer(actual.getLeft());
                cola.offer(actual.getRight());
            }
        }
        }

    }*/
    
    public int alturaArbol(Node<T> actual){
        if(actual == null){
            return 0;
        }
        int alturaIzquierda = alturaArbol(actual.getLeft());
        int alturaDerecha = alturaArbol(actual.getRight());
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }

    public int pesoArbol(Node<T> actual){
        if(actual == null){
            return 0;
        }
        int pesoIzquierdo = pesoArbol(actual.getLeft());
        int pesoDerecho = pesoArbol(actual.getRight());
        return pesoIzquierdo + pesoDerecho + 1;
    }

}
