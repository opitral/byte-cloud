package com.opitral.bytecloud.service;

import com.opitral.bytecloud.domain.entity.FileEntity;

import java.util.List;
import java.util.Optional;

public interface FileService {
    FileEntity saveFile(FileEntity file);
    Optional<FileEntity> getFileById(Long fileId);
    List<FileEntity> getAllFiles();
    List<FileEntity> getFilesByFolderId(Long folderId);
    List<FileEntity> getFilesByUserId(Long userId);
    FileEntity updateFile(FileEntity file);
    void deleteFile(Long fileId);
    FileEntity moveFileToFolder(Long fileId, Long newFolderId);
}
