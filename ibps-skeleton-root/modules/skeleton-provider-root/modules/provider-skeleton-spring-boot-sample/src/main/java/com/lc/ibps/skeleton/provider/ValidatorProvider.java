/**
 * 	GET（SELECT）：从服务器取出资源（一项或多项）。
 *	POST（CREATE）：在服务器新建一个资源。
 *	PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）。
 *	PATCH（UPDATE）：在服务器更新资源（客户端提供改变的属性）。
 *	DELETE（DELETE）：从服务器删除资源。
 */

/**
 *  Bean Validation 中内置的 constraint
 * 	@Null   被注释的元素必须为 null     
 *	@NotNull    被注释的元素必须不为 null     
 *	@AssertTrue     被注释的元素必须为 true     
 *	@AssertFalse    被注释的元素必须为 false     
 *	@Min(value)     被注释的元素必须是一个数字，其值必须大于等于指定的最小值     
 *	@Max(value)     被注释的元素必须是一个数字，其值必须小于等于指定的最大值     
 *	@DecimalMin(value)  被注释的元素必须是一个数字，其值必须大于等于指定的最小值     
 *	@DecimalMax(value)  被注释的元素必须是一个数字，其值必须小于等于指定的最大值     
 *	@Size(max=, min=)   被注释的元素的大小必须在指定的范围内     
 *	@Digits (integer, fraction)     被注释的元素必须是一个数字，其值必须在可接受的范围内     
 *	@Past   被注释的元素必须是一个过去的日期     
 *	@Future     被注释的元素必须是一个将来的日期     
 *	@Pattern(regex=,flag=)  被注释的元素必须符合指定的正则表达式     
 *
 *	Hibernate Validator 附加的 constraint     
 *	@NotBlank(message =)   验证字符串非null，且长度必须大于0     
 *	@Email  被注释的元素必须是电子邮箱地址     
 *	@Length(min=,max=)  被注释的字符串的大小必须在指定的范围内     
 *	@NotEmpty   被注释的字符串的必须非空     
 *	@Range(min=,max=,message=)  被注释的元素必须在合适的范围内
 *
 *	自定义constraint
 *	@IdCard  被注释的元素必须是合法的中国大陆居民身份证号码
 *	@CheckCase  被注释的元素必须是大写或小写字符
 *	@CheckEnum  被注释的元素必须是枚举值
 *	@CheckClass  被注释的元素必须是存在的类（是谁的子类）
 *	@CheckSuperClass  被注释的元素必须是是谁的子类
 *	@Mobile  被注释的元素必须中国大陆手机号码
 *	@Phone  被注释的元素必须中国大陆固定电话号码
 *	@TelePhone  被注释的元素必须中国大陆手机号码或固定电话号码
 */

package com.lc.ibps.skeleton.provider;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartResolver;

import com.lc.ibps.skeleton.model.ValidGroup.Group1;
import com.lc.ibps.skeleton.model.ValidGroup.Group2;
import com.lc.ibps.skeleton.model.ValidGroup.GroupOrder1;
import com.lc.ibps.skeleton.model.ValidatorVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Validated
@Api(tags = "后端校验管理", value = "后端参数校验")
@RequestMapping(value = "/validator")
@RestController
public class ValidatorProvider {
	
protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private MultipartResolver multipartResolver;
	
	protected MultipartResolver getMultipartResolver () {
		return multipartResolver;
	}
	
	protected HttpServletRequest getRequest() {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		try {
			attributes.getRequest().setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException ignore) {
			return null;
		}
		return attributes.getRequest();
	}
	
	protected HttpServletResponse getResponse() {
		ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
		try {
			attributes.getResponse().setCharacterEncoding("UTF-8");
		} catch (Exception ignore) {
			return null;
		}
		return attributes.getResponse();
	}
	
	@ApiOperation(value = "valid", notes = "valid")
	@RequestMapping(value = "/valid", method = RequestMethod.POST)
	public String valid(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) @Valid ValidatorVO request){
		
		return "成功！";
	}
	
	@ApiOperation(value = "validGroup1", notes = "validGroup1")
	@RequestMapping(value = "/validGroup1", method = RequestMethod.POST)
	public String validGroup1(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) @Validated(value = {Group1.class}) ValidatorVO request){
		
		return "成功！";
	}
	
	@ApiOperation(value = "validGroup2", notes = "validGroup2")
	@RequestMapping(value = "/validGroup2", method = RequestMethod.POST)
	public String validGroup2(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) @Validated(value = {Group2.class}) ValidatorVO request){
		
		return "成功！";
	}
	
	@ApiOperation(value = "validGroupOrder1", notes = "validGroupOrder1")
	@RequestMapping(value = "/validGroupOrder1", method = RequestMethod.POST)
	public String validGroupOrder1(
			@ApiParam(name = "request", value = "传入查询请求json字符串", required = true) 
			@RequestBody(required = true) @Validated(value = {GroupOrder1.class}) ValidatorVO request){
		
		return "成功！";
	}
	
	@ApiOperation(value = "Validated", notes = "Validated")
	@RequestMapping(value = "/validated", method = RequestMethod.GET)
    public String validated(
    		@ApiParam(name = "grade", value = "年级", required = true) 
    		@RequestParam(name = "grade", required = true)
    		@Range(min = 1, max = 9, message = "{validator.demo.range.grade}")
	        int grade,
	        @ApiParam(name = "classroom", value = "班级", required = true) 
	        @RequestParam(name = "classroom", required = true)
	        @Min(value = 1, message = "{validator.demo.min.classroom}")
	        @Max(value = 99, message = "{validator.demo.max.classroom}")
	        int classroom) {
		logger.info("grade {}, classroom {}.", grade, classroom);
		
		return "成功！";
    }
	
	@ApiOperation(value = "exception", notes = "exception")
	@RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exception(
    		@ApiParam(name = "grade", value = "年级", required = false) 
    		@RequestParam(name = "grade", required = false, defaultValue = "0")
	        int grade,
	        @ApiParam(name = "classroom", value = "班级", required = false) 
	        @RequestParam(name = "classroom", required = false, defaultValue = "0")
	        int classroom) throws Exception {
		throw new Exception("000000");
    }

}
