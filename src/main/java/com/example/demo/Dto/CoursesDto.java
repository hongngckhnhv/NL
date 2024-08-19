package com.example.demo.Dto;

public class CoursesDto {
    private Integer id; // ID của khóa học trong ứng dụng web
    private Integer webCourseId; // ID của khóa học trên Moodle
    private String fullname;
    private String shortname;
    private String category;
    private String description;

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
