package com.lyc.imageloaderstandard.download;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by lyc on 2015/8/18.
 */
public class SimpleImageDownloader implements ImageDownloader {


    @Override
    public InputStream getStream(String imgUri, Object extra)  {

        InputStream  is=null;
        URLConnection  coon=null;

        try{
            URL url=new URL(imgUri);
            coon=url.openConnection();
            is=coon.getInputStream();
        }catch (Exception e){
            return null;
        }
        return is;

    }
}
