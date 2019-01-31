//package repository;//package repositories;
//
//import demo.Application;
//import demo.MessagePOJO;
//import demo.respositories.MessageRepository;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//import static org.junit.Assert.assertNull;
//
///**
//* Created by Bipin on 3/25/2016.
//*/
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {Application.class})
//@WebAppConfiguration
//public class MessageRepositoryTest {
//
//    @Autowired
//    MessageRepository messageRepository;
//
//    @Test
//    public void writeMessage() {
//        messageRepository.save(new MessagePOJO("bipin", "active"));
//
//    }
//}
