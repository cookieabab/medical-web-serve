package com.company.medical.param;

import com.company.medical.domain.Drug;

public class DrugParam extends Drug {

    private Long[] saleIds;//售卖该药品的药店
    //省略get/set方法


    public Long[] getSaleIds() {
        return saleIds;
    }

    public void setSaleIds(Long[] saleIds) {
        this.saleIds = saleIds;
    }
}