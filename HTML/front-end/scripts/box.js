// sample for Alert box, confirm box, Prompt box

// just to show the alert message
alert("Hello, World!");

// just to show the confirm message
// if the user clicks "OK", it will return true
// if the user clicks "Cancel", it will return false
const answer = confirm("Are you sure?");
console.log(answer);

// just to show the prompt message
// it will return the value entered by the user
// if the user clicks "OK", it will return the value entered by the user
// if the user clicks "Cancel", it will return null
const name = prompt("What is your name?");
console.log(name);