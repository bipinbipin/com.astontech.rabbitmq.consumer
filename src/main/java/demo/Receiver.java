package demo;

import demo.respositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * Created by bipin on 4/25/2017.
 */
@Component
public class Receiver {

    @Autowired
    MessageRepository messageRepository;

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public void writeMessage(MessagePOJO messagePOJO) {
        System.out.println("Message Received" + messagePOJO.toString());
        messageRepository.save(messagePOJO);
        System.out.println("Message Saved - ID: " + messagePOJO.getId());
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
