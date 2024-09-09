class ShortExample {
    public static void main(String[] args) {
        // b. Number of bytes used to represent a short value
        System.out.println("Bytes used by short: " + Short.BYTES);

        // c. Minimum and maximum values of short
        System.out.println("Minimum value of short: " + Short.MIN_VALUE);
        System.out.println("Maximum value of short: " + Short.MAX_VALUE);

        // d. Convert short to String using Short.toString()
        short number = 1234;
        String numberString = Short.toString(number);
        System.out.println("Short to String: " + numberString);

        // e. Convert String to short using Short.parseShort()
        String strNumber = "1234";
        short parsedNumber = Short.parseShort(strNumber);
        System.out.println("String to short: " + parsedNumber);

        // f. Attempt to convert "Ab12Cd3" to short, catching NumberFormatException
        String invalidStrNumber = "Ab12Cd3";
        try {
            short invalidNumber = Short.parseShort(invalidStrNumber);
            System.out.println("String to short: " + invalidNumber);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // g. Convert short to Short using Short.valueOf()
        Short shortWrapper = Short.valueOf(number);
        System.out.println("Short to Wrapper: " + shortWrapper);

        // h. Convert String to Short using Short.valueOf()
        Short parsedWrapper = Short.valueOf(strNumber);
        System.out.println("String to Wrapper: " + parsedWrapper);

        // i. Converting short to other primitive types
        int intValue = number;
        long longValue = number;
        float floatValue = number;
        double doubleValue = number;
        byte byteValue = (byte) number;

        System.out.println("Short to int: " + intValue);
        System.out.println("Short to long: " + longValue);
        System.out.println("Short to float: " + floatValue);
        System.out.println("Short to double: " + doubleValue);
        System.out.println("Short to byte: " + byteValue);

        // Convert int to short with explicit casting
        int anotherInt = 20000;
        short shortFromInt = (short) anotherInt;
        System.out.println("Int to short: " + shortFromInt);
    }
}
