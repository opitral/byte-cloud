package com.opitral.bytecloud.service;

import com.opitral.bytecloud.domain.entity.FolderEntity;

import java.util.List;
import java.util.Optional;

public interface FolderService {
    FolderEntity createFolder(FolderEntity folder);
    Optional<FolderEntity> getFolderById(Long id);
    List<FolderEntity> getAllFolders();
    List<FolderEntity> getFoldersByParentId(Long parentId);
    FolderEntity updateFolder(Long id, String newName);
    void deleteFolder(Long id);
}
