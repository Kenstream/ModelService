package com.brandearly.modelservice.service;

import com.brandearly.modelservice.domain.ProModel;
import com.brandearly.modelservice.domain.Results;
import com.brandearly.modelservice.domain.StudentProfile;
import javafx.scene.web.PromptData;

/**
 * Created by shikhar on 2015-02-17.
 */
public class MatchingAndResultsServiceImplementation {

    public Results matchingService(Long proModelId, StudentProfile studentProfile){
        Results results = new Results();
        ProModel proModel = getProModelFromDB(proModelId);




        return results;
    }


    private ProModel getProModelFromDB(Long proModelId){
        ProModel model = new ProModel();
        //To Do: Fetch ProModel from Database
        return model;
    }






}
