package Array;

public class LongestString {
	
	
//	public static String longest(String s) {
//		String[] words = s.split(" ");
//		
//		String longestword = "";
//		
//		for(String word:words) {
//			
//			if(word.length()>longestword.length()) {
//				longestword = word;
//			}
//		}
//		return longestword;
//		
//	}
	
	
	public static void longestString (String str)
	{
		String str2[] = str.split(" ");
		int len = str2.length;
		String longest = "";
		
		for(int i =0;i<len;i++)
		{
			if(str2[i].length()>longest.length())
			{
				longest= str2[i];
			}
		}
		System.out.println(longest);
		
	}
	
	
	
	
	
public static void main(String[] args) {
	String ss = "vaibhav khup ma.....od ahe is a good boy";
	 
//	System.out.println(longest(ss));
	longestString(ss);
}
}
