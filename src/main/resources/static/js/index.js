/*

    ********************************************
    *   注释：1.各大块间3行间隔                *
    *         2.前端测试为前端模拟用           *
    *         3.每大块均有注释解释用途及功能   *
    *         4.其他事项会后续添加             *
    *                                          *
    ********************************************

*/


var addHTML='<form action="">'+
				'<div class="form_group">'+
					'<span class="label"><span class="required"> * </span> 任务名称：</span>'+
					'<input type="text" placeholder="请输入任务名称">'+
					'<span class="judge_name required"> 名称不能为空 </span>'+
				'</div>'+
				'<div class="form_group">'+
					'<span class="label"><span class="required"> * </span> 任务地址：</span>'+
					'<input type="text" placeholder="http:// 或 https:// 开头">'+
					'<span class="judge_name required"> 名称不能为空 </span>'+
				'</div>'+
				'<div class="form_group">'+
					'<span class="label"><span class="required"> * </span> 检索深度：</span>'+
					'<select name="" id="">'+
						'<option value="">三级(默认)</option>'+
						'<option value="">一级</option>'+
						'<option value="">二级</option>'+
						'<option value="">四级</option>'+
						'<option value="">五级</option>'+
						'<option value="">全部</option>'+
					'</select>'+
				'</div>'+
				'<div class="form_group">'+
					'<span class="label labelgjz"><span class="required"> * </span> 关键字：</span>'+
					'<div class="keyword_content">'+
						'<div class="keyword_select_show">'+
							'<!-- <span class="selected" name=""></span> -->'+
						'</div>'+
						'<div class="keyword_select clearFix">'+
							'<div class="keyword_select_all">'+
								'<div class="btn_select_all"><span class="span_all">全选</span></div>'+
								'<div class="a_select_keyword"><a href="keyword.html">关键字管理</a></div>'+
							'</div>'+
							'<div class="keyword_list">'+
								'<span class="choice" name="mimi">mimi</span>'+
								'<span class="choice" name="jimi">jimi</span>'+
								'<span class="choice" name="mini">mini</span>'+
							'</div>'+
						'</div>'+
					'</div>'+
					
				'</div>'+
			'</form>';

var addkeywordHTML='<div class="form_group">'+
					'<span class="label"><span class="required"> * </span> 关键字：</span>'+
					'<input type="text" placeholder="请添加关键字" class="keyword_txt">'+
				'</div>';

var changePasswordHTML='<form action="">'+
							'<div class="form_group" style="font-size:14px;">'+
								'<span class="label">用户名称：</span>'+
								'当前登陆者名称'+
							'</div>'+
							'<div class="form_group">'+
								'<span class="label">原密码：</span>'+
								'<input type="text" placeholder="请输入原密码">'+
								'<span class="required"> * </span>'+
							'</div>'+
							'<div class="form_group">'+
								'<span class="label">原密码：</span>'+
								'<input type="text" placeholder="请输入新密码">'+
								'<span class="required"> * </span>'+
							'</div>'+
							'<div class="form_group">'+
								'<span class="label">确认密码：</span>'+
								'<input type="text" placeholder="请输入新密码">'+
								'<span class="required"> * </span>'+
							'</div>'+
						'</form>';

var removeHTML='<div class="removePop" style="font-size: 14px;">'+
					'确定要删除任务？'+
				'</div>';

//<a href="javascript:void(0)"> 选择 </a>
var reportkeywordHTML='<div class="form_group">'+
							'<span class="label"><span class="required"> * </span> 关键字：</span>'+
							'<input type="text" placeholder="请导入您的关键字" style="width:250px;">'+
							'<input type="file" value="选择" style="background:none;border:none;display:inline-block;width:150px;">'+
						'</div>';

