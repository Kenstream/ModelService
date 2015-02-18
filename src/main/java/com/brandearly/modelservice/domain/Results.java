package com.brandearly.modelservice.domain;


import java.util.List;
/**
 * Created by shikhar on 2015-02-17.
 */
public class Results {
    
    private long studentId;
    private long proModelId;

    private int xAxisScore;
    private int yAxisScore;
    private int zAxisScore;

    private List<String> xAxisRecommendations;
    private List<String> yAxisRecommendations;
    private List<String> zAxisRecommendations;

    public void setStudentId(long id){
        this.studentId=id;
    }
    public void setProModelId(long id){
        this.proModelId=id;
    }
    public void setxAxisScore(int score){
        this.xAxisScore=score;
    }
    public void setyAxisScore(int score){
        this.yAxisScore=score;
    }
    public void setzAxisRecommendations(List<String> reco) {
        this.zAxisRecommendations = reco;
    }
    public void setyAxisRecommendations(List<String> reco){
        this.yAxisRecommendations=reco;
    }

    public void setzAxisScore(int score){
        this.zAxisScore=score;
    }

    public long getStudentId(){
        return this.studentId;
    }
    public long getProModelId(){
        return this.proModelId;
    }
    public int getxAxisScore(){
        return this.xAxisScore;
    }
    public int getyAxisScore(){
        return this.yAxisScore;
    }
    public int getzAxisScore(){
        return this.zAxisScore;
    }
    public List<String> getxAxisRecommendations(){
        return this.xAxisRecommendations;
    }
    public List<String> getyAxisRecommendations(){
        return this.yAxisRecommendations;
    }
    public List<String> getzAxisRecommendations(){
        return this.zAxisRecommendations;
    }

}
