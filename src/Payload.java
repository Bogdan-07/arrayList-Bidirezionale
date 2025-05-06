import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Payload
{
    private int id;
    private String description;
    private LocalDateTime timeStamp;
    private String lessi;

    //Constructor

    public Payload(int id, String description)
    {
        this.id = id;
        this.description = description + "";
        timeStamp = LocalDateTime.now();
    }

    //Description

    public void setDescription(String description)
    {
        this.description = description;
    }
    public String getDescription()
    {
        return description;
    }

    //Id

    public void setId(int inputId)
    {
        id = inputId;
    }
    public int getId()
    {
        return id;
    }

    //Date

    public void setTimeStamp()
    {
        timeStamp = LocalDateTime.now();
    }
    public LocalDateTime getTimeStamp()
    {
        return timeStamp;
    }

}