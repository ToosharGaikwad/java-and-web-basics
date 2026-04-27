package Array;

public class LongestString2 {

	public static String longestString(String s) {
		String s2[] = s.split(" ");
		String longer = "";
//		String second = "";
		int len = s2.length;
		for(int i=0;i<len;i++)
		{
			if(s2[i].length()>longer.length())
			{
//				second = longer;
				longer=s2[i];
			}
		}
		return longer;
//		return second;
		
	}
	public static void main(String[] args) {
		String s = "dlkjpl dkj sllld dhhhdlk dkk dkikdh ";
		System.out.println(longestString(s));
	}
}
