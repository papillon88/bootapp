package qwe.asd.zxc.dao;

import org.springframework.stereotype.Repository;
import qwe.asd.zxc.models.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by papillon on 7/20/2017.
 */
@Repository
public class TopicDao {

    private Topic[] topicArray = {
            new Topic("spring","Spring Framework","Spring Framework Description"),
            new Topic("java","Core Java","Core Java Description"),
            new Topic("javascript","JavaScript","Javascript Description")
    };
    private List<Topic> topics = new ArrayList<>(Arrays.asList(topicArray));

    public List<Topic> getTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        Predicate<Topic> predicate = topic -> topic.getId().equalsIgnoreCase(id);
        List<Topic> listWithOneElement = topics.stream()
                                                .filter(predicate)
                                                .collect(Collectors.toList());
        try {
            Topic topic = topics.stream()
                                .filter(predicate)
                                .findFirst().get();
        } catch (NoSuchElementException ex){
            ex.printStackTrace();
        }
        System.out.println("output from TOPIC DAO !" + listWithOneElement.size());
        return listWithOneElement.get(0);
    }

    public void postTopic(Topic topic) {
        topics.add(topic);
    }
}
