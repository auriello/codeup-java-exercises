package grades;
import java.util.ArrayList;
public class Student {

    private final String name;
        private final ArrayList<Integer> grades;

        public Student(String name) {
            this.name = name;
            this.grades = new ArrayList<>();
        }

        public String getName() {
            return this.name;
        }

        public void addGrade(int grade) {
            this.grades.add(grade);
        }

        public double getGradeAverage() {
            if (this.grades.isEmpty()) {
                return 0.0;
            }

            double sum = 0;
            for (int grade : this.grades) {
                sum += grade;
            }

            return sum / this.grades.size();
        }
    }


