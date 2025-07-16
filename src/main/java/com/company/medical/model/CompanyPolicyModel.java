package com.company.medical.model;

import com.company.medical.domain.CompanyPolicy;
import lombok.Data;


@Data
public class CompanyPolicyModel extends CompanyPolicy {

    private DrugCompanyModel drugCompanyModel;

}