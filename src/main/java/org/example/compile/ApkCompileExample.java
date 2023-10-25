package org.example.compile;

public class ApkCompileExample {
    public static void main(String[] args) {
        User user = new User();
        user.submitRequest(new ApkCompileCallback() {
            @Override
            public void onApkCompileComplete() {
                // APK编译完成后进行安全检测
                user.performSecurityCheck();
            }
        });
    }
}
