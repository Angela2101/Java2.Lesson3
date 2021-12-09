import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Integer arr1[] = {1, 2, 3, 4, 5, 6, 7};
        String arr2[] = {"X", "Y", "Z"};
        swap(arr1, 1, 4);
        swap(arr2, 0, 2);

        //Задание 2
        Box<Orange> or = new Box<>();
        Box<Orange> or1 = new Box<>();
        Box<Apple> ap = new Box<>();
        Box<Apple> ap1 = new Box<>();
        System.out.println("Задание 2");
        System.out.println("AddFruit: ");
        or.addFruit(new Orange(),10);
        or1.addFruit(new Orange(), 6);
        ap.addFruit(new Apple(),15);
        ap1.addFruit(new Apple(),4);
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());
        System.out.println("Compare(): ");
        System.out.println("Box 1 equals box 3: "+or.compare(ap));
        System.out.println("Box 2 equals box 4: "+or1.compare(ap1));
        System.out.println("Pour(): ");
        or.pour(or1);
        ap.pour(ap1);
        System.out.println("GetWeight(): ");
        System.out.println("Box 1: "+or.getWeight());
        System.out.println("Box 2: "+or1.getWeight());
        System.out.println("Box 3: "+ap.getWeight());
        System.out.println("Box 4: "+ap1.getWeight());

    }

    public static void swap(Object[] arr, int n1, int n2){
        System.out.println("Задача 1: "+ Arrays.toString(arr));
        Object sw = arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=sw;
        System.out.println("Результат замены: "+Arrays.toString(arr)+"\n================================");
    }
}
