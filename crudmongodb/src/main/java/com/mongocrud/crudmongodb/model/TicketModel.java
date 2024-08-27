package com.mongocrud.crudmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//to contain the data set -> database
@Document(collection = "ticketcollection")
public class TicketModel {
    //create fields for ticket reservation system
    //int bookingId, trainNo, source, destination, price, birthType, doj, name, age, gender, mobile
    @Id
    private int bookingId;
    private String trainNo;
    public int getBookingId() { return bookingId; }
    public void setBookingId(int bookingId) { this.bookingId = bookingId; }
    public String getTrainNo() { return trainNo; }
    public void setTrainNo(String trainNo) { this.trainNo = trainNo; }
    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }
    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
    public String getBirthType() { return birthType; }
    public void setBirthType(String birthType) { this.birthType = birthType; }
    public String getDoj() { return doj; }
    public void setDoj(String doj) { this.doj = doj; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAge() { return age; }
    public void setAge(String age) { this.age = age; }
    public String getGender() { return gender;}
    public void setGender(String gender) { this.gender = gender; }
    public String getMobile() { return mobile;}
    public void setMobile(String mobile) { this.mobile = mobile;}

    private String source;
    private String destination;
    private String price;
    private String birthType;
    private String doj;
    private String name;
    private String age;
    private String gender;
    private String mobile;

}
