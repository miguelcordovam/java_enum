package old;

public enum Actions {
    RUN ("run"), WALK ("walk"), EAT("eat"), CRY("cry"), JUMP("jump");

    private String name;

    Actions(String name) {
        this.name = name;
    }
}
