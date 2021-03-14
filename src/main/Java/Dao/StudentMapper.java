package Dao;

import Entity.Sort;
import Entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentMapper {

    List<Student> selectGetInfo(Student info, @Param("orderby") String orderby);

    List<Student> selectPostInfo(Sort sort);
}