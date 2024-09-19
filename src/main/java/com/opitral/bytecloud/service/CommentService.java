package com.opitral.bytecloud.service;

import com.opitral.bytecloud.domain.entity.CommentEntity;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    CommentEntity createComment(CommentEntity comment);
    Optional<CommentEntity> getCommentById(Long id);
    List<CommentEntity> getCommentsByFileId(Long fileId);
    CommentEntity updateComment(Long id, String newContent);
    void deleteComment(Long id);
}
