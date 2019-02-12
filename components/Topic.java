package components;

class Topic {
    String topic_name;
    int priority;
    int hours_needed;

    public Topic(String topic_name, int priority, int hours_needed) {
        this.topic_name = topic_name;
        this.priority = priority;
        this.hours_needed = hours_needed;
    }

    public String getTopic_name() {
        return topic_name;
    }

    public int getPriority() {
        return priority;
    }

    public int getHours_needed() {
        return hours_needed;
    }
}
