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
    public Book(String name, String author, int quantity, int price, double weight){
        this.name = name;
        this.author = author;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }

    //Phương thức lấy thông tin (Get)
    public String getName() {
        return name;
    }
    public String getAuthor(){
        return author;
    }
    public int getQuantity(){
        return quantity;
    }
    public int getPrice(){
        return price;
    }
    public double getWeight(){
        return weight;
    }

    //Phương thức đặt thông tin (Set)
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    //Trả về toàn bộ thông tin sách
    public String toString(){
        return "Tên: " + name + ", Tác giả: " + author + ", Số lượng: " + quantity + ", Giá tiền: " + price + "JPY, Khối lượng: " + weight + "kg";
    }

}
