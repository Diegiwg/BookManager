package view.components;

public enum FormInputTypes {
	TEXT("t"), NUMBER("n"), FLOAT("f"), BOOLEAN("b");

	private final String value;

	FormInputTypes(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
