import java.time.LocalDateTime;

public class Payload
{
    private int id;
    private String description;
    private LocalDateTime currentDate;

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

    public void setCurrentDate()
    {
        currentDate = LocalDateTime.now();
    }
    public LocalDateTime getCurrentDate()
    {
        return currentDate;
    }

}