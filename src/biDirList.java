import java.util.ArrayList;

public class biDirList
{
    private ArrayList<Node> List = new ArrayList<>();
    private Node temp;


    public int getListSize()
    {
        return List.size();
    }
    public void addNodeToList(int i,Node n)
    {
        temp = n;
        if(i != 0)
            i--;
        List.add(i,temp);
        setNextNode();
        setPrevNode();
    }
    public void removeNodeAtIndex(int i)
    {
        i--;
        List.remove(i);
        setNextNode();
        setPrevNode();
    }
    public Node getNodeAtIndex(int i)
    {
        return List.get(i);
    }


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
