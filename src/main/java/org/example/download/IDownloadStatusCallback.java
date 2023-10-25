package org.example.download;

public interface IDownloadStatusCallback {
    void startDownload();
    void stopDownload();
    void showDownloadURL(String url);
    void showDownloadProgress(int progress);

}
