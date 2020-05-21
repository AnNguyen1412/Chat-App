package com.messages;

import javafx.scene.image.Image;

import java.io.Serializable;


public class User implements Serializable {

    byte[] pictureArray;
    Status status;
    String name;
    String ipAddress;
    String portListen;


    //IP Address
    public String getIp() {
        return ipAddress;
    }
    public void setIp(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    //port to Listen
    public String getPort() {
        return portListen;
    }
    public void setPort(String port) {
        this.portListen = port;
    }

    //name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Picture
    public byte[] getPicture() {
        return pictureArray;
    }

    public void setPicture(byte[] pictureArray) {
        this.pictureArray = pictureArray;
    }

    //Status
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
}
