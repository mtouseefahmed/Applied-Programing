package com.appliedprogrmming.springboot.starter.topic;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*import org.springframework.beans.factory.annotation.Autowired;*/
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	/*@Autowired
	TopicRepository topicRepository;*/
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework Description"),
			new Topic("Java", "Java Programming", "Java Programming Description"),
			new Topic("JavaScript", "JavaScript Framework", "JavaScript Framework Description")			
			));
	
	public List<Topic> getAllTopics() {
		/*List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topics::add);*/
		return topics;
	}
	
	public Topic getTopic(String id) {
		Topic topic =null;
		
for (Topic t:topics) {
	if(t.getId().equals(id)){
topic = t;
break; }
}

return topic;
	}
	
	public void addTopics(Topic topic) {
		topics.add(topic);
	}
	

	public void updateTopic(String id, Topic topic) {

		for(int i = 0; i < topics.size(); i++) {
			
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				System.out.println("ID is -> " + t.getId());
				topics.set(i, topic);
				return;
			}
		}
		
	}

	
	
	public void deleteTopic(String id) {

		for(int i = 0; i < topics.size(); i++) {
			
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				System.out.println("ID is -> " + t.getId());
				topics.remove(i);
				return;
			}
		
		
			}
		}
}