"use strict";function numberAppendZero(e){return e-=0,e<10&&(e="0"+e),e}require("module/jquery.extend");var _cube=require("module/cube"),_util=require("common/util");_util.Util.lteIE9()?$("#j-rain-area-IE").removeClass("z-hide"):$("#j-rain-area").removeClass("z-hide");var reload=function(){location.reload()},logined=$("#j-main").data("logined"),contents={text1:"活动未开始，五一再来哟！",text2:"活动已结束！",text3:"红包欲来风满楼！",text4:"抢红包雨人太多，稍后再来吧！",text5:"亲，登录后才可参与抢现金券哦！",text6:"亲，登录后才可领取奖励哦！"},domain=env.globalPath,urls={init:domain+"/activity/mayDay4Gifts/init",receive:domain+"/activity/mayDay4Gifts/receive"},random=function(e,t){return Math.round(e+Math.random()*(t-e))};$(".u-redbag-flakes").each(function(){var e=random(70,100);$(this).css({left:random(100,1200)+"px",width:e,height:e})}),_util.Util.post({url:urls.init,callback:function(e){if(e&&e.success){var t=e.result;t&&init(t)}else log("后端数据有问题")}});var init=function(e){var t=e.activityStatus,a=e.couponForDayFlag;switch($("#j-redbag-rain").attr("data-couponForDayFlag",a),$("#j-receiveStartTime").text(e.receiveStartTime.substr(0,5)),$("#j-receiveEndTime").text(e.receiveEndTime.substr(0,5)),t){case 2:beforeActivity(e);break;case 4:1==logined?duringActivityLogined(e):duringActivityNotLogined(e);break;case 6:afterActivity(e)}$("#j-three-gifts").removeClass("z-hide"),$("#j-redbag-wrapper").removeClass("z-hide")},showMask=function(e){$("#j-mask-title").text(e),$("#j-rain-area-mask").removeClass("z-hide")},goLoginPage1=function(){_cube.Dialog.show({content:contents.text5,okValue:"去登录",close:reload,callback:function(){_util.Util.post({url:urls.receive})}})},goLoginPage2=function(){_cube.Dialog.show({content:contents.text6,okValue:"去登录",close:reload,callback:function(){_util.Util.post({url:urls.receive})}})},beforeActivity=function(e){showMask(contents.text1),$(".j-gift-btn").text("活动未开始").addClass("z-disable"),$("#j-gifts-wrapper").removeClass("z-hide")},splitAmount=function(e){if(e>=1e3){for(var t=e.toString(),a=parseInt(t.length/3),n=t.split("").reverse(),o=1;o<=a;o++){var i=3*o-1;i!==n.length-1&&(n[i]=","+n[i])}return n.reverse().join("")}return e},duringActivityNotLogined=function(e){var t=e.receiveStartTime||"",a=e.receiveEndTime||"",n=t.substr(0,t.indexOf(":")),o=t.substr(t.indexOf(":")+1,2),i=a.substr(0,a.indexOf(":")),r=a.substr(a.indexOf(":")+1,2),s=env.serverDate,l=e.lastReceiveEndTime,c=new Date(l).getFullYear(),d=new Date(l).getMonth()+1,u=new Date(l).getDate(),g=new Date(s).getFullYear(),b=new Date(s).getMonth()+1,v=new Date(s).getDate(),f=!1,p=""+new Date(s).getHours()+(""+numberAppendZero(new Date(s).getMinutes()))-0,h=""+n+(""+numberAppendZero(o))-0,m=""+i+(""+numberAppendZero(r))-0;g==c&&b==d&&v==u&&(f=!0),(p>h||p==h)&&p<m?$("#j-redbag-rain").on("click",".u-redbag-flakes, .u-redbag-flakes-IE",goLoginPage1):f&&(p>m||p==m)?($("#j-three-gifts").addClass("z-onTop"),$("#j-redbag-wrapper").addClass("z-onBottom").appendTo("#j-wrap"),showMask("活动已结束！")):showMask(contents.text3),$(".j-gift-btn").text("等待领取").on("click",goLoginPage2),$("#j-gifts-wrapper").removeClass("z-hide")},duringActivityLogined=function(e){var t=e.receiveStartTime||"",a=e.receiveEndTime||"",n=t.substr(0,t.indexOf(":")),o=t.substr(t.indexOf(":")+1,2),i=a.substr(0,a.indexOf(":")),r=a.substr(a.indexOf(":")+1,2),s=env.serverDate,l=e.lastReceiveEndTime,c=new Date(l).getFullYear(),d=new Date(l).getMonth()+1,u=new Date(l).getDate(),g=new Date(s).getFullYear(),b=new Date(s).getMonth()+1,v=new Date(s).getDate(),f=!1,p=""+new Date(s).getHours()+(""+numberAppendZero(new Date(s).getMinutes()))-0,h=""+n+(""+numberAppendZero(o))-0,m=""+i+(""+numberAppendZero(r))-0;g==c&&b==d&&v==u&&(f=!0),(p>h||p==h)&&p<m?$("#j-redbag-rain").on("click",".u-redbag-flakes, .u-redbag-flakes-IE",function(){var e=$(this);p=""+new Date(s).getHours()+(""+numberAppendZero(new Date(s).getMinutes()))-0,(p>h||p==h)&&p<m?"true"==$("#j-redbag-rain").attr("data-couponForDayFlag")?_cube.Dialog.show({content:"恭喜您领取成功！如未及时到账，请耐心等待",close:reload,callback:reload}):_util.Util.post({url:urls.receive,data:{couponAmount:30},callback:function(t){t.success?($.shade("show"),e.addClass("z-hide"),$("#j-redbag-open").removeClass("z-hide"),$("#j-redbag-open-btn").on("click",function(){window.location.href=env.globalPath+"/coupon/couponList"}),$(".u-shade, #j-redbag-close").on("click",function(){$("#j-redbag-open").addClass("z-hide"),$.shade("hide"),$("#j-redbag-rain").attr("data-couponForDayFlag",!0)})):_cube.Dialog.show({content:contents.text4,close:reload,callback:reload})}}):showMask(contents.text3)}):f&&(p>m||p==m)?($("#j-three-gifts").addClass("z-onTop"),$("#j-redbag-wrapper").addClass("z-onBottom").appendTo("#j-wrap"),showMask("活动已结束！")):showMask(contents.text3);var w=e.investAmount||0,j=e.couponForLv1||"",k=e.couponForLv2||"",x=e.couponForLv3,D=e.totalInvestLv1||0,z=e.totalInvestLv2||0,C=e.totalInvestLv3||0;$("#j-investAmout").text(splitAmount(w)),$(".u-total-count").removeClass("z-hide"),1==j?($("#j-redbag-88").addClass("z-active"),$("#j-gift-btn-88").text("您已领取").addClass("z-disable")):$("#j-gift-btn-88").text("等待领取").on("click",function(){A(w,88,D)}),1==k?($("#j-redbag-188").addClass("z-active"),$("#j-gift-btn-188").text("您已领取").addClass("z-disable")):$("#j-gift-btn-188").text("等待领取").on("click",function(){A(w,188,z)}),1==x?($("#j-redbag-500").addClass("z-active"),$("#j-gift-btn-500").text("您已领取").addClass("z-disable")):$("#j-gift-btn-500").text("等待领取").on("click",function(){A(w,500,C)});var A=function(e,t,a){$("#j-gift-btn-"+t).hasClass("z-disable")||(e>a||e==a?_util.Util.post({url:urls.receive,data:{couponAmount:t},callback:function(e){var a=e.success||!1;e&&a?(_cube.Dialog.show({content:"恭喜获得1张"+t+"元现金券，继续投资，获取更多奖励吧！",close:reload,callback:reload}),$("#j-redbag-"+t).addClass("z-active"),$("#j-gift-btn-"+t).text("您已领取").addClass("z-disable")):_cube.Dialog.show({content:"领取失败，请稍后再次领取！",close:reload,callback:reload})}}):_cube.Dialog.show({content:"快去投资获取奖励吧！",okValue:"立即投资",callback:function(){window.location.href=env.globalPath+"/products/list-all-all-investing-1-createTimeAsc-1.html"},close:reload}))};$("#j-gifts-wrapper").removeClass("z-hide");var y=$("#j-redbag-rain").attr("data-couponForDayFlag");"true"==y&&($("#j-three-gifts").addClass("z-onTop"),$("#j-redbag-wrapper").addClass("z-onBottom").appendTo("#j-wrap"))},afterActivity=function(e){showMask(contents.text2),$(".j-gift-btn").text("活动已结束").addClass("z-disable"),$("#j-gifts-wrapper").removeClass("z-hide")};
//# sourceMappingURL=mayDay4Gifts.js.map
