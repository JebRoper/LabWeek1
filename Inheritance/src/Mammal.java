/**
 * Created by admin on 3/29/17.
 */
public abstract class Mammal extends Vertebrate {

    public Mammal(String gender) {
        super(gender);
    }

    public final boolean isWarmBlooded() {
        return true;
    }

    public boolean hasFur() {
        return true;
    }

}
