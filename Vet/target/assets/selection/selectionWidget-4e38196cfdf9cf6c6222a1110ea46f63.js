function objectMap(e,t){var n={};jQuery.each(e,function(e,r){var i=t.call({},e,r);if(i.value!=""){n[i.key]=i.value}});return n}$(function(){$.widget("easygrid.selectionComp",{options:{gridName:null,urlAjaxAutocomp:null,urlAjaxGrid:null,urlAjaxSelLabel:null,showAutocompleteBox:true,staticConstraints:{},dynamicConstraints:{},autocompleteSize:3,autocomMinLength:2,disabled:false,baseId:null,width:940,height:400,title:"",showSeparateLabel:true,labelElement:null,selButton:null,label:null,idValue:null,value:null,onlyValue:null,inputElem:null,labelDiv:null,changeData:function(e){var t=$("#"+this.id);var n=t.selectionComp("option","onlyValue");if(n){var r=n[0];t.selectionComp("setValue",r.id,r.label)}else{t.selectionComp("option","inputElem","")}}},_create:function(){var e=this;var t=this.element.attr("id");this.options.baseId=t;var n=this.element.parent();if(this.options.showAutocompleteBox){this.options.inputElem=$('<input type="text" />');this.options.inputElem.attr("size",this.options.autocompleteSize);this.options.inputElem.attr("id",t+"_autocomplete");this.options.inputElem.attr("disabled",this.options.disabled);this.options.inputElem.addClass("selcomp_autocomplete_input");this.options.inputElem.change(function(){e._trigger("changeData")});n.append(this.options.inputElem);var r=this.options.urlAjaxAutocomp;this.options.inputElem.autocomplete({source:function(t,n){jQuery.ajax({url:r,data:$.extend({},e.options.staticConstraints,{term:t.term},objectMap(e.options.dynamicConstraints,function(e,t){return{key:e,value:jQuery(t).val()}})),success:function(t){if(t.length==1){e.options.onlyValue=jQuery.map(t,function(e){return{id:e.id,label:e.label,value:e.value}})}else{e.options.onlyValue=null}n(jQuery.map(t,function(e){return{id:e.id,label:e.label,value:e.value}}))},error:function(e){}})},minLength:e.options.autocomMinLength,select:function(t,n){e.setValue(n.item.id,n.item.label);return false}})}},addElements:function(){console.log("addElements");var e=this.element.parent();var t=this;var n=this.element.attr("id");var r=$(this.options.selButton);console.log(r);e.append(r);r.click(function(e){t.showJQGridSelectionPopup();return false});if(this.options.showSeparateLabel){this.options.labelDiv=$(t.options.labelElement);this.options.labelDiv.attr("id",n+"_label");this.options.labelDiv.addClass("selcomp_label");this.options.labelDiv.dblclick(function(e){t.clear();return false});e.append(this.options.labelDiv)}},_destroy:function(){},getValue:function(){return this.options.idValue},setValue:function(e,t){this.options.idValue=e;this.options.label=t;this.element.val(e);if(this.options.showSeparateLabel){this.options.labelDiv.text(t);$("#"+this.options.baseId+"_autocomplete").val("")}else{$("#"+this.options.baseId+"_autocomplete").val(t)}this._trigger("change")},clear:function(){this.setValue("null","")},showJQGridSelectionPopup:function(){var e=this;var t=$("<div></div>");t.attr("title",e.options.title);$.ajax({url:this.options.urlAjaxGrid,data:$.extend({},e.options.staticConstraints,{selectionComp:true},objectMap(e.options.dynamicConstraints,function(e,t){return{key:e,value:jQuery(t).val()}})),dataType:"html",success:function(n){t.dialog({modal:true,width:e.options.width,height:e.options.height,close:function(e,n){t.remove();$(this).remove()}}).dialog("open");t.html(n);$("#"+e.options.gridName+"_table").jqGrid("setGridParam",{onSelectRow:function(n){e.setLabel(n);t.dialog("close");t.remove()}})}})},setLabel:function(e){var t=this;jQuery.ajax({url:this.options.urlAjaxSelLabel,dataType:"json",data:{id:e},success:function(n){t.setValue(e,n[0].label)},error:function(e){}})}})})