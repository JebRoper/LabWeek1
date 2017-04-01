/**
 * Created by admin on 3/29/17.
 */
public class Dog extends Mammal {
    private String name;

    public Dog(String gender, String name) {
        super(gender);
        this.name = name;
        commonName="Dog";

    }

    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return "bow wow";
    }


    @Override
    public boolean hasFur() {
        return super.hasFur();
    }

    public boolean hasTeeth() {
        return true;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}' + super.toString();
    }
}
