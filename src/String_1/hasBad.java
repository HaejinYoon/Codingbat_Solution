package String_1;

public class hasBad {
	public boolean hasBadRegex(String str) {
		return java.util.regex.Pattern.matches(".?bad.*", str);
	}
}
