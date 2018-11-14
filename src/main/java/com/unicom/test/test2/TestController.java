package com.unicom.test.test2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = { "test-order" })
@RestController
public class TestController {

	@ApiOperation("获取订单信息")
	@GetMapping("/api/v1/orderinfo")
	public Object gainOrderInfo() {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", "hello,world!");
		return result;
	}
}
