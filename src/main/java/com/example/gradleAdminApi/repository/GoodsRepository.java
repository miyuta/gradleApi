package com.example.gradleAdminApi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gradleAdminApi.model.entity.Goods;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long>{
    Page<Goods> findByGdsNameContaining(String keyword, Pageable pageable);
}
