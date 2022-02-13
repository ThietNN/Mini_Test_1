import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Tạo đối tượng thuộc lớp Book
        Book b1 = new Book("Arknights", "Yostar", 1, 27000, 2.7);
        Book b2 = new Book("Revived Witch", "Yostar", 2, 12000, 1.2);
        Book b3 = new Book("Epic Seven", "Smilegate", 3, 25000, 2.5);
        Book b4 = new Book("Fate Grand Order", "Aniplex", 4, 16000, 1.6);
        Book b5 = new Book("Punishing Gray Raven", "Kuro Technology", 5, 7000, 7);
        Book[] Books = {b1, b2, b3, b4, b5};

        // Hiện menu, lấy lựa chọn của người dùng
        System.out.println("Menu:");
        System.out.println("0. Hiển thị lại toàn bộ Menu");
        System.out.println("1. Tổng số lượng của sách hiện có");
        System.out.println("2. Lấy số lượng của một tựa sách bất kì");
        System.out.println("3. Tổng khối lượng của sách hiện có");
        System.out.println("4. Lấy khối lượng của một cuốn sách bất kì");
        System.out.println("5. Tổng số tiền để mua hết sách");
        System.out.println("6. Lấy giá tiền của một cuốn sách cụ thể");
        System.out.println("7. Tìm kiếm toàn bộ thông tin của một tựa sách cụ thể");
        System.out.println("8. Thoát khỏi chương trình");
        int choice;
        do {
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Menu:");
                    System.out.println("0. Hiển thị lại toàn bộ Menu");
                    System.out.println("1. Tổng số lượng của sách hiện có");
                    System.out.println("2. Lấy số lượng của một tựa sách bất kì");
                    System.out.println("3. Tổng khối lượng của sách hiện có");
                    System.out.println("4. Lấy khối lượng của một cuốn sách bất kì");
                    System.out.println("5. Tổng số tiền để mua hết sách");
                    System.out.println("6. Lấy giá tiền của một cuốn sách cụ thể");
                    System.out.println("7. Tìm kiếm toàn bộ thông tin của một tựa sách cụ thể");
                    System.out.println("8. Thoát khỏi chương trình");
                    break;
                case 1:
                    int totalQuantity = getSumQuantity(Books);
                    System.out.println("Tổng số lượng sách hiện có là: " + totalQuantity + " cuốn");
                    break;
                case 2:
                    // Lấy thông tin người dùng nhập
                    System.out.println("Nhập tên tựa sách bạn muốn kiểm tra số lượng: ");
                    System.out.println("Gõ 'Back' để thoát");
                    String trash2 = sc.nextLine();
                    String search2;
                    do {
                        // Tìm xem sách được nhập vào có tồn tại không
                        search2 = sc.nextLine();
                        if(search2.equals("Back")) {
                            System.out.println("Đã thoát khỏi chương trình lấy số lượng");
                            break;
                        }
                        boolean check1 = false;
                        for (int i = 0; i < Books.length; i++) {
                            if (search2.equals(Books[i].getName())) {
                                check1 = true;
                                break;
                            }
                        }
                        // kết quả in ra màn hình
                        if (check1) {
                            for (int i = 0; i < Books.length; i++) {
                                if (search2.equals(Books[i].getName())) {
                                    System.out.println("Có " + Books[i].getQuantity() + " cuốn sách có tên " + Books[i].getName());
                                }
                            }
                        }
                        else {
                            System.out.println("Không tìm thấy tựa sách nào có tên '" + search2 + "' " );
                        }
                    }while (!search2.equals("Back"));
                    break;
                case 3:
                    double totalWeight = getSumWeight(Books);
                    System.out.println("Tổng số cân nặng của toàn bộ sách là: " + totalWeight + "kg");
                    break;
                case 4:
                    System.out.println("Nhập tên cuốn sách bạn muốn kiểm tra khối lượng: ");
                    String trash4 = sc.nextLine();
                    String search4;
                    do {
                        // Tìm xem sách được nhập vào có tồn tại không
                        search4 = sc.nextLine();
                        if(search4.equals("Back")) {
                            System.out.println("Đã thoát khỏi chương trình lấy khối lượng");
                            break;
                        }
                        boolean check4 = false;
                        for (int i = 0; i < Books.length; i++) {
                            if (search4.equals(Books[i].getName())) {
                                check4 = true;
                                break;
                            }
                        }
                        // kết quả in ra màn hình
                        if (check4) {
                            for (int i = 0; i < Books.length; i++) {
                                if (search4.equals(Books[i].getName())) {
                                    System.out.println("Cuốn sách " + Books[i].getName() + " có khối lượng là " + Books[i].getWeight() + "kg");
                                }
                            }
                        }
                        else {
                            System.out.println("Không tìm thấy cuốn sách nào có tên '" + search4 + "' ");
                        }
                    }while (!search4.equals("Back"));
                    break;
                case 5:
                    int totalPrice = getSumPrice(Books);
                    System.out.println("Giá trị của toàn bộ số sách là: " + totalPrice + "JPY");
                    break;
                case 6:
                    System.out.println("Nhập tên cuốn sách bạn muốn xem giá tiền: ");
                    String trash6 = sc.nextLine();
                    String search6;
                    do {
                        // Tìm xem sách được nhập vào có tồn tại không
                        search6 = sc.nextLine();
                        if(search6.equals("Back")) {
                            System.out.println("Đã thoát khỏi chương trình lấy giá tiền");
                            break;
                        }
                        boolean check6 = false;
                        for (int i = 0; i < Books.length; i++) {
                            if (search6.equals(Books[i].getName())) {
                                check6 = true;
                                break;
                            }
                        }
                        // kết quả in ra màn hình
                        if (check6) {
                            for (int i = 0; i < Books.length; i++) {
                                if (search6.equals(Books[i].getName())) {
                                    System.out.println("Cuốn sách " + Books[i].getName() + " có giá là " + Books[i].getPrice() + "JPY");
                                }
                            }
                        }
                        else {
                            System.out.println("Không tìm thấy cuốn sách nào có tên '" + search6 + "' ");
                        }
                    }while (!search6.equals("Back"));
                    break;
                case 7:
                    //Lấy thông tin người dùng nhập
                    System.out.println("Nhập tên tựa sách bạn đang tìm: ");
                    String trash = sc.nextLine();
                    String search7;
                    do {
                        search7 = sc.nextLine();
                        if(search7.equals("Back")){
                            System.out.println("Đã thoát khỏi chương trình tìm sách");
                            break;
                        }
                        //Kiểm tra xem sách nhập vào có tồn tại trong thư viện không
                        boolean check7 = false;
                        for (int i = 0; i < Books.length; i++) {
                            if (search7.equals(Books[i].getName())) {
                                check7 = true;
                                break;
                            }
                        }
                        //Tìm thông tin nếu tên sách nhập vào có tồn tại
                        if (check7) {
                            for (int i = 0; i < Books.length; i++) {
                                if (search7.equals(Books[i].getName())) {
                                    System.out.println(Books[i].toString());
                                    break;
                                }
                            }
                        } else {
                            System.out.println("Không tìm thấy cuốn sách nào có tên '" + search7 + "' ");
                        }
                    } while (!search7.equals("Back"));
                    break;
            }
        } while (choice!=8);
    }
    //Phương thức tính tổng số sách
    public static int getSumQuantity(Book[] b){
        int sum = 0;
        for (int i = 0; i < b.length; i++){
            sum += b[i].getQuantity();
        }
        return sum;
    }
    //Phương thức tính tổng khối lượng số sách
    public static double getSumWeight(Book[] b){
        int sum = 0;
        for (int i = 0; i < b.length; i++){
            sum += b[i].getQuantity() * b[i].getWeight();
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
