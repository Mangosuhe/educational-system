package com.javen.controller;

import com.javen.model.Student;
import com.javen.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mango
 */
@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    /**
     * 查询所有学生
     *
     * @return 学生列表
     */
    @RequestMapping("findAll")
    @ResponseBody
    public Map<String, Object> findAll() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",iStudentService.findAll().size());
        result.put("data",iStudentService.findAll());
        return result;
    }

    /**
     * 按姓名查询
     *
     * @param name 姓名
     * @return 学生
     */
    @RequestMapping("findByName")
    @ResponseBody
    public Map<String, Object> findByName(String name) {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",iStudentService.findByName(name).size());
        result.put("data",iStudentService.findByName(name));
        return result;
    }

    /**
     * 新增学生
     *
     * @param student 学生
     * @return 新增情况
     */
    @RequestMapping("addStudent")
    @ResponseBody
    public Integer addStudent(Student student) {
        int account = iStudentService.addStudent(student);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 删除学生
     *
     * @param student 学生
     * @return 删除情况
     */
    @RequestMapping("deleteStudent")
    @ResponseBody
    public Integer deleteStudent(Student student) {
        int account = iStudentService.deleteStudent(student);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }

    /**
     * 更新学生
     *
     * @param student 学生
     * @return 更新情况
     */
    @RequestMapping("updateStudent")
    @ResponseBody
    public Integer updateStudent(Student student) {
        int account = iStudentService.updateStudent(student);
        int data;
        if (account == 1) {
            data = 200;
        } else {
            data = 404;
        }
        return data;
    }
}
