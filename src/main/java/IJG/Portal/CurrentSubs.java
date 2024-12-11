package IJG.Portal;
import jakarta.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "current_subs")
public class CurrentSubs {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "expiry_date")
    private Date expiryDate;

    //@OneToOne
    //@JoinColumn(name = "id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "Client"))
    //private Clients client;

    //@OneToOne
    //@JoinColumn(name = "id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "Client"))
    // @Column(name = )
    // private Clients client;

    // Constructors
    public CurrentSubs() {
    }

    public CurrentSubs(int id, Date expiryDate) {
        this.id = id;
        this.expiryDate = expiryDate;
        //this.client = client;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    // public Clients getClient() {
    //     return client;
    // }

    // public void setClient(Clients client) {
    //     this.client = client;
    // }

    @Override
    public String toString() {
        return "Subscription Details {" +
                "id=" + id +
                ", expiryDate=" + expiryDate +
                // ", client=" + client +
                '}';
    }
}
