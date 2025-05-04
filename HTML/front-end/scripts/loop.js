// Loops, Types of loops

// for loop sample
let i = 0
for (;i < 10;) {
    console.log(`for loop ${i}`);
    // i++ is not in the for loop, so it will be incremented in the block of code
    i++
}

// do while loop sample
let j = 0
// do while loop will execute the block of code once before checking the condition
// and then it will check the condition
do {
    console.log(`do while loop ${j}`);
    j++
}
while (j < 10);


// infinite loop sample
// let k = 0
// while (k < 10) {
//     console.log(k+1);
// }

// for of loop sample
// for of loop is used to iterate over iterable objects like arrays, strings, etc.
const numbers = ["one", "two", "three", "four", "five"]
for (const element of numbers) {
    console.log(element);
}

// forEach loop sample
// function myFunction(value, index) {
//     console.log(`forEach loop ${index} ${value}`);
// }
// const myArrowFunction = (value, index) => {
//     console.log(`forEach loop ${index} ${value}`);
// }
// way one
// numbers.forEach(myArrowFunction);
// way two
// numbers.forEach(function test(value, index) {
//     console.log(`forEach loop ${index} ${value}`);
// });
// way three (best way)
numbers.forEach((value, index) => {
    console.log(`forEach loop ${index} ${value}`);
});

