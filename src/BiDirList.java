import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BiDirList
{
    private ArrayList<Node> List = new ArrayList<>();
    private Node temp;
    private final int head = 0;
    private int index = head;

    //Constructor

    public BiDirList()
    {

    }

    //IsEmpty

    public boolean isEmpty()
    {
        return List.isEmpty();
    }

    //Index

    public void increaseIndex()
    {
        if(index == List.size()-1)
            index = head;
        else
            index++;
    }
    public void decreaseIndex()
    {
        if(index == 0)
            index = List.size()-1;
        else
            index--;
    }

    //Manage List

    public void addNodeToList(Node n)
    {
        if(List.size() > 1)
            increaseIndex();
        temp = n;
        List.add(index, temp);
        setNextNode();
        setPrevNode();

    }
    public Node getNode()
    {
        return List.get(index);
    }
    public int removeNodeAtIndex()
    {
        if(isEmpty())
            return -1;
        else
            List.remove(index);
        setNextNode();
        setPrevNode();
        return 0;
    }

    public String printEntireList()
    {
        if(isEmpty())

            return "Unable to print the list because it's empty!\n";
        else
        {
            String a = "";
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d E yyyy, H:m:ss");

            for (Node tot : List)
                a =   ("Node:\n"
                        + "\tID: "  + tot.getPayload().getId() + "\n"
                        + "\tDescription: "  + tot.getPayload().getDescription() + "\n"
                        + "\tTimeStamp: "  + tot.getPayload().getTimeStamp().format(formatter) + "\n"
                    ) + a;
            return a;
        }
    }

    //Next & Prev

    private void setNextNode()
    {
        if(List.size() == 1)
            temp.setNext(0);
        else
        {
            int dim = List.size();
            int j = dim -1;

            for(int i = 0; i < dim; i++)
            {
                temp = List.get(i);
                List.remove(i);
                if(j != 0)
                {
                    temp.setNext(dim - j);
                    j--;
                }
                else
                    temp.setNext(j);
                List.add(i, temp);
            }
        }
    }
    private void setPrevNode()
    {
        if(List.size() == 1)
            temp.setPrev(0);
        else
        {
            int dim = List.size()-1;
            int j = 1;

            for(int i = dim; i >= 0; i--)
            {
                temp = List.get(i);
                List.remove(i);
                if(i == 0)
                    temp.setPrev(dim);
                else if (i == 1)
                    temp.setPrev(0);
                else
                {
                    temp.setPrev(dim - j);
                    j++;
                }
                List.add(i, temp);
            }
        }
    }
}