// import structures.trees.IntTree;
// import models.Person;
// import structures.trees.BinaryTree;

import java.util.Set;

import collections.set.*;
import collections.set.maps.Maps;

public class App {
    public static void main(String[] args) throws Exception {
        runMaps();
        
    }

    public static void runMaps(){
        Maps maps = new Maps();
        maps.construirHashMap();

    }

    public static void runSets(){
        collections.set.Sets sets = new Sets();
        System.out.println("HashSet: ");
        Set<String> hashSet = sets.construirHashSet();
        System.out.println(hashSet);
        System.out.println("Tamaño: " + hashSet.size());
        System.out.println(hashSet.contains("F"));

        
        System.out.println();
        Set<String> lhSet = sets.construirLinkedHashSet();
        System.out.println(lhSet);
        System.out.println("Tamaño: " + lhSet.size());
        System.out.println(lhSet.contains("B"));

        // Implementacion método TreeSet
        System.out.println("TreeSet: ");
        Set <String> treeSet = sets.construirTreeSet();
        System.out.println(treeSet);
        System.out.println(treeSet.size());
    }
    

    /* private static void runIntTree() {
        IntTree arbolNumeros = new IntTree(); /// CLASE ARBOL

        // Node<Integer> node3 = new Node<>(30);
        // Node<Integer> node4 = new Node<>(40);
        // Node<Integer> node5 = new Node<>(50);

        // Node<Integer> root = arbolNumeros.getRoot();

        // root.setLeft(node2);
        // root.setRight(node3);

        // node2.setLeft(node4);
        // node4.setRight(node5);

        //// ERROR GENERA CLICLOS
        // node5.setLeft(root);

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
        System.out.println("\nNiveles o Anchura: ");
        // arbolNumeros.nivelesIterativo();
        System.out.println("\nCalculo altura del Árbol: ");
        System.out.println(arbolNumeros.alturaArbol(arbolNumeros.getRoot()));
        System.out.println("Calculo peso del Árbol: ");
        System.out.println(arbolNumeros.pesoArbol(arbolNumeros.getRoot()));

        public static void runPersonTree(){
            BinaryTree<Person> personTree = new BinaryTree<>();
            personTree.insert(new Person("Alice", 30));
            personTree.insert(new Person("Bob", 25));
            personTree.insert(new Person("Diego", 35));
            personTree.insert(new Person("Rafael", 35));
            personTree.insert(new Person("Ana", 35));

            personTree.inOrder(); // Imprime las personas ordenadas por edad
            System.out.println();
            System.out.println();
            personTree.preOrder(); // Imprime las personas en pre-orden

        }   
    }*/
}
