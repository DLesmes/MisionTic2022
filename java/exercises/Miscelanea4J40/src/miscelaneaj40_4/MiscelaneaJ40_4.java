/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscelaneaj40_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Carlos_Garcia
 */
public class MiscelaneaJ40_4 {

    /**
     * @param args the command line arguments
     */
    
    //enum
    enum Contienente{
     AFRICA (54),
     EUROPA (50),
     ASIA (49),
     AMERICA (35),
     OCEANIA (15),
     ANTARTIDA (1);
     private int numPaises;

        private Contienente(int numPaises) {
            this.numPaises = numPaises;
        }

        public int getNumPaises() {
            return numPaises;
        }
     
     
    }
    
    private static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        //ejemploEnum();
         //ejemploTreeset();
        //ejemploHashSet();
        //ejemploLinkedList();
        //ejemploArrayList();
        //ejemploHashMap();
        //ejemploTreeMap();        
        //ejemploHashMap2();

        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
        
        //ejercicio6_1();
        //ejercicio7();
        //ejercicio7_1();
        //ejemploLinkeArrayPersona();
        //ejercicio8();
        
//        Baraja as = new Baraja();
//        System.out.println(as.repartir(16));

        AgendaTelefonica laAgenda = new AgendaTelefonica();
        laAgenda.addTelefono("andres",320812133);
        laAgenda.addTelefono("alfonso",310914156);
        laAgenda.addTelefono("javier",320109216);
        laAgenda.addTelefono("pedro",300796123);
        laAgenda.addTelefono("camila",300912314);
        laAgenda.addTelefono("yina",310923123);
        laAgenda.addTelefono("lady",320912415);
        
        laAgenda.mostrarAgenda();
        System.out.println("Consulta javier " +laAgenda.consulta("javier"));
        System.out.println("Consulta andrea " +laAgenda.consulta("andrea"));
        System.out.println("Consulta camila " +laAgenda.consulta("camila"));
        System.out.println("Esta javier " +laAgenda.estaIncluido("javier"));
        System.out.println("Esta alfredo " +laAgenda.estaIncluido("alfredo"));
        
