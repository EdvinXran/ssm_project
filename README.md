
# ssm_project
ssm课程的项目

# 模块划分
计划进度 ： 邹睿明  
人员监控 ： 杨向东  
物料监控 ： 鲁妮  
工艺监控 ： 胡丰安  
质量监控 ： 杨渝挺  
设备监控 ： 杨骁  



182.61.60.156:3306/ssm_project

###url要加一句allowPublicKeyRetrieval=true

|账号|使用人|
|------|------|
|user11|空|
|user22|鲁妮|
|user33|空|
|user44|空|
|user55|空|
|user66|杨向东|
|user77|杨渝挺|

密码
Abc123456+


## 质量监控                      
|前端名称|业务逻辑|数据库表|依赖|
|------|------|------|------|
|不及格品管理  	|不及格品申请表 |unqualify_apply 		|产品表|
|工序计计量质检	|工序计计量质检	|process_measure_check	|工序表|
|工序计量质检	|工序计量质检	|process_count_check	|工序表|
|成品计数质检	|成品计数质检	|final_count_check		|订单表|
|成品计量质检	|成品计量质检	|final_measuret_check	|订单表|
