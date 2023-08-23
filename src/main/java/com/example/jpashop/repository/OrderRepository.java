package com.example.jpashop.repository;

import com.example.jpashop.domain.Order;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {
    private final EntityManager em;

    public void save(Order order){
        em.persist(order);
    }

    public Order findOne(Long id){
        return em.find(Order.class, id);
    }

    public List<Order> findAll(OrderSearch orderSearch){
        String jpql = "select o from Order o join o.member m";
       return  em.createQuery(jpql +
                "where o.status = :status" +
                "and m.name like :name"
                , Order.class)
               .setParameter("status", orderSearch.getOrderStatus())
               .setMaxResults(1000)
                .getResultList();
    }

    //finally we need to use queryDsl
}
