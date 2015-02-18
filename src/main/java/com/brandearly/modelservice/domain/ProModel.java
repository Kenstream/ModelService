package com.brandearly.modelservice.domain;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.List;

/**
 * Created by shikhar on 2015-02-17.
 */

@Entity
public class ProModel {
    private int internalWeightProgramCompulsory;
    private int internalWeightProgramAdditional;

    private int weightInternalExperienceHigh;
    private int weightInternalExperienceLow;

    private int internalWeightExperienceCompulsory;
    private int internalWeightExperienceAdditional;

    private int internalWeightPersonalCompulsory;
    private int internalWeightPersonalAdditional;

    private int weightPersonalHigh;
    private int weightPersonalLow;


    @Id
    private Long id;

    private int ownerId;

    private List<KeyValue> programCompulsory;
    private List<KeyValue> programAdditional;
    private List<KeyValue> experienceCompulsory;
    private List<KeyValue> experienceAdditional;
    private List<KeyValue> personalAttributesCompulsory;
    private List<KeyValue> personalAttributesAdditional;

    public int getInternalWeightProgramCompulsory(){
        return this.internalWeightProgramCompulsory;
    }
    public void setInternalWeightProgramCompulsory(int w){
        this.internalWeightProgramCompulsory =w;
    }
    public int getInternalWeightProgramAdditional(){
        return this.internalWeightProgramAdditional;
    }
    public void setInternalWeightProgramAdditional(int w){
        this.internalWeightProgramAdditional =w;
    }
    public int getWeightInternalExperienceHigh(){
        return this.weightInternalExperienceHigh;
    }
    public void setWeightInternalExperienceHigh(int w){
        this.weightInternalExperienceHigh =w;
    }
    public int getWeightInternalExperienceLow(){
        return this.weightInternalExperienceLow;
    }
    public void setWeightInternalExperienceLow(int w){
        this.weightInternalExperienceLow =w;
    }
    public int getInternalWeightExperienceCompulsory(){
        return this.internalWeightExperienceCompulsory;
    }
    public void setInternalWeightExperienceCompulsory(int w){
        this.internalWeightExperienceCompulsory =w;
    }
    public int getInternalWeightExperienceAdditional(){
        return this.internalWeightExperienceAdditional;
    }
    public void setInternalWeightExperienceAdditional(int w){
        this.internalWeightExperienceAdditional =w;
    }
    public int getInternalWeightPersonalCompulsory(){
        return this.internalWeightPersonalCompulsory;
    }
    public void setInternalWeightPersonalCompulsory(int w){
        this.internalWeightPersonalCompulsory =w;
    }
    public int getInternalWeightPersonalAdditional(){
        return this.internalWeightPersonalAdditional;
    }
    public void setInternalWeightPersonalAdditional(int w){
        this.internalWeightPersonalAdditional =w;
    }
    public int getWeightPersonalHigh(){
        return this.weightPersonalHigh;
    }
    public void setWeightPersonalHigh(int w){
        this.weightPersonalHigh=w;
    }
    public int getWeightPersonalLow(){
        return this.weightPersonalLow;
    }
    public void setWeightPersonalLow(int w){
        this.weightPersonalLow=w;
    }
    public Long getId(){
        return this.id;
    }
    public void setId(Long Id){
        this.id=Id;
    }
    public int getOwnerId(){
        return this.ownerId;
    }
    public void setOwnerId(int id){
        this.ownerId =id;
    }

    public List<KeyValue> getProgramCompulsory(){
        return this.programCompulsory;
    }

    public void setProgramCompulsory(List<KeyValue> ListOfPrograms){
        this.programCompulsory =ListOfPrograms;
    }

    public List<KeyValue> getProgramAdditional(){
        return this.programAdditional;
    }

    public void setProgramAdditional(List<KeyValue> ListOfPrograms){
        this.programAdditional =ListOfPrograms;
    }

    public List<KeyValue> getExperienceCompulsory(){
        return this.experienceCompulsory;
    }

    public void setExperienceCompulsory(List<KeyValue> Programs){
        this.experienceCompulsory =Programs;
    }

    public List<KeyValue> getExperienceAdditional(){
        return this.experienceAdditional;
    }

    public void setExperienceAdditional(List<KeyValue> Ex){
        this.experienceAdditional =Ex;
    }

    public List<KeyValue> getPersonalAttributesCompulsory(){
        return this.personalAttributesCompulsory;
    }

    public void setPersonalAddtributesCompulsary(List<KeyValue> att){
        this.personalAttributesCompulsory =att;
    }

    public List<KeyValue> getPersonalAttributesAdditional(){
        return this.personalAttributesAdditional;
    }

    public void setPersonalAttributesAdditional(List<KeyValue> att) {
        this.personalAttributesAdditional = att;
    }

}
