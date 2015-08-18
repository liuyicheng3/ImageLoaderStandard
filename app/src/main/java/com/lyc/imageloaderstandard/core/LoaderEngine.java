package com.lyc.imageloaderstandard.core;

import android.widget.ImageView;

import com.lyc.imageloaderstandard.Constant;
import com.lyc.imageloaderstandard.LoaderConfiguartion;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by lyc on 2015/8/18.
 */
public class LoaderEngine {
    public ExecutorService executor;





    public LoaderConfiguartion config;

    public static volatile LoaderEngine instances;


    public LoaderEngine() {
    }

    public LoaderEngine getInstance() {
        if (instances == null) {
            instances = new LoaderEngine();
        }
        return instances;
    }

    public void init(LoaderConfiguartion conf) {
        this.config = conf;
        executor= Executors.newFixedThreadPool(Constant.default_thread_size);
    }


    public void displayImage(String url,ImageView iv,LoaderStatusListener  statusListener,LoaderProgressListener progressListenerd){

    }


}
