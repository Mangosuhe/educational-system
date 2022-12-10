package com.javen.dao;

import com.javen.model.Course;

import java.util.List;

/**
 * @author Mango
 * @date 2022/12/05 21:55
 */
public interface CourseDao {
    /**
     * 查询所有课程
     *
     * @return 课程列表
     */
    List<Course> findAll();

    /**
     * 根据项姓名查询课程
     *
     * @param name 课程姓名
     * @return 课程
     */
    List<Course> findByName(String name);

    /**
     * 新增课程
     *
     * @param course 课程
     * @return 新增情况
     */
    Integer addCourse(Course course);

    /**
     * 删除课程
     *
     * @param course 课程
     * @return 更新情况
     */
    Integer deleteCourse(Course course);

    /**
     * 更新课程
     *
     * @param course 课程
     * @return 更新情况
     */
    Integer updateCourse(Course course);
}
