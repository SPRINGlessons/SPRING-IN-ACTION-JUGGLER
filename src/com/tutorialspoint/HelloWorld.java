// This Project created by Anton Romanov (www.antonromanov.com) 10.01.2018 at 16:10
// Source URL - http://www.w3ii.com/spring/spring_hello_world_example.html
// Git Hub repo - https://github.com/SPRINGlessons/OLD-XML-SPRING-IDEA and git@github.com:SPRINGlessons/OLD-XML-SPRING-IDEA.git


package com.tutorialspoint;

public class HelloWorld {

    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }


}
