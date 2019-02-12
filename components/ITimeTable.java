package components;

public interface ITimeTable {
    String hourIBelongsTo(int i);
    void setHoursFor(int i, int j, String topic);
    int studyHoursFor(String topic_name);
}
