package com.company.medical.controller;

import com.company.medical.param.CompanyPolicyParam;
import com.company.medical.service.CompanyPolicyService;
import com.company.medical.util.Msg;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@Api(tags = "医药公司政策控制器类")
@RestController
@RequestMapping("/api/company_policys")
@CrossOrigin
public class CompanyPolicyController {

    @Autowired
    private CompanyPolicyService companyPolicyService;

    /**
     * 分页、关键字查询医药公司政策信息
     * @param param
     * @return
     */
    @GetMapping(value = "")
    public Msg getPolicyWithPage(CompanyPolicyParam param) {
        Msg msg = companyPolicyService.getAllPolicyWithPage(param);
        return msg;
    }

    /**
     * 添加医药公司政策信息
     * @param param
     * @return
     */
    @RolesAllowed({"1"})
    @PostMapping(value = "")
    public Msg saveMedicalPolicy(@RequestBody CompanyPolicyParam param) {
        Msg msg = companyPolicyService.savePolicy(param);
        return msg;
    }

    /**
     * 更新医药公司政策信息
     * @param param
     * @return
     */
    @RolesAllowed({"1"})
    @PutMapping(value = "/{id}")
    public Msg updateMedicalPolicy(@PathVariable("id") Long id, @RequestBody CompanyPolicyParam param) {
        if (!StringUtils.hasLength(param.getTitle())) {
            return Msg.fail().mess("标题不能为空");
        }
        if (!StringUtils.hasLength(param.getMessage())) {
            return Msg.fail().mess("内容不能为空");
        }
        if (param.getCompanyId() == null) {
            return Msg.fail().mess("公司ID不能为空");
        }
        return companyPolicyService.updatePolicy(id, param);
    }

    @RolesAllowed({"1"})
    @DeleteMapping("/{id}")
    public Msg deletePolicy(@PathVariable("id") Long id) {
        return companyPolicyService.deletePolicy(id);
    }

}