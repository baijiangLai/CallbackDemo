package org.example.compile;

public class User {
    public void submitRequest(ApkCompileCallback callback) {
        System.out.println("用户点击提交按钮，开始APK编译...");

        // 模拟APK编译过程，这里休眠10秒来模拟耗时操作
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 当APK编译完成后，调用回调通知用户
        System.out.println("APK编译完成。");
        callback.onApkCompileComplete();
    }

    public void performSecurityCheck() {
        System.out.println("进行安全检测...");
    }
}
