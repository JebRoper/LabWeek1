import java.time.LocalDate;

/**
 * Created by admin on 3/29/17.
 */
public abstract class Animal {

    private String gender;
    private LocalDate dob;
    protected String commonName = "Unknown";


    public Animal(String gender) {
        this.gender = gender;
        dob = LocalDate.now();
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public abstract String speak();

    public String getCommonName() {
        return commonName;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "gender='" + gender + '\'' +
                ", dob=" + dob +
                ", commonName='" + commonName + '\'' +
                '}';
    }
}







