package components;

import java.util.ArrayList;

public class EvaluationMetrics {

    static double strengthAlignment(ITimeTable timeTable, IAptitude aptitude) {

        double strength_alignment = 0;

        ArrayList<String> strengths = aptitude.strengths();

        for(String strength : strengths) {

            double hours_needed, hours_allotted;

            try {
                hours_needed = Topics.getTopicByName(strength).getHours_needed();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            hours_allotted = timeTable.studyHoursFor(strength);

            strength_alignment += (hours_allotted / hours_needed);
        }

        return strength_alignment/strengths.size();
    }

    static double weaknessAlignment(ITimeTable timeTable, IAptitude aptitude) {

        double weakness_alignment = 0;

        ArrayList<String> weaknesses = aptitude.weaknesses();

        for(String weakness : weaknesses) {

            double hours_needed, hours_allotted;

            try {
                hours_needed = Topics.getTopicByName(weakness).getHours_needed();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }

            hours_allotted = timeTable.studyHoursFor(weakness);

            weakness_alignment += (hours_allotted / hours_needed);
        }

        return weakness_alignment/weaknesses.size();
    }
    
}
