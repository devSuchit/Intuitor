package components;
/**
 * Time Table Planner
 */
import java.util.*;
public class TimeTable implements ITimeTable
{
    // instance variables
    private ArrayList<Topic> topics_table;
    //getter function
    Topic hourIBelongsTo(int i)
    {
        return topics_table[i];
    }
    //setter function
    void setHoursFor(int start, int end, Topic topic_name)
    {
        for(int i = start;i<=end;i++)
        {
                topics_table.add(i,topic_name);
        }
    }
    //evaluator
    int studyHoursFor(String topic_name)
    {
        int counter=0;
        for(Topic topic : topics_table)
        {
              if((topic.topic_name).equalsIgnoreCase(topic_name))
              {
                  counter++;
              }
        }
        return counter;
    }
}


