package com.opitral.bytecloud.service.impl;

import com.opitral.bytecloud.domain.entity.CommentEntity;
import com.opitral.bytecloud.service.CommentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService {

    @Override
    public CommentEntity createComment(CommentEntity comment) {
        return null;
    }

    @Override
    public Optional<CommentEntity> getCommentById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<CommentEntity> getCommentsByFileId(Long fileId) {
        return List.of();
    }

    @Override
    public CommentEntity updateComment(Long id, String newContent) {
        return null;
    }

    @Override
    public void deleteComment(Long id) {

    }
}
