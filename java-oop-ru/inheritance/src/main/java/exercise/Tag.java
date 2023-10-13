package exercise;

// BEGIN
abstract class Tag {
    String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public abstract String toString();

}
// END
