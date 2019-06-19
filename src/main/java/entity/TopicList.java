package entity;

import java.util.Objects;

public class TopicList {
    private Long id;
    private String topic;
    private String description;
    private Long list;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getList() {
        return list;
    }

    public void setList(Long list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TopicList topicList = (TopicList) o;
        return Objects.equals(id, topicList.id) &&
                Objects.equals(topic, topicList.topic) &&
                Objects.equals(description, topicList.description) &&
                Objects.equals(list, topicList.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, topic, description, list);
    }

    @Override
    public String toString() {
        return "TopicList{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", description='" + description + '\'' +
                ", list=" + list +
                '}';
    }
}
