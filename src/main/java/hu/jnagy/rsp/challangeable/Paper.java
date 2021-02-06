package hu.jnagy.rsp.challangeable;

public class Paper extends Challangeable {

	public boolean beats(Challangeable challangeable) {
		return Type.ROCK == challangeable.getType();
	}

	@Override
	public Type getType() {
		return Type.PAPER;
	}

}