        laAgenda.addTelefono("lady",988812);
        laAgenda.mostrarAgenda();
        

    }
    private static void ejercicio8(){
        String modelo, placa;
        modelo = "Renault Sandero";
        placa = "IPU105";
        
        GestionReparaciones taller = new GestionReparaciones();
        System.out.println("Taller");
        taller.addVehiculo(modelo, placa);
        taller.addVehiculo("Audi", "ASD123");
        taller.addVehiculo("Kia", "iwe456");
        taller.addVehiculo("Mazda", "wdc456");
        taller.addVehiculo("Chevrolet", "pmw123");
        taller.listaAutos();
        
        taller.reparado(placa);
        taller.reparado("iwe456");
        taller.fechaSalidaTaller(placa);
        taller.fechaSalidaTaller("pmw123");
        taller.eliminarPrimerRegistro();
        taller.listaAutos();
        
    }
    
    private static void ejemploLinkeArrayPersona(){
        List<Persona> arrayPersona = new ArrayList<>();
        List<Persona> linkedPersona = new LinkedList<>();
        
        long antes;
        
        for (int i=0;i<10000;i++){
            arrayPersona.add(new Persona(i,"Persona array "+i,i));
            linkedPersona.add(new Persona(i,"Persona linked "+i,i));
        }
    
        System.out.println("Tiempo invertido en insertar una persona en el arraylist");
        antes= System.nanoTime();
        arrayPersona.add(new Persona(4550,"Persona array ",10001));
        System.out.println(System.nanoTime()-antes);
        
        System.out.println("Tiempo invertido en insertar una persona en el linkedlist");
        antes = System.nanoTime();
        linkedPersona.add(new Persona(4550,"Persona array ",10001));
        System.out.println(System.nanoTime()-antes);
    }
    
    private static void ejercicio7_1(){
        int cantidad;
        ArrayList<Integer> numeArrayList = new ArrayList<>();
        System.out.println("Cuántos numeros en la lista");
        cantidad = teclado.nextInt();
        
        for(int i=0;i<cantidad;i++){
            System.out.println("Ingrese el numero ");
            numeArrayList.add(teclado.nextInt());
        }
        
        Collections.sort(numeArrayList);
        System.out.println("Lista ordenada de numeros");
        for(Integer lista:numeArrayList){
            System.out.println(lista);
        }
    }
    
    private static void ejercicio7(){
        int [] listaDatos;
        int cantidad;
        
        System.out.println("Cantidad de numeros en la lista");
        cantidad=teclado.nextInt();
        listaDatos = new int[cantidad];
        
        for(int i=0; i<cantidad;i++){
            System.out.println("Escriba el numero");
            listaDatos[i] = teclado.nextInt();
        }
        
        for(int i=0;i<cantidad;i++){
            for(int j=0;j<(cantidad-1)-i;j++){
                if(listaDatos[j]>listaDatos[j+1]){
                    int auxiliar;
                    auxiliar = listaDatos[j];
                    listaDatos[j] = listaDatos[j+1];
                    listaDatos[j+1]=auxiliar;
                }
            }
        }
        
        System.out.println("La lista ordenada es");
        for(int i=0;i<cantidad;i++){
            System.out.println(listaDatos[i]);
        }
        
    }
    
    private static void ejercicio6_1(){
        
        int numPaises;
        ArrayList<String> paisesArrayList = new ArrayList<>();
        System.out.println("¿Cuántos paises desea guardar?");
        numPaises = teclado.nextInt();
        
        for(int i=0;i<numPaises;i++){
            System.out.println("Escriba el pais");
            paisesArrayList.add(teclado.next());
        }
        
        //ordenar la lista
        Collections.sort(paisesArrayList);
        for (String datosOrdenados:paisesArrayList) {
            System.out.println(datosOrdenados);
        }
        
    }
    
    private static void ejercicio6(){
        String [] paises;
        int cantPaises;
        System.out.println("Cantidad de paises?");
        
        cantPaises= teclado.nextInt();
        paises = new String[cantPaises];
        
        //almaceno en el array paises
        for(int i=0;i<cantPaises;i++){
            System.out.println("Escriba el país");
            paises[i] = teclado.next();
        }
        //ordenar el array de manera alfabetica
        
        for(int i=0;i<cantPaises-1;i++){
            for(int j=0;j<(cantPaises-1)-i;j++){
                if(paises[j].compareTo(paises[j+1])>0 ){
                    String auxiliar;
                    auxiliar = paises[j];
                    paises[j]=paises[j+1];
                    paises[j+1]= auxiliar;
                }
            }
        }
        //muestra el array de manera ordenada
        System.out.println("El orden de la lista de paises");
        for(int f=0;f<cantPaises;f++){
            System.out.println(paises[f]);
        }
        
    }
    
    private static void ejercicio5(){
        int [] salarios;
        int cantSalarios;
        
        System.out.println("¿Cuántos salarios?");
        cantSalarios = teclado.nextInt();
        
        salarios = new int[cantSalarios];
        //almacenar los salarios en el arreglo
        for(int i=0;i<cantSalarios;i++){
            System.out.println("Ingrese el salario");
            salarios[i] = teclado.nextInt();
        }
        //ordenar los salarios
        for(int i=0; i<(cantSalarios-1);i++){
            for(int j=0;j<(cantSalarios-1)-i;j++){
                if(salarios[j]>salarios[j+1]){
                    int almacenar;
                    almacenar = salarios[j];
                    salarios[j] = salarios[j+1];
                    salarios[j+1] = almacenar;
                }
            }
        }
        //visualiza el array de menor a mayor
        System.out.println("El orden de los salarios es");
        for(int i=0;i<cantSalarios;i++){
            System.out.print(salarios[i]+" ");
        }
    }
    
    private static void ejercicio4(){
        int [] listanumeros;
        int menor, datos;
        System.out.println("¿Cuántos números?");
        datos=teclado.nextInt();
        listanumeros = new int[datos];

        //almaceno los datos en el array listanumeros
        for(int i=0;i<datos;i++){
            System.out.println("Ingrese el número");
            listanumeros[i] = teclado.nextInt();
        }
        
        menor = listanumeros[0];//inicializo la variable menor con lo que tenga almacenado al posicion 0 de listanumeros
        
        for(int j=0;j<datos;j++){
            if(listanumeros[j]<menor){
                menor=listanumeros[j];//menor tendrá lo que valga listanumeros en la posicion j
            }
        }
        System.out.println("El número menor es "+menor);
    }
    
    private static void ejercicio3(){
        String [] nombres;
        float [] sueldos;
        int cantEmpleados;
        
        System.out.println("¿Cuántos empleados son?");
        cantEmpleados = teclado.nextInt();
        
        nombres= new String[cantEmpleados];
        sueldos= new float[cantEmpleados];
        
        //almacenar los datos en arrays nombres y sueldos
        for(int i=0; i<cantEmpleados;i++){
            System.out.println("Escriba el nombre del empleado");
            nombres[i] = teclado.next();
            
            System.out.println("Ingrese el sueldo del empleado");
            sueldos[i] = teclado.nextFloat();
        }
        float mayor;
        int posicion=0;
        mayor = sueldos[0];
        
        for(int j=0;j<cantEmpleados;j++){
            if(sueldos[j]>mayor){
                mayor=sueldos[j];
                posicion=j;
            }
        }
        
        System.out.println("El empleado con el mayor sueldo es "
                + nombres[posicion] + " $"+mayor);
    }
    
    private static void ejercicio2(){
        int [] listaNumeros;
        int totalnum, suma=0;
        
        System.out.println("¿Cuántos números tendrá el arreglo?");
        totalnum = teclado.nextInt();
        
        listaNumeros = new int[totalnum];
        for(int i=0; i<totalnum;i++){
            System.out.println("Escriba el número " +(i+1));
            listaNumeros[i]= teclado.nextInt();
        }
        
        for(int j=0;j<totalnum;j++){
            suma = suma+listaNumeros[j];
        }
        System.out.println("La suma es "+suma);
            
    }

    private static void ejercicio1(){
        System.out.println("¿Cuántos sueldos a almacenar?");
        int numSueldo;
        int [] sueldos; //arreglo, array o vector
        
        numSueldo = teclado.nextInt();//almaceno lo que se escriba por consola
        sueldos= new int[numSueldo];
        
        //obtener los datos de los sueldos
        for(int i=0;i<numSueldo;i++){
            System.out.println("Escriba el sueldo del operario "
            + (i+1));
            sueldos[i] = teclado.nextInt();
        }
        //imprimir los datos del arreglo sueldos
        System.out.println("Los sueldos son");
        for(int j=0;j<numSueldo;j++){
            System.out.print(sueldos[j]+" " );
        }
    }
    
    private static void ejemploEnum() {
       

//RECORRER EL ENUM
for(Contienente cont: Contienente.values()){
    System.out.println("Enum "+ cont+
            " número de paises " +cont.getNumPaises() );
}
    }

    private static void ejemploHashMap2() {
        
        
        //creando un mapa de clave Integer y valores de tipo String
        HashMap<Integer,String> ciudades = new HashMap<>();
        //agregar ciudades clave int, valor string
        ciudades.put(1, "Lima");
        ciudades.put(2, "Buenos Aires");
        ciudades.put(3,"Santiago de Chile");
        ciudades.put(4,"Bogotá");
        ciudades.put(5,"Barranquilla");
        ciudades.put(6,"Bucaramanga");
        ciudades.put(7,"Sao Paulo");
        ciudades.put(8,"Medellín");
        
        Iterator it = ciudades.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            System.out.println("Clave:"+key+ " valor "+ciudades.get(key));
        }
        
        //actualizar un dato del mapa
        ciudades.replace(7, "Rio de Janeiro");
        //eliminar un dato del mapa
        ciudades.remove(3);
        
        //tamaño del mapa
        System.out.println("Tamaño del mapa "+ciudades.size());
        System.out.println("Está vacío el mapa "+ciudades.isEmpty());
        
        System.out.println("Lista mapa con for");
        for(Integer iter:ciudades.keySet()){
            System.out.println("Clave "+iter+" valor "+ciudades.get(iter));
        }
        
        //eliminar todos los datos del mapa
        ciudades.clear();
        System.out.println("Tamaño del mapa "+ciudades.size());
    }

    private static void ejemploTreeMap() {
        
        
        SortedMap ejemplMapTree = new TreeMap();
        //agregar datos al treemap put=>clave, valor
        ejemplMapTree.put("key1", "Info 1");
        ejemplMapTree.put("key2", "Info 2");
        ejemplMapTree.put("key3", "Info 3");
        ejemplMapTree.put("key4", "Info 4");
        
        System.out.println("Valors del mapa");
        verElementosHash(ejemplMapTree.values());
        
        //actualizar un dato del mapa
        ejemplMapTree.replace("key3", "cambia");
        //eliminar un dato del mapa
        ejemplMapTree.remove("key1");
        System.out.println("Tamaño del mapa "
                +ejemplMapTree.size());
        //recorrer el tree map por foreach usando las claves 
        for(Object iter:ejemplMapTree.keySet()){
            System.out.println("clave->"+iter+" valor->"
                    +ejemplMapTree.get(iter));
        }
        System.out.println("Existe este valor Info 4?"+
                ejemplMapTree.containsValue("Info 4"));
        
        System.out.println("Existe este clave Info 4?"+
                ejemplMapTree.containsKey("Info 4"));
        
        //eliminar por completo todos los datos del mapa
        ejemplMapTree.clear();
        //saber si está vacío el mapa
        System.out.println("Está vacío el mapa? "
                + ejemplMapTree.isEmpty());
        
        System.out.println("Tamaño del mapa "
                +ejemplMapTree.size());
    }

    private static void ejemploHashMap() {
        
        
        //creacion de un objeto de tipo Map
        Map ejemploMapaHash = new HashMap();
        //agregar elementos al mapa se usa put=>clave,valor
        ejemploMapaHash.put("clave1", "Dato 1");
        ejemploMapaHash.put("clave2", "Dato 2");
        ejemploMapaHash.put("clave3", "Dato 3");
        ejemploMapaHash.put("clave4", "Dato 4");
        //tamaño del mapa size
        System.out.println("Tamaño del mapa "+ejemploMapaHash.size());
        //recorrer el mapa y mostrar los valores
        for(Object ite: ejemploMapaHash.values()){
            System.out.println("Valores->"+ite);
        }
        //eliminar un dato del mapa a partir de la clave
        ejemploMapaHash.remove("clave2");
        
        //actualizar un elemento del mapa
        ejemploMapaHash.replace("clave1", "Dato actualizado");
        
        //si una clave se encuentra en el mapa
        System.out.println("se encuentra la clave 2? "+
                ejemploMapaHash.containsKey("clave2"));
        
        //si una clave se encuentra en el mapa
        System.out.println("se encuentra la clave 3? "+
                ejemploMapaHash.containsKey("clave3"));
        
        //si alguna clave contiene un valor en el mapa
        System.out.println("Esta el valor dato " +
                ejemploMapaHash.containsValue("dato 1"));
        
        //si alguna clave contiene un valor en el mapa
        System.out.println("Esta el valor Dato 3 " +
                ejemploMapaHash.containsValue("Dato 3"));
        
        //recorrer el mapa se muestra la clave y el valor
        for(Object ite: ejemploMapaHash.keySet()){
            System.out.println("Clave->"+ite+ " valor-> "
                    +ejemploMapaHash.get(ite));
        }
        
        //si el mapa se encuentra vacio
        System.out.println("El mapa está vacío? "+
                ejemploMapaHash.isEmpty());
        
        System.out.println("Claves del mapa");
        verElementosHash(ejemploMapaHash.keySet());
        System.out.println("Valores de cada clave");
        verElementosHash(ejemploMapaHash.values());

        //eliminar todos los elementos del mapa
        ejemploMapaHash.clear();
        System.out.println("El mapa está vacío? "+
                ejemploMapaHash.isEmpty());
        System.out.println("Tamaño del mapa "+ejemploMapaHash.size());
        
        
        
        
        
        //ejemploHash();
    }
    
    public static void verElementosHash(Collection coll){
        Iterator iter = coll.iterator();
        while(iter.hasNext()){
        String datos = (String) iter.next();
            System.out.println(datos+" ");
        }
        System.out.println();
    }
    
        
    private static void ejemploHash() {
        Map<String, Object> datos = new HashMap<>();
        datos.put("dato1", "Hola");
        datos.put("datos2", 3);
        System.out.println(datos);
        
//        datos.remove("dato1");//elimina esa clave
//        datos.replace("dato1", datos); //actualiza
//        datos.keySet();
//        datos.entrySet();
//        datos.get("dato1");
for(Object i: datos.values()){
    System.out.println("->"+datos.entrySet());
}
datos.clear();//elimina todo

HashMap<String, Integer> hashMap = new HashMap<>();
hashMap.put("A", 1);
if (hashMap.containsKey("A")) {
    System.out.printf("Contiene la clave A. Su valor es: %d\n", hashMap.get("A"));
}

if (hashMap.containsValue(0)) {
    System.out.println("Contiene el valor 0");
}

int aparicionesDeA = hashMap.get("A");
hashMap.remove("A");

// Ahora ponemos varios elementos para imprimirlos
hashMap.put("A", 1);
hashMap.put("E", 12);
hashMap.put("I", 15);
hashMap.put("O", 0);
hashMap.put("U", 0);
for (HashMap.Entry<String, Integer> entry : hashMap.entrySet()) {
    System.out.printf("Clave: %s. Valor: %d\n", entry.getKey(), entry.getValue());
}
    }

    private static void ejemploTreeset() {
        
        
        SortedSet ejemploConjuntoTreeSet = new TreeSet();
        ejemploConjuntoTreeSet.add("Elemento 1");
        ejemploConjuntoTreeSet.add("Elemento 2");
        ejemploConjuntoTreeSet.add("Elemento 3");
        ejemploConjuntoTreeSet.add("Elemento 4");
        
        System.out.println("Conjunto de dato de tipo tree");
        mostrar_elementos(ejemploConjuntoTreeSet);
        
        System.out.println("El ultimo dato del conjunto es "
                + "\n"+ejemploConjuntoTreeSet.last());
        System.out.println("El primer dato del conjunto es "
                + "\n"+ejemploConjuntoTreeSet.first());
        
        System.out.println(ejemploConjuntoTreeSet.contains("elemento 1"));
        ejemploConjuntoTreeSet.remove("Elemento 3");
        for(Object listaTree: ejemploConjuntoTreeSet){
            System.out.println(listaTree);
        }
        
        ejemploConjuntoTreeSet.clear();
        System.out.println(ejemploConjuntoTreeSet.size());
    }

    private static void ejemploHashSet() {
     
        
        HashSet<Integer> numerosHash = new HashSet<>();
        numerosHash.add(12);
        numerosHash.add(163);
        numerosHash.add(987);
        numerosHash.add(12398);
        
        for(Integer datoslista: numerosHash){
            System.out.println(datoslista);
        }
        
        numerosHash.remove(2);
        System.out.println(numerosHash.contains(12));
        System.out.println(numerosHash.isEmpty());
        System.out.println(numerosHash.size());
        numerosHash.clear();
        System.out.println(numerosHash.isEmpty());
        
//        for(int i=0; i<numerosHash.size();i++){
//            if(numerosHash.contains(i)){
//                System.out.println(i+ " fue encontrado en el hash set");
//            } else {
//                System.out.println(i+ " NO fue encontrado en el hash set");
//            }
//        }
    }

    private static void ejemploArrayList() {
       
        ArrayList<String> autos = new ArrayList<>();//crear un array list de tipo String
        autos.add("Volvo"); //agrego datos a lista por medio del metodo add
        autos.add("Ferrari");
        autos.add("Porsche");
        autos.add("Mercedes Benz");
        autos.add("BMW");
        autos.add("Audi");
        autos.add("Renault");
        autos.add("Mazda");
        autos.add("Ferrari");
        System.out.println("Listado de autos en el ArrayList");
        mostrar_elementos(autos);
        
        autos.remove(1);//elimino el elemento de la posicion 1
        autos.set(4, "Honda"); //actualizo el elemento de la posicion 4
        System.out.println(autos.size()); //el tamaño de la lista
        System.out.println(autos.isEmpty());//conozco si la lista está vacía o no true o false
        
        System.out.println(autos.contains("Mazda")); //busqueda de algun elemento
        
        System.out.println("\n");
        for(int i=0;i<autos.size();i++){
            System.out.println(autos.get(i));
        }
        
        autos.clear(); //limpia la lista y la deja vacía 
    }

    private static void ejemploLinkedList() {
        // TODO code application logic here
        
        List ejemploListaLinked = new LinkedList();//crea un objeto de tipo list 
        ejemploListaLinked.add("Elemento 1");//agrega elementos o objetos a linkedlist
        ejemploListaLinked.add("Elemento 2");
        ejemploListaLinked.add("Ejemplo 3");
        ejemploListaLinked.add("Ejemplo 4");
        
        System.out.println("Listado de elementos linked list");
        for(int i=0;i<ejemploListaLinked.size();i++){//recorre la linkedlist y los visualiza
            System.out.println(ejemploListaLinked.get(i));
        }
        System.out.println("\n");
        ejemploListaLinked.forEach(lista -> { //otra alternativa para recorre la lista linkedlist
            System.out.println("-> "+lista);
        });
        
        System.out.println(ejemploListaLinked.isEmpty()); //isempty sabrá si la lista se encuentra vacía
        ejemploListaLinked.set(2, "Elemento 3");//.set modifica o actualiza un elemento de acuerdo
        //a la posicion que se encuentre en linkedlist y el atributo a cambiar
        ejemploListaLinked.set(3, "Elemento 4");
        
        ejemploListaLinked.remove(1); //.remove eliminar un elemento de la lista de acuerdo a su posición en la misma
        System.out.println(ejemploListaLinked.size());//.size conoce el tamaño de la lista linked list
        
        mostrar_elementos(ejemploListaLinked);
        ejemploListaLinked.clear(); //.clear borra todos los elementos de la lista, es decir la lista queda vacía
        System.out.println(ejemploListaLinked.size());
    }
    
    public static void mostrar_elementos(Collection coll){
        Iterator iter = coll.iterator();
        while(iter.hasNext()){
            String elem = (String) iter.next();
            System.out.println(elem+" ");
        }
    }
    
}

