package in.ashokit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.binding.Course;

public interface CourseRepo extends JpaRepository<Course, Integer>{

}
