package other;

import java.util.ArrayList;
import java.util.List;

public class test_1 {
    static class Student {
        public Integer id;
        public String name;

        public Student(Integer id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    static class Grade {
        public Integer score;
        public Integer sid;

        public Grade(Integer score, Integer sid) {
            this.score = score;
            this.sid = sid;
        }
    }

    static class Result {
        public Student student;
        public Grade grade;

        public Result(Student student, Grade grade) {
            this.student = student;
            this.grade = grade;
        }

        @Override
        public String toString() {
            return student.id + "  " + student.name + "  " + grade.score + "  " + grade.sid;
        }
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "chenyou"));
        students.add(new Student(2, "xiaodan"));
        students.add(new Student(3, "baobao"));
        students.add(new Student(4, "meimei"));

        List<Grade> grades = new ArrayList<>();
        grades.add(new Grade(80, 1));
        grades.add(new Grade(70, 2));
        grades.add(new Grade(100, 4));
        grades.add(new Grade(5, 100));
        grades.add(new Grade(100, 1));

        // 1、模拟内连接 (select * from student s INNER JOIN grade g on s.id = g.sid;)
        System.out.println("- - - - - - - 测试模拟内连接- - - - - - - - -");
        List<Result> results = new ArrayList<>();
        for (Grade g : grades) {
            for (Student s : students) {
                if (s.id == g.sid) {
                    results.add(new Result(s, g));
                }
            }
        }
        printResult(results);

        // 2、模拟左连接 (select * from student s LEFT JOIN grade g on s.id = g.sid;)
        System.out.println("- - - - - - - 测试模拟左连接- - - - - - - - -");
        List<Result> resultsLeft = new ArrayList<>();
        for (Student s : students) {
            int count = resultsLeft.size();
            for (Grade g : grades) {
                if (s.id == g.sid) {
                    resultsLeft.add(new Result(s, g));
                }
            }
            if (count == resultsLeft.size()) {
                resultsLeft.add(new Result(s, new Grade(null, null)));
            }
        }

        printResult(resultsLeft);

        // 2、模拟右连接 (select * from student s RIGHT JOIN grade g on s.id = g.sid;)
        System.out.println("- - - - - - - 测试模拟右连接- - - - - - - - -");
        List<Result> resultsRight = new ArrayList<>();
        for (Grade g : grades) {
            int count = resultsRight.size();
            for (Student s : students) {
                if (s.id == g.sid) {
                    resultsRight.add(new Result(s, g));
                }
            }
            if (count == resultsRight.size()) {
                resultsRight.add(new Result(new Student(null, null), g));
            }
        }
        printResult(resultsRight);
    }


    public static void printResult(List<Result> results) {
        System.out.println("id" + "  " + "name" + "  " + "score" + "  " + "sid");
        for (Result result : results) {
            System.out.println(result);
        }
    }
}
