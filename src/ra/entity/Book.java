package ra.entity;

import java.util.Scanner;

public class Book implements IBookManagement{
    private int bookId;
    private String bookName;
    private String title;
    private String Author;
    private int totalPages;
    private String content;
    private String publisher;
    private double price;
    private int typeId;
    private boolean isDelete;

    public Book() {
    }

    public Book(int bookId, String bookName, String title, String author, int totalPages, String content, String publisher, double price, int typeId, boolean isDelete) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        Author = author;
        this.totalPages = totalPages;
        this.content = content;
        this.publisher = publisher;
        this.price = price;
        this.typeId = typeId;
        this.isDelete = isDelete;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public void inputData(Scanner scanner) {
        System.out.println("Nhập tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sách: ");
        this.title = scanner.nextLine();
        System.out.println("Nhập tên tác giả: ");
        this.Author = scanner.nextLine();
        System.out.println("Nhập số trang sách: ");
        this.totalPages = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nội dung sách: ");
        this.content = scanner.nextLine();
        System.out.println("Nhập nhà xuất bản: ");
        this.publisher = scanner.nextLine();
        System.out.println("Nhập giá sách: ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mã loại sách: ");
        this.typeId = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập trạng thái: ");
        this.isDelete = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("id: " + this.bookId);
        System.out.println("tên sách: " + this.bookName);
        System.out.println("tiêu đề: " + this.title);
        System.out.println("tác giả: " + this.Author);
        System.out.println("số trang: " + this.totalPages);
        System.out.println("nội dung: " + this.content);
        System.out.println("nhà xuất bản: " + this.publisher);
        System.out.println("giá: " + this.price);
        System.out.println("mã loại sách: " + this.typeId);
        System.out.println("trạng thái: " + this.isDelete);
    }
}
