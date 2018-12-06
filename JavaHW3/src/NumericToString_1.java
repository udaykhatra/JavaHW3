import java.util.Arrays;
    public class NumericToString_1 {
        public static void main(String[] args){

            int[] array1 = {
                    5, 10, 8, 6, 1,
                    3, 7, 15, 12, 11,
                    2, 14,4,13, 9};

            String[] array2 = {
                    "Rajkot",
                    "Amreli",
                    "Surat",
                    "Navsari",
                    "Ahmedabad",
                    "Baroda",
                    "Junagadh"
            };
            System.out.println("Original numeric array : "+Arrays.toString(array1));
            Arrays.sort(array1);
            System.out.println("Sorted numeric array : "+Arrays.toString(array1));

            System.out.println("Original string array : "+Arrays.toString(array2));
            Arrays.sort(array2);
            System.out.println("Sorted string array : "+Arrays.toString(array2));
        }


}
