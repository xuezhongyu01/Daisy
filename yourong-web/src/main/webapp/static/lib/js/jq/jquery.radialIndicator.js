/*
    radialIndicator.js v 1.2.0
    Author: Sudhanshu Yadav
    Copyright (c) 2015 Sudhanshu Yadav - ignitersworld.com , released under the MIT license.
    Demo on: ignitersworld.com/lab/radialIndicator.html
*/
!function(t,e,n){"use strict";function i(t){var e=/^#?([a-f\d])([a-f\d])([a-f\d])$/i;t=t.replace(e,function(t,e,n,i){return e+e+n+n+i+i});var n=/^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i.exec(t);return n?[parseInt(n[1],16),parseInt(n[2],16),parseInt(n[3],16)]:null}function r(t,e,n,i){return Math.round(n+(i-n)*t/e)}function a(t,e,n,a,o){var u=-1!=o.indexOf("#")?i(o):o.match(/\d+/g),l=-1!=a.indexOf("#")?i(a):a.match(/\d+/g),s=n-e,c=t-e;return u&&l?"rgb("+r(c,s,l[0],u[0])+","+r(c,s,l[1],u[1])+","+r(c,s,l[2],u[2])+")":null}function o(){for(var t=arguments,e=t[0],n=1,i=t.length;i>n;n++){var r=t[n];for(var a in r)r.hasOwnProperty(a)&&(e[a]=r[a])}return e}function u(t){return function(e){if(!t)return e.toString();e=e||0;for(var n=e.toString().split("").reverse(),i=t.split("").reverse(),r=0,a=0,o=i.length;o>r&&n.length;r++)"#"==i[r]&&(a=r,i[r]=n.shift());return i.splice(a+1,i.lastIndexOf("#")-a,n.reverse().join("")),i.reverse().join("")}}function l(t,e){function i(t){if(e.interaction){t.preventDefault();var n=-Math.max(-1,Math.min(1,t.wheelDelta||-t.detail)),i=null!=e.precision?e.precision:0,a=Math.pow(10,i),o=e.maxValue-e.minValue,u=r.current_value+Math.round(a*n*o/Math.min(o,100))/a;return r.value(u),!1}}var r=this;e=e||{},e=o({},s.defaults,e),this.indOption=e,"string"==typeof t&&(t=n.querySelector(t)),t.length&&(t=t[0]),this.container=t;var a=n.createElement("canvas");t.appendChild(a),this.canElm=a,this.ctx=a.getContext("2d"),this.current_value=e.initValue||e.minValue||0;var u=function(t){if(e.interaction){var i="touchstart"==t.type?"touchmove":"mousemove",o="touchstart"==t.type?"touchend":"mouseup",u=a.getBoundingClientRect(),l=u.top+a.offsetHeight/2,s=u.left+a.offsetWidth/2,d=function(t){t.preventDefault();var n=t.clientX||t.touches[0].clientX,i=t.clientY||t.touches[0].clientY,a=(c+h+Math.atan2(i-l,n-s))%(c+.0175),o=e.radius-1+e.barWidth/2,u=c*o,d=null!=e.precision?e.precision:0,f=Math.pow(10,d),v=Math.round(f*a*o*(e.maxValue-e.minValue)/u)/f;r.value(v)},f=function(){n.removeEventListener(i,d,!1),n.removeEventListener(o,f,!1)};n.addEventListener(i,d,!1),n.addEventListener(o,f,!1)}};a.addEventListener("touchstart",u,!1),a.addEventListener("mousedown",u,!1),a.addEventListener("mousewheel",i,!1),a.addEventListener("DOMMouseScroll",i,!1)}function s(t,e){var n=new l(t,e);return n._init(),n}var c=2*Math.PI,h=Math.PI/2,d=function(){var t=n.createElement("canvas").getContext("2d"),i=e.devicePixelRatio||1,r=t.webkitBackingStorePixelRatio||t.mozBackingStorePixelRatio||t.msBackingStorePixelRatio||t.oBackingStorePixelRatio||t.backingStorePixelRatio||1,a=i/r;return function(t,e,i){var r=i||n.createElement("canvas");return r.width=t*a,r.height=e*a,r.style.width=t+"px",r.style.height=e+"px",r.getContext("2d").setTransform(a,0,0,a,0,0),r}}();l.prototype={constructor:s,_init:function(){var t=this.indOption,e=this.canElm,n=(this.ctx,2*(t.radius+t.barWidth));return this.formatter="function"==typeof t.format?t.format:u(t.format),this.maxLength=t.percentage?4:this.formatter(t.maxValue).length,d(n,n,e),this._drawBarBg(),this.value(this.current_value),this},_drawBarBg:function(){var t=this.indOption,e=this.ctx,n=2*(t.radius+t.barWidth),i=n/2;e.strokeStyle=t.barBgColor,e.lineWidth=t.barWidth,"transparent"!=t.barBgColor&&(e.beginPath(),e.arc(i,i,t.radius-1+t.barWidth/2,0,2*Math.PI),e.stroke())},value:function(t){if(void 0===t||isNaN(t))return this.current_value;t=parseFloat(t);var e=this.ctx,n=this.indOption,i=n.barColor,r=2*(n.radius+n.barWidth),o=n.minValue,u=n.maxValue,l=r/2;t=o>t?o:t>u?u:t;var s=null!=n.precision?n.precision:0,d=Math.pow(10,s),f=Math.round((t-o)*d/(u-o)*100)/d,v=n.percentage?f+"%":this.formatter(t);if(this.current_value=t,e.clearRect(0,0,r,r),this._drawBarBg(),"object"==typeof i)for(var m=Object.keys(i),p=1,g=m.length;g>p;p++){var x=m[p-1],b=m[p],M=i[x],C=i[b],w=t==x?M:t==b?C:t>x&&b>t?n.interpolate?a(t,x,b,M,C):C:!1;if(0!=w){i=w;break}}if(e.strokeStyle=i,n.roundCorner&&(e.lineCap="round"),e.beginPath(),e.arc(l,l,n.radius-1+n.barWidth/2,-h,c*f/100-h,!1),e.stroke(),n.displayNumber){var y=e.font.split(" "),B=n.fontWeight,V=n.fontSize||r/(this.maxLength-(Math.floor(1.4*this.maxLength/4)-1));y=n.fontFamily||y[y.length-1],e.fillStyle=n.fontColor||i,e.font=B+" "+V+"px "+y,e.textAlign="center",e.textBaseline="middle",e.fillText(v,l,l)}return this},animate:function(t){var e=this.indOption,n=this.current_value||e.minValue,i=this,r=e.minValue,a=e.maxValue,o=e.frameNum||(e.percentage?100:500),u=null!=e.precision?e.precision:Math.ceil(Math.log(a-r/o)),l=Math.pow(10,u),s=Math.round((a-r)*l/o)/l;t=r>t?r:t>a?a:t;var c=n>t;return this.intvFunc&&clearInterval(this.intvFunc),this.intvFunc=setInterval(function(){if(!c&&n>=t||c&&t>=n){if(i.current_value==n)return clearInterval(i.intvFunc),void(e.onAnimationComplete&&e.onAnimationComplete(i.current_value));n=t}i.value(n),n!=t&&(n+=c?-s:s)},e.frameTime),this},option:function(t,e){return void 0===e?this.option[t]:(-1!=["radius","barWidth","barBgColor","format","maxValue","percentage"].indexOf(t)&&(this.indOption[t]=e,this._init().value(this.current_value)),void(this.indOption[t]=e))}},s.defaults={radius:50,barWidth:5,barBgColor:"#eeeeee",barColor:"#99CC33",format:null,frameTime:10,frameNum:null,fontColor:null,fontFamily:null,fontWeight:"bold",fontSize:null,interpolate:!0,percentage:!1,precision:null,displayNumber:!0,roundCorner:!1,minValue:0,maxValue:100,initValue:0,interaction:!1},e.radialIndicator=s,t&&(t.fn.radialIndicator=function(e){return this.each(function(){var n=s(this,e);t.data(this,"radialIndicator",n)})})}(window.jQuery,window,document,void 0);