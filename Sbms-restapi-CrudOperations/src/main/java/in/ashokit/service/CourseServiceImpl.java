package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.binding.Course;
import in.ashokit.repo.CourseRepo;

@Service
public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepo repo;
	
	@Override
	public String upsert(Course course) {
		repo.save(course);
		
		return "sucess";
	}

	@Override
	public Course getById(Integer cid) {
		Optional<Course> id = repo.findById(cid);
		if(id.isPresent()) {
			return id.get();
		}
		
		return null;
	}

	@Override
	public List<Course> getAllCourses() {
		List<Course> list = repo.findAll();
		
		return list;
	}

	@Override
	public String deleteById(Integer cid) {
		if(repo.existsById(cid)) {
			repo.deleteById(cid);
			return "sucessfuly delete";
		}else {
			return "no record found";
		}
		
	}

}
