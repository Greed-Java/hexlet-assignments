package exercise;

// BEGIN
class ReversedSequence implements CharSequence{
    String string;

    public ReversedSequence(String string) {
        char[] array = string.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        this.string = result;
    }

    @Override
    public int length() {
        char[] array = string.toCharArray();
        return array.length;
    }

    @Override
    public char charAt(int i) {
        char[] array = string.toCharArray();
        return array[i];
    }

    @Override
    public String toString() {
        return string;
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return string.substring(i, i1);
    }
}
// END
