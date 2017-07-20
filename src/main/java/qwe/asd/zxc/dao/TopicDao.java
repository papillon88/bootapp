package qwe.asd.zxc.dao;

import org.springframework.stereotype.Repository;
import qwe.asd.zxc.models.Topic;

/**
 * Created by papillon on 7/20/2017.
 */
@Repository
public class TopicDao {


    public Topic[] getTopics() {
        return new Topic[]{
                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("java","Core Java","Core Java Description"),
                new Topic("javascript","JavaScript","Javascript Description")
        };
    }
}
