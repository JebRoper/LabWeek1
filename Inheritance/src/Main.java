import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        Dog dog = new Dog("female", "fido");
        System.out.println(dog);
        System.out.println("Speak= " + dog.speak());
        System.out.println("warm blooded=" + dog.isWarmBlooded());
        System.out.println("has fur=" + dog.hasFur());
        System.out.println("has teeth=" + dog.hasTeeth());
    }
}


