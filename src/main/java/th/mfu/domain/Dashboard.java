package th.mfu.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dashboard {

    @Id
    private Long id;

    private String title;
    private String description;

    public Dashboard() {
        // Default constructor
    }

    public Dashboard(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        // Initialize other properties as needed
    }

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
