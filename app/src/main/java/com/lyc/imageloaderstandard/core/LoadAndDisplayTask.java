package com.lyc.imageloaderstandard.core;

import com.lyc.imageloaderstandard.download.ImageDownloader;
import com.lyc.imageloaderstandard.download.SimpleImageDownloader;

import java.io.InputStream;

/**
 * Created by lyc on 2015/8/18.
 */
public class LoadAndDisplayTask implements Runnable {

    public ImageLoadingInfo info;

    @Override
    public void run() {
        ImageDownloader downloader=new SimpleImageDownloader();
        InputStream is= downloader.getStream(info.imgUrl,null);
    }
}
