package edu.poly.trainingtest.Service.Impl;

import edu.poly.trainingtest.Entity.Status;
import edu.poly.trainingtest.Repository.StatusRepo;
import edu.poly.trainingtest.Service.StatusService;
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
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusRepo statusRepo;

    @Override
    public void flush() {
        statusRepo.flush();
    }

    @Override
    public <S extends Status> S saveAndFlush(S entity) {
        return statusRepo.saveAndFlush(entity);
    }

    @Override
    public <S extends Status> List<S> saveAllAndFlush(Iterable<S> entities) {
        return statusRepo.saveAllAndFlush(entities);
    }

    @Override
    @Deprecated
    public void deleteInBatch(Iterable<Status> entities) {
        statusRepo.deleteInBatch(entities);
    }

    public void deleteAllInBatch(Iterable<Status> entities) {
        statusRepo.deleteAllInBatch(entities);
    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {
        statusRepo.deleteAllByIdInBatch(longs);
    }

    @Override
    public void deleteAllInBatch() {
        statusRepo.deleteAllInBatch();
    }

    @Override
    @Deprecated
    public Status getOne(Long aLong) {
        return statusRepo.getOne(aLong);
    }

    @Override
    @Deprecated
    public Status getById(Long aLong) {
        return statusRepo.getById(aLong);
    }

    @Override
    public Status getReferenceById(Long aLong) {
        return statusRepo.getReferenceById(aLong);
    }

    @Override
    public <S extends Status> List<S> findAll(Example<S> example) {
        return statusRepo.findAll(example);
    }

    @Override
    public <S extends Status> List<S> findAll(Example<S> example, Sort sort) {
        return statusRepo.findAll(example, sort);
    }

    @Override
    public <S extends Status> List<S> saveAll(Iterable<S> entities) {
        return statusRepo.saveAll(entities);
    }

    @Override
    public List<Status> findAll() {
        return statusRepo.findAll();
    }

    @Override
    public List<Status> findAllById(Iterable<Long> longs) {
        return statusRepo.findAllById(longs);
    }

    @Override
    public <S extends Status> S save(S entity) {
        return statusRepo.save(entity);
    }

    @Override
    public Optional<Status> findById(Long aLong) {
        return statusRepo.findById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return statusRepo.existsById(aLong);
    }

    @Override
    public long count() {
        return statusRepo.count();
    }

    @Override
    public void deleteById(Long aLong) {
        statusRepo.deleteById(aLong);
    }

    @Override
    public void delete(Status entity) {
        statusRepo.delete(entity);
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        statusRepo.deleteAllById(longs);
    }

    @Override
    public void deleteAll(Iterable<? extends Status> entities) {
        statusRepo.deleteAll(entities);
    }

    @Override
    public void deleteAll() {
        statusRepo.deleteAll();
    }

    @Override
    public List<Status> findAll(Sort sort) {
        return statusRepo.findAll(sort);
    }

    @Override
    public Page<Status> findAll(Pageable pageable) {
        return statusRepo.findAll(pageable);
    }

    @Override
    public <S extends Status> Optional<S> findOne(Example<S> example) {
        return statusRepo.findOne(example);
    }

    @Override
    public <S extends Status> Page<S> findAll(Example<S> example, Pageable pageable) {
        return statusRepo.findAll(example, pageable);
    }

    @Override
    public <S extends Status> long count(Example<S> example) {
        return statusRepo.count(example);
    }

    @Override
    public <S extends Status> boolean exists(Example<S> example) {
        return statusRepo.exists(example);
    }

    @Override
    public <S extends Status, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return statusRepo.findBy(example, queryFunction);
    }
}
