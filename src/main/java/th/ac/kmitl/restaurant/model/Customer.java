package th.ac.kmitl.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {

    private   String  name;
    private   String tal;
    @Id
    private   int id;
    private String pin;
    private String gender;

    public  Customer(){ }

    public Customer(String name, String tal, int id, String pin, String gender) {
        this.name = name;
        this.tal = tal;
        this.id = id;
        this.pin = pin;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTal() {
        return tal;
    }

    public void setTal(String tal) {
        this.tal = tal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
