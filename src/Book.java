public class Book {
    //Khai báo biến
    String name;
    private String author;
    private int price;
    private int quantity;
    private double weight;

    //Constructor
    public Book(){
        quantity++;
    }
    public Book(String name, String author, int price, double weight, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.weight = weight;
        this.quantity = quantity;

    }

    //Phương thức lấy thông tin (Get)
    public String getName() {
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }
    public int getQuantity(){
        return quantity;
    }

    //Phương thức đặt thông tin (Set)
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Trả về toàn bộ thông tin sách
    public String toString(){
        return "Tên: " + name + ", Tác giả: " + author + ", Giá tiền: " + price + "JPY, Khối lượng: " + weight + "kg, Số lượng: " + quantity;
    }

    //Tính tổng khối lượng các cuốn sách

}
