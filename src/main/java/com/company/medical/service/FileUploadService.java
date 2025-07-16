package com.company.medical.service;

import com.company.medical.util.Msg;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.UUID;
@Service
public class FileUploadService {
    @Value("${upload.path}")
    private String uploadPath;  // 注入上传目录配置

    @Value("${server.port:8080}")
    private int serverPort;     // 获取服务器端口（默认8080）

    public Msg upload(MultipartFile file) {
        String fileName = null;
        try {
            // 生成唯一文件名
            fileName = UUID.randomUUID() + file.getOriginalFilename();

            // 构建完整文件路径
            File uploadDir = new File(uploadPath);
            if (!uploadDir.exists()) {
                uploadDir.mkdirs();  // 创建目录（包括父目录）
            }

            File targetFile = new File(uploadDir, fileName);

            // 保存文件（使用Java 7+的Files工具类更简洁安全）
            Files.copy(file.getInputStream(), targetFile.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

            // 构建访问URL（假设静态资源映射到/images/路径）
            String url = "http://localhost:" + serverPort + "/image/" + fileName;
            return Msg.success().mess("上传成功").data("url", url);

        } catch (IOException e) {
            System.err.println("文件上传失败: " + e.getMessage());
            e.printStackTrace();  // 打印详细堆栈信息
            return Msg.fail().mess("上传失败");
        }
    }
}