import java.util.ArrayList;

public class PigLatinConverter {
	/**
	 * Constructor for PigLatinConverter
	 * @param s Input String
	 */
	public PigLatinConverter(String s) {
		char[] splitIn = s.toCharArray();
		ArrayList<Character> splitArray = new ArrayList<>();
		for(char c : splitIn)
			splitArray.add(c);
		this.convertToPL(splitArray);
	}
	
	private void convertToPL(ArrayList<Character> splitArray) {
		char first = splitArray.get(0);
		char second = splitArray.get(1);
		String out = "";
		if(isVowel(first)) {
			splitArray.add('a');
			splitArray.add('y');
			out = getStringRepresentation(splitArray);
		}else if (isConsonant(first)) {
			if(isVowel(second)) {
				splitArray.remove(0);
				splitArray.add(first);
				splitArray.add('a');
				splitArray.add('y');
				out = getStringRepresentation(splitArray);
			}else if (isConsonant(second)){
				splitArray.remove(0);
				splitArray.remove(0);
				splitArray.add(first);
				splitArray.add(second);
				splitArray.add('a');
				splitArray.add('y');
				out = getStringRepresentation(splitArray);
			}
		}
		System.out.println(out);
	}

	private boolean isVowel(Character c) {
		boolean hasvowel = false;
		switch (c) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				hasvowel=true;
		}
		
		return hasvowel;
	}
	
	private boolean isConsonant(Character c) {
		return !(isVowel(c));
	}
	
	private String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}
}
