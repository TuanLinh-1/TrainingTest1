package edu.poly.trainingtest.Service;

import edu.poly.trainingtest.Entity.Sub_category;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public interface SubCategoryService {
    void flush();

    <S extends Sub_category> S saveAndFlush(S entity);

    <S extends Sub_category> List<S> saveAllAndFlush(Iterable<S> entities);

    @Deprecated
    void deleteInBatch(Iterable<Sub_category> entities);

    void deleteAllInBatch(Iterable<Sub_category> entities);

    void deleteAllByIdInBatch(Iterable<Long> longs);

    void deleteAllInBatch();

    @Deprecated
    Sub_category getOne(Long aLong);

    @Deprecated
    Sub_category getById(Long aLong);

    Sub_category getReferenceById(Long aLong);

    <S extends Sub_category> List<S> findAll(Example<S> example);

    <S extends Sub_category> List<S> findAll(Example<S> example, Sort sort);

    <S extends Sub_category> List<S> saveAll(Iterable<S> entities);

    List<Sub_category> findAll();

    List<Sub_category> findAllById(Iterable<Long> longs);

    <S extends Sub_category> S save(S entity);

    Optional<Sub_category> findById(Long aLong);

    boolean existsById(Long aLong);

    long count();

    void deleteById(Long aLong);

    void delete(Sub_category entity);

    void deleteAllById(Iterable<? extends Long> longs);

    void deleteAll(Iterable<? extends Sub_category> entities);

    void deleteAll();

    List<Sub_category> findAll(Sort sort);

    Page<Sub_category> findAll(Pageable pageable);

    <S extends Sub_category> Optional<S> findOne(Example<S> example);

    <S extends Sub_category> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends Sub_category> long count(Example<S> example);

    <S extends Sub_category> boolean exists(Example<S> example);

    <S extends Sub_category, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
