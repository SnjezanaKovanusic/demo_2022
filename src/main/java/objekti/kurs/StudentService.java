package objekti.kurs;

import java.util.List;

public class StudentService {
    public void dodajStudenta(List<Student> students, String ime) {
        Student student = new Student(ime);
        students.add(student);
        System.out.println("Dodan je student "+ime);
        students.forEach(System.out::println);
    }

    public void izbrisiStudenta(List<Student> students, String ime) {
        students.forEach(student -> {
            if (student.getIme().equals(ime)) {
                students.remove(student);
            }
        });
        System.out.println("Izbrisan je student "+ime);
        students.forEach(System.out::println);
    }

    public void ispisiStudente(List<Student> student){
        System.out.println("Svi trenutni students");
        student.forEach(System.out::println);
    }
   
}
