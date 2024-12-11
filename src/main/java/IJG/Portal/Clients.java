package IJG.Portal;

import jakarta.persistence.*;

@Entity
@Table(name = "clients", schema = "mydb") // Specify the table name and schema if needed
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use this if `ID` is auto-incremented
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "Name", length = 45)
    private String name;

    @Column(name = "Email", length = 45)
    private String email;

    @Column(name = "SubCount")
    private Integer subCount;

    @Column(name = "Revenue")
    private Integer revenue;

    // Constructors
    public Clients() {
    }

    public Clients(Integer id, String name, String email, Integer subCount, Integer revenue) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.subCount = subCount;
        this.revenue = revenue;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getSubCount() {
        return subCount;
    }

    public void setSubCount(Integer subCount) {
        this.subCount = subCount;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subCount=" + subCount +
                ", revenue=" + revenue +
                '}';
    }
}
