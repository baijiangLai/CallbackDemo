package org.example.buy;

import java.util.concurrent.TimeUnit;

public class BookStore {
    private BookAvailableCallback callback;

    public void setCallback(BookAvailableCallback callback) {
        this.callback = callback;
    }


    public void stockBooks() {
        try {
            System.out.println("书店正在备货，请稍候...");
            TimeUnit.SECONDS.sleep(4); // 模拟备货过程，等待5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String bookTitle = "Java Programming"; // 模拟书店有了书
        System.out.println("书店已有书：" + bookTitle);

        // 当书店有书时，调用回调通知用户
        if (callback != null) {
            callback.onBookAvailable(bookTitle);
        }
    }
}
