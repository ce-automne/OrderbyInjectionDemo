package Controllers;

import Entity.Sort;
import Entity.Student;
import Service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/student/info")
public class SortController {
    @Autowired
    private IStudentService service;

    @GetMapping()
    public List<Student> GetStudentInfo(@RequestParam String orderby) {
        List<Student> students = service.selectGetInfo(new Student(),orderby);
        return students;
    }

    @RequestMapping(value={"/json"},produces={"application/json;charset=utf-8"},method=RequestMethod.POST)
    public List<Student> GetStudentInfo(@RequestBody Sort sort) {
        List<Student> students = service.selectPostInfo(sort);
        return students;
    }
}