var result_decisionHTML='<div class="hit_keyword clearFix">'+
							'<span class="hit_keyword_t">命中关键字：关键字1、关键字2</span>'+
							'<span class="hit_keyword_web">网页地址：<a href="http://image.baidu.com/search/index">http://image.baidu.com/search/index</a></span>'+
						'</div>'+
						'<div class="keyword_abstract">'+
							'关键字摘要：（共3处）'+
						'</div>'+
						'<ul class="keyword_abstract_details">'+
							'<li>1. 会议听取了信息专项及各项目档案验收工作实施情况汇报，部署了下一步工作安排，并对档案验收工作中存在的问题进行沟通和交流。会议认为，一是信息专项档案验收工作组织推进有序。各级任务承担单位重视档案验收工作，沟通协调到位。二是信息专项档案验收工作保障措施有力。档案验收工作目标明确，组织架构完善，制度体系较为完备。三是前期档案验收准备工作有实效，为档案验收提供坚实基础<span class="keyword_">MM  JM</span></li>'+
							'<li>2. 会议听取了信息专项及各项目档案验收工作实施情况汇报，部署了下一步工作安排，并对档案验收工作中存在的问题进行沟通和交流。会议认为，一是信息专项档案验收工作组织推进有序。各级任务承担单位重视档案验收工作，沟通协调到位。二是信息专项档案验收工作保障措施有力。档案验收工作目标明确，组织架构完善，制度体系较为完备。三是前期档案验收准备工作有实效，为档案验收提供坚实基础<span class="keyword_">MM  JM</span></li>'+
							'<li>3. 会议听取了信息专项及各项目档案验收工作实施情况汇报，部署了下一步工作安排，并对档案验收工作中存在的问题进行沟通和交流。会议认为，一是信息专项档案验收工作组织推进有序。各级任务承担单位重视档案验收工作，沟通协调到位。二是信息专项档案验收工作保障措施有力。档案验收工作目标明确，组织架构完善，制度体系较为完备。三是前期档案验收准备工作有实效，为档案验收提供坚实基础<span class="keyword_">MM  JM</span></li>'+
						'</ul>'+
						'<div class="decision_description clearFix">'+
							'<div class="decision_description_l">'+
								'<input type="radio" name="isSuspicious" checked="true"> 可疑 <input type="radio" name="isSuspicious"> 否'+
							'</div>'+
							'<div class="decision_description_r">'+
								'判断说明：<input type="text">'+
							'</div>'+
						'</div>';











var webSystem={
	func:{},
	ui:{},
	data:{}
};



$(function(){

	webSystem.func.judgeWinWidthHeight();

	$("li.user_show").click(function(){
		$(".user_do,.zzc").show();
	});

	$(".zzc").click(function(){
		$(".user_do,.zzc,.popup").hide();
	});

	$("#chooseCheckbox").click(function(){
		if($(this).prop("checked")){
			$(".table_wrap input[name='choose']").prop("checked",true);
		}else{
			$(".table_wrap input[name='choose']").prop("checked",false);
		};
	});

});

$(window).on("resize",function(){
	webSystem.func.judgeWinWidthHeight();
});

webSystem.func.judgeWinWidthHeight=function(){
	if($(window).width()>1024){
		$("#box_adaption").css("width","100%");
	}else{
		$("#box_adaption").css("width","1024px");
	};
	if($(window).height()>720){
		$("#box_adaption").css("height","100%");
	}else{
		$("#box_adaption").css("height","720px");
	};
};

$("#add_btn").on("click",function(){
	$(".save").show();
	$(".sure").hide();
	// $.get("fragment/add.html",function(data){
	// 	webSystem.func.popupParameter(740,data,"添加任务");
	// 	webSystem.func.addRemoveKeyword();
	// });
	webSystem.func.popupParameter(740,addHTML,"添加任务");
	webSystem.func.addRemoveKeyword();
});

$(".edit_task").on("click",function(){
	$(".save").show();
	$(".sure").hide();
	// $.get("fragment/add.html",function(data){
	// 	webSystem.func.popupParameter(740,data,"添加任务");
	// 	webSystem.func.addRemoveKeyword();
	// });
	webSystem.func.popupParameter(740,addHTML,"添加任务");
	webSystem.func.addRemoveKeyword();
});

$("#remove_btn").on("click",function(){
	$(".save").hide();
	$(".sure").show();
	// $.get("fragment/remove.html",function(data){
	// 	webSystem.func.popupParameter(340,data,"删除任务");
	// });
	webSystem.func.popupParameter(340,removeHTML,"删除任务");
});

$(".changePass").on("click",function(e){
	$(".user_do").hide();
	e.stopPropagation();
	$(".save").show();
	$(".sure").hide();

	// $.get("fragment/changePassword.html",function(data){
	// 	webSystem.func.popupParameter(600,data,"修改密码");
	// });

	webSystem.func.popupParameter(600,changePasswordHTML,"修改密码");
	
});

