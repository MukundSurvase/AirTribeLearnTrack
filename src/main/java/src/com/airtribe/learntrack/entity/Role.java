package src.com.airtribe.learntrack.entity;

public enum Role {
    STUDENT(1),
    INSTUCTOR(2),
    COORIDINATOR(3),
    ADMIN(4);

    private final int code;
    Role(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // Factory method
    public static Role fromInput(int input) {
        for (Role type : values()) {
            if (type.code == input) {
                return type;
            }
        }
        // default to first value
        return values()[0];
    }
}
