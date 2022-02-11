import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tạo đối tượng thuộc lớp Book
        Book b1 = new Book("Arknights","Yostar",27000,2.7,1);
        Book b2 = new Book("Revived Witch","Yostar",12000,1.2,2);
        Book b3 = new Book("Epic Seven","Smilegate",25000,25,3);
        Book b4 = new Book("Fate Grand Order","Aniplex",16000,16,4);
        Book b5 = new Book("Punishing Gray Raven","Kuro Technology",7000,7,5);
        Book[] bks = {b1,b2,b3,b4,b5};
        String[] bookname = {b1.name,b2.name,b3.name,b4.name,b5.name};

        //Hiện thông tin tổng
        int totalQuantity = getSumQuantity(bks);
        System.out.println("Tổng khối lượng của sách hiện có: ");
        System.out.println(totalQuantity + " cuốn");
        int totalPrice = getSumPrice(bks);
        System.out.println("Tổng số tiền để mua hết sách: ");
        System.out.println(totalPrice + "JPY");

        //Lấy thông tin người dùng nhập
        String search;
        System.out.println("Nhập tên cuốn sách bạn đang tìm");
        System.out.println("Gõ Exit để thoát khỏi chương trình");
        do {
            search = sc.nextLine();

            //Kiểm tra xem sách nhập vào có tồn tại trong thư viện không
            boolean check = false;
            for (int i = 0; i < bookname.length; i++){
                if (search.equals(bookname[i])){
                    check = true;
                    break;
                }
            }

            //Tìm thông tin nếu tên sách nhập vào có tồn tại
            if (check) {
                for (int i = 0; i < bookname.length; i++) {
                    if (search.equals(bookname[i])) {
                        System.out.println(bks[i].toString());
                        System.out.println("Bạn có muốn tìm thêm cuốn sách nào không?");
                        break;
                    }
                }
            } else
                System.out.println("Bạn có nhập sai tên sách đang tìm không?");
        }while (!search.equals("Exit"));
    }

    //Phương thức tính tổng số sách trong
    public static int getSumQuantity(Book[] b){
        int sum =0;
        for (int i = 0; i < b.length; i++){
            sum += b[i].getQuantity();
        }
        return sum;
    }

    // Phương thức tính tổng số tiền của các tựa sách
    public static int getSumPrice(Book[] b){
        int sum = 0;
        for (int i = 0; i < b.length; i++){
            sum += b[i].getPrice() * b[i].getQuantity();
        }
        return sum;
    }

}
