package edu.poly.trainingtest.Service.Impl;

import edu.poly.trainingtest.Entity.Sub_category;
import edu.poly.trainingtest.Repository.SubCategoryRepo;
import edu.poly.trainingtest.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class SubCategoryserviceImpl implements SubCategoryService {
    @Autowired
    private SubCategoryRepo subcategoryrepo;

    @Override
    public void flush() {
        subcategoryrepo.flush();
    }

    @Override
    public <S extends Sub_category> S saveAndFlush(S entity) {
        return subcategoryrepo.saveAndFlush(entity);
    }

    @Override
    public <S extends Sub_category> List<S> saveAllAndFlush(Iterable<S> entities) {
        return subcategoryrepo.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Sub_category> entities) {
        subcategoryrepo.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Sub_category> entities) {
        subcategoryrepo.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        subcategoryrepo.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        subcategoryrepo.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Sub_category getOne(Long aLong) {
        return subcategoryrepo.getOne(aLong);
    }

    @Override
    @Deprecated
    public Sub_category getById(Long aLong) {
        return subcategoryrepo.getById(aLong);
    }

    @Override
    public Sub_category getReferenceById(Long aLong) {
        return subcategoryrepo.getReferenceById(aLong);
    }

    @Override
    public <S extends Sub_category> List<S> findAll(Example<S> example) {
        return subcategoryrepo.findAll(example);
    }

    @Override
    public <S extends Sub_category> List<S> findAll(Example<S> example, Sort sort) {
        return subcategoryrepo.findAll(example, sort);
    }

    @Override
    public <S extends Sub_category> List<S> saveAll(Iterable<S> entities) {
        return subcategoryrepo.saveAll(entities);
    }

    @Override
    public List<Sub_category> findAll() {
        return subcategoryrepo.findAll();
    }

    @Override
    public List<Sub_category> findAllById(Iterable<Long> longs) {
        return subcategoryrepo.findAllById(longs);
    }

    @Override
    public <S extends Sub_category> S save(S entity) {
        return subcategoryrepo.save(entity);
    }

    @Override
    public Optional<Sub_category> findById(Long aLong) {
        return subcategoryrepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return subcategoryrepo.existsById(aLong);
    }

    @Override
    public long count() {
        return subcategoryrepo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        subcategoryrepo.deleteById(aLong);
    }

    @Override
    public void delete(Sub_category entity) {
        subcategoryrepo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        subcategoryrepo.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Sub_category> entities) {
        subcategoryrepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        subcategoryrepo.deleteAll();
    }

    @Override
    public List<Sub_category> findAll(Sort sort) {
        return subcategoryrepo.findAll(sort);
    }

    @Override
    public Page<Sub_category> findAll(Pageable pageable) {
        return subcategoryrepo.findAll(pageable);
    }

    @Override
    public <S extends Sub_category> Optional<S> findOne(Example<S> example) {
        return subcategoryrepo.findOne(example);
    }

    @Override
    public <S extends Sub_category> Page<S> findAll(Example<S> example, Pageable pageable) {
        return subcategoryrepo.findAll(example, pageable);
    }

    @Override
    public <S extends Sub_category> long count(Example<S> example) {
        return subcategoryrepo.count(example);
    }

    @Override
    public <S extends Sub_category> boolean exists(Example<S> example) {
        return subcategoryrepo.exists(example);
    }

    @Override
    public <S extends Sub_category, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return subcategoryrepo.findBy(example, queryFunction);
    }
}
