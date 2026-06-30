package collections.set.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    
    //Map <Clave(K), Valor(V)>
    public Map<String, Integer> construirHashMap(){
        Map<String, Integer> map = new HashMap<>();
        // entrada o entry de mapa -> (clave, valor)
        // put en vez de add
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("A", 40);

        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.values().toArray());

        for(int i = 0; i> map.size(); i++){
            // values: transforma el diccionario y solo deja los
            // valores, esos valores los lleva a un arreglo
            // Map -> V -> Valores -> Array -> Array[pos]
            System.out.println(map.values().toArray()[i]);
        }

        // Map -> K -> KEY (llaves) -> SET -> VALOR DEL SET
        for (String key: map.keySet()) {
            System.out.println(key);
        } // A, B, C

        // Set<T> solo tiene un tipo, los diccionarios pueden ser de <K, V>
        // entrySet() me devuelve un set, un solo tipo Set<Entry<String, Integer>>
        map.entrySet();
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry);
            
        }
        return map;
    }
    public Map<String, Integer> coLinkedHashMap(){
        Map<String, Integer> lMap = new LinkedHashMap();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;
    }

    public Map<String, Integer> cTreeMap(){
        Map<String, Integer> lMap = new TreeMap<>();
        lMap.put("A", 2);
        lMap.put("B", 3);
        lMap.put("A", 5);
        lMap.put("C", 50);
        lMap.put("D", 5);
        lMap.put("F", 3);
        lMap.put("G", 8);
        lMap.put("H", 85);
        lMap.put("I", 5);
        System.out.println(lMap);
        System.out.println(lMap.entrySet());
        return lMap;


    }
    
}
