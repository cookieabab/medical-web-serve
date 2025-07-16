package com.company.medical.controller;

import com.company.medical.service.FileUploadService;
import com.company.medical.util.Msg;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.security.RolesAllowed;

@Api(tags = "文件上传控制器")
@RestController
@RequestMapping("/api/base/upload")
@CrossOrigin
public class FileUploadController {

    @Autowired
    private FileUploadService fileUploadService;

    /**
     * 上传文件至华为云
     * @param file
     * @return
     */
    @RolesAllowed({"1","2"})
    @PostMapping(value = "")
    public Msg fileUpload(MultipartFile file) {
        Msg msg = fileUploadService.upload(file);
        return msg;
    }
}