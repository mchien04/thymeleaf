package vn.iostar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import vn.iostar.entity.CategoryEntity;

public interface ICategoryService {

	void deleteAll();

	void delete(CategoryEntity entity);

	void deleteById(Long id);

	long count();

	Optional<CategoryEntity> findById(Long id);

	<S extends CategoryEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	List<CategoryEntity> findAllById(Iterable<Long> ids);

	List<CategoryEntity> findAll();

	List<CategoryEntity> findAll(Sort sort);

	<S extends CategoryEntity> Optional<S> findOne(Example<S> example);

	Page<CategoryEntity> findByNameContaining(String name, Pageable pageable);

	List<CategoryEntity> findByNameContaining(String name);

	<S extends CategoryEntity> S save(S entity);

}
