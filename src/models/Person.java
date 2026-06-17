package models;

public class Person implements Comparable<Person> { 
    //la clase Person debe IMPLEMENTAR la interfaz Comparable 
    // para poder ser comparada y ordenada en el árbol binario
    private String name;
    private int age;
    
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    @Override
    public int compareTo(Person otra) { 
        // le digo a este método como se van a comparar dos objetos de tipo Person
        // devuelve un valor negativo si this es menor que otra, 0 si son iguales, 
        // y un valor positivo si this es mayor que otra
        // ordenamos por edad, pero podemos ordenar por otro cualquier atributo
        int compAge = Integer.compare(this.age, otra.age);
        if (compAge != 0) {  // si al comparar las edades son distintas de cero
            return compAge; // entonces las edades son diferentes, continuamos con el codigo y ordenamos por edad
        }
        return this.name.compareTo(otra.getName()); // Si las edades son iguales, ordenamos por nombre
    }
}
