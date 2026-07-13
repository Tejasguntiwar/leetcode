import java.util.Hashtable;
class Solution {
    public static final Map<Integer, Boolean> SEQUENTIAL_DIGITS = new LinkedHashMap<>();
    static {
        // 2 digits
        SEQUENTIAL_DIGITS.put(12, true);
        SEQUENTIAL_DIGITS.put(23, true);
        SEQUENTIAL_DIGITS.put(34, true);
        SEQUENTIAL_DIGITS.put(45, true);
        SEQUENTIAL_DIGITS.put(56, true);
        SEQUENTIAL_DIGITS.put(67, true);
        SEQUENTIAL_DIGITS.put(78, true);
        SEQUENTIAL_DIGITS.put(89, true);
        
        // 3 digits
        SEQUENTIAL_DIGITS.put(123, true);
        SEQUENTIAL_DIGITS.put(234, true);
        SEQUENTIAL_DIGITS.put(345, true);
        SEQUENTIAL_DIGITS.put(456, true);
        SEQUENTIAL_DIGITS.put(567, true);
        SEQUENTIAL_DIGITS.put(678, true);
        SEQUENTIAL_DIGITS.put(789, true);
        
        // 4 digits
        SEQUENTIAL_DIGITS.put(1234, true);
        SEQUENTIAL_DIGITS.put(2345, true);
        SEQUENTIAL_DIGITS.put(3456, true);
        SEQUENTIAL_DIGITS.put(4567, true);
        SEQUENTIAL_DIGITS.put(5678, true);
        SEQUENTIAL_DIGITS.put(6789, true);
        
        // 5 digits
        SEQUENTIAL_DIGITS.put(12345, true);
        SEQUENTIAL_DIGITS.put(23456, true);
        SEQUENTIAL_DIGITS.put(34567, true);
        SEQUENTIAL_DIGITS.put(45678, true);
        SEQUENTIAL_DIGITS.put(56789, true);
        
        // 6 digits
        SEQUENTIAL_DIGITS.put(123456, true);
        SEQUENTIAL_DIGITS.put(234567, true);
        SEQUENTIAL_DIGITS.put(345678, true);
        SEQUENTIAL_DIGITS.put(456789, true);
        
        // 7 digits
        SEQUENTIAL_DIGITS.put(1234567, true);
        SEQUENTIAL_DIGITS.put(2345678, true);
        SEQUENTIAL_DIGITS.put(3456789, true);
        
        // 8 digits
        SEQUENTIAL_DIGITS.put(12345678, true);
        SEQUENTIAL_DIGITS.put(23456789, true);
        
        // 9 digits
        SEQUENTIAL_DIGITS.put(123456789, true);
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list = new ArrayList<>();
        for(Integer n : SEQUENTIAL_DIGITS.keySet()) {
            if(low <= n && n <= high) list.add(n);
        }
        // int first_digit = low;
        // while(first_digit >= 10) {
        //     first_digit /= 10;
        // }
        // // System.out.println(first_digit);
        // int num = first_digit;
        // List<Integer> list = new ArrayList<>();
        // // list.add(num);
        // for(int i = first_digit+1; num < high; i++) {
        //     num *= 10;
        //     num += i;
        //     System.out.println(i + " " + num);
        //     if(num >= low && num <= high)
        //     list.add(num);

        //     if(num > high) break;
        // }
        return list;
    }
}