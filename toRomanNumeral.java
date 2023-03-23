public static String toRomanNumeral(int number) {
    if (number < 1 || number > 3999) {
        throw new IllegalArgumentException("Number must be between 1 and 3999");
    }
    
    String[] thousands = {"", "M", "MM", "MMM"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    
    StringBuilder roman = new StringBuilder();
    roman.append(thousands[number / 1000]);
    roman.append(hundreds[(number % 1000) / 100]);
    roman.append(tens[(number % 100) / 10]);
    roman.append(ones[number % 10]);
    
    return roman.toString();
}

int number = 42;
String roman = toRomanNumeral(number);
System.out.println(number + " in Roman numerals is " + roman);
