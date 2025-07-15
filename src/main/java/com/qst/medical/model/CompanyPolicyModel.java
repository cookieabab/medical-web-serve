package com.qst.medical.model;

import com.qst.medical.domain.CompanyPolicy;
import lombok.Data;


@Data
public class CompanyPolicyModel extends CompanyPolicy {

    private DrugCompanyModel drugCompanyModel;

}