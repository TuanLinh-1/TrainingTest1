package edu.poly.trainingtest.Service.Impl;

import edu.poly.trainingtest.Entity.Brand;
import edu.poly.trainingtest.Repository.BrandRepo;
import edu.poly.trainingtest.Service.BrandService;
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
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandRepo brandrepo;

    @Override
    public void flush() {
        brandrepo.flush();
    }

    @Override
    public <S extends Brand> S saveAndFlush(S entity) {
        return brandrepo.saveAndFlush(entity);
    }

    @Override
    public <S extends Brand> List<S> saveAllAndFlush(Iterable<S> entities) {
        return brandrepo.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Brand> entities) {
        brandrepo.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Brand> entities) {
        brandrepo.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        brandrepo.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        brandrepo.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Brand getOne(Long aLong) {
        return brandrepo.getOne(aLong);
    }

    @Override
    @Deprecated
    public Brand getById(Long aLong) {
        return brandrepo.getById(aLong);
    }

    @Override
    public Brand getReferenceById(Long aLong) {
        return brandrepo.getReferenceById(aLong);
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example) {
        return brandrepo.findAll(example);
    }

    @Override
    public <S extends Brand> List<S> findAll(Example<S> example, Sort sort) {
        return brandrepo.findAll(example, sort);
    }

    @Override
    public <S extends Brand> List<S> saveAll(Iterable<S> entities) {
        return brandrepo.saveAll(entities);
    }

    @Override
    public List<Brand> findAll() {
        return brandrepo.findAll();
    }

    @Override
    public List<Brand> findAllById(Iterable<Long> longs) {
        return brandrepo.findAllById(longs);
    }

    @Override
    public <S extends Brand> S save(S entity) {
        return brandrepo.save(entity);
    }

    @Override
    public Optional<Brand> findById(Long aLong) {
        return brandrepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return brandrepo.existsById(aLong);
    }

    @Override
    public long count() {
        return brandrepo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        brandrepo.deleteById(aLong);
    }

    @Override
    public void delete(Brand entity) {
        brandrepo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        brandrepo.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Brand> entities) {
        brandrepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        brandrepo.deleteAll();
    }

    @Override
    public List<Brand> findAll(Sort sort) {
        return brandrepo.findAll(sort);
    }

    @Override
    public Page<Brand> findAll(Pageable pageable) {
        return brandrepo.findAll(pageable);
    }

    @Override
    public <S extends Brand> Optional<S> findOne(Example<S> example) {
        return brandrepo.findOne(example);
    }

    @Override
    public <S extends Brand> Page<S> findAll(Example<S> example, Pageable pageable) {
        return brandrepo.findAll(example, pageable);
    }

    @Override
    public <S extends Brand> long count(Example<S> example) {
        return brandrepo.count(example);
    }

    @Override
    public <S extends Brand> boolean exists(Example<S> example) {
        return brandrepo.exists(example);
    }

    @Override
    public <S extends Brand, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return brandrepo.findBy(example, queryFunction);
    }
}
