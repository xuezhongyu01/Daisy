"use strict";require("module/jquery.extend");var _util=require("common/util"),_cube=require("module/cube");Number.prototype.toFixed=function(e){var t=Math.pow(10,e);return Math.round(this*t)/t},_cube.Checkin.init(),_cube.Message.pushUnreadMessage(300),$.ajaxSetup({cache:!1,statusCode:{403:function(){alert("请刷新页面")},500:function(){window.location.href=environment.globalPath+"/500"},901:function(){window.location.href=environment.globalPath+"/security/login/"}}}),_cube.Stats.registerTrace(),$(".j-app-qrcode").qrcodePreview(),_util.Util.lteIE9()&&$('input[type="text"]:visible,input[type="password"]').placeholder({isUseSpan:!0,onInput:!0});
//# sourceMappingURL=common.js.map
