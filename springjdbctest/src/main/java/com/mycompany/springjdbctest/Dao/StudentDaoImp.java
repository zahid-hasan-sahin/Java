package com.mycompany.springjdbctest.Dao;

import com.mycompany.springjdbctest.Entities.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component("studentDaoImp")
public class StudentDaoImp implements StudentDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Student student) {
        String q = "insert into Student(id,name,city) values(?,?,?);";
        return jdbcTemplate.update(q, student.getId(), student.getName(), student.getCity());
    }

    @Override
    public int change(Student student) {
        String q = "update student set name=? ,city=? where id=?";
        return jdbcTemplate.update(q, student.getName(), student.getCity(), student.getId());
    }

    @Override
    public int delete(int studentId) {
        String q = "delete from student where id=?";
        return jdbcTemplate.update(q, studentId);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Student getStudent(int studentId) {
        String q = "select * from student where id=?";
        Student student = (Student) jdbcTemplate.queryForObject(q, (ResultSet rs, int i) -> {
            Student st = new Student();
            st.setId(rs.getInt(1));
            st.setName(rs.getString(2));
            st.setCity(rs.getString(3));
            return st;

        },
                studentId);

        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        String q = "select * from student";
        List<Student> students = jdbcTemplate.query(q, (ResultSet rs, int i) -> {
            Student st = new Student();
            st.setId(rs.getInt(1));
            st.setName(rs.getString(2));
            st.setCity(rs.getString(3));
            return st;

        }
        );

        return students;
    }

}
