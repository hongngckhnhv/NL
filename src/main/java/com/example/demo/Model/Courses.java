package com.example.demo.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "courses")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "web_course_id") // Đặt tên cho cột lưu trữ ID của khóa học trên web
    private Integer webCourseId; // Trường mới để lưu trữ ID của khóa học trên web

    private String fullname;
    private String shortname;
    private String category;
    private String description;

    // Getters và setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWebCourseId() {
        return webCourseId;
    }

    public void setWebCourseId(Integer webCourseId) {
        this.webCourseId = webCourseId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
