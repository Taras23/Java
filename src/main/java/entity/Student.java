package entity;

import java.util.Objects;

public class Student {
        private Long id;
        private String student_name;
        private String student_surname;
        private String email;
        private Float success;

    public Student(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_surname() {
        return student_surname;
    }

    public void setStudent_surname(String student_surname) {
        this.student_surname = student_surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getSuccess() {
        return success;
    }

    public void setSuccess(Float success) {
        this.success = success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) &&
                Objects.equals(student_name, student.student_name) &&
                Objects.equals(student_surname, student.student_surname) &&
                Objects.equals(email, student.email) &&
                Objects.equals(success, student.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, student_name, student_surname, email, success);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", student_name='" + student_name + '\'' +
                ", student_surname='" + student_surname + '\'' +
                ", email='" + email + '\'' +
                ", success=" + success +
                '}';
    }
}
