package hu.jnagy.rsp.challangeable;

public class Rock extends Challangeable {

    @Override
    public boolean beats(Challangeable challangeable) {
        return Type.SCISSORS == challangeable.getType();
    }

    public Type getType() {
        return Type.ROCK;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
