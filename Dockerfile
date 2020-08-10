FROM registry.cn-hangzhou.aliyuncs.com/csh1104/csh:spring-boot-v1.0
#ADD test2-0.0.1.jar /usr/local/app/
ADD $(system.defaultworkingdirectory) /usr/local/app/test2-0.0.1.jar
