package qwe.asd.zxc.courses.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qwe.asd.zxc.courses.models.Course;
import qwe.asd.zxc.courses.services.CourseService;

import java.util.List;

/**
 * Created by papillon on 7/20/2017.
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService topicService;

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Course> getAllTopics(){
        return topicService.getTopics();
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Course getTopic(@PathVariable String id){
        Course topic = topicService.getTopic(id);
        return topic;
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void postTopic(@RequestBody Course topic){
        topicService.postTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void putTopic(@RequestBody Course topic, @PathVariable String id){
        topicService.putTopic(topic,id);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
