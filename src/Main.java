import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        BiDirList biList = new BiDirList();

        boolean x = true;
        int choice;

        do
        {
            System.out.println("|~~~~~|~~~~~|~~~~~|~~~~~|~~~~~|~~~~~|~~~~~|~~~~~|\n");
            System.out.println("1. Add a node after the current one\n2. Remove current node\n3. Go to the next node\n4. Go to the previous node\n5. Print the entire List\n6. Exit the code\n");
            if(biList.isEmpty())
                System.out.println("Currently, the list is empty.");
            else
                System.out.println("Currently pointing at the node with ID: "+biList.getNode().getPayload().getId());
            System.out.print("\n-What would you like to do: ");
            choice = scanner.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    System.out.print("Insert your ID: ");
                    int tempID = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Insert a description if needed: ");
                    String tempDesc = scanner.nextLine();

                    Payload p = new Payload(tempID, tempDesc);
                    Node node = new Node(p);

                    biList.addNodeToList(node);
                    break;
                case 2:
                    if(biList.removeNodeAtIndex() == -1)
                        System.out.println("Unable to remove the node because the list it's empty!");
                    else
                        System.out.println("Node removed!");
                    break;
                case 3:
                    biList.increaseIndex();
                    break;
                case 4:
                    biList.decreaseIndex();
                    break;
                case 5:
                    String s = biList.printEntireList();
                    System.out.println(s);
                    break;
                case 6:
                    x = false;
                    break;
            }
        }while(x);
    }
}