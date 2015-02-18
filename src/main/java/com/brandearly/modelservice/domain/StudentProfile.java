package com.brandearly.modelservice.domain;

import java.util.List;

/**
 * Created by shikhar on 2015-02-17.
 */
public class StudentProfile {

    private List<String> xAxisAttributes;
    private List<String> yAxisAttributes;
    private List<String> zAxisAttributes;

    public void setxAxisAttributes(List<String> list){
        this.xAxisAttributes=list;
    }
    public void setyAxisAttributes(List<String> list){
        this.yAxisAttributes=list;
    }
    public void setzAxisAttributes(List<String> list){
        this.zAxisAttributes=list;
    }
    public List<String> getxAxisAttributes(){
        return this.xAxisAttributes;
    }
    public List<String> getyAxisAttributes(){
        return this.yAxisAttributes;
    }
    public List<String> getzAxisAttributes(){
        return this.zAxisAttributes;
    }

}
