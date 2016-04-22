package iut.tdd;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int tmp = 0;
		char[] chiffreRomain = new char[]{'I', 'V', 'X', 'L', 'C', 'D','M'};
		int[] chiffreArabe = new int[]{1, 5, 10, 50, 100, 500, 1000};
		
		return "I";
	}

	public String convertFromRoman(String roman) {
		int tmp = 0;
		char[] chiffreRomain = new char[]{'I', 'V', 'X', 'L', 'C', 'D','M'};
		int[] chiffreArabe = new int[]{1, 5, 10, 50, 100, 500, 1000};
		
		for (int i = 0; i < roman.length(); i++) {
			for (int j = 0; j < chiffreRomain.length; j++) {
				if (i + 1 < roman.length()) {
					if (roman.charAt(i) == 'I' && roman.charAt(i+1) != 'I') {
						tmp -= 1;
						i += 1;
					}
				}
				if (roman.charAt(i) == chiffreRomain[j]) {
					tmp += chiffreArabe[j];
					
				}
			}
		}
		return tmp + "";
	}
}
