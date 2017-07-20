package qwe.asd.zxc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import qwe.asd.zxc.models.Topic;

import java.util.Arrays;
import java.util.List;

/**
 * Created by papillon on 7/20/2017.
 */
@RestController
public class TopicController {

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics(){
        Topic[] topics = {
                new Topic("spring","Spring Framework","Spring Framework Description"),
                new Topic("java","Core Java","Core Java Description"),
                new Topic("javascript","JavaScript","Javascript Description")
        };
        return Arrays.asList(topics);
    }
}
