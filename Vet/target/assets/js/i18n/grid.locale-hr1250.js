(function(e){e.jgrid=e.jgrid||{};e.extend(e.jgrid,{defaults:{recordtext:"Pregled {0} - {1} od {2}",emptyrecords:"Nema zapisa",loadtext:"U�itavam...",pgtext:"Stranica {0} od {1}"},search:{caption:"Tra�i...",Find:"Pretra�ivanje",Reset:"Poni�ti",odata:[{oper:"eq",text:"jednak"},{oper:"ne",text:"nije identi�an"},{oper:"lt",text:"manje"},{oper:"le",text:"manje ili identi�no"},{oper:"gt",text:"ve�e"},{oper:"ge",text:"ve�e ili identi�no"},{oper:"bw",text:"po�inje sa"},{oper:"bn",text:"ne po�inje sa "},{oper:"in",text:"je u"},{oper:"ni",text:"nije u"},{oper:"ew",text:"zavr�ava sa"},{oper:"en",text:"ne zavr�ava sa"},{oper:"cn",text:"sadr�i"},{oper:"nc",text:"ne sadr�i"},{oper:"nu",text:"is null"},{oper:"nn",text:"is not null"}],groupOps:[{op:"I",text:"sve"},{op:"ILI",text:"bilo koji"}],operandTitle:"Click to select search operation.",resetTitle:"Reset Search Value"},edit:{addCaption:"Dodaj zapis",editCaption:"Promijeni zapis",bSubmit:"Preuzmi",bCancel:"Odustani",bClose:"Zatvri",saveData:"Podaci su promijenjeni! Preuzmi promijene?",bYes:"Da",bNo:"Ne",bExit:"Odustani",msg:{required:"Polje je obavezno",number:"Molim, unesite ispravan broj",minValue:"Vrijednost mora biti ve�a ili identi�na ",maxValue:"Vrijednost mora biti manja ili identi�na",email:"neispravan e-mail",integer:"Molim, unjeti ispravan cijeli broj (integer)",date:"Molim, unjeti ispravan datum ",url:"neispravan URL. Prefiks je obavezan ('http://' or 'https://')",nodefined:" nije definiran!",novalue:" zahtjevan podatak je obavezan!",customarray:"Opcionalna funkcija trebala bi bili polje (array)!",customfcheck:"Custom function should be present in case of custom checking!"}},view:{caption:"Otvori zapis",bClose:"Zatvori"},del:{caption:"Obri�i",msg:"Obri�i ozna�en zapis ili vi�e njih?",bSubmit:"Obri�i",bCancel:"Odustani"},nav:{edittext:"",edittitle:"Promijeni obilje�eni red",addtext:"",addtitle:"Dodaj novi red",deltext:"",deltitle:"Obri�i obilje�eni red",searchtext:"",searchtitle:"Potra�i zapise",refreshtext:"",refreshtitle:"Ponovo preuzmi podatke",alertcap:"Upozorenje",alerttext:"Molim, odaberi red",viewtext:"",viewtitle:"Pregled obilje�enog reda"},col:{caption:"Obilje�i kolonu",bSubmit:"Uredu",bCancel:"Odustani"},errors:{errcap:"Gre�ka",nourl:"Nedostaje URL",norecords:"Bez zapisa za obradu",model:"colNames i colModel imaju razli�itu duljinu!"},formatter:{integer:{thousandsSeparator:".",defaultValue:"0"},number:{decimalSeparator:",",thousandsSeparator:".",decimalPlaces:2,defaultValue:"0,00"},currency:{decimalSeparator:",",thousandsSeparator:".",decimalPlaces:2,prefix:"",suffix:"",defaultValue:"0,00"},date:{dayNames:["Ned","Pon","Uto","Sri","�et","Pet","Sub","Nedjelja","Ponedjeljak","Utorak","Srijeda","�etvrtak","Petak","Subota"],monthNames:["Sij","Velj","O�u","Tra","Svi","Lip","Srp","Kol","Ruj","Lis","Stu","Pro","Sije�anj","Velja�a","O�ujak","Travanj","Svibanj","Lipanj","Srpanj","Kolovoz","Rujan","Listopad","Studeni","Prosinac"],AmPm:["am","pm","AM","PM"],S:function(e){return""},srcformat:"Y-m-d",newformat:"d.m.Y.",parseRe:/[#%\\\/:_;.,\t\s-]/,masks:{ISO8601Long:"Y-m-d H:i:s",ISO8601Short:"Y-m-d",ShortDate:"d.m.Y.",LongDate:"l, j. F Y",FullDateTime:"l, j. F Y H:i:s",MonthDay:"d F",ShortTime:"H:i",LongTime:"H:i:s",SortableDateTime:"Y-m-d\\TH:i:s",UniversalSortableDateTime:"Y-m-d H:i:sO",YearMonth:"F Y"},reformatAfterEdit:false},baseLinkUrl:"",showAction:"",target:"",checkbox:{disabled:true},idName:"id"}})})(jQuery)