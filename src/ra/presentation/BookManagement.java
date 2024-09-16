package ra.presentation;

import ra.business.BookBusiness;
import ra.entity.BookType;
import ra.util.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("******************BOOK-MANAGEMENT******************[5 điểm]\n" +
                    "1. Quản lý loại sách\n" +
                    "2. Quản lý sách\n" +
                    "3. Thoát \n");
            System.out.println("Chọn từ 1 - 3");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    BookManagement.menuBookType(scanner);
                    break;
                case 2:
                    BookManagement.menuBook(scanner);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai, mời nhập lại");
            }
        } while (true);
    }

    public static void menuBookType(Scanner scanner){
        boolean check1 = true;
        do {
            System.out.println("**********************BOOKTYPE-MENU********************\n" +
                    "1. Danh sách loại sách\n" +
                    "2. Tạo mới loại sách\n" +
                    "3. Cập nhật thông tin loại sách\n" +
                    "4. Xóa loại sách\n" +
                    "5. Thống kê số lượng sách theo mã loại sách\n" +
                    "6. Thoát \n");
            System.out.println("Chọn từ 1 - 6");
            int choice1 = Integer.parseInt(scanner.nextLine());
            switch (choice1){
                case 1:
                    BookManagement.displayBookType();
                    break;
                case 2:
                    BookManagement.createBookType(scanner);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    check1 = false;
                    break;
                default:
                    System.out.println("Nhập sai, mời nhập lại");
            }
        } while (check1);
    }

    public static void displayBookType(){
        List<BookType> bookTypes = BookBusiness.getAllBookType();
        for (BookType bookType : bookTypes) {
            bookType.displayData();
        }
    }

    public static void createBookType(Scanner scanner){
        BookType bookType = new BookType();
        bookType.inputData(scanner);
        BookBusiness.createBookType(bookType);
    }




    public static void menuBook(Scanner scanner){
        do {
            System.out.println(" ***********************BOOK-MENU***********************\n" +
                    "1. Danh sách sách\n" +
                    "2. Tạo mới sách\n" +
                    "3. Cập nhật thông tin sách\n" +
                    "4. Xóa sách\n" +
                    "5. Hiển thị danh sách các cuốn sách theo giá giảm dần\n" +
                    "6. Tìm kiếm sách theo tên hoặc nội dung\n" +
                    "7. Thống kê số lượng sách theo nhóm \n" +
                    "8. Thoát\n");
            System.out.println("Chọn từ 1 - 8");
            int choice2 = Integer.parseInt(scanner.nextLine());
            switch (choice2){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    System.exit(0);
                default:
                    System.out.println("Nhập sai, mời nhập lại");
            }
        } while (true);
    }
}
