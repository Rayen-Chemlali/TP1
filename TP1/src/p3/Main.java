package p3;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Object object1=new Object("1");
        Object object2=new Object("Rayen");
        Object object3=new Object("Gold Digger");
        Object object4=new Object("Hello");
        CustomArrayList Array1=new CustomArrayList();
        Array1.add(object1);
        Array1.add(object2);
        Array1.add(object3);
        Array1.add(5,object4);
        Array1.content();
        System.out.println(Array1.isEmpty());
        System.out.println(Array1.size());
        System.out.println(Array1.isIn(object1));
        System.out.println(Array1.get(1));
        Array1.remove(object2);
        Array1.content();
    }
}