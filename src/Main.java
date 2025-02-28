import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        biDirList biList = new biDirList();

        boolean x = true;
        int choice;

        do
        {
            System.out.println("1. Add a node...\n2. Remove a node...\n3. Show on screen ID, description and when the last change was made for each node...\n4. Exit the code\n");
            System.out.print("-What would you like to do: ");
            choice = scanner.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    Payload p = new Payload();
                    Node n = new Node(p);
                    System.out.println("Insert");

                    System.out.println("\t1. Add the node as first\n\t2. Add the node in a chosen position\n\t3. Add the node as last\n\t4. Go back\n");
                    System.out.print("-What would you like to do: ");
                    choice = scanner.nextInt();
                    switch(choice)
                    {
                        case 1:
                            biList.addNodeToList(0, n);
                            break;
                        case 2:
                            System.out.print("Insert the desired position: ");
                            biList.addNodeToList(scanner.nextInt(), n);
                            break;
                        case 3:
                            biList.addNodeToList(biList.getListSize(),n);
                        case 4:
                            break;
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    x = false;
                    break;
            }
        }while(x);



       /* for(int i = 0; i<al.List.size() ;i++)
        {
            System.out.print(("Il nodo nr ")+i+" ha come prossimo nodo il nodo nr "+al.List.get(i).getNext());
            System.out.println(" ed ha come nodo precedente il nodo nr "+al.List.get(i).getPrev());
        }

        */














    }
}