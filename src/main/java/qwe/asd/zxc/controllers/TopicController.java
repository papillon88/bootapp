package qwe.asd.zxc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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
        return topicService.getTopics();
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.GET)
    public Topic getTopic(@PathVariable String id){
        Topic topic = topicService.getTopic(id);
        return topic;
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void postTopic(@RequestBody Topic topic){
        topicService.postTopic(topic);
    }
}
