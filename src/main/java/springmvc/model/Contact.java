package springmvc.model;

public class Contact {
	private long number;

	@Override
	public String toString() {
		return "Contact [number=" + number + "]";
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}
}
