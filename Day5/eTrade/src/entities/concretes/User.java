package entities.concretes;

import entities.abstracts.BaseUser;

public class User extends BaseUser {
    private String firstName;
    private String lastName;

    public User() {
    }

    public User(int id, String email, String password, String firstName, String lastName) {
        super(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
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
}
