package qwe.asd.zxc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by papillon on 7/20/2017.
 */
@RestController
public class TopicController {

    @RequestMapping("/topics")
    public String getAllTopics(){
        return "All Topics";
    }
}
