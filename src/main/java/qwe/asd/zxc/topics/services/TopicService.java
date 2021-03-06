package qwe.asd.zxc.topics.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qwe.asd.zxc.topics.dao.TopicDao;
import qwe.asd.zxc.topics.models.Topic;

import java.util.List;

/**
 * Created by papillon on 7/20/2017.
 */
@Service
public class TopicService {

    @Autowired
    private TopicDao topicDao;

    public List<Topic> getTopics() {
        return topicDao.getTopics();
    }

    public Topic getTopic(String id) {
        return topicDao.getTopic(id);
    }

    public void postTopic(Topic topic) {
        topicDao.postTopic(topic);
    }

    public void putTopic(Topic topic, String id) {
        topicDao.putTopic(topic,id);
    }

    public void deleteTopic(String id) {
        topicDao.deleteTopic(id);
    }
}
