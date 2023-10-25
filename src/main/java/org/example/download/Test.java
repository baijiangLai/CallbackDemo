package org.example.download;

public class Test {
    private static final String URL = "https://www.baidu.com";

    public static void main(String[] args) {
        Client client = new Client();
        client.download(URL);
    }
}
