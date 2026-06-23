import structures.trees.IntTree;
import structures.trees.Ejercicio_01_insert.Ejercicio1;
import models.Person;
import structures.trees.BinaryTree;

public class App {
    public static void main(String[] args) throws Exception {
        runIntTree();
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

    public void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[] {5, 3, 7, 2, 4, 6, 8};
        ejercicio1.insert(numeros); 
        System.out.println();
    }

}

