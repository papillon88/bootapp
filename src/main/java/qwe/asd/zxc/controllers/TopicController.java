package qwe.asd.zxc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qwe.asd.zxc.models.Topic;
import qwe.asd.zxc.services.TopicService;

import java.util.Arrays;
import java.util.List;

/**
 * Created by papillon on 7/20/2017.
 */
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics(){
        Topic[] topics = topicService.getTopics();
        return Arrays.asList(topics);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){
        Topic topic = topicService.getTopic(id);
        return topic;
    }
}
