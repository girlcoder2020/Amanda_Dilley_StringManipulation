
public class StringManipulator {
	public String trimAndConcat(String letter1, String letter2) {
		return letter1.trim() + letter2.trim();
	}
	
	public Integer getIndexOrNull(String song, char aa) {
		return song.indexOf(aa);
	}
	
	public Integer getIndexOrNull(String fire, String wind) {
		return fire.indexOf(wind);
	}
	
	public String concatSubstring(String lass, int c, int d, String goob) {
		return lass.substring(c, d) + goob;
	}
	
}
