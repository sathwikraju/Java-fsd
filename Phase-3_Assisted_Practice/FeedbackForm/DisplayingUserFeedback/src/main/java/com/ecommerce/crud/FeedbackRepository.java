package com.ecommerce.crud;

import org.springframework.data.repository.CrudRepository;

import com.ecommerce.entity.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
}
