package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic ("spring" ,"spring framework", "spring framework description"),
                new Topic ("java" ,"java core", "java description"),
                new Topic ("javascript" ,"JavaScript", "javascript framework description")
    ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){

        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }
}
