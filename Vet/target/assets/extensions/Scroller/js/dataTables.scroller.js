(function(e,t,n){var r=function(r,i){"use strict";var s=function(e,n){if(!this instanceof s){alert("Scroller warning: Scroller must be initialised with the 'new' keyword.");return}if(typeof n=="undefined"){n={}}this.s={dt:e,tableTop:0,tableBottom:0,redrawTop:0,redrawBottom:0,autoHeight:true,viewportRows:0,stateTO:null,drawTO:null,heights:{jump:null,page:null,virtual:null,scroll:null,row:null,viewport:null},topRowFloat:0,scrollDrawDiff:null};this.s=r.extend(this.s,s.oDefaults,n);this.s.heights.row=this.s.rowHeight;this.dom={force:t.createElement("div"),scroller:null,table:null};this.s.dt.oScroller=this;this._fnConstruct()};s.prototype={fnRowToPixels:function(e,t,r){var i;if(r){i=this._domain("virtualToPhysical",e*this.s.heights.row)}else{var s=e-this.s.baseRowTop;i=this.s.baseScrollTop+s*this.s.heights.row}return t||t===n?parseInt(i,10):i},fnPixelsToRow:function(e,t,r){var i=e-this.s.baseScrollTop;var s=r?this._domain("physicalToVirtual",e)/this.s.heights.row:i/this.s.heights.row+this.s.baseRowTop;return t||t===n?parseInt(s,10):s},fnScrollToRow:function(e,t){var n=this;var i=false;var s=this.fnRowToPixels(e);var o=(this.s.displayBuffer-1)/2*this.s.viewportRows;var u=e-o;if(u<0){u=0}if((s>this.s.redrawBottom||s<this.s.redrawTop)&&this.s.dt._iDisplayStart!==u){i=true;s=this.fnRowToPixels(e,false,true)}if(typeof t=="undefined"||t){this.s.ani=i;r(this.dom.scroller).animate({scrollTop:s},function(){setTimeout(function(){n.s.ani=false},0)})}else{r(this.dom.scroller).scrollTop(s)}},fnMeasure:function(e){if(this.s.autoHeight){this._fnCalcRowHeight()}var t=this.s.heights;t.viewport=r(this.dom.scroller).height();this.s.viewportRows=parseInt(t.viewport/t.row,10)+1;this.s.dt._iDisplayLength=this.s.viewportRows*this.s.displayBuffer;if(typeof e=="undefined"||e){this.s.dt.oInstance.fnDraw()}},_fnConstruct:function(){var t=this;if(!this.s.dt.oFeatures.bPaginate){this.s.dt.oApi._fnLog(this.s.dt,0,"Pagination must be enabled for Scroller");return}this.dom.force.style.position="absolute";this.dom.force.style.top="0px";this.dom.force.style.left="0px";this.dom.force.style.width="1px";this.dom.scroller=r("div."+this.s.dt.oClasses.sScrollBody,this.s.dt.nTableWrapper)[0];this.dom.scroller.appendChild(this.dom.force);this.dom.scroller.style.position="relative";this.dom.table=r(">table",this.dom.scroller)[0];this.dom.table.style.position="absolute";this.dom.table.style.top="0px";this.dom.table.style.left="0px";r(this.s.dt.nTableWrapper).addClass("DTS");if(this.s.loadingIndicator){r(this.dom.scroller.parentNode).css("position","relative").append('<div class="DTS_Loading">'+this.s.dt.oLanguage.sLoadingRecords+"</div>")}if(this.s.heights.row&&this.s.heights.row!="auto"){this.s.autoHeight=false}this.fnMeasure(false);r(this.dom.scroller).on("scroll.DTS",function(){t._fnScroll.call(t)});r(this.dom.scroller).on("touchstart.DTS",function(){t._fnScroll.call(t)});this.s.dt.aoDrawCallback.push({fn:function(){if(t.s.dt.bInitialised){t._fnDrawCallback.call(t)}},sName:"Scroller"});r(e).on("resize.DTS",function(){t._fnInfo()});var n=true;this.s.dt.oApi._fnCallbackReg(this.s.dt,"aoStateSaveParams",function(e,r){if(n&&t.s.dt.oLoadedState){r.iScroller=t.s.dt.oLoadedState.iScroller;n=false}else{r.iScroller=t.dom.scroller.scrollTop}},"Scroller_State");this.s.dt.aoDestroyCallback.push({sName:"Scroller",fn:function(){r(e).off("resize.DTS");r(t.dom.scroller).off("touchstart.DTS scroll.DTS");r(t.s.dt.nTableWrapper).removeClass("DTS");r("div.DTS_Loading",t.dom.scroller.parentNode).remove();t.dom.table.style.position="";t.dom.table.style.top="";t.dom.table.style.left=""}})},_fnScroll:function(){var e=this,t=this.s.heights,n=this.dom.scroller.scrollTop,i;if(this.s.skip){return}if(this.s.dt.bFiltered||this.s.dt.bSorted){this.s.lastScrollTop=0;return}this._fnInfo();clearTimeout(this.s.stateTO);this.s.stateTO=setTimeout(function(){e.s.dt.oApi._fnSaveState(e.s.dt)},250);if(n<this.s.redrawTop||n>this.s.redrawBottom){var s=Math.ceil((this.s.displayBuffer-1)/2*this.s.viewportRows);if(Math.abs(n-this.s.lastScrollTop)>t.viewport||this.s.ani){i=parseInt(this._domain("physicalToVirtual",n)/t.row,10)-s;this.s.topRowFloat=this._domain("physicalToVirtual",n)/t.row}else{i=this.fnPixelsToRow(n)-s;this.s.topRowFloat=this.fnPixelsToRow(n,false)}if(i<=0){i=0}else if(i+this.s.dt._iDisplayLength>this.s.dt.fnRecordsDisplay()){i=this.s.dt.fnRecordsDisplay()-this.s.dt._iDisplayLength;if(i<0){i=0}}else if(i%2!==0){i++}if(i!=this.s.dt._iDisplayStart){this.s.tableTop=r(this.s.dt.nTable).offset().top;this.s.tableBottom=r(this.s.dt.nTable).height()+this.s.tableTop;var o=function(){if(e.s.scrollDrawReq===null){e.s.scrollDrawReq=n}e.s.dt._iDisplayStart=i;if(e.s.dt.oApi._fnCalculateEnd){e.s.dt.oApi._fnCalculateEnd(e.s.dt)}e.s.dt.oApi._fnDraw(e.s.dt)};if(this.s.dt.oFeatures.bServerSide){clearTimeout(this.s.drawTO);this.s.drawTO=setTimeout(o,this.s.serverWait)}else{o()}}}this.s.lastScrollTop=n},_domain:function(e,t){var n=this.s.heights;var r;if(n.virtual===n.scroll){r=(n.virtual-n.viewport)/(n.scroll-n.viewport);if(e==="virtualToPhysical"){return t/r}else if(e==="physicalToVirtual"){return t*r}}var i=(n.scroll-n.viewport)/2;var s=(n.virtual-n.viewport)/2;r=s/(i*i);if(e==="virtualToPhysical"){if(t<s){return Math.pow(t/r,.5)}else{t=s*2-t;return t<0?n.scroll:i*2-Math.pow(t/r,.5)}}else if(e==="physicalToVirtual"){if(t<i){return t*t*r}else{t=i*2-t;return t<0?n.virtual:s*2-t*t*r}}},_fnDrawCallback:function(){var e=this,t=this.s.heights,n=this.dom.scroller.scrollTop,i=n,s=n+t.viewport,o=r(this.s.dt.nTable).height(),u=this.s.dt._iDisplayStart,a=this.s.dt._iDisplayLength,f=this.s.dt.fnRecordsDisplay();this.s.skip=true;this._fnScrollForce();if(u===0){n=this.s.topRowFloat*t.row}else if(u+a>=f){n=t.scroll-(f-this.s.topRowFloat)*t.row}else{n=this._domain("virtualToPhysical",this.s.topRowFloat*t.row)}this.dom.scroller.scrollTop=n;this.s.baseScrollTop=n;this.s.baseRowTop=this.s.topRowFloat;var l=n-(this.s.topRowFloat-u)*t.row;if(u===0){l=0}else if(u+a>=f){l=t.scroll-o}this.dom.table.style.top=l+"px";this.s.tableTop=l;this.s.tableBottom=o+this.s.tableTop;var c=(n-this.s.tableTop)*this.s.boundaryScale;this.s.redrawTop=n-c;this.s.redrawBottom=n+c;this.s.skip=false;setTimeout(function(){e._fnInfo.call(e)},0);if(this.s.dt.oFeatures.bStateSave&&this.s.dt.oLoadedState!==null&&typeof this.s.dt.oLoadedState.iScroller!="undefined"){var h=this.s.dt.sAjaxSource||e.s.dt.ajax?true:false;if(h&&this.s.dt.iDraw==2||!h&&this.s.dt.iDraw==1){setTimeout(function(){r(e.dom.scroller).scrollTop(e.s.dt.oLoadedState.iScroller);e.s.redrawTop=e.s.dt.oLoadedState.iScroller-t.viewport/2},0)}}},_fnScrollForce:function(){var e=this.s.heights;var t=1e6;e.virtual=e.row*this.s.dt.fnRecordsDisplay();e.scroll=e.virtual;if(e.scroll>t){e.scroll=t}this.dom.force.style.height=e.scroll+"px"},_fnCalcRowHeight:function(){var e=this.s.dt.nTable;var t=e.cloneNode(false);var n=r("<tbody/>").appendTo(t);var i=r('<div class="'+this.s.dt.oClasses.sWrapper+' DTS">'+'<div class="'+this.s.dt.oClasses.sScrollWrapper+'">'+'<div class="'+this.s.dt.oClasses.sScrollBody+'"></div>'+"</div>"+"</div>");r("tbody tr:lt(4)",e).clone().appendTo(n);while(r("tr",n).length<3){n.append("<tr><td>&nbsp;</td></tr>")}r("div."+this.s.dt.oClasses.sScrollBody,i).append(t);i.appendTo(this.s.dt.nHolding);this.s.heights.row=r("tr",n).eq(1).outerHeight();i.remove()},_fnInfo:function(){if(!this.s.dt.oFeatures.bInfo){return}var e=this.s.dt,t=this.dom.scroller.scrollTop,n=Math.floor(this.fnPixelsToRow(t,false,this.s.ani)+1),i=e.fnRecordsTotal(),s=e.fnRecordsDisplay(),o=Math.ceil(this.fnPixelsToRow(t+this.s.heights.viewport,false,this.s.ani)),u=s<o?s:o,a=e.fnFormatNumber(n),f=e.fnFormatNumber(u),l=e.fnFormatNumber(i),c=e.fnFormatNumber(s),h;if(e.fnRecordsDisplay()===0&&e.fnRecordsDisplay()==e.fnRecordsTotal()){h=e.oLanguage.sInfoEmpty+e.oLanguage.sInfoPostFix}else if(e.fnRecordsDisplay()===0){h=e.oLanguage.sInfoEmpty+" "+e.oLanguage.sInfoFiltered.replace("_MAX_",l)+e.oLanguage.sInfoPostFix}else if(e.fnRecordsDisplay()==e.fnRecordsTotal()){h=e.oLanguage.sInfo.replace("_START_",a).replace("_END_",f).replace("_TOTAL_",c)+e.oLanguage.sInfoPostFix}else{h=e.oLanguage.sInfo.replace("_START_",a).replace("_END_",f).replace("_TOTAL_",c)+" "+e.oLanguage.sInfoFiltered.replace("_MAX_",e.fnFormatNumber(e.fnRecordsTotal()))+e.oLanguage.sInfoPostFix}var p=e.aanFeatures.i;if(typeof p!="undefined"){for(var d=0,v=p.length;d<v;d++){r(p[d]).html(h)}}}};s.defaults={trace:false,rowHeight:"auto",serverWait:200,displayBuffer:9,boundaryScale:.5,loadingIndicator:false};s.oDefaults=s.defaults;s.version="1.2.1";if(typeof r.fn.dataTable=="function"&&typeof r.fn.dataTableExt.fnVersionCheck=="function"&&r.fn.dataTableExt.fnVersionCheck("1.9.0")){r.fn.dataTableExt.aoFeatures.push({fnInit:function(e){var t=e.oInit;var n=t.scroller||t.oScroller||{};var r=new s(e,n);return r.dom.wrapper},cFeature:"S",sFeature:"Scroller"})}else{alert("Warning: Scroller requires DataTables 1.9.0 or greater - www.datatables.net/download")}r.fn.dataTable.Scroller=s;r.fn.DataTable.Scroller=s;if(r.fn.dataTable.Api){var o=r.fn.dataTable.Api;o.register("scroller().rowToPixels()",function(e,t,n){var r=this.context;if(r.length&&r[0].oScroller){return r[0].oScroller.fnRowToPixels(e,t,n)}});o.register("scroller().pixelsToRow()",function(e,t,n){var r=this.context;if(r.length&&r[0].oScroller){return r[0].oScroller.fnPixelsToRow(e,t,n)}});o.register("scroller().scrollToRow()",function(e,t){this.iterator("table",function(n){if(n.oScroller){n.oScroller.fnScrollToRow(e,t)}});return this});o.register("scroller().measure()",function(e){this.iterator("table",function(t){if(t.oScroller){t.oScroller.fnMeasure(e)}});return this})}return s};if(typeof define==="function"&&define.amd){define("datatables-scroller",["jquery","datatables"],r)}else if(jQuery&&!jQuery.fn.dataTable.Scroller){r(jQuery,jQuery.fn.dataTable)}})(window,document)