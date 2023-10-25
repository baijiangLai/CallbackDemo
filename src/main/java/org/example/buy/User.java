package org.example.buy;

public class User implements BookAvailableCallback{
    private String phoneNumber;

    public User(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void onBookAvailable(String bookTitle) {
        System.out.println("通知电话号码：" + phoneNumber + "，书籍已到：" + bookTitle);
    }
}
