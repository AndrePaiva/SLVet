var xmlJsonClass={xml2json:function(e,t){if(e.nodeType===9){e=e.documentElement}var n=this.removeWhite(e);var r=this.toObj(n);var i=this.toJson(r,e.nodeName,"	");return"{\n"+t+(t?i.replace(/\t/g,t):i.replace(/\t|\n/g,""))+"\n}"},json2xml:function(e,t){var n=function(e,t,r){var i="";var s,o;if(e instanceof Array){if(e.length===0){i+=r+"<"+t+">__EMPTY_ARRAY_</"+t+">\n"}else{for(s=0,o=e.length;s<o;s+=1){var u=r+n(e[s],t,r+"	")+"\n";i+=u}}}else if(typeof e==="object"){var a=false;i+=r+"<"+t;var f;for(f in e)if(e.hasOwnProperty(f)){if(f.charAt(0)==="@"){i+=" "+f.substr(1)+'="'+e[f].toString()+'"'}else{a=true}}i+=a?">":"/>";if(a){for(f in e)if(e.hasOwnProperty(f)){if(f==="#text"){i+=e[f]}else if(f==="#cdata"){i+="<![CDATA["+e[f]+"]]>"}else if(f.charAt(0)!=="@"){i+=n(e[f],f,r+"	")}}i+=(i.charAt(i.length-1)==="\n"?r:"")+"</"+t+">"}}else if(typeof e==="function"){i+=r+"<"+t+">"+"<![CDATA["+e+"]]>"+"</"+t+">"}else{if(e===undefined){e=""}if(e.toString()==='""'||e.toString().length===0){i+=r+"<"+t+">__EMPTY_STRING_</"+t+">"}else{i+=r+"<"+t+">"+e.toString()+"</"+t+">"}}return i};var r="";var i;for(i in e)if(e.hasOwnProperty(i)){r+=n(e[i],i,"")}return t?r.replace(/\t/g,t):r.replace(/\t|\n/g,"")},toObj:function(e){var t={};var n=/function/i;if(e.nodeType===1){if(e.attributes.length){var r;for(r=0;r<e.attributes.length;r+=1){t["@"+e.attributes[r].nodeName]=(e.attributes[r].nodeValue||"").toString()}}if(e.firstChild){var i=0,s=0,o=false;var u;for(u=e.firstChild;u;u=u.nextSibling){if(u.nodeType===1){o=true}else if(u.nodeType===3&&u.nodeValue.match(/[^ \f\n\r\t\v]/)){i+=1}else if(u.nodeType===4){s+=1}}if(o){if(i<2&&s<2){this.removeWhite(e);for(u=e.firstChild;u;u=u.nextSibling){if(u.nodeType===3){t["#text"]=this.escape(u.nodeValue)}else if(u.nodeType===4){if(n.test(u.nodeValue)){t[u.nodeName]=[t[u.nodeName],u.nodeValue]}else{t["#cdata"]=this.escape(u.nodeValue)}}else if(t[u.nodeName]){if(t[u.nodeName]instanceof Array){t[u.nodeName][t[u.nodeName].length]=this.toObj(u)}else{t[u.nodeName]=[t[u.nodeName],this.toObj(u)]}}else{t[u.nodeName]=this.toObj(u)}}}else{if(!e.attributes.length){t=this.escape(this.innerXml(e))}else{t["#text"]=this.escape(this.innerXml(e))}}}else if(i){if(!e.attributes.length){t=this.escape(this.innerXml(e));if(t==="__EMPTY_ARRAY_"){t="[]"}else if(t==="__EMPTY_STRING_"){t=""}}else{t["#text"]=this.escape(this.innerXml(e))}}else if(s){if(s>1){t=this.escape(this.innerXml(e))}else{for(u=e.firstChild;u;u=u.nextSibling){if(n.test(e.firstChild.nodeValue)){t=e.firstChild.nodeValue;break}else{t["#cdata"]=this.escape(u.nodeValue)}}}}}if(!e.attributes.length&&!e.firstChild){t=null}}else if(e.nodeType===9){t=this.toObj(e.documentElement)}else{alert("unhandled node type: "+e.nodeType)}return t},toJson:function(e,t,n,r){if(r===undefined)r=true;var i=t?'"'+t+'"':"",s="	",o="\n";if(!r){s="";o=""}if(e==="[]"){i+=t?":[]":"[]"}else if(e instanceof Array){var u,a,f=[];for(a=0,u=e.length;a<u;a+=1){f[a]=this.toJson(e[a],"",n+s,r)}i+=(t?":[":"[")+(f.length>1?o+n+s+f.join(","+o+n+s)+o+n:f.join(""))+"]"}else if(e===null){i+=(t&&":")+"null"}else if(typeof e==="object"){var l=[],c;for(c in e){if(e.hasOwnProperty(c)){l[l.length]=this.toJson(e[c],c,n+s,r)}}i+=(t?":{":"{")+(l.length>1?o+n+s+l.join(","+o+n+s)+o+n:l.join(""))+"}"}else if(typeof e==="string"){i+=(t&&":")+'"'+e.replace(/\\/g,"\\\\").replace(/\"/g,'\\"')+'"'}else{i+=(t&&":")+e.toString()}return i},innerXml:function(e){var t="";if("innerHTML"in e){t=e.innerHTML}else{var n=function(e){var t="",r;if(e.nodeType===1){t+="<"+e.nodeName;for(r=0;r<e.attributes.length;r+=1){t+=" "+e.attributes[r].nodeName+'="'+(e.attributes[r].nodeValue||"").toString()+'"'}if(e.firstChild){t+=">";for(var i=e.firstChild;i;i=i.nextSibling){t+=n(i)}t+="</"+e.nodeName+">"}else{t+="/>"}}else if(e.nodeType===3){t+=e.nodeValue}else if(e.nodeType===4){t+="<![CDATA["+e.nodeValue+"]]>"}return t};for(var r=e.firstChild;r;r=r.nextSibling){t+=n(r)}}return t},escape:function(e){return e.replace(/[\\]/g,"\\\\").replace(/[\"]/g,'\\"').replace(/[\n]/g,"\\n").replace(/[\r]/g,"\\r")},removeWhite:function(e){e.normalize();var t;for(t=e.firstChild;t;){if(t.nodeType===3){if(!t.nodeValue.match(/[^ \f\n\r\t\v]/)){var n=t.nextSibling;e.removeChild(t);t=n}else{t=t.nextSibling}}else if(t.nodeType===1){this.removeWhite(t);t=t.nextSibling}else{t=t.nextSibling}}return e}}