package qwe.asd.zxc.courses.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import qwe.asd.zxc.courses.models.Course;
import qwe.asd.zxc.courses.repositories.CourseRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by papillon on 7/20/2017.
 */
@Repository
public class CourseDao {

    @Autowired
    private CourseRepository topicRepository;

    public List<Course> getTopics() {
        List<Course> topic = new ArrayList<>();
        topicRepository.findAll().forEach(topic::add);
        return topic;
    }

    public Course getTopic(String id) {
        return topicRepository.findOne(id);
    }

    public void postTopic(Course topic) {
        topicRepository.save(topic);
    }

    public void putTopic(Course topic, String id) {
        topicRepository.save(topic);
    }

    public void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
