package com.brandearly.modelservice.domain;

/**
 * Created by shikhar on 2015-02-17.
 */
public class KeyValue {
    private String key;
    private int value;

    public void setKey(String keyValue){
        this.key=keyValue;
    }

    public void setValue(int v){
        this.value=v;
    }
   
    public String getKey(){
        return this.key;
    }

    public int getValue(){
        return this.value;
    }

}
