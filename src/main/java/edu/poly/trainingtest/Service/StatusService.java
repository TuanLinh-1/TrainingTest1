package edu.poly.trainingtest.Service;

import edu.poly.trainingtest.Entity.Status;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface StatusService {
    void flush();

    <S extends Status> S saveAndFlush(S entity);

    <S extends Status> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Status> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Status getOne(Long aLong);

    @Deprecated
    Status getById(Long aLong);

    Status getReferenceById(Long aLong);

    <S extends Status> List<S> findAll(Example<S> example);

    <S extends Status> List<S> findAll(Example<S> example, Sort sort);

    <S extends Status> List<S> saveAll(Iterable<S> entities);

    List<Status> findAll();

    List<Status> findAllById(Iterable<Long> longs);

    <S extends Status> S save(S entity);

    Optional<Status> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Status entity);

    void deleteAllById(Iterable<? extends Long> longs);

    void deleteAll(Iterable<? extends Status> entities);

    void deleteAll();

    List<Status> findAll(Sort sort);

    Page<Status> findAll(Pageable pageable);

    <S extends Status> Optional<S> findOne(Example<S> example);

    <S extends Status> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Status> long count(Example<S> example);

    <S extends Status> boolean exists(Example<S> example);

    <S extends Status, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
