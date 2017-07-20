package qwe.asd.zxc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qwe.asd.zxc.dao.TopicDao;
import qwe.asd.zxc.models.Topic;

/**
 * Created by papillon on 7/20/2017.
 */
@Service
public class TopicService {

    @Autowired
    private TopicDao topicDao;

    public Topic[] getTopics() {
        return topicDao.getTopics();
    }
}
