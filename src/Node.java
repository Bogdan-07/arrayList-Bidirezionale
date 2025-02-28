public class Node
{
    private Payload payload;
    int nextNode;
    int prevNode;

    public Node(Payload payload)
    {
        this.payload = payload;
    }

    public void setPayload(String description, int id)
    {
        payload.setDescription(description);
        payload.setId(id);
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