/**
 *
 * @author Пічкур
 */
import java.util.Date;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Laba2 {
    public static void main(String[] args) {
        List<Product> list = getList();
        list.stream().forEach(x-> System.out.println(x));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть найменування: ");
        String denomination1 = scanner.nextLine();
        System.out.println("Введене найменування:"+ denomination1);
        System.out.println(getCorrect(list,denomination1));
        System.out.println("*****************************************");

        System.out.println("Введіть ціну: ");
        int price = scanner.nextInt();
        System.out.println("Введена ціна:"+ price);
        System.out.println(getCorrect1(list,denomination1,price));
        System.out.println("Введіть місяць у форматі(01-12) ");
        int m = scanner.nextInt();
        System.out.println("Введіть день: ");
        int day = scanner.nextInt();

        Date termin = new Date(2000, m, day);
        List<Product> list2 = getCorrect2(list, termin);

        list2.stream().forEach(x-> System.out.println(x));


    }


    /**
     * перевірка заданого найменування, ціна яких не перевищує задану
     * @param list
     * @param d
     * @param price
     * @return
     *
     */
    public static List getCorrect1(List<Product> list, String d, int price){ //приймає список, змінну з найменуванням, змінну з ціною
        List<Product> list2 = getCorrect(list, d);
        return list2.stream().filter(x->x.getPrice() <= price).collect(Collectors.toList());

    }

    /**
     * список товарів, термін зберігання яких більше заданого
     * @param list
     * @param termin
     * @return
     */

    public static List getCorrect2(List<Product> list, Date termin){//приймає список, змінну з датою

        return list.stream().filter(x->Checker(x.getExpiration_date(),termin)).collect(Collectors.toList());
    }

    /**
     * перевірка дати
     * @param x
     * @param m
     * @return
     */
    public static boolean Checker(MyDate x, Date m){//приймає змінну з днем, та з місяцем

        if (x.Q()>m.getMonth()){
            return true;


        }
        else if (x.Q()==m.getMonth()) {
            if (x.getDay2()>=m.getDay()){
                return true;
            }
            else {return false;}
        }
        else {return false;}
    }

    /**
     * список товарів для заданого найменування
     * @param list
     * @param d
     * @return
     */
    public static List getCorrect(List<Product> list, String d){//приймає список, та змінну з найменуванням

        return list.stream().filter(x->x.getDenomination().toLowerCase().equals(d.toLowerCase())).collect(Collectors.toList());
    }


    /**
     * створення списку
     * @return
     */
    public static List getList(){
        MyDate d1 = new MyDate(2, "червня", 19, "червня");
        Product p1 = null;
        try {
            p1 = new Product("зелений","Виробник 1",100, d1 ,200);
        } catch (Exception e) {
            System.out.println("Введений неправильний діапазон значень");
        }


        MyDate d2 = new MyDate(2, "червня", 15,"серпня");
        Product p2 = null;
        try {
            p2 = new Product("білий","Виробник 2",1000, d2 ,150);
        } catch (Exception e) {
            System.out.println("Введений неправильний діапазон значень");
        }


        MyDate d3 = new MyDate(8, "червня", 30, "серпня");
        Product p3 = null;
        try {
            p3 = new Product("чорний","Виробник 3",2699, d3 ,10);
        } catch (Exception e) {
            System.out.println("Введений неправильний діапазон значень");
        }


        MyDate d4 = new MyDate(1, "червня", 10,"червня");
        Product p4 = null;
        try {
            p4 = new Product("жовтий","Виробник 4",385, d4 ,385);
        } catch (Exception e) {
            System.out.println("Введений неправильний діапазон значень");
        }


        MyDate d5 = new MyDate(21, "червня", 29, "липня");
        Product p5 = null;
        try {
            p5 = new Product("білий","Виробник 5",8950, d5 ,4);
        } catch (Exception e) {
            System.out.println("Введений неправильний діапазон значень");
        }


        MyDate d6 = new MyDate(19, "червня", 30, "липня");
        Product p6 = null;
        try {
            p6 = new Product("жовтий","Виробник 6",10000, d6 ,1);
        } catch (Exception e) {
            System.out.println("Введений неправильний діапазон значень");
        }


        List<Product> list = new LinkedList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);

        return list;
    }



}
