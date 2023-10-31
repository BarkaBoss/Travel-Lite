package ng.com.nokt.travellite.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity(name = "user")
public class User {

    @Id
    private Long id;

    @NotNull
    private String email;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String phoneNumber;

    @CreationTimestamp
    private Date create_at;

    @UpdateTimestamp
    private Date updated_at;

    @NotNull
    private Date dateOfBirth;
    private String nextOfKinFullName;
    private String nextOfKinPhoneNumber;
    private String nextOfKinEmail;

    public User() {
    }

    public User(String email, String firstName, String lastName, String phoneNumber, Date create_at, Date updated_at, Date dateOfBirth, String nextOfKinFullName, String nextOfKinPhoneNumber, String nextOfKinEmail) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.create_at = create_at;
        this.updated_at = updated_at;
        this.dateOfBirth = dateOfBirth;
        this.nextOfKinFullName = nextOfKinFullName;
        this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
        this.nextOfKinEmail = nextOfKinEmail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getNextOfKinFullName() {
        return nextOfKinFullName;
    }

    public void setNextOfKinFullName(String nextOfKinFullName) {
        this.nextOfKinFullName = nextOfKinFullName;
    }

    public String getNextOfKinPhoneNumber() {
        return nextOfKinPhoneNumber;
    }

    public void setNextOfKinPhoneNumber(String nextOfKinPhoneNumber) {
        this.nextOfKinPhoneNumber = nextOfKinPhoneNumber;
    }

    public String getNextOfKinEmail() {
        return nextOfKinEmail;
    }

    public void setNextOfKinEmail(String nextOfKinEmail) {
        this.nextOfKinEmail = nextOfKinEmail;
    }
}
