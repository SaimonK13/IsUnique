public class IsUnique {
	//method 1: time complexity => O(n^2)
	static String findUnique(String s) {
		
		char[] arr = s.toCharArray(); //parse the string into a character array
		int len = arr.length;
		
		//compare the characters with each other
		for (int i = 0; i < len; i++) {
			for (int j = len-1; j > i; j--) {
				if(arr[i] == arr[j]) {
					return "All characters are not unique"; //if 2 characters are same, they are not unique
				}
			}
		}
		
		return "All characters are unique";
	}
	
	//method 2: time complexity: O(n)
	static String findUnique2(String s) {
		
		//create a an array for 128 ASCII characters
		boolean[] arr = new boolean[128];
		
		//iterate over the string
		for (int i = 0; i < s.length(); i++) {
			int charVal = s.charAt(i);//take integer value of character
			if(arr[charVal]) {
				return "All characters are not unique"; //if the character already exists, return "not unique"
			}
			else
				arr[charVal] = true;
		}
		
		return "All characters are unique";
	}

	//main method
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println("Method 1: " + findUnique(str));
		System.out.println("Method 2: " + findUnique2(str));
	}

}
