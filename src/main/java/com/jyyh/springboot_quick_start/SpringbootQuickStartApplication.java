package com.jyyh.springboot_quick_start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 *  @SpringBootConfiguration
 *  通过这个注解可以标注此类为spring管理的配置类 底层是一个@compent注解
 	@EnableAutoConfiguration
 	具备自动配置的功能
 	@ComponentScan(
	扫描当前包和子包下的类 交给spring管理
	 excludeFilters = {@Filter(
	 type = FilterType.CUSTOM,
	 classes = {TypeExcludeFilter.class}
	 ), @Filter(
	 type = FilterType.CUSTOM,
	 classes = {AutoConfigurationExcludeFilter.class}
 )}
 )
 */
public class SpringbootQuickStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootQuickStartApplication.class, args);
	}

}
