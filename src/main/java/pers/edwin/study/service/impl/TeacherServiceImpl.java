package pers.edwin.study.service.impl;

import pers.edwin.study.entity.Student;
import pers.edwin.study.entity.Teacher;
import pers.edwin.study.dao.TeacherDao;
import pers.edwin.study.service.TeacherService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Teacher)表服务实现类
 *
 * @author makejava
 * @since 2020-04-28 00:24:35
 */
@Service("teacherService")
public class TeacherServiceImpl implements TeacherService {
    @Resource
    private TeacherDao teacherDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Teacher queryById(Integer id) {
        return this.teacherDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<Teacher> queryAllByLimit(int offset, int limit) {
        return this.teacherDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher insert(Teacher teacher) {
        this.teacherDao.insert(teacher);
        return teacher;
    }

    /**
     * 修改数据
     *
     * @param teacher 实例对象
     * @return 实例对象
     */
    @Override
    public Teacher update(Teacher teacher) {
        this.teacherDao.update(teacher);
        return this.queryById(teacher.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.teacherDao.deleteById(id) > 0;
    }

    @Override
    public boolean check(String telephone) {
        List<Teacher> teachers = this.teacherDao.queryAll(Teacher.builder().telephone(telephone).build());
        return teachers.size() == 0;
    }

    @Override
    public Teacher login(String telephone, String password) {
        List<Teacher> teachers = this.teacherDao.queryAll(Teacher.builder()
                .telephone(telephone)
                .password(password)
                .build());
        if (teachers.size() > 0) {
            return teachers.get(0);
        }
        return null;
    }


}