
public class OccurrencesOfWordInString {
	
	public static int CountOccurrences(String wholeString, String findString)
	{
		int count = 0;
		
		String a[] = wholeString.split(" ");
		
		for(int i=0; i<a.length; i++)
		{
			if(findString.equals(a[i]))
			{
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xyz = "rajesh rajesh rajesh ramtere rajesh";
		String findString = "rajesh";
		
		int count = CountOccurrences(xyz, findString);	
		System.out.println("Count : " +count);
	}

	
}
