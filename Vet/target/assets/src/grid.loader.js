function jqGridInclude(){function i(e){var t=document.getElementsByTagName("head")[0];var n=document.createElement("script");n.setAttribute("type","text/javascript");n.setAttribute("language","javascript");n.setAttribute("src",e);t.appendChild(n)}var e="js/";var t=[{include:true,incfile:"i18n/grid.locale-en.js"},{include:true,incfile:"grid.base.js"},{include:true,incfile:"grid.common.js"},{include:true,incfile:"grid.formedit.js"},{include:true,incfile:"grid.inlinedit.js"},{include:true,incfile:"grid.celledit.js"},{include:true,incfile:"grid.subgrid.js"},{include:true,incfile:"grid.treegrid.js"},{include:true,incfile:"grid.grouping.js"},{include:true,incfile:"grid.custom.js"},{include:true,incfile:"grid.tbltogrid.js"},{include:true,incfile:"grid.import.js"},{include:true,incfile:"jquery.fmatter.js"},{include:true,incfile:"JsonXml.js"},{include:true,incfile:"grid.jqueryui.js"},{include:true,incfile:"grid.filter.js"}];var n;for(var r=0;r<t.length;r++){if(t[r].include===true){n=e+t[r].incfile;if(jQuery.browser.safari){jQuery.ajax({url:n,dataType:"script",async:false,cache:true})}else{if(jQuery.browser.msie){document.write('<script charset="utf-8" type="text/javascript" src="'+n+'"></script>')}else{i(n)}}}}}jqGridInclude()