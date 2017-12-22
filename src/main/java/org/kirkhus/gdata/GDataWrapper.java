package org.kirkhus.gdata;

/**
 * Created by kirkhus on 13.07.2017.
 */
public class GDataWrapper {


    private static GDataWrapper wrapper;

    private GDataWrapper() {


    }

    public static GDataWrapper getInstance() {
        if (wrapper == null) {
            wrapper = new GDataWrapper();
        }

        return wrapper;
    }

    public Boolean isConnected() {

        return true;
    }

}