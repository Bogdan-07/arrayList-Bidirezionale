import java.time.LocalDateTime;

public class Payload
{
    private int id;
    private String description;
    private LocalDateTime currentDate;

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setId(int inputId)
    {
        id = inputId;
    }

    public int getId()
    {
        return id;
    }

    public void setCurrentDate()
    {
        currentDate = LocalDateTime.now();
    }

    public LocalDateTime getCurrentDate()
    {
        return currentDate;
    }

}