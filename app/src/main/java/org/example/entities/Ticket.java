package org.example.entities;

import java.util.Date;

public class Ticket {
    private String ticketId;
    private String userId;
    private String destination;
    private String source;
    private Date dateOfTravel;
    private Train train;

    public String getTicketId() {
        return ticketId;
    }

    public String getUserId() {
        return userId;
    }

    public Date getDateOfTravel() {
        return dateOfTravel;
    }

    public String getDestination() {
        return destination;
    }

    public String getSource() {
        return source;
    }

    public Train getTrain() {
        return train;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setDateOfTravel(Date dateOfTravel) {
        this.dateOfTravel = dateOfTravel;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    public String getTicketInfo(){
        return String.format("Ticket ID: %s belongs to user %s from %s to %s on %s",ticketId,userId,source,destination,dateOfTravel);
    }

}
