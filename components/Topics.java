package components;

import java.util.ArrayList;

public class Topics {
    public static ArrayList<Topic> topics;

    public static ArrayList<Topic> getTopics() {
        return topics;
    }

    public static Topic getTopicByName(String name) throws Exception {
        for(Topic topic : topics) {
            if(topic.getTopic_name().equals(name)){
                return topic;
            }
        }

        throw new Exception("No such topic.");
    }
}
