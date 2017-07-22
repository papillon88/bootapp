package qwe.asd.zxc.courses.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import qwe.asd.zxc.courses.dao.CourseDao;
import qwe.asd.zxc.courses.models.Course;

import java.util.List;

/**
 * Created by papillon on 7/20/2017.
 */
@Service
public class CourseService {

    @Autowired
    private CourseDao topicDao;

    public List<Course> getTopics() {
        return topicDao.getTopics();
    }

    public Course getTopic(String id) {
        return topicDao.getTopic(id);
    }

    public void postTopic(Course topic) {
        topicDao.postTopic(topic);
    }

    public void putTopic(Course topic, String id) {
        topicDao.putTopic(topic,id);
    }

    public void deleteTopic(String id) {
        topicDao.deleteTopic(id);
    }
}
