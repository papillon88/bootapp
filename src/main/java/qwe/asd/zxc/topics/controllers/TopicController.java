package qwe.asd.zxc.topics.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import qwe.asd.zxc.topics.models.Topic;
import qwe.asd.zxc.topics.services.TopicService;

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

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.PUT)
    public void putTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.putTopic(topic,id);
    }

    @RequestMapping(value = "/topics/{id}", method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