$(".result_decision").on("click",function(e){
	$(".save").show();
	$(".sure").hide();
	// $.get("fragment/result_decision.html",function(data){
	// 	webSystem.func.popupParameter(740,data,"任务名称+文件名称  结果判定");
	// });
	webSystem.func.popupParameter(740,result_decisionHTML,"任务名称+文件名称  结果判定");
});

$(".add_keyword").on("click",function(e){
	$(".save").show();
	$(".sure").hide();
	// $.get("fragment/addkeyword.html",function(data){
	// 	webSystem.func.popupParameter(550,data,"添加关键字");
	// });
	webSystem.func.popupParameter(550,addkeywordHTML,"添加关键字");
});

$(".export_keyword").on("click",function(e){
	$(".save").show();
	$(".sure").hide();
	// $.get("fragment/reportkeyword.html",function(data){
	// 	webSystem.func.popupParameter(600,data,"导入关键字");
	// });
	webSystem.func.popupParameter(600,reportkeywordHTML,"导入关键字");

});


webSystem.func.popupParameter=function(w,c,t){
	$(".zzc").show();
	$(".popup").css({
		"width":w+"px",
		"margin-left":-(w/2)+"px",
	}).show();
	$(".popup_title_pos").html(t);
	$(".popup_con").html(c);
};


webSystem.func.addRemoveKeyword=function(){
	$(".keyword_list span").on("click",function(){
		if($(this).hasClass('choiced')){
			$(this).removeClass('choiced');
			$(".keyword_select_show span[name='"+$(this).attr("name")+"']").remove();
		}else{
			$(this).addClass('choiced');
			$(".keyword_select_show").append('<span name="'+$(this).attr("name")+'">'+$(this).text()+' , </span>');
		};
	});
	$(".span_all").on("click",function(){
		$(".keyword_select_show").html("");
		$(".keyword_list span").addClass('choiced');
		for(var i=0;i<$(".keyword_list span").length;i++){
			$(".keyword_select_show").append('<span name="'+$(".keyword_list span").eq(i).attr("name")+'">'+$(".keyword_list span").eq(i).text()+' , </span>');
		};
	});
};


webSystem.func.closePopup=function(){
	$(".popup,.zzc").hide();
};


// $(".keyword_page_list span.keyword_list_one").on("mouseover",function(e){
// 	e.stopPropagation();
// 	if($(this).hasClass('keyword_list_one_c')){
// 		$(this).removeClass('keyword_list_one_c');
// 		$(this).find(".keyword_list_one_c_X").remove();
// 	}else{
// 		$(this).addClass('keyword_list_one_c');
// 		$(this).append('<span class="keyword_list_one_c_X">x</span>');
// 		$(".keyword_list_one_c_X").on("click",function(e){
// 			$(this).parent().remove();
// 		});
// 	};
// });

$(".keyword_page_list span.keyword_list_one").on("mouseover",function(e){
	e.stopPropagation();
	$(this).addClass('keyword_list_one_c');
	$(this).append('<span class="keyword_list_one_c_X">x</span>');
	$(".keyword_list_one_c_X").on("click",function(e){
		$(this).parent().remove();
	});
});

$(".keyword_page_list span.keyword_list_one").on("mouseout",function(e){
	$(this).removeClass('keyword_list_one_c');
	$(this).find(".keyword_list_one_c_X").remove();
});

$(".keyword_page_list span.keyword_list_one").on("click",function(e){
	webSystem.func.popupParameter(550,addkeywordHTML,"修改关键字");
	$(".keyword_txt").val($(this).text().split("x")[0]);
});


$('#filer_check_begintime_calendar').calendar({
    trigger: '.filer_check_begintime',
    zIndex: 999,
	format: 'yyyy-mm-dd',
    onSelected: function (view, date, data) {
        console.log('event: onSelected')
    },
    onClose: function (view, date, data) {
        console.log('event: onClose')
        console.log('view:' + view)
        console.log('date:' + date)
        console.log('data:' + (data || 'None'));
    }
});
$('#filer_check_finishtime_calendar').calendar({
    trigger: '.filer_check_finishtime',
    zIndex: 999,
	format: 'yyyy-mm-dd',
    onSelected: function (view, date, data) {
        console.log('event: onSelected')
    },
    onClose: function (view, date, data) {
        console.log('event: onClose')
        console.log('view:' + view)
        console.log('date:' + date)
        console.log('data:' + (data || 'None'));
    }
});



