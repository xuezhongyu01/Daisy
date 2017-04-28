"use strict";function _classCallCheck(e,r){if(!(e instanceof r))throw new TypeError("Cannot call a class as a function")}Object.defineProperty(exports,"__esModule",{value:!0}),exports.Validform=void 0;var _createClass=function(){function e(e,r){for(var t=0;t<r.length;t++){var a=r[t];a.enumerable=a.enumerable||!1,a.configurable=!0,"value"in a&&(a.writable=!0),Object.defineProperty(e,a.key,a)}}return function(r,t,a){return t&&e(r.prototype,t),a&&e(r,a),r}}();require("lib/js/validform");var Validform=exports.Validform=function(){function e(){_classCallCheck(this,e),this.init()}return _createClass(e,[{key:"init",value:function(){var e=$(".j-validform").Validform({tiptype:3,postonce:!0,datatype:{"zh2-4":/^[\u4E00-\u9FA5]{2,4}$/,zhs:/^[\u4E00-\u9FA5]{2,10}(?:·[\u4E00-\u9FA5]{2,10})*$/,pwd:/^(?![^a-zA-Z]+$)(?!\D+$).{6,16}$/,mobile:/^13[0-9]{9}$|14[5,7]{1}[0-9]{8}$|15[0-9]{9}$|17[0,1,3,6,7,8]{1}[0-9]{8}$|18[0-9]{9}$/,money:/^[1-9]*[1-9][0-9]*(.[0-9]{1,2})?$|^(0.[0-9]{1,2})$/,idcard:function(e,r,t,a){function l(e){var r=0;"x"==e[17].toLowerCase()&&(e[17]=10);for(var t=0;t<17;t++)r+=o[t]*e[t];var a=r%11;return e[17]==u[a]}function n(e){var r=e.substring(6,10),t=e.substring(10,12),a=e.substring(12,14),l=new Date(r,parseFloat(t)-1,parseFloat(a));return l.getFullYear()==parseFloat(r)&&l.getMonth()==parseFloat(t)-1&&l.getDate()==parseFloat(a)}function s(e){var r=e.substring(6,8),t=e.substring(8,10),a=e.substring(10,12),l=new Date(r,parseFloat(t)-1,parseFloat(a));return l.getYear()==parseFloat(r)&&l.getMonth()==parseFloat(t)-1&&l.getDate()==parseFloat(a)}var o=[7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2,1],u=[1,0,10,9,8,7,6,5,4,3,2];if(15==e.length)return s(e);if(18==e.length){var i=e.split("");return!(!n(e)||!l(i))}return!1},"z3-14":function(e,r,t,a){function l(e){for(var r=0,t=e.length,a=-1,l=0;l<t;l++)a=e.charCodeAt(l),r+=a>=0&&a<=128?1:2;return r}var n=/^[\u4E00-\u9FA5\uf900-\ufa2dA-Za-z]+$/;if(n.test(e)){var s=l(e);return!(s<3||s>14)}return!1},date:/^(?:(?:1[6-9]|[2-9][0-9])[0-9]{2}([-\/.]?)(?:(?:0?[1-9]|1[0-2])\1(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])\1(?:29|30)|(?:0?[13578]|1[02])\1(?:31))|(?:(?:1[6-9]|[2-9][0-9])(?:0[48]|[2468][048]|[13579][26])|(?:16|[2468][048]|[3579][26])00)([-\/.]?)0?2\2(?:29))(\s+([01][0-9]:|2[0-3]:)?[0-5][0-9]:[0-5][0-9])?$/}});return e.addRule([{ele:".v-sex",datatype:"*",nullmsg:"请选择性别",errormsg:"请选择性别"},{ele:".v-edu",datatype:"*",nullmsg:"请选择学历",errormsg:"请选择学历"},{ele:".v-mob",datatype:"mobile",nullmsg:"手机号码不能为空",errormsg:"请输入正确的手机号码"},{ele:".v-pwd",datatype:"pwd",nullmsg:"请输入密码",errormsg:"长度6-16位至少包含数字和字母"},{ele:".v-pwd-reck",datatype:"pwd",nullmsg:"请再输入一次密码",errormsg:"您两次输入的密码不一致"},{ele:".v-oldPwd",datatype:"pwd",nullmsg:"请输入旧密码",errormsg:"长度6-16位至少包含数字和字母"},{ele:".v-newPwd",datatype:"pwd",nullmsg:"请输入新密码",errormsg:"长度6-16位至少包含数字和字母"},{ele:".v-rname",datatype:"zhs,*2-25",nullmsg:"请填写姓名",errormsg:"请填写中文姓名"},{ele:".v-select-req",datatype:"*",nullmsg:"此项为必选",errormsg:"此项为必选"},{ele:".v-input-req",datatype:"*",nullmsg:"此项为必填",errormsg:"此项为必填"},{ele:".v-loginid",datatype:"mobile|z3-14",nullmsg:"请填写手机或昵称",errormsg:"请填写正确的手机号码或昵称"},{ele:".v-job",datatype:"*",nullmsg:"请选择职业",errormsg:"请选择职业"},{ele:".v-n1-10",datatype:"n1-10",nullmsg:"请填写信息",errormsg:"请填写1到10位数字"},{ele:".v-money",datatype:"money",nullmsg:"请填写金额",errormsg:"金额不能小于0.01元"},{ele:".v-bankcard",datatype:"n16-19",nullmsg:"请填写银行卡",errormsg:"请填写正确的银行卡号"},{ele:".v-bank-reck",datatype:"n16-19",nullmsg:"请再输入一次银行卡",errormsg:"您两次输入的银行卡号不一致"},{ele:".v-idcard",datatype:"idcard",nullmsg:"请填写身份证",errormsg:"请填写正确的身份证"}]),e.tipmsg.r=" ",e}}]),e}();
//# sourceMappingURL=validform.js.map
