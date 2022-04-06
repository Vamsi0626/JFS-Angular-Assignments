var arr = ["1.2", "2.3", "3.4"];
console.log(arr.toString());

  
var test1 = ["stop", "quit", "exit"];
console.log(test1.filter(checklist));

function checklist(wrd) {
  return wrd !="quit";
}

console.log((test1.filter(checklist)).length);
