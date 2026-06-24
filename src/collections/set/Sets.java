package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        hashSet.add("1Ggggggeegeg");
        hashSet.add("2G2gggggeegeg");
        hashSet.add("3Gggggeegeg");
        hashSet.add("4Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("5Ggggggeegeg");
        hashSet.add("6Ggggggeegeg");
        hashSet.add("G7gggggeegeg");


        return hashSet;
    }
    public Set<String> construirLinkedHashSet(){
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("D");
        linkedHashSet.add("A");
        linkedHashSet.add("1Ggggggeegeg");
        linkedHashSet.add("2G2gggggeegeg");
        linkedHashSet.add("3Gggggeegeg");
        linkedHashSet.add("4Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("5Ggggggeegeg");
        linkedHashSet.add("6Ggggggeegeg");
        linkedHashSet.add("G7gggggeegeg");

        return linkedHashSet;
    }

    public Set<String> construirTreeSet(){
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("1Ggggggeegeg");
        treeSet.add("2G2gggggeegeg");
        treeSet.add("3Gggggeegeg");
        treeSet.add("4Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("5Ggggggeegeg");
        treeSet.add("6Ggggggeegeg");
        treeSet.add("G7gggggeegeg");

        return treeSet;
    }

    public Set<Contacto> construirTreeSetComparador(){

        Set<Contacto> treeSet = new TreeSet<>(
            (c1, c2) -> {return c1.getNombre().compareTo(c2.getNombre()); 
            // funcion comparadora

            }
        );

        treeSet.add(new Contacto("Juan", "Perez", "123456789"));
        treeSet.add(new Contacto("Ana", "Gomez", "987654321"));
        treeSet.add(new Contacto("Pedro", "Lopez", "456789123"));
        treeSet.add(new Contacto("Maria", "Rodriguez", "789123456"));
        treeSet.add(new Contacto("Juan", "Perez", "123456789")); 
        treeSet.add(new Contacto("Juan", "Lopez", "123456789")); 

        return treeSet;
    }

    public Set<Contacto> construirHashSetContactos(){
        Set <Contacto> hCSet = new HashSet<>();

        Contacto c1 = new Contacto("Juan", "Perez", "123456789");
        Contacto c2 = new Contacto("Ana", "Gomez", "987654321");
        Contacto c3 = new Contacto("Pedro", "Lopez", "456789123");

        Contacto c4 = new Contacto("Maria", "Rodriguez", "789123456");
        Contacto c5 = new Contacto("Juan", "Perez", "123456789");
        Contacto c6 = new Contacto("Juan", "Lopez", "123456789");
        System.out.println("Contacto c1: " + c1.hashCode());
        System.out.println("Contacto c5: " + c5.hashCode());
        
        hCSet.add(c1);
        hCSet.add(c2);
        hCSet.add(c3);
        hCSet.add(c4);
        hCSet.add(c5);
        hCSet.add(c6);

        return hCSet;
    }
    
}
