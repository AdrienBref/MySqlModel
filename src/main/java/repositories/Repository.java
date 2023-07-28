package repositories;

import java.util.List;

public interface Repository<T> {
    void save(T t);
    void delete(T t);
    List<T> findAll();
    T findOneByID(long id);
    void update(T t);
}

