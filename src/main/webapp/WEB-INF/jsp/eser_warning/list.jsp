<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ 
	page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"
%>
<html>
<head>
<title>风险预警系统</title>
<script type="text/javascript" src="../js/project_model.js"></script>
</head>
<body> 
    <!--内容区-->
        <table class="" border="0" cellpadding="0" cellspacing="0" width="100%">
            <tr>
                <td width="200" valign="top">
                    <div class="map_workplace" id="map_workplace">
                        <p class="map_workplace_head">
                            预警报警
                        </p>                    
                        <div class="main_xxk_box">
                            <ul class="xxk_box">
                                <li class="xxk_boxli1">厂界</li>
                                <li>周界</li>
                                <li>污水排口</li>
                                <li>雨水排口</li>
                                <li class="clearfix">废气排口</li>
                                <li>危险源</li>
                                <br class="clearfix"/>
                            </ul>
                            <ul class="xxk_content">
                                <li>
                                    <div class="search_company">
                                        <input type="text" class="txtinput"/><input type="button" class="btn_xxk" value="搜索"/>
                                    </div>                                   
                                    <div class="xxk_content_neirong xxk_content_neirong_cj">
                                       <!--  <p class="neirong_item" id="changjie">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p>
                                        <p class="neirong_item">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p>
                                        <p class="neirong_item">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p>
                                        <p class="neirong_item">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p>
                                        <p class="neirong_item">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p>
                                        <p class="neirong_item">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p>
                                        <p class="neirong_item">厂界1</p>
                                        <p class="neirong_item">厂界2</p>
                                        <p class="neirong_item">厂界3</p> -->
                                    </div>
                                    <div class="page_company">
                                        <input type="button" class="btn_page_com" value="1" />
                                        <input type="button" class="btn_page_com" value="2" />
                                        <input type="button" class="btn_page_com" value="3" />
                                        <input type="button" class="btn_page_com" value="4" />
                                    </div>
                                </li>
                                <li>
                                    <div class="search_company">
                                        <input type="text" class="txtinput"/><input type="button" class="btn_xxk" value="搜索"/>
                                    </div>
                                    
                                    <div class="xxk_content_neirong">
                                        <p class="neirong_item">周界1</p>
                                        <p class="neirong_item">周界2</p>
                                        <p class="neirong_item">周界3</p>
                                    </div>
                                    <div class="page_company">
                                        <input type="button" class="btn_page_com" value="1" />
                                        <input type="button" class="btn_page_com" value="2" />
                                        <input type="button" class="btn_page_com" value="3" />
                                        <input type="button" class="btn_page_com" value="4" />
                                    </div>
                                </li>
                                <li>
                                    <div class="search_company">
                                        <input type="text" class="txtinput"/><input type="button" class="btn_xxk" value="搜索"/>
                                    </div>
                                    
                                    <div class="xxk_content_neirong">
                                        <p class="neirong_item">污水排口1</p>
                                        <p class="neirong_item">污水排口2</p>
                                        <p class="neirong_item">污水排口3</p>
                                    </div>
                                    <div class="page_company">
                                        <input type="button" class="btn_page_com" value="1" />
                                        <input type="button" class="btn_page_com" value="2" />
                                        <input type="button" class="btn_page_com" value="3" />
                                        <input type="button" class="btn_page_com" value="4" />
                                    </div>
                                </li>
                                <li>
                                    <div class="search_company">
                                        <input type="text" class="txtinput"/><input type="button" class="btn_xxk" value="搜索"/>
                                    </div>
                                    
                                    <div class="xxk_content_neirong">
                                        <p class="neirong_item">雨水排口1</p>
                                        <p class="neirong_item">雨水排口2</p>
                                        <p class="neirong_item">雨水排口3</p>
                                    </div>
                                    <div class="page_company">
                                        <input type="button" class="btn_page_com" value="1" />
                                        <input type="button" class="btn_page_com" value="2" />
                                        <input type="button" class="btn_page_com" value="3" />
                                        <input type="button" class="btn_page_com" value="4" />
                                    </div>
                                </li>
                                <li>
                                    <div class="search_company">
                                        <input type="text" class="txtinput"/><input type="button" class="btn_xxk" value="搜索"/>
                                    </div>
                                    
                                    <div class="xxk_content_neirong">
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                        <p class="neirong_item">废水排口1</p>
                                        <p class="neirong_item">废水排口2</p>
                                        <p class="neirong_item">废水排口3</p>
                                    </div>
                                    <div class="page_company">
                                        <input type="button" class="btn_page_com" value="1" />
                                        <input type="button" class="btn_page_com" value="2" />
                                        <input type="button" class="btn_page_com" value="3" />
                                        <input type="button" class="btn_page_com" value="4" />
                                    </div>
                                </li>
                                <li>
                                    <div class="search_company">
                                        <input type="text" class="txtinput"/><input type="button" class="btn_xxk" value="搜索"/>
                                    </div>
                                    
                                    <div class="xxk_content_neirong">
                                        <p class="neirong_item">危险源1</p>
                                        <p class="neirong_item">危险源2</p>
                                        <p class="neirong_item">危险源3</p>
                                    </div>
                                    <div class="page_company">
                                        <input type="button" class="btn_page_com" value="1" />
                                        <input type="button" class="btn_page_com" value="2" />
                                        <input type="button" class="btn_page_com" value="3" />
                                        <input type="button" class="btn_page_com" value="4" />
                                    </div>
                                </li>
                            </ul>
                        </div>
                    </div>
                </td>             
                <td valign="top" style="padding-left:10px;">                    
                    <div class="map_box" id="map_box">
                        <div class="map_container" id="map">
                             <!-- 工具栏 -->
                            <div class="toolbar">
                                <ul>
                                    <li id="screen">全屏</li>
                                    <li id="clearMesure">清空</li>
                                    <li id="mesure">测距</li>
                                </ul>
                            </div>
                            <div id="mouse-position" >          
                            </div>
                            <!-- marker -->
                            <div style="display:none">
                                <div id="marker" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                         <div class="float_box">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">厂界XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">类型：</span>厂界<br/>
                                                    <span class="detail_name">监测因子数：</span>0<br/>
                                                    <span class="detail_name">当日报警数：</span>0
                                                </p>
                                                <p class="more"><a href="实时数据_detail.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                            <div id="marker2" class="marker" title="Marker">
                                 <div class="address" id="address" >
                                    <img src="../images/position.png">
                                    <div class="float_box">
                                        <div class="float_content">
                                            <p class="float_head">
                                                <span class="float_title">周界XXX</span>
                                                <span class="float_close"></span>
                                                <br class="clearfix"/>
                                            </p>
                                            <p class="float_detail">
                                                <span class="detail_name">类型：</span>周界<br/>
                                                <span class="detail_name">监测因子数：</span>0<br/>
                                                <span class="detail_name">当日报警数：</span>0
                                            </p>
                                            <p class="more"><a href="实时数据_detail.html" target="_blank">查看详情&gt;&gt;</a></p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            </div>
                            <div style="display:none">
                                <div id="marker3" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box float_box_pollution">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">污水排口XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">类型：</span>污水排口<br/>
                                                    <span class="detail_name">监测因子数：</span>0<br/>
                                                    <span class="detail_name">当日报警数：</span>0<br/>
                                                    <span class="detail_name">所属企业：</span><a href="#" class="link_tbdw">XXXX公司</a>
                                                </p>
                                                <p class="more"><a href="实时数据_detail.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                                <div id="marker4" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box float_box_pollution">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">雨水排口XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">类型：</span>雨水排口<br/>
                                                    <span class="detail_name">监测因子数：</span>0<br/>
                                                    <span class="detail_name">当日报警数：</span>0<br/>
                                                    <span class="detail_name">所属企业：</span><a href="#" class="link_tbdw">XXXX公司</a>
                                                </p>
                                                <p class="more"><a href="实时数据_detail.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                                <div id="marker5" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">废水排口XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">监测因子数：</span>0<br/>
                                                    <span class="detail_name">当日报警数：</span>0<br/>
                                                    <span class="detail_name">所属企业：</span>XXXXXX
                                                </p>
                                                <p class="more"><a href="实时数据_detail.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                             <div style="display:none">
                                <div id="marker6" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box float_box_hazard">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">危险源XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">监测设备数：</span>0<br/>
                                                    <span class="detail_name">当日报警数：</span>0<br/>
                                                </p>
                                                <p class="more"><a href="危险源_detail.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                                <div id="marker7" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">环保企业XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">地址：</span>0000<br/>
                                                    <span class="detail_name">联系人：</span>0000<br/>
                                                    <span class="detail_name">电话：</span>0000
                                                </p>
                                                <p class="more"><a href="#">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                                <div id="marker8" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">应急物资XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">类别：</span>0000<br/>
                                                    <span class="detail_name">数量：</span>0000<br/>
                                                    <span class="detail_name">有效期：</span>0000
                                                </p>
                                                <p class="more"><a href="园区应急物资装备_detail（查看）.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                                <div id="marker9" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">应急装备XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">类别：</span>0000<br/>
                                                    <span class="detail_name">数量：</span>0000<br/>
                                                    <span class="detail_name">有效期：</span>0000
                                                </p>
                                                <p class="more"><a href="园区应急物资装备_detail（查看）.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div style="display:none">
                                <div id="marker10" class="marker" title="Marker">
                                    <div class="address" id="address" >
                                        <img src="../images/position.png">
                                        <div class="float_box float_box_pollution">
                                            <div class="float_content">
                                                <p class="float_head">
                                                    <span class="float_title">应急队伍XXX</span>
                                                    <span class="float_close"></span>
                                                    <br class="clearfix"/>
                                                </p>
                                                <p class="float_detail">
                                                    <span class="detail_name">所在地址：</span>0000<br/>
                                                    <span class="detail_name">队伍类别：</span>0000<br/>
                                                    <span class="detail_name">适用事件类别：</span>0000<br/>
                                                    <span class="detail_name">应急值班电话：</span>0000
                                                </p>
                                                <p class="more"><a href="园区应急队伍_detail（查看）.html" target="_blank">查看详情&gt;&gt;</a></p>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        <img src="../images/warn_gif.gif" style="position:absolute; left:350px; top:220px;" />
                        <img src="../images/warn_gif2.gif" style="position:absolute; left:260px; top:230px;" />
                        
                        <div class="table_warn_box">
                            <p class="control_row">
                                <span class="showitem">
                                    <input type="checkbox" id="show_cj" checked="checked" class="showitem_popup"/>
                                    <label for="show_cj"><i class="showitem_bg" style="background-image: url(../images/ic_changjie_s.png)"></i>厂界</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_zj" class="showitem_popup"/>
                                    <label for="show_zj"><i class="showitem_bg" style="background-image: url(../images/ic_zhoujie_s.png)"></i>周界</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_wspk" class="showitem_popup"/>
                                    <label for="show_wspk"><i class="showitem_bg" style="background-image: url(../images/ic_paiwukou_s.png)"></i>污水排口</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_yspk" class="showitem_popup"/>
                                    <label for="show_yspk"><i class="showitem_bg" style="background-image: url(../images/ic_paishuikou_s.png)"></i>雨水排口</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_fspk" class="showitem_popup"/>
                                    <label for="show_fspk"><i class="showitem_bg" style="background-image: url(../images/ic_fspk_s.png)"></i>废气排口</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_wxy" class="showitem_popup"/><label for="show_wxy"><i class="showitem_bg" style="background-image: url(../images/ic_wxy_s.png)"></i>危险源</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_hbqy" class="showitem_popup"/><label for="show_hbqy"><i class="showitem_bg" style="background-image: url(../images/ic_hbqy_s.png)"></i>环保企业</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_yjwz" class="showitem_popup"/>
                                    <label for="show_yjwz"><i class="showitem_bg" style="background-image: url(../images/ic_yjwz_s.png)"></i>应急物资</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_yjzb" class="showitem_popup"/>
                                    <label for="show_yjzb"><i class="showitem_bg" style="background-image: url(../images/ic_yjzb_s.png)"></i>应急装备</label>
                                </span>
                                <span class="showitem">
                                    <input type="checkbox" checked="checked" id="show_yjdw" class="showitem_popup"/>
                                   <label for="show_yjdw"><i class="showitem_bg" style="background-image: url(../images/ic_team_s.png)"></i>应急队伍</label>
                                </span>
                                
                                <a href="#">更多报警信息&gt;&gt;</a>
                                <span class="voice" title="开启/关闭报警声音" onclick="alarmSound()"><audio id="video" src="../scorus/bg.mp3" >浏览器暂不支持audio</audio></span>
                                <br class="clearfix"/>
                            </p>
                            <div class="table_warn_head">
                            <table class="table_warn" border="0" cellpadding="0" cellspacing="0">
                                <colgroup>
                                    <col width="15%">
                                        <col width="10%">
                                        <col width="">
                                        <col width="35%">
                                        <col width="20%">
                                </colgroup>
                                <thead>
                                    <tr>
                                        <th>报警时间</th>
                                        <th>类型</th>
                                        <th>监测点</th>
                                        <th>报警信息</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                            </table>
                            </div>
                            
                            <div class="table_warn_body">
                                <table class="table_warn" border="0" cellpadding="0" cellspacing="0">
                                    <colgroup>
                                        <col width="15%">
                                        <col width="10%">
                                        <col width="">
                                        <col width="35%">
                                        <col width="20%">
                                    </colgroup>
                                    <tbody>
                                        <tr style="border-top:none;">
                                            <td>2016-10-10 15:20:35</td>
                                            <td>厂界</td>
                                            <td>XXXXXX</td>
                                            <td>因子：甲醛，监测值：0.04，一级报警（H：0.03，HH：0.05）</td>
                                            <td>
                                                <a class="btn_deal" href="#">【定位】</a>
                                                <a class="btn_deal txtred" href="" target="_blank">【处理】</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>2016-10-10 15:20:35</td>
                                            <td>危险源</td>
                                            <td>XXXXXX</td>
                                            <td>奇美化工丙烯睛罐区(位号：A0102A)丙稀睛可燃气体泄漏超限报警
