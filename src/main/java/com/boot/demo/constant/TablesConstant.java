package com.boot.demo.constant;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablesConstant {
    public static Map<String, List<Tuple>> systemTalbeMap = new HashMap<>();

    static {
        List<Tuple> compassSystem = new ArrayList<>();
        compassSystem.add(new Tuple("bd_board_follow"        ,"关注看板表"     ));
        compassSystem.add(new Tuple("bd_board_limit"         ,"看板权限表"     ));
        compassSystem.add(new Tuple("bd_board"               ,"看板表"   ));
        compassSystem.add(new Tuple("bd_chart_board"         ,"图表看板表"  ));
        compassSystem.add(new Tuple("ct_chart_info"          ,"图表信息"  ));
        compassSystem.add(new Tuple("rc_dictionary"          ,"枚举值配置表"      ));
        compassSystem.add(new Tuple("tt_model_filter_field"  ,"模型统计字段表"      ));
        compassSystem.add(new Tuple("tt_model_group"         ,"分组管理表"    ));
        compassSystem.add(new Tuple("tt_model"               ,"模型管理表"  ));
        compassSystem.add(new Tuple("tt_model_ss_target"     ,"模型统计指标表"   ));
        compassSystem.add(new Tuple("tt_target_dismantling"  ,"公式拆解"      ));
        compassSystem.add(new Tuple("tt_target"              ,"指标管理表"  ));
        compassSystem.add(new Tuple("psi_samples"            ,"PSI分数表"     ));
        compassSystem.add(new Tuple("risk_model_config"      ,"模型信息配置表"  ));
        compassSystem.add(new Tuple("roc_ks_score_label"     ,"ROC和KS分数表"   ));
        systemTalbeMap.put("风险罗盘", compassSystem);

        List<Tuple> accessSystem = new ArrayList<>();
        accessSystem.add(new Tuple("access_business_info"     ,"业务信息"   ));
        systemTalbeMap.put("接入管理", accessSystem);

        List<Tuple> bloodSystem = new ArrayList<>();
        bloodSystem.add(new Tuple("br_node_info"     ,    "节点信息表"  ));
        bloodSystem.add(new Tuple("br_prop_conf"     ,    "属性配置表"      ));
        bloodSystem.add(new Tuple("br_data_dict"     ,     "字典表"     ));
        bloodSystem.add(new Tuple("br_node_relation"     ,"节点关系表"       ));
        bloodSystem.add(new Tuple("br_relation_rule"     ,"节点规则"  ));
        bloodSystem.add(new Tuple("access_tag"     ,      "标签表"      ));
        bloodSystem.add(new Tuple("access_tag_scope"     ,"标签作用域表"  ));
        systemTalbeMap.put("血缘关系", bloodSystem);

        List<Tuple> designerSystem = new ArrayList<>();
        designerSystem.add(new Tuple("jrs_common_setting"     ,     "通用设置表"      ));
        designerSystem.add(new Tuple("jrs_component_definition"  ,  "组件定义表"    ));
        designerSystem.add(new Tuple("jrs_component_library"  ,     "组件版本库表"     ));
        designerSystem.add(new Tuple("jrs_component_user_library" , "组件用户版本库表"     ));
        designerSystem.add(new Tuple("jrs_decisionflow_pic"     ,   "决策流图片表"         ));
        designerSystem.add(new Tuple("jrs_dependent"     ,          "数据依赖表"         ));
        designerSystem.add(new Tuple("jrs_directory"     ,          "目录表"          ));
        designerSystem.add(new Tuple("jrs_password_error_log"     , "密码错误记录表"     ));
        designerSystem.add(new Tuple("jrs_password_log"     ,       "用户信息修改记录表"   ));
        designerSystem.add(new Tuple("jrs_resource_lock"     ,      "资源锁定记录表"   ));
        designerSystem.add(new Tuple("jrs_sms_log"     ,            "短信发送记录表"  ));
        designerSystem.add(new Tuple("jrs_strategy_deploy"     ,    "策略部署表"   ));
        designerSystem.add(new Tuple("jrs_sys_approve"     ,        "策略审批表"    ));
        designerSystem.add(new Tuple("jrs_sys_log"     ,            "操作日志表"    ));
        designerSystem.add(new Tuple("jrs_sys_message"     ,        "消息表"  ));
        designerSystem.add(new Tuple("jrs_sys_org"     ,            "组织表"  ));
        designerSystem.add(new Tuple("jrs_sys_org_role"     ,       "组织角色表"   ));
        designerSystem.add(new Tuple("jrs_sys_resource"     ,       "资源表"   ));
        designerSystem.add(new Tuple("jrs_sys_role"     ,           "角色表"  ));
        designerSystem.add(new Tuple("jrs_sys_role_auth"     ,      "角色授权表"    ));
        designerSystem.add(new Tuple("jrs_sys_theme"     ,          "用户主题表"   ));
        designerSystem.add(new Tuple("jrs_sys_user"     ,           "用户表" ));
        designerSystem.add(new Tuple("jrs_sys_user_org"     ,       "用户组织表"  ));
        designerSystem.add(new Tuple("jrs_sys_user_role"     ,       "用户角色表"  ));
        systemTalbeMap.put("策略中心", designerSystem);

        List<Tuple> insightSystem = new ArrayList<>();
        insightSystem.add(new Tuple("t_alarm_info"         ,            "告警信息表"              ));
        insightSystem.add(new Tuple("t_alarm_rule"         ,            "告警规则信息表"          ));
        insightSystem.add(new Tuple("t_alarm_rule_charge_user_info" ,   "告警规则负责人信息表"     ));
        insightSystem.add(new Tuple("t_alarm_rule_index"         ,      "告警规则指标关联信息"       ));
        insightSystem.add(new Tuple("t_condition"         ,             "条件信息"          ));
        insightSystem.add(new Tuple("t_datasource"         ,            "数据源信息"          ));
        insightSystem.add(new Tuple("t_field_mapping"         ,         "字段映射信息"             ));
        insightSystem.add(new Tuple("t_index"         ,                 "指标信息"         ));
        insightSystem.add(new Tuple("t_index_index"         ,           "指标关联信息"          ));
        insightSystem.add(new Tuple("t_stat_result"         ,           "统计结果信息"             ));
        insightSystem.add(new Tuple("t_table"         ,                 "表信息"         ));
        insightSystem.add(new Tuple("t_trigger_info"         ,          "规则触发信息表"          ));
        insightSystem.add(new Tuple("t_user_alarm_rule_follow_info" ,   "用户告警规则关注信息"         ));
        systemTalbeMap.put("风险洞察", insightSystem);


        List<Tuple> actSystem = new ArrayList<>();
        actSystem.add(new Tuple(  "act_approver_info"  ,           "审批人信息表"      ));
        actSystem.add(new Tuple(  "act_approver_info_copy" , "审批人信息表"       ));
        actSystem.add(new Tuple(  "act_def_task",         "任务配置信息表"      ));
        actSystem.add(new Tuple(  "act_evt_log"  ,          ""    ));
        actSystem.add(new Tuple(  "act_fms_repeat"  ,       "防重表"                  ));
        actSystem.add(new Tuple(  "act_ge_bytearray",       ""               ));
        actSystem.add(new Tuple(  "act_ge_property"  ,      ""       ));
        actSystem.add(new Tuple(  "act_hi_actinst"  ,       ""   ));
        actSystem.add(new Tuple(  "act_hi_actinst_backup"  ,"" ));
        actSystem.add(new Tuple(  "act_hi_attachment"  ,    ""   ));
        actSystem.add(new Tuple(  "act_hi_comment"  ,       ""      ));
        actSystem.add(new Tuple(  "act_hi_detail"  ,        ""   ));
        actSystem.add(new Tuple(  "act_hi_identitylink"  ,  ""       ));
        actSystem.add(new Tuple(  "act_hi_procinst"  ,      ""       ));
        actSystem.add(new Tuple(  "act_hi_taskinst"  ,      ""           ));
        actSystem.add(new Tuple(  "act_hi_varinst"  ,       ""           ));
        actSystem.add(new Tuple(  "act_id_group"  ,         ""        ));
        actSystem.add(new Tuple(  "act_id_info"  ,          ""            ));
        actSystem.add(new Tuple(  "act_id_membership"  ,    ""       ));
        actSystem.add(new Tuple(  "act_id_user"  ,          ""       ));
        actSystem.add(new Tuple(  "act_model_notice"  ,     "流程模型消息通知表"           ));
        actSystem.add(new Tuple(  "act_oa_keys"  ,          "OA信息KEY表"            ));
        actSystem.add(new Tuple(  "act_post_info"  ,        "岗位信息表"           ));
        actSystem.add(new Tuple(  "act_procdef_info"  ,     ""           ));
        actSystem.add(new Tuple(  "act_re_deployment"  ,    ""               ));
        actSystem.add(new Tuple(  "act_re_model"  ,         ""           ));
        actSystem.add(new Tuple(  "act_re_procdef"  ,       ""           ));
        actSystem.add(new Tuple(  "act_ru_event_subscr"  ,  ""           ));
        actSystem.add(new Tuple(  "act_ru_execution"  ,     ""           ));
        actSystem.add(new Tuple(  "act_ru_identitylink"  ,  ""           ));
        actSystem.add(new Tuple(  "act_ru_job"  ,           ""           ));
        actSystem.add(new Tuple(  "act_ru_task"  ,          ""           ));
        actSystem.add(new Tuple(  "act_ru_variable"  ,      ""           ));
        actSystem.add(new Tuple(  "act_system_flow"  ,      "流程系统对照表"           ));
        actSystem.add(new Tuple(  "act_system_info"  ,      "系统生成表"           ));
        systemTalbeMap.put("审批中心", actSystem);

        List<Tuple> sgySystem = new ArrayList<>();
        sgySystem.add(new Tuple("sgy_app_token_relation"     ,      "应用token关系表"            ));
        sgySystem.add(new Tuple("sgy_approval_request"     ,        "审批业务流水表"          ));
        sgySystem.add(new Tuple("sgy_approval_task"     ,           "审批任务表"       ));
        sgySystem.add(new Tuple("sgy_import_record"     ,           "导入记录表"       ));
        sgySystem.add(new Tuple("sgy_interface"     ,               "接口表"   ));
        sgySystem.add(new Tuple("sgy_interface_busi_rel"     ,      "接口与业务数据关联关系表"            ));
        sgySystem.add(new Tuple("sgy_interface_indicator"     ,     "指标定义表"             ));
        sgySystem.add(new Tuple("sgy_interface_mock"     ,          "接口mock表"        ));
        sgySystem.add(new Tuple("sgy_interface_param"     ,         "参数定义表"         ));
        sgySystem.add(new Tuple("sgy_interface_redundance"     ,    "接口冗余表，用于接口查询"              ));
        sgySystem.add(new Tuple("sgy_interface_replication"     ,   "接口复制表"               ));
        sgySystem.add(new Tuple("sgy_interface_strategy_relation"  , "接口表"                     ));
        sgySystem.add(new Tuple("sgy_interface_test"     ,          "接口测试记录表"        ));
        sgySystem.add(new Tuple("sgy_interface_token_relation"     ,"接口token关系表"                  ));
        sgySystem.add(new Tuple("sgy_interface_version"     ,       "接口版本表"           ));
        sgySystem.add(new Tuple("sgy_plan_indicator"     ,          "指标执行计划主表"        ));
        sgySystem.add(new Tuple("sgy_plan_indicator_detail"     ,   "指标执行计划明细表"               ));
        sgySystem.add(new Tuple("sgy_plan_node"     ,               "策略编排定义表"   ));
        sgySystem.add(new Tuple("sgy_plan_node_condition"     ,     "条件明细表"             ));
        sgySystem.add(new Tuple("sgy_plan_node_relation"     ,      "策略编排节点关系表"            ));
        sgySystem.add(new Tuple("sgy_pn_con_ele"     ,              "条件元素表"    ));
        sgySystem.add(new Tuple("sgy_strategy"     ,                "策略表"  ));
        sgySystem.add(new Tuple("sgy_strategy_param"     ,          "策略参数表"        ));
        sgySystem.add(new Tuple("sgy_strategy_version"     ,        "策略版本表"          ));
        systemTalbeMap.put("接口中心", sgySystem);


        List<Tuple> arkSystem = new ArrayList<>();
        arkSystem.add(new Tuple("ark_dict"    ,                 "数据字典表"        ));
        arkSystem.add(new Tuple("ark_function"    ,             "自定义函数表"   ));
        arkSystem.add(new Tuple("ark_gateway_api"    ,          "API表"      ));
        arkSystem.add(new Tuple("ark_gateway_api_param"    ,    "API参数表"            ));
        arkSystem.add(new Tuple("ark_operation_log"    ,        "操作日志表"        ));
        arkSystem.add(new Tuple("ark_source"    ,               "数据源表"        ));
        arkSystem.add(new Tuple("ark_source_history"    ,       "数据源历史表"         ));
        arkSystem.add(new Tuple("ark_source_instance"    ,      "数据源实例表"          ));
        arkSystem.add(new Tuple("ark_source_instance_history"  , "数据源实例历史表"                  ));
        arkSystem.add(new Tuple("ark_source_instance_param"    ,"元数据参数表"                ));
        arkSystem.add(new Tuple("ark_source_instance_param_t"  , "元数据参数表"                  ));
        arkSystem.add(new Tuple("ark_source_instance_t"    ,    "数据源实例表"            ));
        arkSystem.add(new Tuple("ark_source_method"    ,        "任务参数关系表"        ));
        arkSystem.add(new Tuple("ark_source_t"    ,             "数据源表"           ));
        arkSystem.add(new Tuple("ark_source_type"    ,          "数据源类型表"      ));
        arkSystem.add(new Tuple("ark_system"    ,               "业务系统表"        ));
        arkSystem.add(new Tuple("ark_system_relation"    ,      "变量业务系统关系表"          ));
        arkSystem.add(new Tuple("ark_tag"    ,                  "变量标签表"          ));
        arkSystem.add(new Tuple("ark_tag_relation"    ,         "变量标签关系表"       ));
        arkSystem.add(new Tuple("ark_template"    ,             "计算模板表"           ));
        arkSystem.add(new Tuple("ark_template_t"    ,           "计算模板表"            ));
        arkSystem.add(new Tuple("ark_variable"    ,             "变量表"        ));
        arkSystem.add(new Tuple("ark_variable_history"    ,     "变量表"           ));
        arkSystem.add(new Tuple("ark_variable_param"    ,       "变量参数表"         ));
        arkSystem.add(new Tuple("ark_variable_param_t"    ,     "变量参数表"           ));
        arkSystem.add(new Tuple("ark_variable_script"    ,      "变量自定义脚本信息表"          ));
        arkSystem.add(new Tuple("ark_variable_t"    ,           "变量表"     ));
        arkSystem.add(new Tuple("ark_variable_task"    ,        "派生变量任务详情表"        ));
        arkSystem.add(new Tuple("ark_variable_task_relation"   , "任务参数关系表"                 ));
        arkSystem.add(new Tuple("ark_variable_task_relation_t" , "任务参数关系表"                   ));
        arkSystem.add(new Tuple("ark_variable_task_t"    ,      "派生变量任务详情表"          ));
        arkSystem.add(new Tuple("ark_variable_test_record"    , "变量测试记录表"               ));
        systemTalbeMap.put("变量中心", arkSystem);

        List<Tuple> gatewaySystem = new ArrayList<>();
        gatewaySystem.add(new Tuple("gateway_api"   ,                 "API表"                    ));
        gatewaySystem.add(new Tuple("gateway_api_application"   ,                 "API应用授权表"                    ));
        gatewaySystem.add(new Tuple("gateway_api_param"   ,                 "API参数表"                    ));
        gatewaySystem.add(new Tuple("gateway_application"   ,                 "应用表"                    ));
        gatewaySystem.add(new Tuple("gateway_approve"   ,                 "审批表"                    ));
        gatewaySystem.add(new Tuple("gateway_test_info"   ,                 "API测试表"));
        systemTalbeMap.put("网关中心", gatewaySystem);

        List<Tuple> nameListSystem = new ArrayList<>();
        nameListSystem.add(new Tuple("jrs_namelist_apply_auth"   ,         "申请权限表"             ));
        nameListSystem.add(new Tuple("jrs_namelist_auth"   ,               "用户权限表"       ));
        nameListSystem.add(new Tuple("jrs_namelist_channel"   ,            "渠道表"          ));
        nameListSystem.add(new Tuple("jrs_namelist_dictionary"   ,         "字典表"             ));
        nameListSystem.add(new Tuple("jrs_namelist_file_info"   ,          "文件表"            ));
        nameListSystem.add(new Tuple("jrs_namelist_operate_log"   ,        "操作日志表"              ));
        nameListSystem.add(new Tuple("jrs_namelist_table_config"   ,       "名单表配置表"               ));
        nameListSystem.add(new Tuple("jrs_namelist_table_construct"   ,    "名单表结构明细表"                  ));
        nameListSystem.add(new Tuple("jrs_namelist_workflow"   ,           "审批流程表"           ));
        systemTalbeMap.put("名单中心", nameListSystem);

        List<Tuple> caseSystem = new ArrayList<>();
        caseSystem.add(new Tuple("risk_case"   ,         "案件业务信息表"         ));
        caseSystem.add(new Tuple("risk_case_add_black"   ,         "案件加黑业务信息表"         ));
        caseSystem.add(new Tuple("risk_case_attachment"   ,         "案件审批附件业务信息表"         ));
        caseSystem.add(new Tuple("risk_case_biz_data"   ,         "案件外部数据业务信息表"         ));
        caseSystem.add(new Tuple("risk_case_call_verify"   ,         "案件电联信息业务表"         ));
        caseSystem.add(new Tuple("risk_case_call_verify_detail"   ,         "案件电联详情业务信息表"         ));
        caseSystem.add(new Tuple("risk_case_operation"   ,         "案件操作业务信息表"         ));
        caseSystem.add(new Tuple("risk_extra_section"   ,         "案件板块配置表"         ));
        caseSystem.add(new Tuple("risk_extra_section_property"   ,    "案件板块属性配置表"              ));
        systemTalbeMap.put("案件中心", caseSystem);
    }

    @Data
    public static class Tuple {
        String name;
        String desc;

        public Tuple(String name, String desc) {
            this.name = name;
            this.desc = desc;
        }
    }
}