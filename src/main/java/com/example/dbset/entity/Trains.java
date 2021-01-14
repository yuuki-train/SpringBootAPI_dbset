package com.example.dbset.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trains")
public class Trains {
    //フィールド
    @Id
    private String id;

    private String lineJ;

    private String lineE;

    private String departure;

    private int depHour;

    private int depMinute;

    private String destination;

    private int arvHour;

    private int arvMinute;

    private String trainType;

    private boolean addFee;

    private int fair;

    private int fee;

    private int changeTrain;




    //getter
    public String getId(){
        return id;
    }

    public String getLineJ(){
        return lineJ;
    }

    public String getLineE(){
        return lineE;
    }

    public String getDeparture(){
        return departure;
    }

    public int getDepHour(){
        return depHour;
    }

    public int getDepMinute(){
        return depMinute;
    }

    public String getDestination(){
        return destination;
    }

    public int getArvHour(){
        return arvHour;
    }

    public int getArvMinute(){
        return arvMinute;
    }

    public String getTrainType(){
        return trainType;
    }

    public boolean getAddFee(){
        return addFee;
    }

    public int getFair(){
        return fair;
    }

    public int getFee(){
        return fee;
    }

    public int getChangeTrain(){return changeTrain;}


    //setter
    public void setId(String id){
        this.id = id;
    }

    public void setLineJ(String lineJ) { this.lineJ = lineJ; }

    public void setLineE(String lineE) { this.lineE = lineE; }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setDepHour(int depHour){
        this.depHour = depHour;
    }

    public void setDepMinute(int depMinute){
        this.depMinute = depMinute;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

    public void setArvHour(int arvHour){
        this.arvHour = arvHour;
    }

    public void setArvMinute(int arvMinute){
        this.arvMinute = arvMinute;
    }

    public void setTrainType(String trainType){
        this.trainType = trainType;
    }

    public void setAddFee(boolean addFee){
        this.addFee = addFee;
    }

    public void setFair(int fair){
        this.fair = fair;
    }

    public void setFee(int fee){
        this.fee = fee;
    }

    public void setChangeTrain(int changeTrain){ this.changeTrain = changeTrain; }
}
