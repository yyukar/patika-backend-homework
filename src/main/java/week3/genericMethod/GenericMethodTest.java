package week3.genericMethod;

public class GenericMethodTest {

    public static void main(String[] args) {

        // Integer ve String türünde dizi oluşturuluyor
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};

        // Generic metot çağrılarak diziler yazdırılıyor
        GenericMethod.printArray(intArray);
        GenericMethod.printArray(strArray);
    }
}
