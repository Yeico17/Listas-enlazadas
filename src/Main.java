
public class Main {
    public static void main(String[] args) {
        MiLista lista = new MiLista();

        System.out.println("¿Está vacía? " + lista.isEmpty());

        // insertTail / add
        lista.add(10);
        lista.insertTail(20);
        lista.insertTail(30);
        System.out.println("Después de insertTail: " + lista);

        // insertHead
        lista.insertHead(5);
        System.out.println("Después de insertHead: " + lista);

        // getSize
        System.out.println("Tamaño: " + lista.getSize());

        // getHead / getTail
        System.out.println("Head: " + lista.getHead());
        System.out.println("Tail: " + lista.getTail());

        // search / contains
        ListNode nodo20 = (ListNode) lista.search(20);
        System.out.println("¿Contiene 20? " + lista.contains(20));

        // insert(node, object) - después de un nodo dado
        lista.insert(nodo20, 25);
        System.out.println("Después de insert tras 20: " + lista);

        // insert(Object referencia, Object nuevo) - por valor
        lista.insert(30, 35);
        System.out.println("Después de insert tras 30 (por valor): " + lista);

        // getBeforeTo / getNextTo
        System.out.println("Antes de 20: " + lista.getBeforeTo(nodo20));
        System.out.println("Después de 20: " + lista.getNextTo(nodo20));

        // set
        lista.set(nodo20, 99);
        System.out.println("Después de set nodo20=99: " + lista);

        // get
        System.out.println("get(nodo20): " + lista.get(nodo20));

        // toArray
        Object[] arreglo = lista.toArray();
        System.out.print("toArray: ");
        for (Object o : arreglo) System.out.print(o + " ");
        System.out.println();

        // toArray(Object[])
        Object[] destino = new Object[10];
        lista.toArray(destino);
        System.out.print("toArray(destino): ");
        for (Object o : destino) System.out.print(o + " ");
        System.out.println();

        // sortList
        MiLista ordenada = lista.sortList();
        System.out.println("Lista ordenada: " + ordenada);

        // subList
        ListNode desde = (ListNode) lista.search(99);
        ListNode hasta = (ListNode) lista.search(30);
        MiLista sub = lista.subList(desde, hasta);
        System.out.println("subList(99 a 30): " + sub);

        // remove
        lista.remove(nodo20);
        System.out.println("Después de remove nodo20: " + lista);

        // clear
        lista.clear();
        System.out.println("Después de clear: " + lista);
        System.out.println("¿Está vacía? " + lista.isEmpty());
    }
}
