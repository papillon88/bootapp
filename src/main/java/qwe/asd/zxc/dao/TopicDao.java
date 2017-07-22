package qwe.asd.zxc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import qwe.asd.zxc.models.Topic;
import qwe.asd.zxc.repositories.TopicRepository;

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

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getTopics() {
        List<Topic> topic = new ArrayList<>();
        topicRepository.findAll().forEach(topic::add);
        return topic;
    }

    public Topic getTopic(String id) {
        return topicRepository.findOne(id);
    }

    public void postTopic(Topic topic) {
        topicRepository.save(topic);
    }

    public void putTopic(Topic topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
