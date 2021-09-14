package String_2;

public class xyBalance {
	public boolean xyzThere(String str) {
		return java.util.regex.Pattern.matches(".*(?<!\\.)xyz.*", str);
	}
}
