var studentObject = require("./jsonObject.json");
var nestedStudent = require("./nestedJsonObject.json");
var studentArray = require("./jsonArrayofObject.json");

// Accessing student json object
console.log(studentObject.age); //Output is 28
console.log(studentObject.name); //Output is Chaitanya Singh
console.log(studentObject.website); //Output is beginnersbook

//Accessing nested Json Object
console.log(nestedStudent.steve.age); //output is 29
console.log(nestedStudent.sop.gender); //output is female

//Accessing  json array of object
for (let i = 0; i < studentArray.students.length; i++) {
  console.log(studentArray.students[i].name);
  console.log(studentArray.students[i].age);
  console.log(studentArray.students[i].gender);
}
