package org.example.entities;

import java.sql.Time;
import java.util.List;
import java.util.Map;
//import java.util.Time;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Integer>> seats;
    private Map<String, Time> stationTimes;
    private List<String> stations;

    public void setTrainId(String trainId) {
        this.trainId = trainId;
    }

    public String getTrainNo() {
        return trainNo;
    }

    public List<List<Integer>> getSeats() {
        return seats;
    }

    public Map<String, Time> getStationTimes() {
        return stationTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public String getTrainId() {
        return trainId;
    }

    public void setSeats(List<List<Integer>> seats) {
        this.seats = seats;
    }

    public void setTrainNo(String trainNo) {
        this.trainNo = trainNo;
    }

    public void setStations(List<String> stations) {
        this.stations = stations;
    }

    public void setStationTimes(Map<String, Time> stationTimes) {
        this.stationTimes = stationTimes;
    }
    public String getTrainInfo(){
        return String.format("Train ID:%s Train No:%s",trainId,trainNo);
    }
}
