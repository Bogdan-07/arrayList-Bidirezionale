public class Main
{
    public static void main(String[] args)
    {
        biDirList al = new biDirList();

        Payload p1 = new Payload();
        p1.setId(1);
        p1.setDescription("uno");
        p1.setCurrentDate();
        Node n1 = new Node(p1);

        Payload p2 = new Payload();
        p2.setId(2);
        p2.setDescription("due");
        p2.setCurrentDate();
        Node n2 = new Node(p2);

        Payload p3 = new Payload();
        p3.setId(3);
        p3.setDescription("tre");
        p3.setCurrentDate();
        Node n3 = new Node(p3);


        al.addNodeToList(n1);
        al.addNodeToList(n2);
        al.addNodeToList(n3);

        System.out.println("La lista e' lunga: "+ al.List.size());
        System.out.println("Ecco a chi punta ciascun oggetto");
        for (int i = 0; i< al.List.size(); i++)
            System.out.println("il nodo nr."+i+" punta al nodo nr.: "+ al.List.get(i).getNext());

        System.out.println("\n\n");

        al.removeNodeAtIndex(2);
        System.out.println("La lista e' lunga: "+ al.List.size());
        System.out.println("Ecco a chi punta ciascun oggetto dopo aver tolto il nodo 2");
        for (int i = 0; i< al.List.size(); i++)
            System.out.println("il nodo avente id "+al.List.get(i).getPayload().getId()+" punta al nodo nr.: "+ al.List.get(i).getNext());
    }
}