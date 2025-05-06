public class Node
{
    private Payload payload;
    int nextNode;
    int prevNode;

    //Constructor

    public Node(Payload payload)
    {
        this.payload = payload;
    }

    //Payload

    public void setPayload(int id, String description)
    {
        payload.setId(id);
        payload.setDescription(description);
        payload.setTimeStamp();
    }
    public Payload getPayload()
    {
        return payload;
    }

    //Next

    public void setNext(int n)
    {
        nextNode = n;
    }
    public int getNext()
    {
        return nextNode;
    }

    //Prev

    public void setPrev(int p)
    {
        prevNode = p;
    }
    public int getPrev()
    {
        return prevNode;
    }
}