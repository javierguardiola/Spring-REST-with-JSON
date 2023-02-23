package org.javacodegeeks.webservices.rest.ticket.service;

import org.javacodegeeks.webservices.rest.ticket.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}