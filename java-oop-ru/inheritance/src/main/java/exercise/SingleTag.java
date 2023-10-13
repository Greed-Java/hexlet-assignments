package exercise;

import java.util.Map;
import java.util.stream.Collectors;

// BEGIN
class SingleTag extends Tag {

    Map<String, String> tegAttributes;

    public SingleTag(String tagName, Map<String, String> tegAttributes) {
        super(tagName);
        this.tegAttributes = tegAttributes;
    }

    @Override
    public String toString() {
        if (tegAttributes.isEmpty()) return "<" +
                tagName +
                ">";
        String result = tegAttributes.entrySet().stream().map(e -> e.getKey() + "=\"" + e.getValue() + "\"")
                .collect(Collectors.joining(" "));
        return "<" + tagName + " " + result + ">";
    }
}
// END
