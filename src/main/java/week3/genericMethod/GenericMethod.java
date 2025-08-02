package week3.genericMethod;

public class GenericMethod {

    // Verilen herhangi bir türdeki dizinin elemanlarını ekrana yazdıran generic metot
    public static <T> void printArray(T[] array) {
        for (T arrayPrint : array){
            System.out.print(arrayPrint + " ");
        }
        System.out.println();
    }
}
