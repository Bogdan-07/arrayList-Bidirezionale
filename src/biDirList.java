import java.util.ArrayList;

public class biDirList
{
    public ArrayList<Node> List = new ArrayList<>();
    private Node temp;

    public void addNodeToList(Node n)
    {
        temp = n;
        List.add(temp);
        setNextNode();

    }

    public Node getNodeAtIndex(int i)
    {
        return List.get(i);
    }
    public void removeNodeAtIndex(int i)
    {
        i--;
        List.remove(i);
        setNextNode();
    }




    private void setNextNode()
    {
        if(List.size() == 1)
            temp.setNext(0);
        else
        {
            int dim = List.size();
            int j = dim - 1;

            for(int i = 0; i < dim; i++)
            {
                temp = List.get(i);
                List.remove(i);
                if(j != 0)
                {
                    temp.setNext(dim - j);
                    List.add(i, temp);
                    j--;
                }
                else
                {
                    temp.setNext(j);
                    List.add(i,temp);
                }
            }
        }
    }
    private void setNextPrev()
    {
        //if(List.size() == 1)

    }
}
