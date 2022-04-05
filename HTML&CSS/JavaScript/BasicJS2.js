function mycalculation(a,b,c) {

    var calculation= (a+b)/c;
    console.log(calculation);
   // return calculation;

   if(isNaN(calculation))
   {
       console.log(" c value should not be 'Zero'");
   }
}

mycalculation(-1,1,0);

function isEven(a) {
    
    if(a%2==0) {
        console.log(a + " is Even");
    }
    else {
        console.log(a+ " is Odd");
    }
}

isEven(5)

var name = window.prompt("Enter your name: "); 
document.write("Your name is " + name);
  