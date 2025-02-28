public class Node
{
    private Payload payload;
    int nextNode;
    int prevNode;

    public Node(Payload payload)
    {
        this.payload = payload;
    }

    public void setPayload(int id, String description)
    {
        payload.setId(id);
        payload.setDescription(description);
        payload.setCurrentDate();
    }
    public Payload getPayload()
    {
        return payload;
    }

    public void setNext(int n)
    {
        nextNode = n;
    }

    public int getNext()
    {
        return nextNode;
    }

    public void setPrev(int p)
    {
        prevNode = p;
    }

    public int getPrev()
    {
        return prevNode;
    }

}