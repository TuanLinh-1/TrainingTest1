package edu.poly.trainingtest.Service.Impl;

import edu.poly.trainingtest.Entity.Product;
import edu.poly.trainingtest.Repository.ProductRepo;
import edu.poly.trainingtest.Service.ProductService;
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
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productrepo;

    @Override
    public void flush() {
        productrepo.flush();
    }

    @Override
    public <S extends Product> S saveAndFlush(S entity) {
        return productrepo.saveAndFlush(entity);
    }

    @Override
    public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
        return productrepo.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Product> entities) {
        productrepo.deleteInBatch(entities);
    }

    @Override
    public void deleteAllInBatch(Iterable<Product> entities) {
        productrepo.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        productrepo.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        productrepo.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Product getOne(Long aLong) {
        return productrepo.getOne(aLong);
    }

    @Override
    @Deprecated
    public Product getById(Long aLong) {
        return productrepo.getById(aLong);
    }

    @Override
    public Product getReferenceById(Long aLong) {
        return productrepo.getReferenceById(aLong);
    }

    @Override
    public <S extends Product> List<S> findAll(Example<S> example) {
        return productrepo.findAll(example);
    }

    @Override
    public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
        return productrepo.findAll(example, sort);
    }

    @Override
    public <S extends Product> List<S> saveAll(Iterable<S> entities) {
        return productrepo.saveAll(entities);
    }

    @Override
    public List<Product> findAll() {
        return productrepo.findAll();
    }

    @Override
    public List<Product> findAllById(Iterable<Long> longs) {
        return productrepo.findAllById(longs);
    }

    @Override
    public <S extends Product> S save(S entity) {
        return productrepo.save(entity);
    }

    @Override
    public Optional<Product> findById(Long aLong) {

        return productrepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return productrepo.existsById(aLong);
    }

    @Override
    public long count() {
        return productrepo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        productrepo.deleteById(aLong);
    }

    @Override
    public void delete(Product entity) {
        productrepo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        productrepo.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Product> entities) {
        productrepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        productrepo.deleteAll();
    }

    @Override
    public List<Product> findAll(Sort sort) {
        return productrepo.findAll(sort);
    }

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productrepo.findAll(pageable);
    }

    @Override
    public <S extends Product> Optional<S> findOne(Example<S> example) {
        return productrepo.findOne(example);
    }

    @Override
    public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
        return productrepo.findAll(example, pageable);
    }

    @Override
    public <S extends Product> long count(Example<S> example) {
        return productrepo.count(example);
    }

    @Override
    public <S extends Product> boolean exists(Example<S> example) {
        return productrepo.exists(example);
    }

    @Override
    public <S extends Product, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return productrepo.findBy(example, queryFunction);
    }
}
