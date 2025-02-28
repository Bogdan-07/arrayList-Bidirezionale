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
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("1. Add a node after the current one\n2. Remove current node\n3. Display on screen and save in the 'temp' object the ID, description, and the last modification date of the current node\n4. Go to the next node\n5. Go to the previous node\n6. Exit the code\n");
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
                    Payload p = new Payload();
                    Payload temp;
                    System.out.print("Insert your ID: ");
                    p.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Insert a description if needed: ");
                    p.setDescription(scanner.nextLine());
                    Node node = new Node(p);
                    biList.addNodeToList(node);
                    break;
                case 2:
                    biList.removeNodeAtIndex();
                    break;
                case 3:

                    if(!(biList.printNodeAtIndex()== null))
                    {
                        temp = biList.printNodeAtIndex().getPayload(); //new discovery
                        System.out.println("This node was modified by ID: " + temp.getId() + " on the following date: " + temp.getCurrentDate() + " and left the following description: " + temp.getDescription()+"\n");
                    }
                        break;
                case 4:
                    biList.increaseIndex();
                    break;
                case 5:
                    biList.decreaseIndex();
                    break;
                case 6:
                    x = false;
                    break;
            }
        }while(x);



    }
}