import java.util.Date;

public class Customer {
    private Date creationDate;

    public Customer() {
        creationDate = new Date();
    }

    //gc ma wiecej roboty
    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }


}
