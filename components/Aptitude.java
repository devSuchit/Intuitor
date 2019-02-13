package components;

import java.util.ArrayList;

public class Aptitude implements IAptitude
{
  private ArrayList<String> topics, strongTopics, weakTopics;
  private ArrayList<Double> aptValues;
  private String best, worst;
  private final double strengthThreshold = 80.0; // on 100
  private final double weaknessThreshold = 50.0; // on 100

  Aptitude(ArrayList<String> topics, ArrayList<Double> aptValues)
  {
    this.topics = topics;
    this.aptValues = aptValues;
  }

  ArrayList<String> strengths()
  {
    double max_apt = -1;
    for(int i = 0; i < topics.size(); i++)
    {
      if(aptValues.get(i) >= strengthThreshold)
        strongTopics.add(topics.get(i));
      if(aptValues.get(i) > max_apt)
      {
        best = topics.get(i);
        max_apt = aptValues.get(i);
      }
    }
    return strongTopics;
  }

  ArrayList<String> weaknesses()
  {
    double min_apt = 101;
    for(int i = 0; i < topics.size(); i++)
    {
      if(aptValues.get(i) < weaknessThreshold)
        weakTopics.add(topics.get(i));
      if(aptValues.get(i) < min_apt)
      {
        best = topics.get(i);
        min_apt = aptValues.get(i);
      }
    }
    return weakTopics;
  }

  String bestTopic()
  {
    return best;
  }

  String worstTopic()
  {
    return worst;
  }
}
