import structures.trees.IntTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;

import java.util.List;
import structures.node.*;
import models.Person;
import structures.trees.BinaryTree;

public class App {
    Node<Integer> root;
    // root será el atributo que se 
    // puede usar en toda esta clase 
    public static void main(String[] args) throws Exception {
        runIntTree();
        App app = new App();
        app.runEjercicio1();
        app.runEjercicio2();
        app.runEjercicio3();
        app.runEjercicio4();
      
    }

    private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); 
        // CLASE ARBOL
        // No insertar manualmente los recorridos 
        // porque genera ciclos

        arbolNumeros.insert(10);
        arbolNumeros.insert(5);
        arbolNumeros.insert(3);
        arbolNumeros.insert(8); /// INORDER 3, 5, 8, 10, 15, 20
        arbolNumeros.insert(20); /// POSTORDER 3 8 5 15 20 10
        arbolNumeros.insert(15); // ANCHURA O NIVELES: 10 5 20 3 8 15

        System.out.println("Pre-Order: ");
        arbolNumeros.preOrder();
        System.out.println("\nPos-Order: ");
        arbolNumeros.posOrder();
        System.out.println("\nIn-Order");
        arbolNumeros.inOrder();
        System.out.println("\nRecorrido por Niveles o Anchura: ");
        arbolNumeros.nivelesIterativo();
        System.out.println("\nCalculo altura del Árbol: ");
        System.out.println(arbolNumeros.alturaArbol(arbolNumeros.getRoot()));
        System.out.println("Calculo peso del Árbol: ");
        System.out.println(arbolNumeros.pesoArbol(arbolNumeros.getRoot()));

          
    }

    public static void runPersonTree(){
        BinaryTree<Person> personTree = new BinaryTree<>();
        personTree.insert(new Person("Alice", 30));
        personTree.insert(new Person("Bob", 25));
        personTree.insert(new Person("Diego", 35));
        personTree.insert(new Person("Rafael", 35));
        personTree.insert(new Person("Ana", 35));

        personTree.inOrder(); 
        // Imprime las personas ordenadas por edad
        // con IN-Order
        System.out.println();
        System.out.println();
        personTree.preOrder(); 
        // Imprime las personas en pre-orden
    }

    public void imprimirNiveles(List<List<Node<Integer>>> niveles) {
        for (List<Node<Integer>> nivel : niveles) {
            String linea = "";
            for (int i = 0; i < nivel.size(); i++) {
                linea = linea + nivel.get(i).getValue();
                if (i < nivel.size() - 1) {
                    linea = linea + " -> ";
                }
            }
            System.out.println(linea);
        }
    }

    public void runEjercicio1(){
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros = new int[] {5, 3, 7, 2, 4, 6, 8};
        System.out.println("Input: ");
        ejercicio1.insert(numeros); 
        
    }

    public void runEjercicio2(){
        root = new Node<>(9);
        root.setLeft(new Node<>(7));
        root.setRight(new Node<>(6));
        root.getLeft().setLeft(new Node<>(4));
        root.getLeft().setRight(new Node<>(3));
        root.getRight().setRight(new Node<>(2));

        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        root = ejercicio2.invert(root);

        System.out.println();

    }

    public void runEjercicio3(){
        root = new Node<>(9);
        root.setLeft(new Node<>(7));
        root.setRight(new Node<>(6));
        root.getLeft().setLeft(new Node<>(4));
        root.getLeft().setRight(new Node<>(3));
        root.getRight().setRight(new Node<>(2));

        ListLevels<Integer> ejercicio3 = new ListLevels<>(); 
        List<List<Node<Integer>>> niveles = ejercicio3.listLevels(root);
        imprimirNiveles(niveles);
            
    }

    public void runEjercicio4(){
        Depth ejercicio4 = new Depth();
        // creo una nueva instancia de depth
        int profundidad = ejercicio4.maxDepth(root);
        // llamo al método maxDepth, pasandole la raíz
        // que tendrá como resultado un int que se guardará 
        // en la variable profundidad
        System.out.println("La profundidad máxima del árbol es: " + profundidad);
        

    }

}

