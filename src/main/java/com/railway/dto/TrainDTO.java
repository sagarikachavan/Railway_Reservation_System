package com.railway.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.railway.entities.Ticket;
import com.railway.entities.Train;

public class TrainDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String trainNo;
	private String trainName;
	private int seat2S;
	private int seatSL;
	private int seatAC;
	private String source;
	private String destination;
	private String arrivalTime;
	private String depatureTime;
	private Date date;
	private List<Ticket> listOfTickets = new ArrayList<>();

	public String getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(String trainNo) {
		this.trainNo = trainNo;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public int getSeat2S() {
		return seat2S;
	}

	public void setSeat2S(int seat2s) {
		seat2S = seat2s;
	}

	public int getSeatSL() {
		return seatSL;
	}

	public void setSeatSL(int seatSL) {
		this.seatSL = seatSL;
	}

	public int getSeatAC() {
		return seatAC;
	}

	public void setSeatAC(int seatAC) {
		this.seatAC = seatAC;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getDepatureTime() {
		return depatureTime;
	}

	public void setDepatureTime(String depatureTime) {
		this.depatureTime = depatureTime;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Ticket> getListOfTickets() {
		return listOfTickets;
	}

	public void setListOfTickets(List<Ticket> listOfTickets) {
		this.listOfTickets = listOfTickets;
	}

	@Override
	public String toString() {
		return "Train [trainNo=" + trainNo + ", trainName=" + trainName + ", seat2S=" + seat2S + ", seatSL=" + seatSL
				+ ", seatAC=" + seatAC + ", source=" + source + ", destination=" + destination + ", arrivalTime="
				+ arrivalTime + ", depatureTime=" + depatureTime + ", date=" + date + "]";
	}

	public Train convertToEntity() {
		Train train = new Train();
		train.setTrainNo(this.trainNo);
		train.setTrainName(this.trainName);
		train.setSource(this.source);
		train.setDestination(this.destination);
		train.setSeat2S(this.seat2S);
		train.setSeatAC(this.seatAC);
		train.setSeatSL(this.seatSL);
		train.setArrivalTime(this.arrivalTime);
		train.setDepatureTime(this.depatureTime);
		train.setDate(this.date);
		train.setListOfTickets(this.listOfTickets);
		return train;

	}
}
