package com.boot.demo.test;


import com.alibaba.fastjson.JSONObject;

public class Main {
    public static void main(String[] args) {
//        String str = "{\"语文\":\"88\",\"数学\":\"78\",\"计算机\":\"99\"}";
        String str = "\"{\"trialRepaymentResults\":[{\"chargeMoney\":0,\"chargePrincipal\":328.12,\"chargeRate\":0.43,\"compoundInterest\":0.00,\"currentIssue\":1,\"penaltyAmount\":0,\"penaltyRate\":0.00,\"refundSecureCharge\":0,\"refundServiceCharge\":0}]}\"";
        JSONObject jsonObject;
        System.out.println(str.substring(1,str.length()-1));
        jsonObject = JSONObject.parseObject(str.substring(1,str.length()-1));
        System.out.println(jsonObject.get("trialRepaymentResults"));
    }
}
