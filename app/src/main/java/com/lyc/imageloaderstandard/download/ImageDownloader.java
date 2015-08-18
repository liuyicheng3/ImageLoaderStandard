package com.lyc.imageloaderstandard.download;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lyc on 2015/8/18.
 */
public interface ImageDownloader {
    InputStream getStream(String imgUri,Object extra);


}
