package Service;

import Dao.StudentMapper;
import Entity.Sort;
import Entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService implements IStudentService {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> selectGetInfo(Student info, @Param("orderby") String orderby) {
        return studentMapper.selectGetInfo(info,orderby);
    }

    public List<Student> selectPostInfo(Sort sort){
        return studentMapper.selectPostInfo(sort);
    }


}
