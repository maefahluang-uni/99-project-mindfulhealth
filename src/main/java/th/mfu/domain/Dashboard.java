package th.mfu.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

//TODO: add proper annotation
@Entity
public class Dashboard {
    
      //TODO: add proper annotation
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
      private String firstName;
      private String lastName;
      private String email;
  
      //TODO: add proper annotation for relationship 
      @OneToOne(cascade = CascadeType.MERGE)
      @JoinColumn(name = "user_id")

    private Profile profile;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Profile getProfile() {
        return profile;
    }
    public void setSeat(Profile seat) {
        this.profile = seat;
    } 
}