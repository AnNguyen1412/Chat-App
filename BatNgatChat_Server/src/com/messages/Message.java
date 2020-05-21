package com.messages;

import javafx.scene.image.Image;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Message implements Serializable {

    private String name;
    private MessageType type;
    private String msg;
    private int count;
    private ArrayList<User> list;
    private ArrayList<User> users;
    private Status status;
    String ipAddress;
    String portListen;

    //send file
    private byte [] byteArray;
    //Avatar array
    private byte [] avatarArray;


    // byteArray
    public void setByteArray(byte[] byteArray) {
        this.byteArray = byteArray;
    }
    public byte[] getByteArray() {
        return byteArray;
    }


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

    // Name message
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Message
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }

    //Type message
    public MessageType getType() {
        return type;
    }
    public void setType(MessageType type) {
        this.type = type;
    }

    //list
    public ArrayList<User> getUserlist() {
        return list;
    }
    public void setUserlist(HashMap<String, User> userList) {
        this.list = new ArrayList<>(userList.values());
    }

    // Count Online
    public void setOnlineCount(int count){
        this.count = count;
    }
    public int getOnlineCount(){
        return this.count;
    }

    //users
    public ArrayList<User> getUsers() {
        return users;
    }
    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    //Status
    public void setStatus(Status status) {
        this.status = status;
    }
    public Status getStatus() {
        return status;
    }

    //Custom Avatar
    public byte[] getAvatarArray() {

        return avatarArray;
    }

    public void setAvatarArray(byte[] avatarArray) {

        this.avatarArray = avatarArray;
    }
}
