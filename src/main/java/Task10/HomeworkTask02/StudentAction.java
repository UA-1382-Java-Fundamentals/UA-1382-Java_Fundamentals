package Task10.HomeworkTask02;

import java.util.ArrayList;

public class StudentAction {

    public double averagePoint(ArrayList<SubjectAndRate> list) {
        double count = 0.0;
        double summa = 0.0;
        for (int i = 0; i <= list.size() - 1; i++) {
            summa = summa + list.get(i).getRate();
            count++;
        }
        return summa / count;
    }

    public boolean rateRemove(ArrayList<SubjectAndRate> list) {
        if (averagePoint(list) < 3) {
            return false;
        } else {
            return true;
        }
    }

    public void rateCheck(ArrayList<Student> list) {
        for (int i = 0; i <= list.size() - 1; i++) {
            if (rateRemove(list.get(i).getRateList()) == false) {
                list.remove(i);
            }
            if (rateRemove(list.get(i).getRateList()) == true) {
                list.get(i).setCourse(list.get(i).getCourse() + 1);
            }
        }
    }

    public void printStudents(ArrayList<Student> list) {
        for (int i = 0; i <= list.size() - 1; i++) {
            System.out.println("Student : " + list.get(i).getName() + " <in course : " + list.get(i).getCourse() + ">");
        }
    }
}
