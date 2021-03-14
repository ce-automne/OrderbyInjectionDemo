package Service;

import Entity.Sort;
import Entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentService {

    List<Student> selectGetInfo(Student info, @Param("orderby") String orderby);

    List<Student> selectPostInfo(Sort sort);

}
