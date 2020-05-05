package com.example.chat.Model;

public class Chat {
    private String sender;
    private String receiver;
    private String message;
    private boolean isseen;

    public Chat(String sender,String receiver,String message,boolean isseen){
        this.sender = sender;
        this.receiver = receiver;
        this.message = message;
        this.isseen = isseen;
    }
    Chat(){

    }
    public String getSender(){
        return  sender;
    }
    public void setSender(String sender){
        this.sender = sender;
    }


}
