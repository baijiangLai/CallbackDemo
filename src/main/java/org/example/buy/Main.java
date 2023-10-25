package org.example.buy;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        User user = new User("123-456-7890");

        // 设置用户的回调
        bookStore.setCallback(user);

        // 模拟用户去书店购书
        System.out.println("用户前往书店购书...");
        bookStore.stockBooks();
    }
}
