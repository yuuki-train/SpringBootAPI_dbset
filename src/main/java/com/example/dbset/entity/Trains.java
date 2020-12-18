package com.example.dbset.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "trains")
public class Trains {
    //フィールド
    @Id
    private int id;

    private int hour;

    private int minute;

    private String trainType;

    private String departure;

    private String destination;

    //getter
    public int getId(){
        return id;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public String getTrainType(){
        return trainType;
    }

    public String getDeparture(){
        return departure;
    }

    public String getDestination(){
        return destination;
    }

    //setter
    public void setId(int id){
        this.id = id;
    }

    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinute(int minute){
        this.minute = minute;
    }

    public void setTrainType(String trainType){
        this.trainType = trainType;
    }

    public void setDeparture(String departure){
        this.departure = departure;
    }

    public void setDestination(String destination){
        this.destination = destination;
    }

}
