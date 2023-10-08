package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private String newTag;
    private TagInterface subTag;

    public LabelTag(String newTag, TagInterface subTag) {
        this.newTag = newTag;
        this.subTag = subTag;
    }

    @Override
    public String render() {
        return "<label>" + newTag + subTag.render() + "</label>";
    }
}
// END
