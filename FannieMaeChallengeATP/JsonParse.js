function JsonParse(){
 var filereader = new Filereader();
 reader.onload = (function(reader){
   return function()
   {
     var json = reader.results;
     var mydata = JSON.parse(json);
     console.log(mydata);
   }
 })(reader);


}

//JsonParse();
