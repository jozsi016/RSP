package hu.jnagy.rsp.challangeable;

public class Scissors extends Challangeable {

    @Override
    public boolean beats(Challangeable challangeable) {
        return Type.PAPER == challangeable.getType();
    }

    @Override
    public Type getType() {
        return Type.SCISSORS;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

}
