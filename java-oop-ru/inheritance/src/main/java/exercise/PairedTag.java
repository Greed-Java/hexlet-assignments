package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends SingleTag {
    String tegBody;
    List<Tag> childs;

    public PairedTag(String tagName, Map<String, String> tegAttributes, String tegBody, List<Tag> childs) {
        super(tagName, tegAttributes);
        this.tegBody = tegBody;
        this.childs = childs;
    }


    public String toString() {
        if (tegAttributes.isEmpty()) return "<" +
                tagName +
                ">" + "</" + tagName + ">";
        String result1 = childs.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining(""));
        String result = tegAttributes.entrySet().stream().map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(" "));
        return "<" + tagName + " " + result + ">" + tegBody + result1 + "</" + tagName + ">";
    }
}
// END
