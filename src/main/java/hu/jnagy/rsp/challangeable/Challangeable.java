package hu.jnagy.rsp.challangeable;

public abstract class Challangeable {

	public abstract boolean beats(Challangeable challangeable);

	public abstract Type getType();

	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
