package Assignment6.Q1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        LocalDate date1 = LocalDate.of(2014, 9, 11);
        Student student1 = new Student(1,"Jack",3.2, new Date(1996,06,16));
        Student student2 = new Student(2,"Rose",3.5, new Date(1998,02,12));
        Student student3 = new Student(3,"Lilly",3.9, new Date(1994,06,10));

        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list, new NameComparator());
        System.out.println("===========Sort by name===========");
        for (int i =0; i<list.size(); i++) {
            System.out.println("id : " + list.get(i).getId() + " - name : " + list.get(i).getName());
        }

        Collections.sort(list,new GpaComparator());
        System.out.println("===========Sort by GPA===========");
        for (int i =0; i<list.size(); i++) {
            System.out.println("id : " + list.get(i).getId() + " - GPA : " + list.get(i).getGpa());
        }

        DateFormat df = new SimpleDateFormat();
        Collections.sort(list, new DateOfBirthComparator());
        System.out.println("===========Sort by Date of Birth===========");
        for (int i =0; i<list.size(); i++) {
            System.out.println("id : " + list.get(i).getId() + " - Date of Birth : " + df.format(list.get(i).getDateOfBirth()));
        }
    }
}
