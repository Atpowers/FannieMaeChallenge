function JsonParse(){
var file = new XMLHttpRequest();
File.overrideMimeType("application/json");
file.open("GET",file);
file.responseType = 'text';
var mydata = Json.parse(file.responseText);
console.log(mydata);
}
