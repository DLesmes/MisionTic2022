import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Colecciones
{
    public static void mostrarElementos(Collection coll) {
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem + ", ");
        }
        System.out.println();
    }
    
    
    
    public static void probarListas() {
        List<String> ejemploObjetoListaLink = new LinkedList<String>();
        ejemploObjetoListaLink.add("elemento1");
        ejemploObjetoListaLink.add("elemento2");
        ejemploObjetoListaLink.add("elemento3");
        ejemploObjetoListaLink.add("elemento3");
        System.out.println("Lista: linked list");
        mostrarElementos(ejemploObjetoListaLink);
        System.out.println("\nLista: linked list sin usar método");
        System.out.println(ejemploObjetoListaLink);
        System.out.println("\n");
        
        List<String> ejemploObjetoListaArray = new ArrayList<String>();
        ejemploObjetoListaArray.add("elemento1");
        ejemploObjetoListaArray.add("elemento2");
        ejemploObjetoListaArray.add("elemento3");
        ejemploObjetoListaArray.add("elemento3");
        System.out.println("Lista: array list");
        mostrarElementos(ejemploObjetoListaArray);
        System.out.println("\nLista: Array list sin usar método");
        System.out.println(ejemploObjetoListaArray);
        System.out.println("\n");
    }
    
    
    
    public static void probarSets() {
        Set<String> ejemploObjetoConjuntoHashSet = new HashSet<String>();
        ejemploObjetoConjuntoHashSet.add("elemento1");
        ejemploObjetoConjuntoHashSet.add("elemento33");
        ejemploObjetoConjuntoHashSet.add("elemento5");
        ejemploObjetoConjuntoHashSet.add("elemento4");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        ejemploObjetoConjuntoHashSet.add("elemento1");
        ejemploObjetoConjuntoHashSet.add("elemento2");
        System.out.println("Conjunto tipo hash");
        mostrarElementos(ejemploObjetoConjuntoHashSet);
        System.out.println("\nSet: hashset sin usar método");
        System.out.println(ejemploObjetoConjuntoHashSet);
        System.out.println("\n");
        
        SortedSet<String> ejemploObjetoConjuntoTreeSet = new TreeSet<String>();
        ejemploObjetoConjuntoTreeSet.add("elemento1");
        ejemploObjetoConjuntoTreeSet.add("elemento3");
        ejemploObjetoConjuntoTreeSet.add("elemento5");
        ejemploObjetoConjuntoTreeSet.add("elemento4");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        ejemploObjetoConjuntoTreeSet.add("elemento1");
        ejemploObjetoConjuntoTreeSet.add("elemento2");
        System.out.println("Conjunto tipo tree");
        mostrarElementos(ejemploObjetoConjuntoTreeSet);
        System.out.println("\nSet: treeset sin usar método");
        System.out.println(ejemploObjetoConjuntoTreeSet);
        System.out.println("\n");
    }
    
    
    public static void probarMapas() {
        Map<String, String> ejemploObjetoMapaHash = new HashMap<String, String>();
        ejemploObjetoMapaHash.put("clave1", "valor1");
        ejemploObjetoMapaHash.put("clave2", "valor1");
        ejemploObjetoMapaHash.put("clave3", "valor3");
        ejemploObjetoMapaHash.put("clave3", "valor5");
        ejemploObjetoMapaHash.put("clave1", "valor1");
        ejemploObjetoMapaHash.put("clave2", "valor2");
        System.out.println("Mapa tipo hash");
        mostrarElementos(ejemploObjetoMapaHash.keySet());
        mostrarElementos(ejemploObjetoMapaHash.values());
        
        System.out.println("\nMapa: hashmap sin usar método");
        System.out.println(ejemploObjetoMapaHash);
        System.out.println("\n");
        
        SortedMap<String, String> ejemploObjetoMapaTree = new TreeMap<String, String>();
        ejemploObjetoMapaTree.put("clave1", "valor1");
        ejemploObjetoMapaTree.put("clave2", "valor2");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        ejemploObjetoMapaTree.put("clave3", "valor3");
        ejemploObjetoMapaTree.put("clave1", "valor1");
        ejemploObjetoMapaTree.put("clave2", "valor2");
        System.out.println("Mapa tipo tree");
        mostrarElementos(ejemploObjetoMapaTree.keySet());
        mostrarElementos(ejemploObjetoMapaTree.values());
        
        System.out.println("\nMapa: treemap sin usar método");
        System.out.println(ejemploObjetoMapaTree);
        System.out.println("\n");
    }
    
}