</td>
                                            <td>
                                                <a class="btn_deal" href="#">【定位】</a>
                                                <a class="btn_deal" href="" target="_blank">【查看】</a>
                                            </td>
                                        </tr>
                                        <tr>
                                            <td>2016-10-10 15:20:35</td>
                                            <td>污水排口</td>
                                            <td>XXXXXX</td>
                                            <td>因子：甲醛，监测值：0.04，一级报警（H：0.03，HH：0.05）</td>
                                            <td>
                                                <a class="btn_deal" href="#">【定位】</a>
                                                <a class="btn_deal" href="" target="_blank">【查看】</a>
                                            </td>
                                        </tr>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        
                    </div>
                </td>
            </tr>
        </table>   
<script>
$.post('../equipmentPosition/boundPosition.do?type=1',function(json){
	var data = JSON.parse(json);
	var html = ''
	$.each(data.content,function(i,m){
		html += '<p class="neirong_item" data-j = '+m.LNG+' data-w = '+m.LAT+'>'+m.name+'</p>'
	})
	$(".xxk_content_neirong_cj").html(html);
	 $(".neirong_item").click(function(){
        	var j = parseFloat($(this).attr("data-j"));
        	var w = parseFloat($(this).attr("data-w"));
        	var zxd= ol.proj.fromLonLat([j,w]);
        	view.setCenter(zxd); 
        })
})
</script>                           
<script>
    var h=document.body.offsetHeight;
    document.getElementById("map_box").style.height=(h-142)+"px";
    document.getElementById("map_workplace").style.height=(h-142)+"px";
    var controls = new Array();  
    //鼠标位置
        var mousePositionControl = new ol.control.MousePosition({
            coordinateFormat: ol.coordinate.createStringXY(4), 
            projection: 'EPSG:4326',
            className: 'custom-mouse-position', 
            target: document.getElementById('mouse-position'), 
            undefinedHTML: '&nbsp;'
        });
        controls.push(mousePositionControl); 
            //设置中心点
            var coor=ol.proj.transform([119.44,32.2], 'EPSG:4326', 'EPSG:3857');  
            var view=new ol.View({  
                center:coor,  
                zoom:12  
            }); 
            var map=new ol.Map({  
                target:'map',  
                layers:[  
                    new ol.layer.Tile({  
                        title: "路网图", 
                        source:new ol.source.XYZ({                             
                            url:"http://t2.tianditu.com/DataServer?T=vec_w&x={x}&y={y}&l={z}"  
                        })  
                    }),  
                    new ol.layer.Tile({  
                        title: "路网图中文标注",
                        source:new ol.source.XYZ({                                
                            url: "http://t2.tianditu.com/DataServer?T=cva_w&x={x}&y={y}&l={z}"  
                        })  
                    })                             
                ],
                view:view,
                controls: ol.control.defaults({  
                    attribution: false  
                }).extend(controls)
            });
             // 全屏
             map.addControl(new ol.control.FullScreen());
            $(".ol-full-screen button").click(function(){
                $("#screen").toggleClass("map_screen");
                if($("#screen").hasClass("map_screen")){
                    $("#screen").html("退出全屏");
                    $("#map").css("height","100%");
                }else{
                    $("#screen").html("全屏");
                    $("#map").css("height","380px");
                }
            })
        //测距
        var source = new ol.source.Vector(); 
        vector = new ol.layer.Vector({
                source: source,
                style: new ol.style.Style({ 
                    fill: new ol.style.Fill({
                        color: 'rgba(255, 255, 255, 0.2)' 
                    }),
                    stroke: new ol.style.Stroke({
                        color: 'red',  
                        width: 2  
                    }),
                    image: new ol.style.Circle({
                        radius: 7,
                        fill: new ol.style.Fill({
                            color: '#ffcc33'
                        })
                    })
                })
            });   
        var wgs84Sphere = new ol.Sphere(6378137); 
        var sketch;
        var helpTooltipElement;
        var helpTooltip;
        var measureTooltipElement;
        var measureTooltip;
        var continueLineMsg = '双击停止绘制';
        var pointerMoveHandler = function(evt) {
            if (evt.dragging) {
                return;
        }
        var helpMsg = '点击开始绘制';
        if (sketch) {
            var geom = (sketch.getGeometry());
            helpMsg = continueLineMsg; 
        }
        helpTooltipElement.innerHTML = helpMsg; 
        helpTooltip.setPosition(evt.coordinate);
        $(helpTooltipElement).removeClass('hidden');
        };
        map.on('pointermove', pointerMoveHandler); 
        $(map.getViewport()).on('mouseout', function() {
            $(helpTooltipElement).addClass('hidden');
        });
        var draw; 
        function addInteraction() {
            var type = 'LineString';
            draw = new ol.interaction.Draw({
                source: source,
                type:  (type), 
                style: new ol.style.Style({
                    fill: new ol.style.Fill({
                        color: 'rgba(255, 255, 255, 0.2)' 
                    }),
                    stroke: new ol.style.Stroke({
                        color: 'rgba(0, 0, 0, 0.5)', 
                        lineDash: [10, 10],
                        width: 2
                    }),
                    image: new ol.style.Circle({
                        radius: 5,
                        stroke: new ol.style.Stroke({
                            color: 'rgba(0, 0, 0, 0.7)'
                        }),
                        fill: new ol.style.Fill({
                            color: 'rgba(255, 255, 255, 0.2)'
                        })
                    })
               })
          });
          map.addInteraction(draw);
          createMeasureTooltip(); 
          createHelpTooltip(); 
          var listener;
          draw.on('drawstart',
            function (evt) {
                sketch = evt.feature; 
                console.log(evt)
                var tooltipCoord = evt.coordinate;
                listener = sketch.getGeometry().on('change', function (evt) {
                    var geom = evt.target;
                    var output;                
                    output = formatLength((geom));
                    tooltipCoord = geom.getLastCoordinate();
                    measureTooltipElement.innerHTML = output;
                    measureTooltip.setPosition(tooltipCoord);
                });
            }, this);
            draw.on('drawend',
                function (evt) {
                    measureTooltipElement.className = 'tooltip tooltip-static'; 
                    measureTooltip.setOffset([0, -7]);
                    sketch = null; 
                    measureTooltipElement = null; 
                    createMeasureTooltip();
                    ol.Observable.unByKey(listener);
                    map.removeInteraction(draw);
                    $(helpTooltipElement).hide();
                }, this);
        }
        function createHelpTooltip() {
            if (helpTooltipElement) {
                helpTooltipElement.parentNode.removeChild(helpTooltipElement);
            }
            helpTooltipElement = document.createElement('div');
            helpTooltipElement.className = 'tooltip hidden';
            helpTooltip = new ol.Overlay({
                element: helpTooltipElement,
                offset: [15, 0],
                positioning: 'center-left'
            });
            map.addOverlay(helpTooltip);
        }
        function createMeasureTooltip() {
            if (measureTooltipElement) {
                measureTooltipElement.parentNode.removeChild(measureTooltipElement);
            }
            measureTooltipElement = document.createElement('div');
            measureTooltipElement.className = 'tooltip tooltip-measure';
            measureTooltip = new ol.Overlay({
                element: measureTooltipElement,
                offset: [0, -15],
                positioning: 'bottom-center'
            });
            map.addOverlay(measureTooltip);
        }
        var formatLength = function (line) {
            var length;
                length = Math.round(line.getLength() * 100) / 100; //直接得到线的长度
            var output;
            if (length > 100) {
                output = (Math.round(length / 1000 * 100) / 100) + ' ' + 'km'; //KM单位
            } else {
                output = (Math.round(length * 100) / 100) + ' ' + 'm'; //m单位
            }
            return output;//线的长度
        };
        addInteraction(draw); 
        map.removeInteraction(draw);
        $(helpTooltipElement).hide();
        document.getElementById( 'mesure' ).onclick = function(e){ 
             source = new ol.source.Vector({ wrapX: false }); 
             vector = new ol.layer.Vector({
                source: source,
                style: new ol.style.Style({ 
                    fill: new ol.style.Fill({
                        color: 'rgba(255, 255, 255, 0.2)' 
                    }),
                    stroke: new ol.style.Stroke({
                        color: 'red',  
                        width: 2  
                    }),
                    image: new ol.style.Circle({
                        radius: 7,
                        fill: new ol.style.Fill({
                            color: '#ffcc33'
                        })
                    })
                })
            });
            map.addLayer(vector);
            addInteraction(draw);
            $(helpTooltipElement).show();
        };
        document.getElementById( 'clearMesure' ).onclick = function(e){
            map.removeInteraction(draw);
            $(helpTooltipElement).hide();
            var layersAll = map.getLayers().getArray();           
            layersAll.splice(2);
            source = null;
            vector.setSource(source);
            $(".tooltip-static").hide();
        };           
            map.addControl(new ol.control.ScaleLine());//比例尺工具
            var zhenjiangzf = ol.proj.fromLonLat([119.4335, 32.1901]);//周界
            var cj = ol.proj.fromLonLat([119.4515, 32.2046]);//厂界
            var ws = ol.proj.fromLonLat([119.3878, 32.1988]);//污水处理
            var zj = ol.proj.fromLonLat([119.5100, 32.1776]);//周界
            var ys = ol.proj.fromLonLat([119.3123, 32.1878]);//雨水
            var fq = ol.proj.fromLonLat([119.6888, 32.1733]);//废气
            var wxy = ol.proj.fromLonLat([119.5467, 32.1122]);//危险源
            var hb = ol.proj.fromLonLat([119.3947, 32.1736]);//环保企业
            var yjwz = ol.proj.fromLonLat([119.5832, 32.1741]);//应急物资
            var yjzb = ol.proj.fromLonLat([119.5708, 32.2241]);//装备
            var yjdw = ol.proj.fromLonLat([119.2642, 32.1669]);//应急队伍           
            var marker10=new ol.Overlay({
                position:yjdw,
                positioning:'center-center',
                element:document.getElementById('marker10'),
                stopEvent:false
            });
            map.addOverlay(marker10);
            var marker9=new ol.Overlay({
                position:yjzb,
                positioning:'center-center',
                element:document.getElementById('marker9'),
                stopEvent:false
            });
            map.addOverlay(marker9);
            var marker8=new ol.Overlay({
                position:yjwz,
                positioning:'center-center',
                element:document.getElementById('marker8'),
                stopEvent:false
            });
            map.addOverlay(marker8);
            var marker7=new ol.Overlay({
                position:hb,
                positioning:'center-center',
                element:document.getElementById('marker7'),
                stopEvent:false
            });
            map.addOverlay(marker7);
            var marker6=new ol.Overlay({
                position:wxy,
                positioning:'center-center',
                element:document.getElementById('marker6'),
                stopEvent:false
            });
            map.addOverlay(marker6);
            var marker5=new ol.Overlay({
                position:fq,
                positioning:'center-center',
                element:document.getElementById('marker5'),
                stopEvent:false
            });
            map.addOverlay(marker5);
            var marker4=new ol.Overlay({
                position:ys,
                positioning:'center-center',
                element:document.getElementById('marker4'),
                stopEvent:false
            });
            map.addOverlay(marker4);
            var marker3=new ol.Overlay({
                position:zj,
                positioning:'center-center',
                element:document.getElementById('marker3'),
                stopEvent:false
            });
            map.addOverlay(marker3);
            var marker2=new ol.Overlay({
                position:ws,
                positioning:'center-center',
                element:document.getElementById('marker2'),
                stopEvent:false
            });
            map.addOverlay(marker2);
            var marker=new ol.Overlay({
                position:cj,
                positioning:'center-center',
                element:document.getElementById('marker'),
                stopEvent:false
            });
            map.addOverlay(marker);
            //关闭图层
            $(".float_head span").click(function(){
                $(this).parent().parent().parent().hide();
                var checkedNum = ($(this).parent().parent().parent().parent().parent().parent().index());
                $(".showitem_popup").eq(checkedNum).prop("checked",false);
            })
            //打开图层
            $(".address img").click(function(){
                $(this).next(".float_box").show();
                var checkedNum = ($(this).parent().parent().parent().index());
                $(".showitem_popup").eq(checkedNum).prop("checked",true);
            })
            //复选框事件                    
            $(".showitem_popup").click(function(){
                var showPopup=$(this).parent().index();
                if($(this).prop("checked")){          
                    $(".marker").find(".float_box").eq(showPopup).show();
                }else{
                    $(".marker").find(".float_box").eq(showPopup).hide();
                }
            });
           
        //平移到镇江园区
       /*  document.getElementById('changjie').onclick = function () {
            var view = map.getView(); //获取地图视图
            view.setCenter(cj); //平移到厂界
            var zoom = view.getZoom();
           view.setZoom(zoom);
            var num = 0;
            $(".showitem_popup").eq(num).prop("checked",true);
            $(".marker").find(".float_box").eq(num).show();
        }; */
       
        
        //音频播放和关闭
        var myVideo=document.getElementById("video");
        function playVid(){
          myVideo.play();
        }
        function pauseVid(){
          myVideo.pause();
        }
        function alarmSound(){
            var url = $(".voice").css("background").split("\"")[1];
            alert(url)
            var imgUrl=url.substring(url.lastIndexOf("/")+1,url.length);
            if(imgUrl=='ic_voice_on.png'){
                pauseVid();
            }else{               
                playVid()
            }
        }
        
</script>
</body>
</html>