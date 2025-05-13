package Encapsulation;
class Book {
    private int page_no;
    public void setData(int x) {
        if (x > 0) {
            page_no = x;
        } else {
            System.out.println("Invalid Data!");
        }
    }
    public int getData() {
        if (page_no > 0) {
            return page_no;
        } else {
            System.out.println("Empty Book");
            return 0;
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Book b = new Book();
        b.setData(100);
        System.out.println(b.getData()); 
    }
}
