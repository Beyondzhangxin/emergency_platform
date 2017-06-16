
$(function(){
	
	//nav
$(".nav_item").first().css("margin-left","10px");
$(".nav_item").click(function(){
	$(this).addClass("nav_item1").siblings().removeClass("nav_item1");
	})

//tab
$(".tabtitle").click(function(){
	$(this).addClass("tabtitle1").siblings().removeClass("tabtitle1");
	})
	
//tab
$(".table_tab").click(function(){
	$(this).addClass("table_tab1").siblings().removeClass("table_tab1");
	})	
	
//tab
$(".content_tab").click(function(){
	$(this).addClass("content_tab1").siblings().removeClass("content_tab1");
	})
	
//tab company
$(".companys li").click(function(){
	$(this).addClass("company1").siblings().removeClass("company1");
	})
	
//tab page
$(".btn_page_com").first().addClass("btn_page_com1");
$(".btn_page_com").click(function(){
	$(this).addClass("btn_page_com1").siblings().removeClass("btn_page_com1");
	})
	
//tab page
$(".btn_page_cam").click(function(){
	$(this).addClass("btn_page_cam1").siblings().removeClass("btn_page_cam1");
	})
	
//tab thepage
$(".thepage").first().addClass("thepage1");
$(".thepage").click(function(){
	$(this).addClass("thepage1").siblings(".thepage").removeClass("thepage1");
	})
	
//tab item
$(".neirong_item").click(function(){
	$(this).addClass("neirong_item1").siblings().removeClass("neirong_item1");
	})
	
//tab detail
$(".tab_float_detail").first().addClass("tab_float_detail1");
$(".tab_float_detail").click(function(){
	$(this).addClass("tab_float_detail1").siblings(".tab_float_detail1").removeClass("tab_float_detail1");
	})
	
//tab
		
$(".xxk_content li").eq(0).show().siblings().hide();
$(".xxk_box li").click(function(){
	var x=$(this).index();
	$(this).addClass("xxk_boxli1").siblings().removeClass("xxk_boxli1");
	$(".xxk_content li").eq(x).show().siblings().hide();
	})
	
//voice
var v = true;
$(".voice").click(function(){
	if(v){
		$(this).addClass("voiceoff");
		v = false;
		}else{
			$(this).removeClass("voiceoff");
			v = true;
			}
	})

//�����˵�
$(".nav_item").mouseenter(function(){
	$(this).children(".menubox").show();
	}).mouseleave(function(){
	$(this).children(".menubox").hide();
	})
$(".menubox>li").click(function(){
	$(".menubox").hide();
	})

//������
$(".btn_search").click(function(){
	$(".searchbox").slideToggle();
	})
})
	