package org.example.structural.Composite;

public class Topic extends Content
{
    private String topicName;

    public Topic(String description, String topicName) {
        super(description);
        this.topicName = topicName;
    }

    public String getTopicName() {
        return topicName;
    }
    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    @Override
    public String display() {
        return " Topic: "+this.topicName + " Description: " + this.getDescription()+"\n";
    }
}
