
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.partner = null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        return (age >= 60 && this instanceof Woman) || (age >= 65 && this instanceof Man);
    }

    public void registerPartnership() {
        if (partner != null) {
            if (this instanceof Woman) {
                partner.lastName = this.lastName;
            } else {
                this.lastName = partner.lastName;
            }
        }
    }
}

