package Assignment.Enum;

public enum TypeName {
	ESSAY("Essay"),
	MULTICHOICE("Multi-choice");

	private String TypeName;

	TypeName(String typeName) {
		this.TypeName = typeName;
	}

	public String getTypeName() {
		return TypeName;
	}
}

