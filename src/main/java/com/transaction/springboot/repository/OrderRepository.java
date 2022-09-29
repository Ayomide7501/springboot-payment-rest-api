package com.transaction.springboot.repository;

import com.transaction.springboot.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public interface OrderRepository extends JpaRepository<Order, Long> {

    /*@Override
    @Transactional(timeout = 10)
    void deleteById(Long aLong);

    @Override
            @Transactional(propagation = Propagation.NEVER)
    <S extends Order> S save(S entity);*/
}
